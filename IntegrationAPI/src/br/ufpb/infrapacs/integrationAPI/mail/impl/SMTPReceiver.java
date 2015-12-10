package br.ufpb.infrapacs.integrationAPI.mail.impl;

import java.util.Properties;

import br.ufpb.infrapacs.integrationAPI.mail.AbstractMailReceiver;
import br.ufpb.infrapacs.integrationAPI.mail.MailAuthenticatorIF;
import br.ufpb.infrapacs.integrationAPI.mail.MailMessageStrategyIF;

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