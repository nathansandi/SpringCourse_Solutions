/**
 * SmcService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pt.victoria.hub.b2c.SmcService;

public interface SmcService extends java.rmi.Remote {
    public pt.victoria.hub.b2c.SmcService.GetPreferencialContactsResponse getPreferencialContacts(pt.victoria.hub.b2c.SmcService.GetPreferencialContactsRequest getPreferencialContactsRequest) throws java.rmi.RemoteException;
    public pt.victoria.hub.b2c.SmcService.GetClientsResponse getClients(pt.victoria.hub.b2c.SmcService.GetClientsRequest getClientsRequest) throws java.rmi.RemoteException;
    public pt.victoria.hub.b2c.SmcService.GetContactsByClientResponse getContactsByClient(pt.victoria.hub.b2c.SmcService.GetContactsByClientRequest getContactsByClientRequest) throws java.rmi.RemoteException;
    public pt.victoria.hub.b2c.SmcService.GetClientDetailResponse getClientDetail(pt.victoria.hub.b2c.SmcService.GetClientDetailRequest getClientDetailRequest) throws java.rmi.RemoteException;
    public pt.victoria.hub.b2c.SmcService.GetActiveClientByVatNumberResponse getActiveClientByVatNumber(pt.victoria.hub.b2c.SmcService.GetActiveClientByVatNumberRequest getActiveClientByVatNumberRequest) throws java.rmi.RemoteException;
    public pt.victoria.hub.b2c.SmcService.GetClientByVatNumberResponse getClientByVatNumber(pt.victoria.hub.b2c.SmcService.GetClientByVatNumberRequest getClientByVatNumberRequest) throws java.rmi.RemoteException;
}
