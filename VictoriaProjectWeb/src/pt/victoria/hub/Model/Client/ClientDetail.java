/**
 * ClientDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.Model.Client;

public class ClientDetail  implements java.io.Serializable {
    private pt.victoria.hub.Model.Common.Contact[] emails;

    private pt.victoria.hub.Model.Common.Contact[] mobiles;

    private pt.victoria.hub.Model.Common.PartnerExternalId[] identityDocuments;

    private java.lang.String[] partnerNumbers;

    private pt.victoria.hub.Model.Client.ClientAddress[] addresses;

    private java.lang.Boolean sendInvoicesByEmail;

    public ClientDetail() {
    }

    public ClientDetail(
           pt.victoria.hub.Model.Common.Contact[] emails,
           pt.victoria.hub.Model.Common.Contact[] mobiles,
           pt.victoria.hub.Model.Common.PartnerExternalId[] identityDocuments,
           java.lang.String[] partnerNumbers,
           pt.victoria.hub.Model.Client.ClientAddress[] addresses,
           java.lang.Boolean sendInvoicesByEmail) {
           this.emails = emails;
           this.mobiles = mobiles;
           this.identityDocuments = identityDocuments;
           this.partnerNumbers = partnerNumbers;
           this.addresses = addresses;
           this.sendInvoicesByEmail = sendInvoicesByEmail;
    }


    /**
     * Gets the emails value for this ClientDetail.
     * 
     * @return emails
     */
    public pt.victoria.hub.Model.Common.Contact[] getEmails() {
        return emails;
    }


    /**
     * Sets the emails value for this ClientDetail.
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
     * Gets the mobiles value for this ClientDetail.
     * 
     * @return mobiles
     */
    public pt.victoria.hub.Model.Common.Contact[] getMobiles() {
        return mobiles;
    }


    /**
     * Sets the mobiles value for this ClientDetail.
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


    /**
     * Gets the identityDocuments value for this ClientDetail.
     * 
     * @return identityDocuments
     */
    public pt.victoria.hub.Model.Common.PartnerExternalId[] getIdentityDocuments() {
        return identityDocuments;
    }


    /**
     * Sets the identityDocuments value for this ClientDetail.
     * 
     * @param identityDocuments
     */
    public void setIdentityDocuments(pt.victoria.hub.Model.Common.PartnerExternalId[] identityDocuments) {
        this.identityDocuments = identityDocuments;
    }

    public pt.victoria.hub.Model.Common.PartnerExternalId getIdentityDocuments(int i) {
        return this.identityDocuments[i];
    }

    public void setIdentityDocuments(int i, pt.victoria.hub.Model.Common.PartnerExternalId _value) {
        this.identityDocuments[i] = _value;
    }


    /**
     * Gets the partnerNumbers value for this ClientDetail.
     * 
     * @return partnerNumbers
     */
    public java.lang.String[] getPartnerNumbers() {
        return partnerNumbers;
    }


    /**
     * Sets the partnerNumbers value for this ClientDetail.
     * 
     * @param partnerNumbers
     */
    public void setPartnerNumbers(java.lang.String[] partnerNumbers) {
        this.partnerNumbers = partnerNumbers;
    }

    public java.lang.String getPartnerNumbers(int i) {
        return this.partnerNumbers[i];
    }

    public void setPartnerNumbers(int i, java.lang.String _value) {
        this.partnerNumbers[i] = _value;
    }


    /**
     * Gets the addresses value for this ClientDetail.
     * 
     * @return addresses
     */
    public pt.victoria.hub.Model.Client.ClientAddress[] getAddresses() {
        return addresses;
    }


    /**
     * Sets the addresses value for this ClientDetail.
     * 
     * @param addresses
     */
    public void setAddresses(pt.victoria.hub.Model.Client.ClientAddress[] addresses) {
        this.addresses = addresses;
    }

    public pt.victoria.hub.Model.Client.ClientAddress getAddresses(int i) {
        return this.addresses[i];
    }

    public void setAddresses(int i, pt.victoria.hub.Model.Client.ClientAddress _value) {
        this.addresses[i] = _value;
    }


    /**
     * Gets the sendInvoicesByEmail value for this ClientDetail.
     * 
     * @return sendInvoicesByEmail
     */
    public java.lang.Boolean getSendInvoicesByEmail() {
        return sendInvoicesByEmail;
    }


    /**
     * Sets the sendInvoicesByEmail value for this ClientDetail.
     * 
     * @param sendInvoicesByEmail
     */
    public void setSendInvoicesByEmail(java.lang.Boolean sendInvoicesByEmail) {
        this.sendInvoicesByEmail = sendInvoicesByEmail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClientDetail)) return false;
        ClientDetail other = (ClientDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emails==null && other.getEmails()==null) || 
             (this.emails!=null &&
              java.util.Arrays.equals(this.emails, other.getEmails()))) &&
            ((this.mobiles==null && other.getMobiles()==null) || 
             (this.mobiles!=null &&
              java.util.Arrays.equals(this.mobiles, other.getMobiles()))) &&
            ((this.identityDocuments==null && other.getIdentityDocuments()==null) || 
             (this.identityDocuments!=null &&
              java.util.Arrays.equals(this.identityDocuments, other.getIdentityDocuments()))) &&
            ((this.partnerNumbers==null && other.getPartnerNumbers()==null) || 
             (this.partnerNumbers!=null &&
              java.util.Arrays.equals(this.partnerNumbers, other.getPartnerNumbers()))) &&
            ((this.addresses==null && other.getAddresses()==null) || 
             (this.addresses!=null &&
              java.util.Arrays.equals(this.addresses, other.getAddresses()))) &&
            ((this.sendInvoicesByEmail==null && other.getSendInvoicesByEmail()==null) || 
             (this.sendInvoicesByEmail!=null &&
              this.sendInvoicesByEmail.equals(other.getSendInvoicesByEmail())));
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
        if (getIdentityDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdentityDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdentityDocuments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartnerNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartnerNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartnerNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSendInvoicesByEmail() != null) {
            _hashCode += getSendInvoicesByEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClientDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Client/", "ClientDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Emails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Common/", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobiles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Mobiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Common/", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IdentityDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Common/", "PartnerExternalId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PartnerNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Addresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Client/", "ClientAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendInvoicesByEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SendInvoicesByEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
