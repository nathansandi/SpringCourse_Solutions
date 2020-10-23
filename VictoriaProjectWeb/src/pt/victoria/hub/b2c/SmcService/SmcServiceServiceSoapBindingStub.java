/**
 * SmcServiceServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.b2c.SmcService;

public class SmcServiceServiceSoapBindingStub extends org.apache.axis.client.Stub implements pt.victoria.hub.b2c.SmcService.SmcService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPreferencialContacts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", "GetPreferencialContactsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetPreferencialContactsRequest"), pt.victoria.hub.b2c.SmcService.GetPreferencialContactsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetPreferencialContactsResponse"));
        oper.setReturnClass(pt.victoria.hub.b2c.SmcService.GetPreferencialContactsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", "GetPreferencialContactsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetClients");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", "GetClientsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetClientsRequest"), pt.victoria.hub.b2c.SmcService.GetClientsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetClientsResponse"));
        oper.setReturnClass(pt.victoria.hub.b2c.SmcService.GetClientsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", "GetClientsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetContactsByClient");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", "GetContactsByClientRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetContactsByClientRequest"), pt.victoria.hub.b2c.SmcService.GetContactsByClientRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetContactsByClientResponse"));
        oper.setReturnClass(pt.victoria.hub.b2c.SmcService.GetContactsByClientResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", "GetContactsByClientResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetClientDetail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", "GetClientDetailRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetClientDetailRequest"), pt.victoria.hub.b2c.SmcService.GetClientDetailRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetClientDetailResponse"));
        oper.setReturnClass(pt.victoria.hub.b2c.SmcService.GetClientDetailResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", "GetClientDetailResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetActiveClientByVatNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", "GetActiveClientByVatNumberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetActiveClientByVatNumberRequest"), pt.victoria.hub.b2c.SmcService.GetActiveClientByVatNumberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetActiveClientByVatNumberResponse"));
        oper.setReturnClass(pt.victoria.hub.b2c.SmcService.GetActiveClientByVatNumberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", "GetActiveClientByVatNumberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetClientByVatNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", "GetClientByVatNumberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetClientByVatNumberRequest"), pt.victoria.hub.b2c.SmcService.GetClientByVatNumberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetClientByVatNumberResponse"));
        oper.setReturnClass(pt.victoria.hub.b2c.SmcService.GetClientByVatNumberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", "GetClientByVatNumberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

    }

    public SmcServiceServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SmcServiceServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SmcServiceServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetActiveClientByVatNumberRequest");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.b2c.SmcService.GetActiveClientByVatNumberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetActiveClientByVatNumberResponse");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.b2c.SmcService.GetActiveClientByVatNumberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetClientByVatNumberRequest");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.b2c.SmcService.GetClientByVatNumberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetClientByVatNumberResponse");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.b2c.SmcService.GetClientByVatNumberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetClientDetailRequest");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.b2c.SmcService.GetClientDetailRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetClientDetailResponse");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.b2c.SmcService.GetClientDetailResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetClientsRequest");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.b2c.SmcService.GetClientsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetClientsResponse");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.b2c.SmcService.GetClientsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetContactsByClientRequest");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.b2c.SmcService.GetContactsByClientRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetContactsByClientResponse");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.b2c.SmcService.GetContactsByClientResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetPreferencialContactsRequest");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.b2c.SmcService.GetPreferencialContactsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://b2c.hub.victoria.pt/SmcService/", ">GetPreferencialContactsResponse");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.b2c.SmcService.GetPreferencialContactsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/b2c/ws/common/", "AbstractWebRequest");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.b2c.ws.common.AbstractWebRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/b2c/ws/common/", "AbstractWebResponse");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.b2c.ws.common.AbstractWebResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Client/", "Client");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.Model.Client.Client.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Client/", "ClientAddress");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.Model.Client.ClientAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Client/", "ClientDetail");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.Model.Client.ClientDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Client/", "ClientStatus");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.Model.Client.ClientStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Client/", "ClientType");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.Model.Client.ClientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Client/", "ContactType");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.Model.Client.ContactType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Common/", "AddressType");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.Model.Common.AddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Common/", "Contact");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.Model.Common.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/Model/Common/", "PartnerExternalId");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.Model.Common.PartnerExternalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/Model/System/", "Order");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.Model.System.Order.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/Model/System/", "OrderOrientation");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.Model.System.OrderOrientation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/Model/System/", "Pageable");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.Model.System.Pageable.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/Model/System/", "PageInfo");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.Model.System.PageInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/Model/System/", "Phase");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.Model.System.Phase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/Model/System/", "ReturnInfo");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.Model.System.ReturnInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/Model/System/", "Sort");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.Model.System.Order[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/Model/System/", "Order");
            qName2 = new javax.xml.namespace.QName("", "Orders");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://hub.victoria.pt/Model/System/", "Status");
            cachedSerQNames.add(qName);
            cls = pt.victoria.hub.Model.System.Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public pt.victoria.hub.b2c.SmcService.GetPreferencialContactsResponse getPreferencialContacts(pt.victoria.hub.b2c.SmcService.GetPreferencialContactsRequest getPreferencialContactsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://b2c.hub.victoria.pt/SmcService/GetPreferencialContacts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetPreferencialContacts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPreferencialContactsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pt.victoria.hub.b2c.SmcService.GetPreferencialContactsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pt.victoria.hub.b2c.SmcService.GetPreferencialContactsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pt.victoria.hub.b2c.SmcService.GetPreferencialContactsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pt.victoria.hub.b2c.SmcService.GetClientsResponse getClients(pt.victoria.hub.b2c.SmcService.GetClientsRequest getClientsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://b2c.hub.victoria.pt/SmcService/GetClients");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetClients"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getClientsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pt.victoria.hub.b2c.SmcService.GetClientsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pt.victoria.hub.b2c.SmcService.GetClientsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pt.victoria.hub.b2c.SmcService.GetClientsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pt.victoria.hub.b2c.SmcService.GetContactsByClientResponse getContactsByClient(pt.victoria.hub.b2c.SmcService.GetContactsByClientRequest getContactsByClientRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://b2c.hub.victoria.pt/SmcService/GetContactsByClient");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetContactsByClient"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getContactsByClientRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pt.victoria.hub.b2c.SmcService.GetContactsByClientResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pt.victoria.hub.b2c.SmcService.GetContactsByClientResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pt.victoria.hub.b2c.SmcService.GetContactsByClientResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pt.victoria.hub.b2c.SmcService.GetClientDetailResponse getClientDetail(pt.victoria.hub.b2c.SmcService.GetClientDetailRequest getClientDetailRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://b2c.hub.victoria.pt/SmcService/GetClientDetail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetClientDetail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getClientDetailRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pt.victoria.hub.b2c.SmcService.GetClientDetailResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pt.victoria.hub.b2c.SmcService.GetClientDetailResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pt.victoria.hub.b2c.SmcService.GetClientDetailResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pt.victoria.hub.b2c.SmcService.GetActiveClientByVatNumberResponse getActiveClientByVatNumber(pt.victoria.hub.b2c.SmcService.GetActiveClientByVatNumberRequest getActiveClientByVatNumberRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://b2c.hub.victoria.pt/SmcService/GetActiveClientByVatNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetActiveClientByVatNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getActiveClientByVatNumberRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pt.victoria.hub.b2c.SmcService.GetActiveClientByVatNumberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pt.victoria.hub.b2c.SmcService.GetActiveClientByVatNumberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pt.victoria.hub.b2c.SmcService.GetActiveClientByVatNumberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public pt.victoria.hub.b2c.SmcService.GetClientByVatNumberResponse getClientByVatNumber(pt.victoria.hub.b2c.SmcService.GetClientByVatNumberRequest getClientByVatNumberRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://b2c.hub.victoria.pt/SmcService/GetClientByVatNumber");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetClientByVatNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getClientByVatNumberRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (pt.victoria.hub.b2c.SmcService.GetClientByVatNumberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (pt.victoria.hub.b2c.SmcService.GetClientByVatNumberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, pt.victoria.hub.b2c.SmcService.GetClientByVatNumberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
