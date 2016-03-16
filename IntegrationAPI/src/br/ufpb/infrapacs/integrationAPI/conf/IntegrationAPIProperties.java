package br.ufpb.infrapacs.integrationAPI.conf;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import br.ufpb.infrapacs.integrationAPI.exceptions.PropertyNotFoundException;

public class IntegrationAPIProperties {
	
	
	public static final String MAIL_SMTP_HOST = "mail.smtp.host";
	public static final String MAIL_SMTP_AUTH ="mail.smtp.auth";
	public static final String MAIL_SMTP_SOCKET_FACTORY_PORT ="mail.smtp.socketFactory.port";
	public static final String MAIL_SMTP_PORT ="mail.smtp.port";
	public static final String MAIL_SMTP_SOCKET_FACTORY_CLASS ="mail.smtp.socketFactory.class";
	public static final String AUTHENTICATION_LOGIN ="authentication.login";
	public static final String AUTHENTICATION_PASSWORD ="authentication.password";

	
	private static String configFilePath = "conf/config.properties";
	private static IntegrationAPIProperties instance;
	private Properties properties;
	
	
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
			properties = new Properties();
			properties.load(new FileInputStream(configFilePath));
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
	
	public String getProperty(String property) throws PropertyNotFoundException{
		if(properties.getProperty(property) == null || properties.getProperty(property).equals("")){
			throw new PropertyNotFoundException(property + " not found."); 
		}
		return properties.getProperty(property);
	}
	

	
	public Properties getConnectionProperties() throws PropertyNotFoundException{
		Properties connectionProperties = new Properties();
		connectionProperties.put(MAIL_SMTP_HOST, getProperty(MAIL_SMTP_HOST));
		connectionProperties.put(MAIL_SMTP_AUTH, getProperty(MAIL_SMTP_AUTH));
		connectionProperties.put(MAIL_SMTP_SOCKET_FACTORY_PORT, getProperty(MAIL_SMTP_SOCKET_FACTORY_PORT));
		connectionProperties.put(MAIL_SMTP_PORT, getProperty(MAIL_SMTP_PORT));
		connectionProperties.put(MAIL_SMTP_SOCKET_FACTORY_CLASS, getProperty(MAIL_SMTP_SOCKET_FACTORY_CLASS));
		return connectionProperties;
	}
	
	public String toString(){
		return properties.toString();
	}
	
	
	
//	public String getSmtpHost() throws PropertyNotFoundException {
//	
//	return getProperty(MAIL_SMTP_HOST);
//}
//
//public boolean isEmailAuth() throws PropertyNotFoundException {
//	return Boolean.parseBoolean(getProperty(MAIL_SMTP_AUTH));
//}
//
//public Integer getEmailSocketFactoryPort() throws NumberFormatException, PropertyNotFoundException {
//	return Integer.parseInt(getProperty(MAIL_SMTP_SOCKET_FACTORY_PORT));
//}
//
//public Integer getSmtpPort() throws NumberFormatException, PropertyNotFoundException {
//	return Integer.parseInt(getProperty(MAIL_SMTP_PORT));
//}
//
//public String getEmailSocketFactoryClass() throws PropertyNotFoundException {
//	return getProperty(MAIL_SMTP_SOCKET_FACTORY_CLASS);
//}
//
//public String getAuthenticationLogin() throws PropertyNotFoundException {
//	return getProperty(AUTHENTICATION_LOGIN);
//}
//
//public String getAuthenticationPassword() throws PropertyNotFoundException {
//	return getProperty(AUTHENTICATION_PASSWORD);
//}
	
//	public String getSmtpHost() {
//		return instance.getProperty("mail.smtp.host", "smtp.gmail.com");
//	}
//	
//	public boolean isEmailAuth() {
//		return Boolean.parseBoolean(instance.getProperty("mail.smtp.auth", "true"));
//	}
//	
//	public Integer getEmailSocketFactoryPort() {
//		return Integer.parseInt(instance.getProperty("mail.smtp.socketFactory.port", "465"));
//	}
//	
//	public Integer getSmtpPort() {
//		return Integer.parseInt(instance.getProperty("mail.smtp.port", "465"));
//	}
//	
//	public String getEmailSocketFactoryClass() {
//		return instance.getProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//	}
							
}
