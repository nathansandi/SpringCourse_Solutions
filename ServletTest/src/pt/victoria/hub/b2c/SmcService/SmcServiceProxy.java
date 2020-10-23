package pt.victoria.hub.b2c.SmcService;

public class SmcServiceProxy implements pt.victoria.hub.b2c.SmcService.SmcService {
  private String _endpoint = null;
  private pt.victoria.hub.b2c.SmcService.SmcService smcService = null;
  
  public SmcServiceProxy() {
    _initSmcServiceProxy();
  }
  
  public SmcServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSmcServiceProxy();
  }
  
  private void _initSmcServiceProxy() {
    try {
      smcService = (new pt.victoria.hub.b2c.SmcService.SmcServiceServiceLocator()).getSmcServicePort();
      if (smcService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)smcService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)smcService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (smcService != null)
      ((javax.xml.rpc.Stub)smcService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public pt.victoria.hub.b2c.SmcService.SmcService getSmcService() {
    if (smcService == null)
      _initSmcServiceProxy();
    return smcService;
  }
  
  public pt.victoria.hub.b2c.SmcService.GetPreferencialContactsResponse getPreferencialContacts(pt.victoria.hub.b2c.SmcService.GetPreferencialContactsRequest getPreferencialContactsRequest) throws java.rmi.RemoteException{
    if (smcService == null)
      _initSmcServiceProxy();
    return smcService.getPreferencialContacts(getPreferencialContactsRequest);
  }
  
  public pt.victoria.hub.b2c.SmcService.GetClientsResponse getClients(pt.victoria.hub.b2c.SmcService.GetClientsRequest getClientsRequest) throws java.rmi.RemoteException{
    if (smcService == null)
      _initSmcServiceProxy();
    return smcService.getClients(getClientsRequest);
  }
  
  public pt.victoria.hub.b2c.SmcService.GetContactsByClientResponse getContactsByClient(pt.victoria.hub.b2c.SmcService.GetContactsByClientRequest getContactsByClientRequest) throws java.rmi.RemoteException{
    if (smcService == null)
      _initSmcServiceProxy();
    return smcService.getContactsByClient(getContactsByClientRequest);
  }
  
  public pt.victoria.hub.b2c.SmcService.GetClientDetailResponse getClientDetail(pt.victoria.hub.b2c.SmcService.GetClientDetailRequest getClientDetailRequest) throws java.rmi.RemoteException{
    if (smcService == null)
      _initSmcServiceProxy();
    return smcService.getClientDetail(getClientDetailRequest);
  }
  
  public pt.victoria.hub.b2c.SmcService.GetActiveClientByVatNumberResponse getActiveClientByVatNumber(pt.victoria.hub.b2c.SmcService.GetActiveClientByVatNumberRequest getActiveClientByVatNumberRequest) throws java.rmi.RemoteException{
    if (smcService == null)
      _initSmcServiceProxy();
    return smcService.getActiveClientByVatNumber(getActiveClientByVatNumberRequest);
  }
  
  public pt.victoria.hub.b2c.SmcService.GetClientByVatNumberResponse getClientByVatNumber(pt.victoria.hub.b2c.SmcService.GetClientByVatNumberRequest getClientByVatNumberRequest) throws java.rmi.RemoteException{
    if (smcService == null)
      _initSmcServiceProxy();
    return smcService.getClientByVatNumber(getClientByVatNumberRequest);
  }
  
  
}