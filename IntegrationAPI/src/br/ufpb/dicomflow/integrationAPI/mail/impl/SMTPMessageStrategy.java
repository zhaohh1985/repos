package br.ufpb.dicomflow.integrationAPI.mail.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

import br.ufpb.dicomflow.integrationAPI.mail.FilterIF;
import br.ufpb.dicomflow.integrationAPI.mail.MailMessageStrategyIF;

public class SMTPMessageStrategy implements MailMessageStrategyIF {
	
	private String provider;
	private String hostProvider;
	private String folderName;

	 
	
	public SMTPMessageStrategy(String provider, String hostProvider,String folderName) {
		this.provider = provider;
		this.hostProvider = hostProvider;
		this.folderName = folderName;
	}

	@Override
	public List<Message> getMessages(Session session, FilterIF filter) {
		
		List<Message> messages = new ArrayList<Message>();
		
		try {
			
			
			Store store = session.getStore(this.provider);
			store.connect(this.hostProvider, null, null);

		    Folder folder = store.getFolder(this.folderName);
		    
		    if (folder == null) {
		    	return messages;
		    }
		    
		    folder.open(Folder.READ_WRITE);
		    
		    //TODO implementar código dos filtros
		    messages.addAll(Arrays.asList(folder.getMessages()));
		    
		    
		    //TODO resolver o fechamento do folder e o store
		    //folder.close(false);
		    //store.close();
	    
		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return messages;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getHostProvider() {
		return hostProvider;
	}

	public void setHostProvider(String hostProvider) {
		this.hostProvider = hostProvider;
	}

	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}
	
	@Override
	public int getType() {
		return MailMessageStrategyIF.SMTP_MESSAGE_STRATEGY;
	}

	
	
	
}
