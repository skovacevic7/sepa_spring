//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.10 at 12:23:06 AM CEST 
//


package sk.sepa.schema.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Authorisation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Authorisation1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTH"/>
 *     &lt;enumeration value="FDET"/>
 *     &lt;enumeration value="FSUM"/>
 *     &lt;enumeration value="ILEV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Authorisation1Code")
@XmlEnum
public enum Authorisation1Code {

    AUTH,
    FDET,
    FSUM,
    ILEV;

    public String value() {
        return name();
    }

    public static Authorisation1Code fromValue(String v) {
        return valueOf(v);
    }

}
