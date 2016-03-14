package br.ufpb.infrapacs.integrationAPI.tests;

import org.junit.Test;

import br.ufpb.infrapacs.integrationAPI.conf.IntegrationAPIProperties;

public class UtilTestCase extends GenericTestCase {
	
	@Test
	public static void testLoadConfigs() {
		IntegrationAPIProperties properties = IntegrationAPIProperties.getInstance();
		System.out.println(properties.getSmtpHost());
		properties.toString();
	}

}
