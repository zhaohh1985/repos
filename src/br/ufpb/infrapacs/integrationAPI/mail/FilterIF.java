package br.ufpb.infrapacs.integrationAPI.mail;

import java.util.Date;

public interface FilterIF {
	
	public void setInitialDate(Date initialDate);
	
	public void setFinalDate(Date finalDate);
	
	public void setServiceType(int type);
	
	public void setId(String id);
	
	

}
