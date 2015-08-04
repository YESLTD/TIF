//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.04 at 02:28:19 PM CEST 
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
 * <p>Java class for TypeDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fields" type="{http://www.ptc.com/integrity-solution}FieldsReference"/>
 *         &lt;element name="states" type="{http://www.ptc.com/integrity-solution}StatesReference"/>
 *         &lt;element name="copyFields" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="editability" type="{http://www.ptc.com/integrity-solution}EditabilityRule"/>
 *         &lt;element name="properties" type="{http://www.ptc.com/integrity-solution}PropertiesDefinition" minOccurs="0"/>
 *         &lt;element name="document-model" type="{http://www.ptc.com/integrity-solution}DocumentModelDefinition" minOccurs="0"/>
 *         &lt;element name="test-management" type="{http://www.ptc.com/integrity-solution}TestManagementDefintion" minOccurs="0"/>
 *         &lt;element name="constraints" type="{http://www.ptc.com/integrity-solution}ConstraintsDefinition" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="attachments" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="show-workflow" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="phase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="time-tracking" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="cp-policy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="backsProject" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="haveRevisions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="canDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="show-history" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="allowCP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="canLabel" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="presentation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeDefinition", propOrder = {
    "fields",
    "states",
    "copyFields",
    "editability",
    "properties",
    "documentModel",
    "testManagement",
    "constraints",
    "description"
})
public class TypeDefinition
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected FieldsReference fields;
    @XmlElement(required = true)
    protected StatesReference states;
    @XmlElement(required = true)
    protected String copyFields;
    @XmlElement(required = true)
    protected EditabilityRule editability;
    protected PropertiesDefinition properties;
    @XmlElement(name = "document-model")
    protected DocumentModelDefinition documentModel;
    @XmlElement(name = "test-management")
    protected TestManagementDefintion testManagement;
    protected ConstraintsDefinition constraints;
    protected String description;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "attachments")
    protected String attachments;
    @XmlAttribute(name = "show-workflow")
    protected Boolean showWorkflow;
    @XmlAttribute(name = "phase")
    protected String phase;
    @XmlAttribute(name = "time-tracking")
    protected Boolean timeTracking;
    @XmlAttribute(name = "cp-policy")
    protected String cpPolicy;
    @XmlAttribute(name = "backsProject")
    protected Boolean backsProject;
    @XmlAttribute(name = "haveRevisions")
    protected Boolean haveRevisions;
    @XmlAttribute(name = "canDelete")
    protected Boolean canDelete;
    @XmlAttribute(name = "show-history")
    protected Boolean showHistory;
    @XmlAttribute(name = "allowCP")
    protected Boolean allowCP;
    @XmlAttribute(name = "canLabel")
    protected Boolean canLabel;
    @XmlAttribute(name = "presentation")
    protected String presentation;

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link FieldsReference }
     *     
     */
    public FieldsReference getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldsReference }
     *     
     */
    public void setFields(FieldsReference value) {
        this.fields = value;
    }

    /**
     * Gets the value of the states property.
     * 
     * @return
     *     possible object is
     *     {@link StatesReference }
     *     
     */
    public StatesReference getStates() {
        return states;
    }

    /**
     * Sets the value of the states property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatesReference }
     *     
     */
    public void setStates(StatesReference value) {
        this.states = value;
    }

    /**
     * Gets the value of the copyFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyFields() {
        return copyFields;
    }

    /**
     * Sets the value of the copyFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyFields(String value) {
        this.copyFields = value;
    }

    /**
     * Gets the value of the editability property.
     * 
     * @return
     *     possible object is
     *     {@link EditabilityRule }
     *     
     */
    public EditabilityRule getEditability() {
        return editability;
    }

    /**
     * Sets the value of the editability property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditabilityRule }
     *     
     */
    public void setEditability(EditabilityRule value) {
        this.editability = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesDefinition }
     *     
     */
    public PropertiesDefinition getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesDefinition }
     *     
     */
    public void setProperties(PropertiesDefinition value) {
        this.properties = value;
    }

    /**
     * Gets the value of the documentModel property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentModelDefinition }
     *     
     */
    public DocumentModelDefinition getDocumentModel() {
        return documentModel;
    }

    /**
     * Sets the value of the documentModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentModelDefinition }
     *     
     */
    public void setDocumentModel(DocumentModelDefinition value) {
        this.documentModel = value;
    }

    /**
     * Gets the value of the testManagement property.
     * 
     * @return
     *     possible object is
     *     {@link TestManagementDefintion }
     *     
     */
    public TestManagementDefintion getTestManagement() {
        return testManagement;
    }

    /**
     * Sets the value of the testManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestManagementDefintion }
     *     
     */
    public void setTestManagement(TestManagementDefintion value) {
        this.testManagement = value;
    }

    /**
     * Gets the value of the constraints property.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintsDefinition }
     *     
     */
    public ConstraintsDefinition getConstraints() {
        return constraints;
    }

    /**
     * Sets the value of the constraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintsDefinition }
     *     
     */
    public void setConstraints(ConstraintsDefinition value) {
        this.constraints = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachments(String value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the showWorkflow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowWorkflow() {
        return showWorkflow;
    }

    /**
     * Sets the value of the showWorkflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowWorkflow(Boolean value) {
        this.showWorkflow = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhase(String value) {
        this.phase = value;
    }

    /**
     * Gets the value of the timeTracking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeTracking() {
        return timeTracking;
    }

    /**
     * Sets the value of the timeTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeTracking(Boolean value) {
        this.timeTracking = value;
    }

    /**
     * Gets the value of the cpPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpPolicy() {
        return cpPolicy;
    }

    /**
     * Sets the value of the cpPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpPolicy(String value) {
        this.cpPolicy = value;
    }

    /**
     * Gets the value of the backsProject property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBacksProject() {
        return backsProject;
    }

    /**
     * Sets the value of the backsProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBacksProject(Boolean value) {
        this.backsProject = value;
    }

    /**
     * Gets the value of the haveRevisions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHaveRevisions() {
        return haveRevisions;
    }

    /**
     * Sets the value of the haveRevisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHaveRevisions(Boolean value) {
        this.haveRevisions = value;
    }

    /**
     * Gets the value of the canDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanDelete() {
        return canDelete;
    }

    /**
     * Sets the value of the canDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanDelete(Boolean value) {
        this.canDelete = value;
    }

    /**
     * Gets the value of the showHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowHistory() {
        return showHistory;
    }

    /**
     * Sets the value of the showHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowHistory(Boolean value) {
        this.showHistory = value;
    }

    /**
     * Gets the value of the allowCP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowCP() {
        return allowCP;
    }

    /**
     * Sets the value of the allowCP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowCP(Boolean value) {
        this.allowCP = value;
    }

    /**
     * Gets the value of the canLabel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanLabel() {
        return canLabel;
    }

    /**
     * Sets the value of the canLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanLabel(Boolean value) {
        this.canLabel = value;
    }

    /**
     * Gets the value of the presentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentation() {
        return presentation;
    }

    /**
     * Sets the value of the presentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentation(String value) {
        this.presentation = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TypeDefinition)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TypeDefinition that = ((TypeDefinition) object);
        {
            FieldsReference lhsFields;
            lhsFields = this.getFields();
            FieldsReference rhsFields;
            rhsFields = that.getFields();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fields", lhsFields), LocatorUtils.property(thatLocator, "fields", rhsFields), lhsFields, rhsFields)) {
                return false;
            }
        }
        {
            StatesReference lhsStates;
            lhsStates = this.getStates();
            StatesReference rhsStates;
            rhsStates = that.getStates();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "states", lhsStates), LocatorUtils.property(thatLocator, "states", rhsStates), lhsStates, rhsStates)) {
                return false;
            }
        }
        {
            String lhsCopyFields;
            lhsCopyFields = this.getCopyFields();
            String rhsCopyFields;
            rhsCopyFields = that.getCopyFields();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "copyFields", lhsCopyFields), LocatorUtils.property(thatLocator, "copyFields", rhsCopyFields), lhsCopyFields, rhsCopyFields)) {
                return false;
            }
        }
        {
            EditabilityRule lhsEditability;
            lhsEditability = this.getEditability();
            EditabilityRule rhsEditability;
            rhsEditability = that.getEditability();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "editability", lhsEditability), LocatorUtils.property(thatLocator, "editability", rhsEditability), lhsEditability, rhsEditability)) {
                return false;
            }
        }
        {
            PropertiesDefinition lhsProperties;
            lhsProperties = this.getProperties();
            PropertiesDefinition rhsProperties;
            rhsProperties = that.getProperties();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "properties", lhsProperties), LocatorUtils.property(thatLocator, "properties", rhsProperties), lhsProperties, rhsProperties)) {
                return false;
            }
        }
        {
            DocumentModelDefinition lhsDocumentModel;
            lhsDocumentModel = this.getDocumentModel();
            DocumentModelDefinition rhsDocumentModel;
            rhsDocumentModel = that.getDocumentModel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentModel", lhsDocumentModel), LocatorUtils.property(thatLocator, "documentModel", rhsDocumentModel), lhsDocumentModel, rhsDocumentModel)) {
                return false;
            }
        }
        {
            TestManagementDefintion lhsTestManagement;
            lhsTestManagement = this.getTestManagement();
            TestManagementDefintion rhsTestManagement;
            rhsTestManagement = that.getTestManagement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testManagement", lhsTestManagement), LocatorUtils.property(thatLocator, "testManagement", rhsTestManagement), lhsTestManagement, rhsTestManagement)) {
                return false;
            }
        }
        {
            ConstraintsDefinition lhsConstraints;
            lhsConstraints = this.getConstraints();
            ConstraintsDefinition rhsConstraints;
            rhsConstraints = that.getConstraints();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constraints", lhsConstraints), LocatorUtils.property(thatLocator, "constraints", rhsConstraints), lhsConstraints, rhsConstraints)) {
                return false;
            }
        }
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsAttachments;
            lhsAttachments = this.getAttachments();
            String rhsAttachments;
            rhsAttachments = that.getAttachments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachments", lhsAttachments), LocatorUtils.property(thatLocator, "attachments", rhsAttachments), lhsAttachments, rhsAttachments)) {
                return false;
            }
        }
        {
            Boolean lhsShowWorkflow;
            lhsShowWorkflow = this.isShowWorkflow();
            Boolean rhsShowWorkflow;
            rhsShowWorkflow = that.isShowWorkflow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showWorkflow", lhsShowWorkflow), LocatorUtils.property(thatLocator, "showWorkflow", rhsShowWorkflow), lhsShowWorkflow, rhsShowWorkflow)) {
                return false;
            }
        }
        {
            String lhsPhase;
            lhsPhase = this.getPhase();
            String rhsPhase;
            rhsPhase = that.getPhase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phase", lhsPhase), LocatorUtils.property(thatLocator, "phase", rhsPhase), lhsPhase, rhsPhase)) {
                return false;
            }
        }
        {
            Boolean lhsTimeTracking;
            lhsTimeTracking = this.isTimeTracking();
            Boolean rhsTimeTracking;
            rhsTimeTracking = that.isTimeTracking();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeTracking", lhsTimeTracking), LocatorUtils.property(thatLocator, "timeTracking", rhsTimeTracking), lhsTimeTracking, rhsTimeTracking)) {
                return false;
            }
        }
        {
            String lhsCpPolicy;
            lhsCpPolicy = this.getCpPolicy();
            String rhsCpPolicy;
            rhsCpPolicy = that.getCpPolicy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cpPolicy", lhsCpPolicy), LocatorUtils.property(thatLocator, "cpPolicy", rhsCpPolicy), lhsCpPolicy, rhsCpPolicy)) {
                return false;
            }
        }
        {
            Boolean lhsBacksProject;
            lhsBacksProject = this.isBacksProject();
            Boolean rhsBacksProject;
            rhsBacksProject = that.isBacksProject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "backsProject", lhsBacksProject), LocatorUtils.property(thatLocator, "backsProject", rhsBacksProject), lhsBacksProject, rhsBacksProject)) {
                return false;
            }
        }
        {
            Boolean lhsHaveRevisions;
            lhsHaveRevisions = this.isHaveRevisions();
            Boolean rhsHaveRevisions;
            rhsHaveRevisions = that.isHaveRevisions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haveRevisions", lhsHaveRevisions), LocatorUtils.property(thatLocator, "haveRevisions", rhsHaveRevisions), lhsHaveRevisions, rhsHaveRevisions)) {
                return false;
            }
        }
        {
            Boolean lhsCanDelete;
            lhsCanDelete = this.isCanDelete();
            Boolean rhsCanDelete;
            rhsCanDelete = that.isCanDelete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "canDelete", lhsCanDelete), LocatorUtils.property(thatLocator, "canDelete", rhsCanDelete), lhsCanDelete, rhsCanDelete)) {
                return false;
            }
        }
        {
            Boolean lhsShowHistory;
            lhsShowHistory = this.isShowHistory();
            Boolean rhsShowHistory;
            rhsShowHistory = that.isShowHistory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showHistory", lhsShowHistory), LocatorUtils.property(thatLocator, "showHistory", rhsShowHistory), lhsShowHistory, rhsShowHistory)) {
                return false;
            }
        }
        {
            Boolean lhsAllowCP;
            lhsAllowCP = this.isAllowCP();
            Boolean rhsAllowCP;
            rhsAllowCP = that.isAllowCP();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowCP", lhsAllowCP), LocatorUtils.property(thatLocator, "allowCP", rhsAllowCP), lhsAllowCP, rhsAllowCP)) {
                return false;
            }
        }
        {
            Boolean lhsCanLabel;
            lhsCanLabel = this.isCanLabel();
            Boolean rhsCanLabel;
            rhsCanLabel = that.isCanLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "canLabel", lhsCanLabel), LocatorUtils.property(thatLocator, "canLabel", rhsCanLabel), lhsCanLabel, rhsCanLabel)) {
                return false;
            }
        }
        {
            String lhsPresentation;
            lhsPresentation = this.getPresentation();
            String rhsPresentation;
            rhsPresentation = that.getPresentation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "presentation", lhsPresentation), LocatorUtils.property(thatLocator, "presentation", rhsPresentation), lhsPresentation, rhsPresentation)) {
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
            FieldsReference theFields;
            theFields = this.getFields();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fields", theFields), currentHashCode, theFields);
        }
        {
            StatesReference theStates;
            theStates = this.getStates();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "states", theStates), currentHashCode, theStates);
        }
        {
            String theCopyFields;
            theCopyFields = this.getCopyFields();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "copyFields", theCopyFields), currentHashCode, theCopyFields);
        }
        {
            EditabilityRule theEditability;
            theEditability = this.getEditability();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "editability", theEditability), currentHashCode, theEditability);
        }
        {
            PropertiesDefinition theProperties;
            theProperties = this.getProperties();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "properties", theProperties), currentHashCode, theProperties);
        }
        {
            DocumentModelDefinition theDocumentModel;
            theDocumentModel = this.getDocumentModel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentModel", theDocumentModel), currentHashCode, theDocumentModel);
        }
        {
            TestManagementDefintion theTestManagement;
            theTestManagement = this.getTestManagement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testManagement", theTestManagement), currentHashCode, theTestManagement);
        }
        {
            ConstraintsDefinition theConstraints;
            theConstraints = this.getConstraints();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "constraints", theConstraints), currentHashCode, theConstraints);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theAttachments;
            theAttachments = this.getAttachments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachments", theAttachments), currentHashCode, theAttachments);
        }
        {
            Boolean theShowWorkflow;
            theShowWorkflow = this.isShowWorkflow();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "showWorkflow", theShowWorkflow), currentHashCode, theShowWorkflow);
        }
        {
            String thePhase;
            thePhase = this.getPhase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "phase", thePhase), currentHashCode, thePhase);
        }
        {
            Boolean theTimeTracking;
            theTimeTracking = this.isTimeTracking();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeTracking", theTimeTracking), currentHashCode, theTimeTracking);
        }
        {
            String theCpPolicy;
            theCpPolicy = this.getCpPolicy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cpPolicy", theCpPolicy), currentHashCode, theCpPolicy);
        }
        {
            Boolean theBacksProject;
            theBacksProject = this.isBacksProject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "backsProject", theBacksProject), currentHashCode, theBacksProject);
        }
        {
            Boolean theHaveRevisions;
            theHaveRevisions = this.isHaveRevisions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "haveRevisions", theHaveRevisions), currentHashCode, theHaveRevisions);
        }
        {
            Boolean theCanDelete;
            theCanDelete = this.isCanDelete();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "canDelete", theCanDelete), currentHashCode, theCanDelete);
        }
        {
            Boolean theShowHistory;
            theShowHistory = this.isShowHistory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "showHistory", theShowHistory), currentHashCode, theShowHistory);
        }
        {
            Boolean theAllowCP;
            theAllowCP = this.isAllowCP();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowCP", theAllowCP), currentHashCode, theAllowCP);
        }
        {
            Boolean theCanLabel;
            theCanLabel = this.isCanLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "canLabel", theCanLabel), currentHashCode, theCanLabel);
        }
        {
            String thePresentation;
            thePresentation = this.getPresentation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "presentation", thePresentation), currentHashCode, thePresentation);
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
            FieldsReference theFields;
            theFields = this.getFields();
            strategy.appendField(locator, this, "fields", buffer, theFields);
        }
        {
            StatesReference theStates;
            theStates = this.getStates();
            strategy.appendField(locator, this, "states", buffer, theStates);
        }
        {
            String theCopyFields;
            theCopyFields = this.getCopyFields();
            strategy.appendField(locator, this, "copyFields", buffer, theCopyFields);
        }
        {
            EditabilityRule theEditability;
            theEditability = this.getEditability();
            strategy.appendField(locator, this, "editability", buffer, theEditability);
        }
        {
            PropertiesDefinition theProperties;
            theProperties = this.getProperties();
            strategy.appendField(locator, this, "properties", buffer, theProperties);
        }
        {
            DocumentModelDefinition theDocumentModel;
            theDocumentModel = this.getDocumentModel();
            strategy.appendField(locator, this, "documentModel", buffer, theDocumentModel);
        }
        {
            TestManagementDefintion theTestManagement;
            theTestManagement = this.getTestManagement();
            strategy.appendField(locator, this, "testManagement", buffer, theTestManagement);
        }
        {
            ConstraintsDefinition theConstraints;
            theConstraints = this.getConstraints();
            strategy.appendField(locator, this, "constraints", buffer, theConstraints);
        }
        {
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theAttachments;
            theAttachments = this.getAttachments();
            strategy.appendField(locator, this, "attachments", buffer, theAttachments);
        }
        {
            Boolean theShowWorkflow;
            theShowWorkflow = this.isShowWorkflow();
            strategy.appendField(locator, this, "showWorkflow", buffer, theShowWorkflow);
        }
        {
            String thePhase;
            thePhase = this.getPhase();
            strategy.appendField(locator, this, "phase", buffer, thePhase);
        }
        {
            Boolean theTimeTracking;
            theTimeTracking = this.isTimeTracking();
            strategy.appendField(locator, this, "timeTracking", buffer, theTimeTracking);
        }
        {
            String theCpPolicy;
            theCpPolicy = this.getCpPolicy();
            strategy.appendField(locator, this, "cpPolicy", buffer, theCpPolicy);
        }
        {
            Boolean theBacksProject;
            theBacksProject = this.isBacksProject();
            strategy.appendField(locator, this, "backsProject", buffer, theBacksProject);
        }
        {
            Boolean theHaveRevisions;
            theHaveRevisions = this.isHaveRevisions();
            strategy.appendField(locator, this, "haveRevisions", buffer, theHaveRevisions);
        }
        {
            Boolean theCanDelete;
            theCanDelete = this.isCanDelete();
            strategy.appendField(locator, this, "canDelete", buffer, theCanDelete);
        }
        {
            Boolean theShowHistory;
            theShowHistory = this.isShowHistory();
            strategy.appendField(locator, this, "showHistory", buffer, theShowHistory);
        }
        {
            Boolean theAllowCP;
            theAllowCP = this.isAllowCP();
            strategy.appendField(locator, this, "allowCP", buffer, theAllowCP);
        }
        {
            Boolean theCanLabel;
            theCanLabel = this.isCanLabel();
            strategy.appendField(locator, this, "canLabel", buffer, theCanLabel);
        }
        {
            String thePresentation;
            thePresentation = this.getPresentation();
            strategy.appendField(locator, this, "presentation", buffer, thePresentation);
        }
        return buffer;
    }

}
