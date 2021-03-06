//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.05 at 03:54:57 PM CEST 
//


package com.ptc.tifworkbench.jaxbbinding;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for DynamicGroupsDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicGroupsDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dynamic-group" type="{http://www.ptc.com/integrity-solution}DynamicGroupDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="edit-dynamic-group" type="{http://www.ptc.com/integrity-solution}DynamicGroupDefinition"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicGroupsDefinition", propOrder = {
    "dynamicGroup",
    "editDynamicGroup"
})
public class DynamicGroupsDefinition
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "dynamic-group")
    protected List<DynamicGroupDefinition> dynamicGroup;
    @XmlElement(name = "edit-dynamic-group", required = true)
    protected DynamicGroupDefinition editDynamicGroup;

    /**
     * Gets the value of the dynamicGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dynamicGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDynamicGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DynamicGroupDefinition }
     * 
     * 
     */
    public List<DynamicGroupDefinition> getDynamicGroup() {
        if (dynamicGroup == null) {
            dynamicGroup = new ArrayList<DynamicGroupDefinition>();
        }
        return this.dynamicGroup;
    }

    /**
     * Gets the value of the editDynamicGroup property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicGroupDefinition }
     *     
     */
    public DynamicGroupDefinition getEditDynamicGroup() {
        return editDynamicGroup;
    }

    /**
     * Sets the value of the editDynamicGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicGroupDefinition }
     *     
     */
    public void setEditDynamicGroup(DynamicGroupDefinition value) {
        this.editDynamicGroup = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DynamicGroupsDefinition)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DynamicGroupsDefinition that = ((DynamicGroupsDefinition) object);
        {
            List<DynamicGroupDefinition> lhsDynamicGroup;
            lhsDynamicGroup = this.getDynamicGroup();
            List<DynamicGroupDefinition> rhsDynamicGroup;
            rhsDynamicGroup = that.getDynamicGroup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dynamicGroup", lhsDynamicGroup), LocatorUtils.property(thatLocator, "dynamicGroup", rhsDynamicGroup), lhsDynamicGroup, rhsDynamicGroup)) {
                return false;
            }
        }
        {
            DynamicGroupDefinition lhsEditDynamicGroup;
            lhsEditDynamicGroup = this.getEditDynamicGroup();
            DynamicGroupDefinition rhsEditDynamicGroup;
            rhsEditDynamicGroup = that.getEditDynamicGroup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "editDynamicGroup", lhsEditDynamicGroup), LocatorUtils.property(thatLocator, "editDynamicGroup", rhsEditDynamicGroup), lhsEditDynamicGroup, rhsEditDynamicGroup)) {
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
            List<DynamicGroupDefinition> theDynamicGroup;
            theDynamicGroup = this.getDynamicGroup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dynamicGroup", theDynamicGroup), currentHashCode, theDynamicGroup);
        }
        {
            DynamicGroupDefinition theEditDynamicGroup;
            theEditDynamicGroup = this.getEditDynamicGroup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "editDynamicGroup", theEditDynamicGroup), currentHashCode, theEditDynamicGroup);
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
            List<DynamicGroupDefinition> theDynamicGroup;
            theDynamicGroup = this.getDynamicGroup();
            strategy.appendField(locator, this, "dynamicGroup", buffer, theDynamicGroup);
        }
        {
            DynamicGroupDefinition theEditDynamicGroup;
            theEditDynamicGroup = this.getEditDynamicGroup();
            strategy.appendField(locator, this, "editDynamicGroup", buffer, theEditDynamicGroup);
        }
        return buffer;
    }

}
