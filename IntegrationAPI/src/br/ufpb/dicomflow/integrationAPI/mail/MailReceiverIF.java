package br.ufpb.dicomflow.integrationAPI.mail;

import java.util.List;
import java.util.Properties;

import javax.mail.Flags.Flag;

public interface MailReceiverIF extends ReceiverIF{
	
	public Properties getProperties();
	
	public MailAuthenticatorIF getAuthenticatorBuilder();
	
	public MailMessageStrategyIF getMessageBuilder();

	
}
