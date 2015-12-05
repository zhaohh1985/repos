package br.ufpb.infrapacs.integrationAPI.mail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.mail.Header;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;

import br.ufpb.infrapacs.integrationAPI.message.xml.ServiceIF;

public abstract class AbstractMailReceiver implements MailReceiverIF {

	@Override
	public abstract Properties getProperties();
	
	@Override
	public abstract MailMessageStrategyIF getMessageBuilder();

	@Override
	public Iterator<ServiceIF> receive(FilterIF filter) {
		
		
		List<ServiceIF> services = new ArrayList<ServiceIF>();
		
		try {
			
			Session session = Session.getDefaultInstance(getProperties(), getAuthenticatorBuilder().getAuthenticator());
			
			
			List<Message> messages = getMessageBuilder().getMessages(session, filter);
			
			Iterator<Message> iterator = messages.iterator();
			while (iterator.hasNext()) {
				Message message = (Message) iterator.next();
				System.out.println("Título da Mensagem: " + message.getSubject());
				
				int contentType = Integer.valueOf(getHeaderValue(message, MailXTags.CONTENT_BUILDER_X_TAG));
				MailContentStrategyIF contentStrategy = MailContentStrategyFactory.createContentStrategy(contentType);
				
				int serviceType =  Integer.valueOf(getHeaderValue(message, MailXTags.SERVICE_TYPE_X_TAG));
				ServiceIF service = contentStrategy.getService((Multipart) message.getContent(), serviceType);
				services.add(service);
				
				
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		
		return services.iterator();
			
	}
	
	protected String getHeaderValue(Message message, String header){
		try { 
			
			Enumeration headers = message.getAllHeaders();
			
			 while (headers.hasMoreElements()) {
	             Header h = (Header) headers.nextElement();
	             
	             if( h.getName().contains(header)){
	             	return h.getValue();
	             }
	         }
			 
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		 
        return null;
     }


	

}
