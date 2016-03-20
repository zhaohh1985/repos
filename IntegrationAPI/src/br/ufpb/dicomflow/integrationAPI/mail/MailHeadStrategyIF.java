package br.ufpb.dicomflow.integrationAPI.mail;

import javax.mail.Message;

import br.ufpb.dicomflow.integrationAPI.message.xml.ServiceIF;

public interface MailHeadStrategyIF {
	
	public static final int SMTP_HEAD_STRATEGY = 1;

	public Message buildHead(Message message, ServiceIF service, MailContentStrategyIF contentBuilder);
	
	public String getHeaderValue(Message message, String header);
	
	public int getType();

}
