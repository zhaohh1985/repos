package br.ufpb.dicomflow.integrationAPI.main;

import java.util.Properties;

import br.ufpb.dicomflow.integrationAPI.exceptions.ServiceCreationException;
import br.ufpb.dicomflow.integrationAPI.mail.MailAuthenticatorIF;
import br.ufpb.dicomflow.integrationAPI.mail.MailContentBuilderIF;
import br.ufpb.dicomflow.integrationAPI.mail.MailHeadBuilderIF;
import br.ufpb.dicomflow.integrationAPI.mail.impl.SMTPAuthenticator;
import br.ufpb.dicomflow.integrationAPI.mail.impl.SMTPHeadBuilder;
import br.ufpb.dicomflow.integrationAPI.mail.impl.SMTPSender;
import br.ufpb.dicomflow.integrationAPI.mail.impl.SMTPContentBuilder;
import br.ufpb.dicomflow.integrationAPI.message.xml.ServiceIF;

public class ServiceProcessor {
	
	public static final String EMAIL = "email";
	public static final String PASSWORD = "pwd";
	public static final String FROM = "from";
	public static final String TO = "to";
	public static final String DOMAIN = "domain";

	public static void sendMessage(ServiceIF obj, Properties props, MailAuthenticatorIF smtpAuthenticatorStrategy, MailHeadBuilderIF smtpHeadStrategy, MailContentBuilderIF smtpSimpleContentStrategy) throws ServiceCreationException {
		
		try {
			obj.setTimestamp(System.currentTimeMillis()+"");			
			
			//TODO alterar esse funcionamento.
			if (smtpAuthenticatorStrategy == null) {
				smtpAuthenticatorStrategy =  new SMTPAuthenticator(props.getProperty(EMAIL), props.getProperty(PASSWORD));
			}
			if (smtpHeadStrategy == null) {
				smtpHeadStrategy = new SMTPHeadBuilder(props.getProperty(FROM), props.getProperty(TO), props.getProperty(DOMAIN));
			}
			if (smtpSimpleContentStrategy == null) {
				smtpSimpleContentStrategy = new SMTPContentBuilder();
			}	        	      
	        
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
	
	//TODO metodos para realizar as operações - ex: verificar mensagens
	// 											enviar um storage de um objeto
	//											get ID's / links dos estudos
	//TODO metodos de integracao com gateways
	//TODO Strategy para mandar as mensagens para o Sender (se vai criptografada, plano, etc)
	
}
