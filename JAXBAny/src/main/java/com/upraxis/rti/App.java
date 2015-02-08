package com.upraxis.rti;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import uk.gov.govtalk.cm.envelope.GovTalkMessage;
import uk.gov.govtalk.cm.envelope.GovTalkMessage.Body;
import uk.gov.govtalk.cm.envelope.GovTalkMessage.GovTalkDetails;
import uk.gov.govtalk.cm.envelope.GovTalkMessage.Header;
import uk.gov.govtalk.taxation.paye.rti.fullpaymentsubmission._15_16._1.IRenvelope;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JAXBException
    {
    	JAXBContext jc = JAXBContext.newInstance(GovTalkMessage.class, IRenvelope.class, uk.gov.govtalk.taxation.paye.rti.fullpaymentsubmission._15_16._1.ObjectFactory.class
    			, uk.gov.govtalk.cm.envelope.ObjectFactory.class);
    	
    	Marshaller marshaller = jc.createMarshaller();
    	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    	
//        IRenvelope irenvelope = (IRenvelope) 
    	
    	GovTalkMessage govTalkMessage = new GovTalkMessage();
    	Header header = new Header();
		govTalkMessage.setHeader(header);
		govTalkMessage.setEnvelopeVersion("2.0");
		GovTalkDetails govTalkDetails = new GovTalkDetails();
		govTalkMessage.setGovTalkDetails(govTalkDetails);
		Body body = new Body();
		
		IRenvelope irenvelope = new IRenvelope();
		body.getAny().add(irenvelope);
		govTalkMessage.setBody(body);
    	marshaller.marshal(govTalkMessage, System.out);
    }
}
