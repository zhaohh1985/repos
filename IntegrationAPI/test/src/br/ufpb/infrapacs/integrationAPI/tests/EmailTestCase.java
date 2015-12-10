package br.ufpb.infrapacs.integrationAPI.tests;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Test;

import br.ufpb.infrapacs.integrationAPI.mail.MailAuthenticatorIF;
import br.ufpb.infrapacs.integrationAPI.mail.MailContentStrategyIF;
import br.ufpb.infrapacs.integrationAPI.mail.MailHeadStrategyIF;
import br.ufpb.infrapacs.integrationAPI.mail.MailMessageStrategyIF;
import br.ufpb.infrapacs.integrationAPI.mail.impl.SMTPAuthenticatorStrategy;
import br.ufpb.infrapacs.integrationAPI.mail.impl.SMTPHeadStrategy;
import br.ufpb.infrapacs.integrationAPI.mail.impl.SMTPMessageStrategy;
import br.ufpb.infrapacs.integrationAPI.mail.impl.SMTPReceiver;
import br.ufpb.infrapacs.integrationAPI.mail.impl.SMTPSender;
import br.ufpb.infrapacs.integrationAPI.mail.impl.SMTPSimpleContentStrategy;
import br.ufpb.infrapacs.integrationAPI.main.DefaultIdMessageGeneratorStrategy;
import br.ufpb.infrapacs.integrationAPI.main.ServiceFactory;
import br.ufpb.infrapacs.integrationAPI.message.xml.Credentials;
import br.ufpb.infrapacs.integrationAPI.message.xml.Object;
import br.ufpb.infrapacs.integrationAPI.message.xml.ServiceIF;
import br.ufpb.infrapacs.integrationAPI.message.xml.StorageDelete;

public class EmailTestCase extends GenericTestCase {
	
	@Test
	public void testReceive() {	
		
//		Properties pop3Props = new Properties();
//		 
//		pop3Props.setProperty("mail.pop3.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//		pop3Props.setProperty("mail.pop3.socketFactory.fallback", "false");
//		pop3Props.setProperty("mail.pop3.port",  "995");
//		pop3Props.setProperty("mail.pop3.socketFactory.port", "995");

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
	
	
	@Test
	public void testSendStorageDelete() {
		
		StorageDelete storageDelete = (StorageDelete) ServiceFactory.createService(ServiceIF.STORAGE_DELETE, DefaultIdMessageGeneratorStrategy.getInstance());// new StorageDelete();
		storageDelete.setMessageID("312312");		
		storageDelete.setTimestamp("12346567346");
		storageDelete.setTimeout("23123");		
		
		Object obj1 = new Object();
		obj1.setId("1");
		obj1.setType("type1");
		Credentials cred1 = new Credentials();
		cred1.setValue("asdfh");
		obj1.setCredential(cred1);
		
		Object obj2 = new Object();
		obj2.setId("2");
		obj2.setType("type2");
		Credentials cred2 = new Credentials();
		cred2.setValue("1we1233");
		obj2.setCredential(cred2);
		
		List<Object> objects = new ArrayList<Object>();
		objects.add(obj1);
		objects.add(obj2);
		storageDelete.setObject(objects);
						
		try {
			File file = new File("C:\\temp\\storageDelete.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(StorageDelete.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			StringWriter str = new StringWriter();
			
			jaxbMarshaller.marshal(storageDelete, file);
			jaxbMarshaller.marshal(storageDelete, System.out);
			jaxbMarshaller.marshal(storageDelete, str);
			
			System.out.println(str.toString());
			
			Properties props = new Properties();
            /** Parâmetros de conexão com servidor Gmail */
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "25");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "25");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.debug", "true");
            props.put("mail.smtp.socketFactory.fallback", "false");

            
            Session session = Session.getDefaultInstance(props,
            new javax.mail.Authenticator() {
                 protected PasswordAuthentication getPasswordAuthentication()
                 {
                       return new PasswordAuthentication("protocolointegracao", "pr0t0c0l0ap1");
                 }
            });

            /** Ativa Debug para sessão */
            session.setDebug(true);


            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("daniloalexandre@gmail.com")); //Remetente

            Address[] toUser = InternetAddress //Destinatário(s)
                       .parse("daniloalexandre@gmail.com");  

            message.setRecipients(Message.RecipientType.TO, toUser);
            message.setSubject("Testando envio de Serviço - integrationAPI");//Assunto
            message.addHeader("Message-ID", "<12121212121212@daba>");
//          message.setText(str.toString());
            
           
            
            Multipart multipart = new MimeMultipart();
            
            MimeBodyPart attachment0 = new MimeBodyPart();
            attachment0.setContent(str.toString(),"text/xml; charset=UTF-8");
            multipart.addBodyPart(attachment0);
            
            message.setContent(multipart);
            
            /**Método para enviar a mensagem criada*/
            Transport.send(message);

            System.out.println("Feito!!!");


		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public static void sendStorageDelete() {
		
		StorageDelete storageDelete = (StorageDelete) ServiceFactory.createService(ServiceIF.STORAGE_DELETE, DefaultIdMessageGeneratorStrategy.getInstance());// new StorageDelete();
		storageDelete.setTimestamp("12346567346");
		storageDelete.setTimeout("23123");		
		
		Object obj1 = new Object();
		obj1.setId("1");
		obj1.setType("type1");
		Credentials cred1 = new Credentials();
		cred1.setValue("asdfh");
		obj1.setCredential(cred1);
		
		Object obj2 = new Object();
		obj2.setId("2");
		obj2.setType("type2");
		Credentials cred2 = new Credentials();
		cred2.setValue("1we1233");
		obj2.setCredential(cred2);
		
		List<Object> objects = new ArrayList<Object>();
		objects.add(obj1);
		objects.add(obj2);
		storageDelete.setObject(objects);
						
		
			
		Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "25");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "25");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");
        props.put("mail.smtp.socketFactory.fallback", "false");

        MailAuthenticatorIF smtpAuthenticatorStrategy =  new SMTPAuthenticatorStrategy("protocolointegracao@gmail.com", "pr0t0c0l0ap1");
        MailHeadStrategyIF smtpHeadStrategy = new SMTPHeadStrategy("protocolointegracao@gmail.com", "daniloalexandre@gmail.com, protocolointegracao@gmail.com", "dominio.com");
        MailContentStrategyIF smtpSimpleContentStrategy = new SMTPSimpleContentStrategy();
        
        SMTPSender sender = new SMTPSender();
        sender.setProperties(props);
        sender.setAuthenticatorBuilder(smtpAuthenticatorStrategy);
        sender.setHeadBuilder(smtpHeadStrategy);
        sender.setContentBuilder(smtpSimpleContentStrategy);
        
        sender.send(storageDelete);
        

	}
}