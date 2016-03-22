package br.ufpb.dicomflow.integrationAPI.mail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;

import br.ufpb.dicomflow.integrationAPI.mail.impl.MailContentStrategyFactory;
import br.ufpb.dicomflow.integrationAPI.mail.impl.MailXTags;
import br.ufpb.dicomflow.integrationAPI.message.xml.ServiceIF;

public abstract class AbstractMailReceiver implements MailReceiverIF {

		@Override
		public abstract Properties getProperties();
		
		@Override
		public abstract MailHeadStrategyIF  getHeadBuilder();

		@Override
		public abstract MailMessageStrategyIF getMessageBuilder();
		
		@Override
		public abstract MailAuthenticatorIF getAuthenticatorBuilder();

		@Override
		public Iterator<ServiceIF> receive(FilterIF filter) {

			List<ServiceIF> services = new ArrayList<ServiceIF>();

			try {

				Session session = Session.getInstance(getProperties(), getAuthenticatorBuilder().getAuthenticator());

				List<Message> messages = getMessageBuilder().getMessages(session, filter);

				Iterator<Message> iterator = messages.iterator();
				while (iterator.hasNext()) {
					Message message = (Message) iterator.next();

					int contentType = Integer.valueOf(getHeadBuilder().getHeaderValue(message, MailXTags.CONTENT_BUILDER_X_TAG));
					MailContentStrategyIF contentStrategy = MailContentStrategyFactory.createContentStrategy(contentType);

					int serviceType = Integer.valueOf(getHeadBuilder().getHeaderValue(message,MailXTags.SERVICE_TYPE_X_TAG));
					ServiceIF service = contentStrategy.getService((Multipart) message.getContent(), serviceType);
					
					services.add(service);

				}

			} catch (IOException e) {
				e.printStackTrace();
			} catch (MessagingException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}

			return services.iterator();

		}

		

}
