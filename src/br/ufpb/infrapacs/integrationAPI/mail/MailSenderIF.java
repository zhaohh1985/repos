package br.ufpb.infrapacs.integrationAPI.mail;

import java.util.Properties;


public interface MailSenderIF extends SenderIF{
	
	public Properties getProperties();
	
	public MailHeadStrategyIF  getHeadBuilder();
	
	public MailAuthenticatorIF getAuthenticatorBuilder();
	
	public MailContentStrategyIF getContentBuilder();
	

}
