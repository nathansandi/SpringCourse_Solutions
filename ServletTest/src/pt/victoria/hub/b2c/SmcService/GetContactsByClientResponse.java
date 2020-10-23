/**
 * GetContactsByClientResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.b2c.SmcService;

public class GetContactsByClientResponse  extends pt.victoria.hub.b2c.ws.common.AbstractWebResponse  implements java.io.Serializable {
    private pt.victoria.hub.Model.Common.Contact[] emails;

    private pt.victoria.hub.Model.Common.Contact[] mobiles;

    public GetContactsByClientResponse() {
    }

    public GetContactsByClientResponse(
           pt.victoria.hub.Model.System.ReturnInfo returnInfo,
           pt.victoria.hub.Model.Common.Contact[] emails,
           pt.victoria.hub.Model.Common.Contact[] mobiles) {
        super(
            returnInfo);
        this.emails = emails;
        this.mobiles = mobiles;
    }


    /**
     * Gets the emails value for this GetContactsByClientResponse.
     * 
     * @return emails
     */
    public pt.victoria.hub.Model.Common.Contact[] getEmails() {
        return emails;
    }


    /**
     * Sets the emails value for this GetContactsByClientResponse.
     * 
     * @param emails
     */
    public void setEmails(pt.victoria.hub.Model.Common.Contact[] emails) {
        this.emails = emails;
    }

    public pt.victoria.hub.Model.Common.Contact getEmails(int i) {
        return this.emails[i];
    }

    public void setEmails(int i, pt.victoria.hub.Model.Common.Contact _value) {
        this.emails[i] = _value;
    }


    /**
     * Gets the mobiles value for this GetContactsByClientResponse.
     * 
     * @return mobiles
     */
    public pt.victoria.hub.Model.Common.Contact[] getMobiles() {
        return mobiles;
    }


    /**
     * Sets the mobiles value for this GetContactsByClientResponse.
     * 
     * @param mobiles
     */
    public void setMobiles(pt.victoria.hub.Model.Common.Contact[] mobiles) {
        this.mobiles = mobiles;
    }

    public pt.victoria.hub.Model.Common.Contact getMobiles(int i) {
        return this.mobiles[i];
    }

    public void setMobiles(int i, pt.victoria.hub.Model.Common.Contact _value) {
        this.mobiles[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetContactsByClientResponse)) return false;
        GetContactsByClientResponse other = (GetContactsByClientResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.emails==null && other.getEmails()==null) || 
             (this.emails!=null &&
              java.util.Arrays.equals(this.emails, other.getEmails()))) &&
            ((this.mobiles==null && other.getMobiles()==null) || 
             (this.mobiles!=null &&
              java.util.Arrays.equals(this.mobiles, other.getMobiles())));
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
        if (getEmails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMobiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMobiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMobiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetContactsByClientResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetContactsByClientResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Common/", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobiles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Common/", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
