package br.ufpb.infrapacs.integrationAPI.mail;

import javax.mail.Authenticator;

public interface MailAuthenticatorIF {
	
	
	public String getEmail();
	
	public String getPassword();
	
	public Authenticator getAuthenticator();

}
