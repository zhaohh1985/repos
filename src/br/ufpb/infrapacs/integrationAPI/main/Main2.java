package br.ufpb.infrapacs.integrationAPI.main;

import java.util.Iterator;
import java.util.Properties;

import br.ufpb.infrapacs.integrationAPI.mail.MailAuthenticatorIF;
import br.ufpb.infrapacs.integrationAPI.mail.MailMessageStrategyIF;
import br.ufpb.infrapacs.integrationAPI.mail.SMTPAuthenticatorStrategy;
import br.ufpb.infrapacs.integrationAPI.mail.SMTPMessageStrategy;
import br.ufpb.infrapacs.integrationAPI.mail.SMTPReceiver;
import br.ufpb.infrapacs.integrationAPI.message.xml.ServiceIF;

public class Main2 {
	
	public static void main(String[] args) {
		
		receiveServices();
		
	}

	private static void receiveServices() {
		
		Properties pop3Props = new Properties();
		 
		pop3Props.setProperty("mail.pop3.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		pop3Props.setProperty("mail.pop3.socketFactory.fallback", "false");
		pop3Props.setProperty("mail.pop3.port",  "995");
		pop3Props.setProperty("mail.pop3.socketFactory.port", "995");
		
		Properties props = System.getProperties();
		props.setProperty("mail.imap.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.setProperty("mail.imap.socketFactory.fallback", "false");
		props.setProperty("mail.store.protocol", "imaps");
		
		MailAuthenticatorIF smtpAuthenticatorStrategy =  new SMTPAuthenticatorStrategy("protocolointegracao@gmail.com", "pr0t0c0l0ap1");
		MailMessageStrategyIF smtpMesssaStrategy = new SMTPMessageStrategy("imaps", "imap.googlemail.com", "INBOX");
		
		SMTPReceiver receiver = new SMTPReceiver();
		receiver.setProperties(props);
		receiver.setAuthenticatorBuilder(smtpAuthenticatorStrategy);
		receiver.setMessageBuilder(smtpMesssaStrategy);
		
		Iterator<ServiceIF> iterator = receiver.receive(null);
		
		while (iterator.hasNext()) {
			ServiceIF serviceIF = (ServiceIF) iterator.next();
			System.out.println("MessageID:" +serviceIF.getMessageID() + "Name: " + serviceIF.getName() + "Action: " +serviceIF.getAction());
		}
	}

}