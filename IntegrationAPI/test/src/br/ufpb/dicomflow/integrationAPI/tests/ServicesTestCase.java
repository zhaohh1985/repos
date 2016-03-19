package br.ufpb.infrapacs.integrationAPI.tests;

import java.util.Properties;

import org.junit.Test;

import br.ufpb.infrapacs.integrationAPI.exceptions.ServiceCreationException;
import br.ufpb.infrapacs.integrationAPI.main.DefaultIdMessageGeneratorStrategy;
import br.ufpb.infrapacs.integrationAPI.main.ServiceFactory;
import br.ufpb.infrapacs.integrationAPI.main.ServiceProcessor;
import br.ufpb.infrapacs.integrationAPI.message.xml.ServiceIF;
import br.ufpb.infrapacs.integrationAPI.message.xml.StorageDelete;

public class ServicesTestCase extends GenericTestCase {
	
	@Test
	private static void testDelete() {
		StorageDelete obj = (StorageDelete) ServiceFactory.createService(ServiceIF.STORAGE_DELETE, DefaultIdMessageGeneratorStrategy.getInstance());// new StorageDelete();

		Properties props = new Properties();        		
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "25");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "25");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");
        props.put("mail.smtp.socketFactory.fallback", "false");
        
        props.put(ServiceProcessor.EMAIL, "protocolointegracao@gmail.com");
        props.put(ServiceProcessor.PASSWORD, "pr0t0c0l0ap1");
        props.put(ServiceProcessor.FROM, "protocolointegracao@gmail.com");
        props.put(ServiceProcessor.TO, "juracylucena@gmail.com");
        props.put(ServiceProcessor.DOMAIN, "dominio.com");                

		
		try {
			ServiceProcessor.sendMessage(obj, props, null, null, null);
		} catch (ServiceCreationException e) {
			fail();
		}
	}
}
