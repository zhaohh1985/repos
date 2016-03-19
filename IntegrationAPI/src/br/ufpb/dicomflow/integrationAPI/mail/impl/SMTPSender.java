package br.ufpb.dicomflow.integrationAPI.mail.impl;

import java.util.Properties;

import br.ufpb.dicomflow.integrationAPI.mail.AbstractMailSender;
import br.ufpb.dicomflow.integrationAPI.mail.MailAuthenticatorIF;
import br.ufpb.dicomflow.integrationAPI.mail.MailContentStrategyIF;
import br.ufpb.dicomflow.integrationAPI.mail.MailHeadStrategyIF;

public class SMTPSender extends AbstractMailSender {
	
	private Properties properties;
	private MailAuthenticatorIF authenticatorBuilder;
	private MailHeadStrategyIF headBuilder;
	private MailContentStrategyIF contentBuilder;

	@Override
	public Properties getProperties() {
		return this.properties;
	}

	@Override
	public MailAuthenticatorIF getAuthenticatorBuilder() {
		return this.authenticatorBuilder;
	}

	@Override
	public MailHeadStrategyIF getHeadBuilder() {
		return this.headBuilder;
	}

	@Override
	public MailContentStrategyIF getContentBuilder() {
		return this.contentBuilder;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void setAuthenticatorBuilder(MailAuthenticatorIF authenticatorBuilder) {
		this.authenticatorBuilder = authenticatorBuilder;
	}

	public void setHeadBuilder(MailHeadStrategyIF headBuilder) {
		this.headBuilder = headBuilder;
	}

	public void setContentBuilder(MailContentStrategyIF contentBuilder) {
		this.contentBuilder = contentBuilder;
	}

	
	
}
