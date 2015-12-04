package br.ufpb.infrapacs.integrationAPI.message.xml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="service")
public class StorageUpdate extends Service {
	
	public static final String storageUpdateName = "Storage";
	public static final String storageUpdateAction = "Update";
	public static final String storageUpdateVersion = "1.0";
		
	private Object object;
	private URL url;
	
	public StorageUpdate(){
		super.setName(storageUpdateName);
		super.setAction(storageUpdateAction);
		super.setVersion(storageUpdateVersion);
		
	}
	
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public URL getUrl() {
		return url;
	}
	public void setUrl(URL url) {
		this.url = url;
	}
	
	

	
}
