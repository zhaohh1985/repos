package br.ufpb.infrapacs.integrationAPI.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class SMTPAuthenticatorStrategy implements MailAuthenticatorIF{
	
	private String email;
	private String password;
	private Authenticator authenticator;
	
	
	public SMTPAuthenticatorStrategy(String mail, String passwd){
		this.email = mail;
		this.password = passwd;
		this.authenticator = new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication()
            {
                  return new PasswordAuthentication(email, password);
            }
       };
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Authenticator getAuthenticator() {
		return authenticator;
	}


	public void setAuthenticator(Authenticator authenticator) {
		this.authenticator = authenticator;
	}
	
	
	
	

}