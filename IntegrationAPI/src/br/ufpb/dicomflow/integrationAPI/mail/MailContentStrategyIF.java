package br.ufpb.infrapacs.integrationAPI.mail;

import javax.mail.Multipart;

import br.ufpb.infrapacs.integrationAPI.message.xml.ServiceIF;

public interface MailContentStrategyIF {
	
	public static final int SMTP_SIMPLE_CONTENT_STRATEGY = 1;
	
	public Multipart getContent(ServiceIF service);

	public int getType();

	public ServiceIF getService(Multipart content, int type);
	
}
