package br.ufpb.infrapacs.integrationAPI.mail.impl;

import java.util.Enumeration;

import javax.mail.Address;
import javax.mail.Header;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import br.ufpb.infrapacs.integrationAPI.mail.MailHeadStrategyIF;
import br.ufpb.infrapacs.integrationAPI.message.xml.ServiceIF;

public class SMTPHeadStrategy implements MailHeadStrategyIF {

	
	private String from;
	private String to;
	private String domain;
	
	public SMTPHeadStrategy(){
		
	}
	
	public SMTPHeadStrategy(String from, String to, String domain){
		this.from = from;
		this.to = to;
		this.domain = domain;
		
	}
	
	@Override
	public Message getMessage(Session session, ServiceIF service) {
		Message message = new MimeMessage(session);
        try {
			message.setFrom(new InternetAddress(this.from));
			
			Address[] toUser = InternetAddress.parse(this.to);  
	        message.setRecipients(Message.RecipientType.TO, toUser);
	        
	        message.setSubject(service.getName()+"-"+service.getAction());
	        
	        message.addHeader(MailXTags.MESSAGE_ID_X_TAG, service.getMessageID()+"@"+this.domain);
	        message.addHeader(MailXTags.SERVICE_TYPE_X_TAG, String.valueOf(service.getType()));
	        
	        
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return message;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	public int getType(){
		return MailHeadStrategyIF.SMTP_HEAD_STRATEGY;
	}
	
	
	

}
