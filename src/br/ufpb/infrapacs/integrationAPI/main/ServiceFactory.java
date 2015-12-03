package br.ufpb.infrapacs.integrationAPI.main;

import br.ufpb.infrapacs.integrationAPI.exceptions.ServiceCreationException;
import br.ufpb.infrapacs.integrationAPI.message.xml.ServiceIF;
import br.ufpb.infrapacs.integrationAPI.message.xml.StorageDelete;
import br.ufpb.infrapacs.integrationAPI.message.xml.StorageResult;
import br.ufpb.infrapacs.integrationAPI.message.xml.StorageSave;
import br.ufpb.infrapacs.integrationAPI.message.xml.StorageUpdate;
/**
 * Class for creating services
 * @author Danilo
 *
 */
public class ServiceFactory {
	/**
	 * StogareSave Service Identifier 
	 */
	public static final int STORAGE_SAVE = 1;
	/**
	 * StogareUpdate Service Identifier 
	 */
	public static final int STORAGE_UPDATE = 2;
	/**
	 * StogareDelete Service Identifier 
	 */
	public static final int STORAGE_DELETE = 3;
	/**
	 * StogareResult Service Identifier 
	 */
	public static final int STORAGE_RESULT = 4;

	/**
	 * Strategy of building services. Create a corresponding service provided identifier
	 * @param serviceId provided Identifier
	 * @return returns the Service or null if the serviceId is invalid 
	 */
	public static ServiceIF createService(int serviceId){
		
		ServiceIF service = null;
		switch (serviceId) {
		case STORAGE_SAVE:
			service = createStorageSave();
			break;
		case STORAGE_UPDATE:
			service = createStorageUpdate();
			break;
		case STORAGE_DELETE:
			service = createStorageDelete();
			break;
		case STORAGE_RESULT:
			service = createStorageResult();
			break;			
		default:
			break;
		}
		
		return service;
	}
	
	/**
	 * Strategy of building services. Create a corresponding service provided identifier
	 * @param serviceId provided Identifier
	 * @param idMessageGenerator Strategy to generate messageID
	 * @return returns the Service or null if the serviceId is invalid 
	 */
	public static ServiceIF createService(int serviceId, IdMessageGeneratorStrategyIF idMessageGenerator){
		
		ServiceIF service = createService(serviceId);
		
		if(service != null){
			service.setMessageID(idMessageGenerator.getNextId());
		}
		
		return service;
	}
	
	protected static ServiceIF createStorageSave(){
		
		//TODO elaborar uma forma melhor de fornecer a versão.
		ServiceIF service = null;
		
		try {
			
			service = createGenericService(StorageSave.class);
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ServiceCreationException e) {
			e.printStackTrace();
		}
		return service; 
		
		
	}
	
	protected  static ServiceIF createStorageUpdate(){
		
		//TODO elaborar uma forma melhor de fornecer a versão.
		ServiceIF service = null;
		
		try {
			
			service = createGenericService(StorageUpdate.class);
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ServiceCreationException e) {
			e.printStackTrace();
		}
		return service; 
		
		
	}
	
	
	protected static ServiceIF createStorageDelete(){
		
		//TODO elaborar uma forma melhor de fornecer a versão.
		ServiceIF service = null;
		
		try {
			
			service = createGenericService(StorageDelete.class);
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ServiceCreationException e) {
			e.printStackTrace();
		}
		return service; 
		
		
	}
	
	protected static ServiceIF createStorageResult(){
		
		//TODO elaborar uma forma melhor de fornecer a versão.
		ServiceIF service = null;
		
		try {
			
			service = createGenericService(StorageResult.class);
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ServiceCreationException e) {
			e.printStackTrace();
		}
		return service; 
		
		
	}
	
	protected  static ServiceIF createGenericService(Class serviceClass, String name, String action, String version) throws InstantiationException, IllegalAccessException, ServiceCreationException{
		
		
		ServiceIF service = createGenericService(serviceClass);
		
		service.setName(name);
		service.setAction(action);
		service.setVersion(version);
		return service;
				
			
	}
	
	
	protected  static ServiceIF createGenericService(Class serviceClass) throws InstantiationException, IllegalAccessException, ServiceCreationException{
		
		
		Object object = serviceClass.newInstance();
		
		if(object instanceof ServiceIF){
			
			return (ServiceIF) object;
			
		}else{
			//TODO elaborar os tipos de exception e internacionalizar as mensagens.
			throw new ServiceCreationException("Classe não é um serviço válido");
		}	
			
	}
}
