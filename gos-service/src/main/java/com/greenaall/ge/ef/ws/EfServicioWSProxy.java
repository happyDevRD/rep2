package com.greenaall.ge.ef.ws;

public class EfServicioWSProxy implements com.greenaall.ge.ef.ws.EfServicioWS {
  private String _endpoint = null;
  private com.greenaall.ge.ef.ws.EfServicioWS efServicioWS = null;
  
  public EfServicioWSProxy() {
    _initEfServicioWSProxy();
  }
  
  public EfServicioWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initEfServicioWSProxy();
  }
  
  private void _initEfServicioWSProxy() {
    try {
      efServicioWS = (new com.greenaall.ge.ef.ws.EfServicioWSServiceLocator()).getEfServicioWS();
      if (efServicioWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)efServicioWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)efServicioWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (efServicioWS != null)
      ((javax.xml.rpc.Stub)efServicioWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.greenaall.ge.ef.ws.EfServicioWS getEfServicioWS() {
    if (efServicioWS == null)
      _initEfServicioWSProxy();
    return efServicioWS;
  }
  
  public com.greenaall.ge.ef.ln.RetornoInsertarPeticion insertarPeticion(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5, java.lang.String in6, byte in7, java.util.Calendar in8, java.util.Calendar in9, java.lang.String in10, java.lang.Short in11) throws java.rmi.RemoteException{
    if (efServicioWS == null)
      _initEfServicioWSProxy();
    return efServicioWS.insertarPeticion(in0, in1, in2, in3, in4, in5, in6, in7, in8, in9, in10, in11);
  }
  
  public com.greenaall.ge.ef.ln.RetornoInsertarDocumento insertarDocumento(long in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5, byte in6, java.lang.String in7) throws java.rmi.RemoteException{
    if (efServicioWS == null)
      _initEfServicioWSProxy();
    return efServicioWS.insertarDocumento(in0, in1, in2, in3, in4, in5, in6, in7);
  }
  
  public com.greenaall.ge.ef.ln.RetornoInsertarFirmante insertarFirmante(long in0, long in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5, short in6, java.lang.String in7) throws java.rmi.RemoteException{
    if (efServicioWS == null)
      _initEfServicioWSProxy();
    return efServicioWS.insertarFirmante(in0, in1, in2, in3, in4, in5, in6, in7);
  }
  
  public com.greenaall.ge.ef.ln.RetornoEntregarPeticion entregarPeticion(long in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (efServicioWS == null)
      _initEfServicioWSProxy();
    return efServicioWS.entregarPeticion(in0, in1);
  }
  
  public com.greenaall.ge.ef.ln.InformacionDocumento getInfoDocumento(long in0) throws java.rmi.RemoteException{
    if (efServicioWS == null)
      _initEfServicioWSProxy();
    return efServicioWS.getInfoDocumento(in0);
  }
  
  public com.greenaall.ge.ef.ln.RetornoEliminarDocumento eliminarDocumento(long in0) throws java.rmi.RemoteException{
    if (efServicioWS == null)
      _initEfServicioWSProxy();
    return efServicioWS.eliminarDocumento(in0);
  }
  
  public com.greenaall.ge.ef.ln.RetornoObtenerInformeFirma getInformeFirma(long in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (efServicioWS == null)
      _initEfServicioWSProxy();
    return efServicioWS.getInformeFirma(in0, in1);
  }
  
  public com.greenaall.ge.ef.ln.RetornoObtenerFirmaDocumento getFirmaDocumento(long in0) throws java.rmi.RemoteException{
    if (efServicioWS == null)
      _initEfServicioWSProxy();
    return efServicioWS.getFirmaDocumento(in0);
  }
  
  public com.greenaall.ge.ef.ln.RetornoObtenerEstadosLoteDocumentos getEstadosLoteDocumentos(long[] in0) throws java.rmi.RemoteException{
    if (efServicioWS == null)
      _initEfServicioWSProxy();
    return efServicioWS.getEstadosLoteDocumentos(in0);
  }
  
  
}