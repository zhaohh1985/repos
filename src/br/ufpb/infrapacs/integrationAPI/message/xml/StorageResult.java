package br.ufpb.infrapacs.integrationAPI.message.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="service")
public class StorageResult extends Service {
	
	private List<Result> result;
	
	public StorageResult(){
		super.setName("Storage");
		super.setAction("Result");
		super.setVersion("1.0");
		
	}
	
	@XmlElementWrapper(name="results")
	public void setResult(List<Result> result) {
		this.result = result;
	}

	public List<Result> getResult() {
		return result;
	}


}
