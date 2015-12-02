package br.ufpb.infrapacs.integrationAPI.message.xml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="service")
public class StorageSave extends AbstractService {
	
	private URL url;
		
	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}
	
}