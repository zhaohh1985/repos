package br.ufpb.infrapacs.integrationAPI.mail;

import javax.mail.Multipart;

import br.ufpb.infrapacs.integrationAPI.message.xml.ServiceIF;

public interface MailContentStrategyIF {
	
	public Multipart getContent(ServiceIF service);

}
