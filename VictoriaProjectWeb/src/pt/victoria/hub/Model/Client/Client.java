/**
 * Client.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.Model.Client;

public class Client  implements java.io.Serializable {
    private java.lang.String clientId;

    private java.lang.String vatNumber;

    private java.lang.String name;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.util.Date birthDate;

    private pt.victoria.hub.Model.Client.ClientStatus clientStatus;

    private java.lang.String statusDescription;

    private pt.victoria.hub.Model.Client.ClientType clientType;

    private java.lang.String clientTypeDescription;

    private pt.victoria.hub.Model.Client.ClientDetail clientDetail;

    public Client() {
    }

    public Client(
           java.lang.String clientId,
           java.lang.String vatNumber,
           java.lang.String name,
           java.lang.String firstName,
           java.lang.String lastName,
           java.util.Date birthDate,
           pt.victoria.hub.Model.Client.ClientStatus clientStatus,
           java.lang.String statusDescription,
           pt.victoria.hub.Model.Client.ClientType clientType,
           java.lang.String clientTypeDescription,
           pt.victoria.hub.Model.Client.ClientDetail clientDetail) {
           this.clientId = clientId;
           this.vatNumber = vatNumber;
           this.name = name;
           this.firstName = firstName;
           this.lastName = lastName;
           this.birthDate = birthDate;
           this.clientStatus = clientStatus;
           this.statusDescription = statusDescription;
           this.clientType = clientType;
           this.clientTypeDescription = clientTypeDescription;
           this.clientDetail = clientDetail;
    }


    /**
     * Gets the clientId value for this Client.
     * 
     * @return clientId
     */
    public java.lang.String getClientId() {
        return clientId;
    }


    /**
     * Sets the clientId value for this Client.
     * 
     * @param clientId
     */
    public void setClientId(java.lang.String clientId) {
        this.clientId = clientId;
    }


    /**
     * Gets the vatNumber value for this Client.
     * 
     * @return vatNumber
     */
    public java.lang.String getVatNumber() {
        return vatNumber;
    }


    /**
     * Sets the vatNumber value for this Client.
     * 
     * @param vatNumber
     */
    public void setVatNumber(java.lang.String vatNumber) {
        this.vatNumber = vatNumber;
    }


    /**
     * Gets the name value for this Client.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Client.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the firstName value for this Client.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Client.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this Client.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Client.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the birthDate value for this Client.
     * 
     * @return birthDate
     */
    public java.util.Date getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this Client.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Date birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the clientStatus value for this Client.
     * 
     * @return clientStatus
     */
    public pt.victoria.hub.Model.Client.ClientStatus getClientStatus() {
        return clientStatus;
    }


    /**
     * Sets the clientStatus value for this Client.
     * 
     * @param clientStatus
     */
    public void setClientStatus(pt.victoria.hub.Model.Client.ClientStatus clientStatus) {
        this.clientStatus = clientStatus;
    }


    /**
     * Gets the statusDescription value for this Client.
     * 
     * @return statusDescription
     */
    public java.lang.String getStatusDescription() {
        return statusDescription;
    }


    /**
     * Sets the statusDescription value for this Client.
     * 
     * @param statusDescription
     */
    public void setStatusDescription(java.lang.String statusDescription) {
        this.statusDescription = statusDescription;
    }


    /**
     * Gets the clientType value for this Client.
     * 
     * @return clientType
     */
    public pt.victoria.hub.Model.Client.ClientType getClientType() {
        return clientType;
    }


    /**
     * Sets the clientType value for this Client.
     * 
     * @param clientType
     */
    public void setClientType(pt.victoria.hub.Model.Client.ClientType clientType) {
        this.clientType = clientType;
    }


    /**
     * Gets the clientTypeDescription value for this Client.
     * 
     * @return clientTypeDescription
     */
    public java.lang.String getClientTypeDescription() {
        return clientTypeDescription;
    }


    /**
     * Sets the clientTypeDescription value for this Client.
     * 
     * @param clientTypeDescription
     */
    public void setClientTypeDescription(java.lang.String clientTypeDescription) {
        this.clientTypeDescription = clientTypeDescription;
    }


    /**
     * Gets the clientDetail value for this Client.
     * 
     * @return clientDetail
     */
    public pt.victoria.hub.Model.Client.ClientDetail getClientDetail() {
        return clientDetail;
    }


    /**
     * Sets the clientDetail value for this Client.
     * 
     * @param clientDetail
     */
    public void setClientDetail(pt.victoria.hub.Model.Client.ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Client)) return false;
        Client other = (Client) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientId==null && other.getClientId()==null) || 
             (this.clientId!=null &&
              this.clientId.equals(other.getClientId()))) &&
            ((this.vatNumber==null && other.getVatNumber()==null) || 
             (this.vatNumber!=null &&
              this.vatNumber.equals(other.getVatNumber()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.clientStatus==null && other.getClientStatus()==null) || 
             (this.clientStatus!=null &&
              this.clientStatus.equals(other.getClientStatus()))) &&
            ((this.statusDescription==null && other.getStatusDescription()==null) || 
             (this.statusDescription!=null &&
              this.statusDescription.equals(other.getStatusDescription()))) &&
            ((this.clientType==null && other.getClientType()==null) || 
             (this.clientType!=null &&
              this.clientType.equals(other.getClientType()))) &&
            ((this.clientTypeDescription==null && other.getClientTypeDescription()==null) || 
             (this.clientTypeDescription!=null &&
              this.clientTypeDescription.equals(other.getClientTypeDescription()))) &&
            ((this.clientDetail==null && other.getClientDetail()==null) || 
             (this.clientDetail!=null &&
              this.clientDetail.equals(other.getClientDetail())));
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
        if (getClientId() != null) {
            _hashCode += getClientId().hashCode();
        }
        if (getVatNumber() != null) {
            _hashCode += getVatNumber().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getClientStatus() != null) {
            _hashCode += getClientStatus().hashCode();
        }
        if (getStatusDescription() != null) {
            _hashCode += getStatusDescription().hashCode();
        }
        if (getClientType() != null) {
            _hashCode += getClientType().hashCode();
        }
        if (getClientTypeDescription() != null) {
            _hashCode += getClientTypeDescription().hashCode();
        }
        if (getClientDetail() != null) {
            _hashCode += getClientDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Client.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Client/", "Client"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClientId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VatNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BirthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClientStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Client/", "ClientStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StatusDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClientType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Client/", "ClientType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientTypeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClientTypeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClientDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Client/", "ClientDetail"));
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
