package br.ufpb.infrapacs.integrationAPI.message.xml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="service")
public class StorageUpdate extends Service {
		
	private Object object;
	private URL url;
	
	public StorageUpdate(){
		super.setName("Storage");
		super.setAction("Update");
		super.setVersion("1.0");
		
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
