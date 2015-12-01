package model;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="service")
public class StorageDelete extends Service {
	
	
	private List<Object> object;

	public List<Object> getObject() {
		return object;
	}
	
	@XmlElementWrapper(name="objects")
	public void setObject(List<Object> object) {
		this.object = object;
	}

}
