Create a folder named 'generated' for the output java files"
$ mkdir generated;

Generate the java class files for 2 xsd files using xjc:
Assuming we have two xsd files saved under rti-rim-artefacts-2016-v1_2 folder

$ xjc -d generated rti-rim-artefacts-2016-v1_2/envelope-v2-0-HMRC.xsd rti-r
im-artefacts-2016-v1_2/FullPaymentSubmission-2016-v1-2.xsd 
