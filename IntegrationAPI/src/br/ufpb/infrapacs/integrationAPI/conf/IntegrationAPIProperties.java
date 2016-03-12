package br.ufpb.infrapacs.integrationAPI.conf;

import java.util.Properties;

public class IntegrationAPIProperties extends Properties {

	private static final long serialVersionUID = -2791416219757102761L;
	private static IntegrationAPIProperties instance;
	
	
	public static IntegrationAPIProperties getInstance() {
		if (instance == null) {
			instance = new IntegrationAPIProperties();
		}
		return instance;
	}

	
	private IntegrationAPIProperties () {
		super();
		try {
			
		} catch (Exception e) {
			//TODO - Log exception
		}		
	}
	
}
