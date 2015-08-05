//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.05 at 11:05:25 AM CEST 
//


package com.ptc.tifworkbench.jaxbbinding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for DocumentModelDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentModelDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="significant-edits" type="{http://www.ptc.com/integrity-solution}SignificantEdits" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="role" type="{http://www.ptc.com/integrity-solution}DocumentRole" />
 *       &lt;attribute name="associated-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentModelDefinition", propOrder = {
    "significantEdits"
})
public class DocumentModelDefinition
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "significant-edits")
    protected SignificantEdits significantEdits;
    @XmlAttribute(name = "role")
    protected DocumentRole role;
    @XmlAttribute(name = "associated-type")
    protected String associatedType;

    /**
     * Gets the value of the significantEdits property.
     * 
     * @return
     *     possible object is
     *     {@link SignificantEdits }
     *     
     */
    public SignificantEdits getSignificantEdits() {
        return significantEdits;
    }

    /**
     * Sets the value of the significantEdits property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignificantEdits }
     *     
     */
    public void setSignificantEdits(SignificantEdits value) {
        this.significantEdits = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentRole }
     *     
     */
    public DocumentRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentRole }
     *     
     */
    public void setRole(DocumentRole value) {
        this.role = value;
    }

    /**
     * Gets the value of the associatedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedType() {
        return associatedType;
    }

    /**
     * Sets the value of the associatedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedType(String value) {
        this.associatedType = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DocumentModelDefinition)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DocumentModelDefinition that = ((DocumentModelDefinition) object);
        {
            SignificantEdits lhsSignificantEdits;
            lhsSignificantEdits = this.getSignificantEdits();
            SignificantEdits rhsSignificantEdits;
            rhsSignificantEdits = that.getSignificantEdits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "significantEdits", lhsSignificantEdits), LocatorUtils.property(thatLocator, "significantEdits", rhsSignificantEdits), lhsSignificantEdits, rhsSignificantEdits)) {
                return false;
            }
        }
        {
            DocumentRole lhsRole;
            lhsRole = this.getRole();
            DocumentRole rhsRole;
            rhsRole = that.getRole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "role", lhsRole), LocatorUtils.property(thatLocator, "role", rhsRole), lhsRole, rhsRole)) {
                return false;
            }
        }
        {
            String lhsAssociatedType;
            lhsAssociatedType = this.getAssociatedType();
            String rhsAssociatedType;
            rhsAssociatedType = that.getAssociatedType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "associatedType", lhsAssociatedType), LocatorUtils.property(thatLocator, "associatedType", rhsAssociatedType), lhsAssociatedType, rhsAssociatedType)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            SignificantEdits theSignificantEdits;
            theSignificantEdits = this.getSignificantEdits();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "significantEdits", theSignificantEdits), currentHashCode, theSignificantEdits);
        }
        {
            DocumentRole theRole;
            theRole = this.getRole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "role", theRole), currentHashCode, theRole);
        }
        {
            String theAssociatedType;
            theAssociatedType = this.getAssociatedType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "associatedType", theAssociatedType), currentHashCode, theAssociatedType);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            SignificantEdits theSignificantEdits;
            theSignificantEdits = this.getSignificantEdits();
            strategy.appendField(locator, this, "significantEdits", buffer, theSignificantEdits);
        }
        {
            DocumentRole theRole;
            theRole = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theRole);
        }
        {
            String theAssociatedType;
            theAssociatedType = this.getAssociatedType();
            strategy.appendField(locator, this, "associatedType", buffer, theAssociatedType);
        }
        return buffer;
    }

}
