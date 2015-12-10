package br.ufpb.infrapacs.integrationAPI.mail.impl;

import br.ufpb.infrapacs.integrationAPI.mail.MailContentStrategyIF;

public class MailContentStrategyFactory {
	
	public static MailContentStrategyIF createContentStrategy(int type){
		
		MailContentStrategyIF contentStrategy;
		
		switch (type) {
		case MailContentStrategyIF.SMTP_SIMPLE_CONTENT_STRATEGY:
			contentStrategy = new SMTPSimpleContentStrategy();
			break;
		default:
			contentStrategy = null;
			break;
		}
		
		return contentStrategy;
	}

}