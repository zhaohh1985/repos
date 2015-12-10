
package org.dcm4chee.xds.infoset.v21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * ExternalIdentifier is the mapping of the same named interface in ebRIM.
 * It extends RegistryObject.
 * 			
 * 
 * <p>Java class for ExternalIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalIdentifierType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}RegistryObjectType">
 *       &lt;attribute name="registryObject" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="identificationScheme" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="value" use="required" type="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}ShortName" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalIdentifierType")
public class ExternalIdentifierType
    extends RegistryObjectType
{

    @XmlAttribute
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object registryObject;
    @XmlAttribute(required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object identificationScheme;
    @XmlAttribute(required = true)
    protected String value;

    /**
     * Gets the value of the registryObject property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRegistryObject() {
        return registryObject;
    }

    /**
     * Sets the value of the registryObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRegistryObject(Object value) {
        this.registryObject = value;
    }

    /**
     * Gets the value of the identificationScheme property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIdentificationScheme() {
        return identificationScheme;
    }

    /**
     * Sets the value of the identificationScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIdentificationScheme(Object value) {
        this.identificationScheme = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
