package br.ufpb.infrapacs.integrationAPI.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;

import br.ufpb.infrapacs.integrationAPI.message.xml.ServiceIF;

public abstract class AbstractMailSender implements MailSenderIF{
	
	 
	
	public void send(ServiceIF service) {
		
		try {
			Session session = Session.getDefaultInstance(getProperties(), getAuthenticatorBuilder().getAuthenticator());
			session.setDebug(true);
			
			Message message = getHeadBuilder().getMessage(session, service);
			message.setContent(getContentBuilder().getContent(service));
			
			Transport.send(message);
			
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (NullPointerException e){
			e.printStackTrace();
		}
		
		
		
		
		
	}

	@Override
	public abstract Properties getProperties();

	@Override
	public abstract MailAuthenticatorIF getAuthenticatorBuilder();

	@Override
	public abstract MailHeadStrategyIF getHeadBuilder();
	
	@Override
	public abstract MailContentStrategyIF getContentBuilder();
	
	
}
