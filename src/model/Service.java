package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="service", propOrder={"version", "name", "action", "messageID", "timestamp", "timeout"})
@XmlSeeAlso({StorageDelete.class, StorageSave.class})
public class Service {
			
	private String version;	
	private String name;	
	private String action;
	
	private String messageID;
	private String timestamp;
	private String timeout;
	
	public String getVersion() {
		return version;
	}
	
	@XmlAttribute
	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getName() {
		return name;
	}
	
	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAction() {
		return action;
	}
	
	@XmlAttribute
	public void setAction(String action) {
		this.action = action;
	}

	public String getMessageID() {
		return messageID;
	}

	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getTimeout() {
		return timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}			
	
}
