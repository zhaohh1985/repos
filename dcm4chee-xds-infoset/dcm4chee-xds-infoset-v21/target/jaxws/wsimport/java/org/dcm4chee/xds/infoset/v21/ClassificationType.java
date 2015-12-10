
package org.dcm4chee.xds.infoset.v21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Classification is the mapping of the same named interface in ebRIM.
 * It extends RegistryObject.
 * 
 * A Classification specifies references to two registry entrys.
 * 
 * The classifiedObject is id of the Object being classified.
 * The classificationNode is id of the ClassificationNode classying the object
 * 			
 * 
 * <p>Java class for ClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassificationType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}RegistryObjectType">
 *       &lt;attribute name="classificationScheme" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="classifiedObject" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="classificationNode" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="nodeRepresentation" type="{urn:oasis:names:tc:ebxml-regrep:rim:xsd:2.1}LongName" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationType")
public class ClassificationType
    extends RegistryObjectType
{

    @XmlAttribute
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object classificationScheme;
    @XmlAttribute(required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object classifiedObject;
    @XmlAttribute
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object classificationNode;
    @XmlAttribute
    protected String nodeRepresentation;

    /**
     * Gets the value of the classificationScheme property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getClassificationScheme() {
        return classificationScheme;
    }

    /**
     * Sets the value of the classificationScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setClassificationScheme(Object value) {
        this.classificationScheme = value;
    }

    /**
     * Gets the value of the classifiedObject property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getClassifiedObject() {
        return classifiedObject;
    }

    /**
     * Sets the value of the classifiedObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setClassifiedObject(Object value) {
        this.classifiedObject = value;
    }

    /**
     * Gets the value of the classificationNode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getClassificationNode() {
        return classificationNode;
    }

    /**
     * Sets the value of the classificationNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setClassificationNode(Object value) {
        this.classificationNode = value;
    }

    /**
     * Gets the value of the nodeRepresentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeRepresentation() {
        return nodeRepresentation;
    }

    /**
     * Sets the value of the nodeRepresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeRepresentation(String value) {
        this.nodeRepresentation = value;
    }

}
