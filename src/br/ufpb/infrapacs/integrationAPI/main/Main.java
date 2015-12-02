package br.ufpb.infrapacs.integrationAPI.main;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import br.ufpb.infrapacs.integrationAPI.message.xml.Completed;
import br.ufpb.infrapacs.integrationAPI.message.xml.Credentials;
import br.ufpb.infrapacs.integrationAPI.message.xml.Object;
import br.ufpb.infrapacs.integrationAPI.message.xml.Result;
import br.ufpb.infrapacs.integrationAPI.message.xml.StorageDelete;
import br.ufpb.infrapacs.integrationAPI.message.xml.StorageResult;
import br.ufpb.infrapacs.integrationAPI.message.xml.StorageSave;
import br.ufpb.infrapacs.integrationAPI.message.xml.URL;

public class Main {

	public static void main(String[] args) {
		storageSave();
		storageDelete();
		storageResult();
	}
	
	public static void storageResult() {
		
		StorageResult storageResult = new StorageResult();
		storageResult.setMessageID("312312");		
		storageResult.setTimestamp("12346567346");
		storageResult.setTimeout("23123");		
		storageResult.setAction("Result");
		storageResult.setName("Storage");
		storageResult.setVersion("1.0");
								
		Result result1 = new Result();
		result1.setOriginalMessageID("273912873912");
		result1.setTimestamp("88729371923");
		
		Completed completed = new Completed();
		completed.setStatus("1");
		completed.setCompletedMessage("Completed message 001 002");
		result1.setCompleted(completed);
		
		Object obj1 = new Object();
		obj1.setId("12345");
		obj1.setType("objType1");
		
		List<Result> results = new ArrayList<Result>();
		results.add(result1);
		storageResult.setResult(results);
		
		List<Object> objects = new ArrayList<Object>();
		objects.add(obj1);
		result1.setObjects(objects);		
		
		try {
			File file = new File("C:\\temp\\storageResult.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(StorageResult.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(storageResult, file);
			jaxbMarshaller.marshal(storageResult, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public static void storageDelete() {
		
		StorageDelete storageDelete = new StorageDelete();
		storageDelete.setMessageID("312312");		
		storageDelete.setTimestamp("12346567346");
		storageDelete.setTimeout("23123");		
		storageDelete.setAction("Save");
		storageDelete.setName("Storage");
		storageDelete.setVersion("1.0");
		
		Object obj1 = new Object();
		obj1.setId("1");
		obj1.setType("type1");
		Credentials cred1 = new Credentials();
		cred1.setValue("asdfh");
		obj1.setCredential(cred1);
		
		Object obj2 = new Object();
		obj2.setId("2");
		obj2.setType("type2");
		Credentials cred2 = new Credentials();
		cred2.setValue("1we1233");
		obj2.setCredential(cred2);
		
		List<Object> objects = new ArrayList<Object>();
		objects.add(obj1);
		objects.add(obj2);
		storageDelete.setObject(objects);
						
		try {
			File file = new File("C:\\temp\\storageDelete.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(StorageDelete.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(storageDelete, file);
			jaxbMarshaller.marshal(storageDelete, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void storageSave() {
		
		StorageSave storageSave = new StorageSave();

		storageSave.setMessageID("123456");
		storageSave.setTimestamp("12346567346");
		storageSave.setTimeout("23123");

		URL url = new URL();
		url.setValue("a");
		
		Credentials cred = new Credentials();
		cred.setValue("credentialValue");
		url.setCredentials(cred);
		storageSave.setUrl(url);

		storageSave.setAction("Save");
		storageSave.setName("Storage");
		storageSave.setVersion("1.0");

		try {
			File file = new File("C:\\temp\\storageSave.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(StorageSave.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(storageSave, file);
			jaxbMarshaller.marshal(storageSave, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
