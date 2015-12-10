
package org.dcm4chee.xds.infoset.v21;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RegistryEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistryEntryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}RegistryObjectType">
 *       &lt;attribute name="expiration" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="majorVersion" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       &lt;attribute name="minorVersion" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="stability">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Dynamic"/>
 *             &lt;enumeration value="DynamicCompatible"/>
 *             &lt;enumeration value="Static"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="status">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Submitted"/>
 *             &lt;enumeration value="Approved"/>
 *             &lt;enumeration value="Deprecated"/>
 *             &lt;enumeration value="Withdrawn"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="userVersion" type="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}ShortName" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryEntryType")
@XmlSeeAlso({
    ExtrinsicObjectType.class,
    RegistryPackageType.class
})
public class RegistryEntryType
    extends RegistryObjectType
{

    @XmlAttribute
    protected XMLGregorianCalendar expiration;
    @XmlAttribute
    protected BigInteger majorVersion;
    @XmlAttribute
    protected BigInteger minorVersion;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stability;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;
    @XmlAttribute
    protected String userVersion;

    /**
     * Gets the value of the expiration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiration(XMLGregorianCalendar value) {
        this.expiration = value;
    }

    /**
     * Gets the value of the majorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMajorVersion() {
        if (majorVersion == null) {
            return new BigInteger("1");
        } else {
            return majorVersion;
        }
    }

    /**
     * Sets the value of the majorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMajorVersion(BigInteger value) {
        this.majorVersion = value;
    }

    /**
     * Gets the value of the minorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinorVersion() {
        if (minorVersion == null) {
            return new BigInteger("0");
        } else {
            return minorVersion;
        }
    }

    /**
     * Sets the value of the minorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinorVersion(BigInteger value) {
        this.minorVersion = value;
    }

    /**
     * Gets the value of the stability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStability() {
        return stability;
    }

    /**
     * Sets the value of the stability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStability(String value) {
        this.stability = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the userVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserVersion() {
        return userVersion;
    }

    /**
     * Sets the value of the userVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserVersion(String value) {
        this.userVersion = value;
    }

}
