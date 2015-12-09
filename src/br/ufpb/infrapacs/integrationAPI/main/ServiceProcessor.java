package br.ufpb.infrapacs.integrationAPI.main;

import java.util.Properties;

import br.ufpb.infrapacs.integrationAPI.exceptions.ServiceCreationException;
import br.ufpb.infrapacs.integrationAPI.mail.MailAuthenticatorIF;
import br.ufpb.infrapacs.integrationAPI.mail.MailContentStrategyIF;
import br.ufpb.infrapacs.integrationAPI.mail.MailHeadStrategyIF;
import br.ufpb.infrapacs.integrationAPI.mail.impl.SMTPAuthenticatorStrategy;
import br.ufpb.infrapacs.integrationAPI.mail.impl.SMTPHeadStrategy;
import br.ufpb.infrapacs.integrationAPI.mail.impl.SMTPSender;
import br.ufpb.infrapacs.integrationAPI.mail.impl.SMTPSimpleContentStrategy;
import br.ufpb.infrapacs.integrationAPI.message.xml.StorageDelete;

public class ServiceProcessor {
	
	public static final String EMAIL = "email";
	public static final String PASSWORD = "pwd";
	public static final String FROM = "from";
	public static final String TO = "to";
	public static final String DOMAIN = "domain";

	public static void sendMessage(StorageDelete obj, Properties props) throws ServiceCreationException {
		
		try {
			obj.setTimestamp(System.currentTimeMillis()+"");			
			
			MailAuthenticatorIF smtpAuthenticatorStrategy =  new SMTPAuthenticatorStrategy(props.getProperty(EMAIL), props.getProperty(PASSWORD));
	        MailHeadStrategyIF smtpHeadStrategy = new SMTPHeadStrategy(props.getProperty(FROM), props.getProperty(TO), props.getProperty(DOMAIN));
	        MailContentStrategyIF smtpSimpleContentStrategy = new SMTPSimpleContentStrategy();
	        
	        SMTPSender sender = new SMTPSender();
	        sender.setProperties(props);
	        sender.setAuthenticatorBuilder(smtpAuthenticatorStrategy);
	        sender.setHeadBuilder(smtpHeadStrategy);
	        sender.setContentBuilder(smtpSimpleContentStrategy);
	        
	        sender.send(obj);

		} catch (Exception e) {
			throw new ServiceCreationException(e.getMessage());
		}
		
	}
	
	//TODO metodos para realizar as opera��es - ex: verificar mensagens
	// 											enviar um storage de um objeto
	//											get ID's / links dos estudos
	//TODO metodos de integracao com gateways
	//TODO Strategy para mandar as mensagens para o Sender (se vai criptografada, plano, etc)
	
}
