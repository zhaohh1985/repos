package br.ufpb.infrapacs.integrationAPI.message.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="service")
public class StorageDelete extends Service {
	
	public static final String storageDeleteName = "Storage";
	public static final String storageDeleteAction = "Delete";
	public static final String storageDeleteVersion = "1.0";		
		
	public StorageDelete(){
		super.setName(storageDeleteName);
		super.setAction(storageDeleteAction);
		super.setVersion(storageDeleteVersion);		
	}
	
	private List<Object> object;

	public List<Object> getObject() {
		return object;
	}
	
	@XmlElementWrapper(name="objects")
	public void setObject(List<Object> object) {
		this.object = object;
	}

}
