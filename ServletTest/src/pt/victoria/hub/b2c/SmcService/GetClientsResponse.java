/**
 * GetClientsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.b2c.SmcService;

public class GetClientsResponse  extends pt.victoria.hub.b2c.ws.common.AbstractWebResponse  implements java.io.Serializable {
    private pt.victoria.hub.Model.Client.Client[] clients;

    private pt.victoria.hub.Model.System.PageInfo pageInfo;

    public GetClientsResponse() {
    }

    public GetClientsResponse(
           pt.victoria.hub.Model.System.ReturnInfo returnInfo,
           pt.victoria.hub.Model.Client.Client[] clients,
           pt.victoria.hub.Model.System.PageInfo pageInfo) {
        super(
            returnInfo);
        this.clients = clients;
        this.pageInfo = pageInfo;
    }


    /**
     * Gets the clients value for this GetClientsResponse.
     * 
     * @return clients
     */
    public pt.victoria.hub.Model.Client.Client[] getClients() {
        return clients;
    }


    /**
     * Sets the clients value for this GetClientsResponse.
     * 
     * @param clients
     */
    public void setClients(pt.victoria.hub.Model.Client.Client[] clients) {
        this.clients = clients;
    }

    public pt.victoria.hub.Model.Client.Client getClients(int i) {
        return this.clients[i];
    }

    public void setClients(int i, pt.victoria.hub.Model.Client.Client _value) {
        this.clients[i] = _value;
    }


    /**
     * Gets the pageInfo value for this GetClientsResponse.
     * 
     * @return pageInfo
     */
    public pt.victoria.hub.Model.System.PageInfo getPageInfo() {
        return pageInfo;
    }


    /**
     * Sets the pageInfo value for this GetClientsResponse.
     * 
     * @param pageInfo
     */
    public void setPageInfo(pt.victoria.hub.Model.System.PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetClientsResponse)) return false;
        GetClientsResponse other = (GetClientsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.clients==null && other.getClients()==null) || 
             (this.clients!=null &&
              java.util.Arrays.equals(this.clients, other.getClients()))) &&
            ((this.pageInfo==null && other.getPageInfo()==null) || 
             (this.pageInfo!=null &&
              this.pageInfo.equals(other.getPageInfo())));
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
        if (getClients() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClients());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClients(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPageInfo() != null) {
            _hashCode += getPageInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetClientsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetClientsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clients");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Clients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Client/", "Client"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/System/", "PageInfo"));
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
