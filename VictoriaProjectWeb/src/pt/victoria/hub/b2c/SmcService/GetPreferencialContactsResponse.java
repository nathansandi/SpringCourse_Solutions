/**
 * GetPreferencialContactsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.b2c.SmcService;

public class GetPreferencialContactsResponse  extends pt.victoria.hub.b2c.ws.common.AbstractWebResponse  implements java.io.Serializable {
    private pt.victoria.hub.Model.Common.Contact[] preferencialContacts;

    private pt.victoria.hub.Model.Client.ContactType contactType;

    public GetPreferencialContactsResponse() {
    }

    public GetPreferencialContactsResponse(
           pt.victoria.hub.Model.System.ReturnInfo returnInfo,
           pt.victoria.hub.Model.Common.Contact[] preferencialContacts,
           pt.victoria.hub.Model.Client.ContactType contactType) {
        super(
            returnInfo);
        this.preferencialContacts = preferencialContacts;
        this.contactType = contactType;
    }


    /**
     * Gets the preferencialContacts value for this GetPreferencialContactsResponse.
     * 
     * @return preferencialContacts
     */
    public pt.victoria.hub.Model.Common.Contact[] getPreferencialContacts() {
        return preferencialContacts;
    }


    /**
     * Sets the preferencialContacts value for this GetPreferencialContactsResponse.
     * 
     * @param preferencialContacts
     */
    public void setPreferencialContacts(pt.victoria.hub.Model.Common.Contact[] preferencialContacts) {
        this.preferencialContacts = preferencialContacts;
    }

    public pt.victoria.hub.Model.Common.Contact getPreferencialContacts(int i) {
        return this.preferencialContacts[i];
    }

    public void setPreferencialContacts(int i, pt.victoria.hub.Model.Common.Contact _value) {
        this.preferencialContacts[i] = _value;
    }


    /**
     * Gets the contactType value for this GetPreferencialContactsResponse.
     * 
     * @return contactType
     */
    public pt.victoria.hub.Model.Client.ContactType getContactType() {
        return contactType;
    }


    /**
     * Sets the contactType value for this GetPreferencialContactsResponse.
     * 
     * @param contactType
     */
    public void setContactType(pt.victoria.hub.Model.Client.ContactType contactType) {
        this.contactType = contactType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPreferencialContactsResponse)) return false;
        GetPreferencialContactsResponse other = (GetPreferencialContactsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.preferencialContacts==null && other.getPreferencialContacts()==null) || 
             (this.preferencialContacts!=null &&
              java.util.Arrays.equals(this.preferencialContacts, other.getPreferencialContacts()))) &&
            ((this.contactType==null && other.getContactType()==null) || 
             (this.contactType!=null &&
              this.contactType.equals(other.getContactType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPreferencialContacts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferencialContacts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferencialContacts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContactType() != null) {
            _hashCode += getContactType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPreferencialContactsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetPreferencialContactsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencialContacts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PreferencialContacts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Common/", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContactType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Client/", "ContactType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
