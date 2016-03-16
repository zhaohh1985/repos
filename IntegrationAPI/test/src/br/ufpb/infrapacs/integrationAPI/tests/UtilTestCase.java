package br.ufpb.infrapacs.integrationAPI.tests;

import org.junit.Test;

import br.ufpb.infrapacs.integrationAPI.conf.IntegrationAPIProperties;
import br.ufpb.infrapacs.integrationAPI.exceptions.PropertyNotFoundException;

public class UtilTestCase extends GenericTestCase {
	
	@Test
	public static void testLoadConfigs() {
		IntegrationAPIProperties properties = IntegrationAPIProperties.getInstance();
		try {
			System.out.println(properties.getProperty(IntegrationAPIProperties.MAIL_SMTP_HOST));
		} catch (PropertyNotFoundException e) {
			e.printStackTrace();
		}
		properties.toString();
	}

}
