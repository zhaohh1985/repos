package br.ufpb.infrapacs.integrationAPI.message.xml;

import javax.xml.bind.annotation.XmlAttribute;

public interface ServiceIF {
	
	
	public String getVersion();
	
	
	public void setVersion(String version);
	
	public String getName();
	
	public void setName(String name);
	
	public String getAction();
	
	public void setAction(String action);

	public String getMessageID();

	public void setMessageID(String messageID);

	public String getTimestamp();

	public void setTimestamp(String timestamp);

	public String getTimeout();

	public void setTimeout(String timeout);

}
