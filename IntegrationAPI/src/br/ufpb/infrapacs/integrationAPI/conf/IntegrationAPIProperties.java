package br.ufpb.infrapacs.integrationAPI.conf;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class IntegrationAPIProperties extends Properties {

	private static final long serialVersionUID = -2791416219757102761L;
	private static String configFilePath = "conf/config.properties";
	private static IntegrationAPIProperties instance;	
	
	
	public static IntegrationAPIProperties getInstance() {
		if (instance == null) {
			instance = new IntegrationAPIProperties();
		}
		return instance;
	}

	
	private IntegrationAPIProperties () {
		super();
		try {			
			//configFilePath = findAppDir() + configFilePath;						
			load(new FileInputStream(configFilePath));
		} catch (Exception e) {
			//TODO - Log exception
		}		
	}
	
	public static String findAppDir() {
		String path = "";
		File dir = new File(IntegrationAPIProperties.class.getProtectionDomain().getCodeSource().getLocation().getPath());
		path = dir.toString();		
		return path;
	}
	
	/* Properties */	
	public String getSmtpHost() {
		return instance.getProperty("mail.smtp.host", "smtp.gmail.com");
	}
	
	public boolean isEmailAuth() {
		return Boolean.parseBoolean(instance.getProperty("mail.smtp.auth", "true"));
	}
	
	public Integer getEmailSocketFactoryPort() {
		return Integer.parseInt(instance.getProperty("mail.smtp.socketFactory.port", "25"));
	}
							
}
