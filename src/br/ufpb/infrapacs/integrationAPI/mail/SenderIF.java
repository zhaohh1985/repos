package br.ufpb.infrapacs.integrationAPI.mail;

import br.ufpb.infrapacs.integrationAPI.message.xml.ServiceIF;


public interface SenderIF {
	
	public void send(ServiceIF service);

}
