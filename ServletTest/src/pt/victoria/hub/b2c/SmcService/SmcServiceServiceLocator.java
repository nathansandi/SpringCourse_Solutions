/**
 * SmcServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.b2c.SmcService;

public class SmcServiceServiceLocator extends org.apache.axis.client.Service implements pt.victoria.hub.b2c.SmcService.SmcServiceService {

    public SmcServiceServiceLocator() {
    }


    public SmcServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SmcServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SmcServicePort
    private java.lang.String SmcServicePort_address = "http://192.168.189.11:9090/v1/smcService";

    public java.lang.String getSmcServicePortAddress() {
        return SmcServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SmcServicePortWSDDServiceName = "SmcServicePort";

    public java.lang.String getSmcServicePortWSDDServiceName() {
        return SmcServicePortWSDDServiceName;
    }

    public void setSmcServicePortWSDDServiceName(java.lang.String name) {
        SmcServicePortWSDDServiceName = name;
    }

    public pt.victoria.hub.b2c.SmcService.SmcService getSmcServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SmcServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSmcServicePort(endpoint);
    }

    public pt.victoria.hub.b2c.SmcService.SmcService getSmcServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pt.victoria.hub.b2c.SmcService.SmcServiceServiceSoapBindingStub _stub = new pt.victoria.hub.b2c.SmcService.SmcServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSmcServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSmcServicePortEndpointAddress(java.lang.String address) {
        SmcServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pt.victoria.hub.b2c.SmcService.SmcService.class.isAssignableFrom(serviceEndpointInterface)) {
                pt.victoria.hub.b2c.SmcService.SmcServiceServiceSoapBindingStub _stub = new pt.victoria.hub.b2c.SmcService.SmcServiceServiceSoapBindingStub(new java.net.URL(SmcServicePort_address), this);
                _stub.setPortName(getSmcServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SmcServicePort".equals(inputPortName)) {
            return getSmcServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", "SmcServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", "SmcServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SmcServicePort".equals(portName)) {
            setSmcServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
