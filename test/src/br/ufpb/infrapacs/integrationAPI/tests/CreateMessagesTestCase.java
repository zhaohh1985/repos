package br.ufpb.infrapacs.integrationAPI.tests;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Test;

import br.ufpb.infrapacs.integrationAPI.message.xml.Completed;
import br.ufpb.infrapacs.integrationAPI.message.xml.Credentials;
import br.ufpb.infrapacs.integrationAPI.message.xml.Object;
import br.ufpb.infrapacs.integrationAPI.message.xml.Result;
import br.ufpb.infrapacs.integrationAPI.message.xml.StorageResult;
import br.ufpb.infrapacs.integrationAPI.message.xml.StorageSave;
import br.ufpb.infrapacs.integrationAPI.message.xml.URL;

public class CreateMessagesTestCase extends GenericTestCase {
	
	@Test
	public void testStorageResultMessage() {
		StorageResult storageResult = new StorageResult();
		
		storageResult.setMessageID("312312");		
		storageResult.setTimestamp("12346567346");
		storageResult.setTimeout("23123");			
								
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
			
			
			StringBuffer xmlStr = new StringBuffer();
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			//File file = new File(outputDir + "storageResult.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(StorageResult.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			//jaxbMarshaller.marshal(storageResult, file);
			jaxbMarshaller.marshal(storageResult, os);
			System.out.println(os.toString());
			
			assertTrue( os!= null && os.size() > 0);
			//assertTrue(file.exists() && file.length() > 0);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	@Test	
	public void testStorageSendMessage() {

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

		try {
			File file = new File(outputDir + "storageSave.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(StorageSave.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(storageSave, file);
			jaxbMarshaller.marshal(storageSave, System.out);
			
			assertTrue(file.exists() && file.length() > 0);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
