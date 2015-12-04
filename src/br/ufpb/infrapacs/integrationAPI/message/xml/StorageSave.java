package br.ufpb.infrapacs.integrationAPI.message.xml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="service")
public class StorageSave extends Service {
	
	public static final String storageSaveName = "Storage";
	public static final String storageSaveAction = "Save";
	public static final String storageSaveVersion = "1.0";
	
	private URL url;
	
	public StorageSave(){
		super.setName(storageSaveName);
		super.setAction(storageSaveAction);
		super.setVersion(storageSaveVersion);		
	}
	
	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}
	
}