//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.05 at 11:05:25 AM CEST 
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
 * <p>Java class for StatesDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatesDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="state" type="{http://www.ptc.com/integrity-solution}StateDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="edit-state" type="{http://www.ptc.com/integrity-solution}StateDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatesDefinition", propOrder = {
    "state",
    "editState"
})
public class StatesDefinition
    implements Equals, HashCode, ToString
{

    protected List<StateDefinition> state;
    @XmlElement(name = "edit-state")
    protected List<StateDefinition> editState;

    /**
     * Gets the value of the state property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the state property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StateDefinition }
     * 
     * 
     */
    public List<StateDefinition> getState() {
        if (state == null) {
            state = new ArrayList<StateDefinition>();
        }
        return this.state;
    }

    /**
     * Gets the value of the editState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StateDefinition }
     * 
     * 
     */
    public List<StateDefinition> getEditState() {
        if (editState == null) {
            editState = new ArrayList<StateDefinition>();
        }
        return this.editState;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StatesDefinition)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StatesDefinition that = ((StatesDefinition) object);
        {
            List<StateDefinition> lhsState;
            lhsState = this.getState();
            List<StateDefinition> rhsState;
            rhsState = that.getState();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "state", lhsState), LocatorUtils.property(thatLocator, "state", rhsState), lhsState, rhsState)) {
                return false;
            }
        }
        {
            List<StateDefinition> lhsEditState;
            lhsEditState = this.getEditState();
            List<StateDefinition> rhsEditState;
            rhsEditState = that.getEditState();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "editState", lhsEditState), LocatorUtils.property(thatLocator, "editState", rhsEditState), lhsEditState, rhsEditState)) {
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
            List<StateDefinition> theState;
            theState = this.getState();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "state", theState), currentHashCode, theState);
        }
        {
            List<StateDefinition> theEditState;
            theEditState = this.getEditState();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "editState", theEditState), currentHashCode, theEditState);
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
            List<StateDefinition> theState;
            theState = this.getState();
            strategy.appendField(locator, this, "state", buffer, theState);
        }
        {
            List<StateDefinition> theEditState;
            theEditState = this.getEditState();
            strategy.appendField(locator, this, "editState", buffer, theEditState);
        }
        return buffer;
    }

}
