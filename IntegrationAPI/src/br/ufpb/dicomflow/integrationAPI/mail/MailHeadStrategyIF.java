package br.ufpb.dicomflow.integrationAPI.mail;

import javax.mail.Message;
import javax.mail.Session;

import br.ufpb.dicomflow.integrationAPI.message.xml.ServiceIF;

public interface MailHeadStrategyIF {
	
	public static final int SMTP_HEAD_STRATEGY = 1;

	public Message getMessage(Session session, ServiceIF service);
	
	public int getType();

}
