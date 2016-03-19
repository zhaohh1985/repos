package br.ufpb.infrapacs.integrationAPI.mail;

import java.util.Iterator;

import br.ufpb.infrapacs.integrationAPI.message.xml.ServiceIF;

public interface ReceiverIF {
	
	public Iterator<ServiceIF> receive(FilterIF filter);

}
