//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.06 at 07:33:19 PM PHT 
//


package uk.gov.govtalk.taxation.paye.rti.fullpaymentsubmission._15_16._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FullPaymentSubmission_YesNoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FullPaymentSubmission_YesNoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="no"/>
 *     &lt;enumeration value="yes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FullPaymentSubmission_YesNoType")
@XmlEnum
public enum FullPaymentSubmissionYesNoType {

    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("yes")
    YES("yes");
    private final String value;

    FullPaymentSubmissionYesNoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FullPaymentSubmissionYesNoType fromValue(String v) {
        for (FullPaymentSubmissionYesNoType c: FullPaymentSubmissionYesNoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
