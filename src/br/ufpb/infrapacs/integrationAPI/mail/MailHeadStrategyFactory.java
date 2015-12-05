package br.ufpb.infrapacs.integrationAPI.mail;

public class MailHeadStrategyFactory {
	
	public static MailHeadStrategyIF createHeadStrategy(int type){
		
		MailHeadStrategyIF headStrategy;
		
		switch (type) {
		case MailHeadStrategyIF.SMTP_HEAD_STRATEGY:
			headStrategy = new SMTPHeadStrategy();
			break;
		default:
			headStrategy = null;
			break;
		}
		
		return headStrategy;
	}

}
