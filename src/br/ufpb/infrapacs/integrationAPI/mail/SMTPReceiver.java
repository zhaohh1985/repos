package br.ufpb.infrapacs.integrationAPI.mail;

import java.util.Properties;

public class SMTPReceiver extends AbstractMailReceiver{
	
	private Properties properties;
	private MailAuthenticatorIF authenticatorBuilder;
	private MailMessageStrategyIF messageBuilder;
	
	@Override
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	@Override
	public MailAuthenticatorIF getAuthenticatorBuilder() {
		return authenticatorBuilder;
	}
	public void setAuthenticatorBuilder(MailAuthenticatorIF authenticatorBuilder) {
		this.authenticatorBuilder = authenticatorBuilder;
	}
	
	@Override
	public MailMessageStrategyIF getMessageBuilder() {
		return messageBuilder;
	}
	public void setMessageBuilder(MailMessageStrategyIF messageBuilder) {
		this.messageBuilder = messageBuilder;
	}

	

}
