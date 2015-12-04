package br.ufpb.infrapacs.integrationAPI.mail;

import java.io.StringWriter;

import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import br.ufpb.infrapacs.integrationAPI.message.xml.ServiceIF;

public class SMTPSimpleContentStrategy implements MailContentStrategyIF {

	@Override
	public Multipart getContent(ServiceIF service) {
		Multipart multipart = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(service.getClass());
			
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			StringWriter str = new StringWriter();
			
			jaxbMarshaller.marshal(service, str);
			
			multipart = new MimeMultipart();
            
            MimeBodyPart attachment0 = new MimeBodyPart();
            
            attachment0.setContent(str.toString(),"text/xml; charset=UTF-8");
            
            multipart.addBodyPart(attachment0);
            
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		
		return multipart;

	}

}
