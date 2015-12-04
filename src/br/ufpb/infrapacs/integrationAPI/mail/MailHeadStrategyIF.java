package br.ufpb.infrapacs.integrationAPI.mail;

import javax.mail.Message;
import javax.mail.Session;

import br.ufpb.infrapacs.integrationAPI.message.xml.ServiceIF;

public interface MailHeadStrategyIF {

	public Message getMessage(Session session, ServiceIF service);

}
