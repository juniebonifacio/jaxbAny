This project solves the problem below:

My goal is to be able to create the following sample xml message to a service provided by the UK government: https://drive.google.com/file/d/0Bwota60eLfeIbGdtUE9kQmlCN0E/view?usp=sharing

GovTalkMessage - is the main envelope for the xml message. Its java class is generated under envelope-v2-0-HMRC.xsd

Body - is an element inside the GovTalkMessage and has elements "anyAttribute" and "any". 

My problem is I need to be able to send the IRenvelope (an element from FullPaymentSubmission-2016-v1-2.xsd) inside the Body.


Basically this is what I have done:
1. Generated the Java classes from the two XSD files involved. 
The two XSD files involved are: 
envelope-v2-0-HMRC.xsd - link to file: https://drive.google.com/file/d/0Bwota60eLfeIN1duSGVhTE8xOWM/view?usp=sharing 
FullPaymentSubmission-2016-v1-2.xsd - link to file: https://drive.google.com/file/d/0Bwota60eLfeIbUtMN1RaMmt0LWM/view?usp=sharing

2. Created a unit test setting the values for GovTalkMessage object based on the values from SUBMISSION_REQUEST.xml

3. (This is where I had the problem). Setting the values for the Body, I need to form the IRenvelope to complete the xml, but what I got is a Body class with incomplete setters (there is no IRenvelope).

I only see the getAny and getOtherAttributes which I have played around and didn't work.

    //Body
    Body body = new Body();
    IRenvelope irEnvelope = new IRenvelope();
    body.getAny().add(irEnvelope);
    govTalkMessage.setBody(body);


I tried setting getAny with an instance of IRenvelope java class generated from FullPaymentSubmission-2016-v1-2.xsd but got the error below:

javax.xml.bind.MarshalException
 - with linked exception:
[com.sun.istack.internal.SAXException2: class com.rti.rim2016.v1_2.fps.generated.IRenvelope nor any of its super class is known to this context.
javax.xml.bind.JAXBException: class com.upraxis.rti.rim2016.v1_2.fps.generated.IRenvelope nor any of its super class is known to this context.]
    at com.sun.xml.internal.bind.v2.runtime.MarshallerImpl.write(MarshallerImpl.java:311)
    at com.sun.xml.internal.bind.v2.runtime.MarshallerImpl.marshal(MarshallerImpl.java:236)
    at javax.xml.bind.helpers.AbstractMarshallerImpl.marshal(AbstractMarshallerImpl.java:116)

Create a folder named 'generated' for the output java files"
$ mkdir generated;

Generate the java class files for 2 xsd files using xjc:
Assuming we have two xsd files saved under rti-rim-artefacts-2016-v1_2 folder

$ xjc -d generated rti-rim-artefacts-2016-v1_2/envelope-v2-0-HMRC.xsd rti-r
im-artefacts-2016-v1_2/FullPaymentSubmission-2016-v1-2.xsd 
