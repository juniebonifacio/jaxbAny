//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.06 at 07:33:19 PM PHT 
//


package uk.gov.govtalk.taxation.paye.rti.fullpaymentsubmission._15_16._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FullPaymentSubmission_ISOcurrencyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FullPaymentSubmission_ISOcurrencyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="GBP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FullPaymentSubmission_ISOcurrencyType")
@XmlEnum
public enum FullPaymentSubmissionISOcurrencyType {


    /**
     * Euro
     * 
     */
    EUR,

    /**
     * Sterling
     * 
     */
    GBP;

    public String value() {
        return name();
    }

    public static FullPaymentSubmissionISOcurrencyType fromValue(String v) {
        return valueOf(v);
    }

}
