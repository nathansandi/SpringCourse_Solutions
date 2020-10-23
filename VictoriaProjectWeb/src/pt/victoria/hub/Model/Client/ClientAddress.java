/**
 * ClientAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.Model.Client;

public class ClientAddress  implements java.io.Serializable {
    private long addressNumber;

    private pt.victoria.hub.Model.Common.AddressType addressType;

    public ClientAddress() {
    }

    public ClientAddress(
           long addressNumber,
           pt.victoria.hub.Model.Common.AddressType addressType) {
           this.addressNumber = addressNumber;
           this.addressType = addressType;
    }


    /**
     * Gets the addressNumber value for this ClientAddress.
     * 
     * @return addressNumber
     */
    public long getAddressNumber() {
        return addressNumber;
    }


    /**
     * Sets the addressNumber value for this ClientAddress.
     * 
     * @param addressNumber
     */
    public void setAddressNumber(long addressNumber) {
        this.addressNumber = addressNumber;
    }


    /**
     * Gets the addressType value for this ClientAddress.
     * 
     * @return addressType
     */
    public pt.victoria.hub.Model.Common.AddressType getAddressType() {
        return addressType;
    }


    /**
     * Sets the addressType value for this ClientAddress.
     * 
     * @param addressType
     */
    public void setAddressType(pt.victoria.hub.Model.Common.AddressType addressType) {
        this.addressType = addressType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClientAddress)) return false;
        ClientAddress other = (ClientAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.addressNumber == other.getAddressNumber() &&
            ((this.addressType==null && other.getAddressType()==null) || 
             (this.addressType!=null &&
              this.addressType.equals(other.getAddressType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getAddressNumber()).hashCode();
        if (getAddressType() != null) {
            _hashCode += getAddressType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClientAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Client/", "ClientAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AddressType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Common/", "AddressType"));
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
