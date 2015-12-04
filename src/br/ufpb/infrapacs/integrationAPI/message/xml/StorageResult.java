package br.ufpb.infrapacs.integrationAPI.message.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="service")
public class StorageResult extends Service {
	
	public static final String storageResultName = "Storage";
	public static final String storageResultAction = "Update";
	public static final String storageResultVersion = "1.0";
	
	private List<Result> result;
	
	public StorageResult(){
		super.setName(storageResultName);
		super.setAction(storageResultAction);
		super.setVersion(storageResultName);
		
	}
	
	@XmlElementWrapper(name="results")
	public void setResult(List<Result> result) {
		this.result = result;
	}

	public List<Result> getResult() {
		return result;
	}


}
