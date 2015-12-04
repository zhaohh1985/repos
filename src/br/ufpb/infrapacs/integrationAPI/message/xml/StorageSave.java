package br.ufpb.infrapacs.integrationAPI.message.xml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="service")
public class StorageSave extends Service {
	
	private URL url;
	
	public StorageSave(){
		super.setName("Storage");
		super.setAction("Save");
		super.setVersion("1.0");
		
	}
	
	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}
	
}