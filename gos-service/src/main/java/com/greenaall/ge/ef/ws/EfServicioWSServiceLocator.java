/**
 * EfServicioWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.greenaall.ge.ef.ws;

public class EfServicioWSServiceLocator extends org.apache.axis.client.Service implements com.greenaall.ge.ef.ws.EfServicioWSService {

    public EfServicioWSServiceLocator() {
    }


    public EfServicioWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EfServicioWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EfServicioWS
    private java.lang.String EfServicioWS_address = "http://test-esijad.e-gim.es/eFirma/services/EfServicioWS";

    public java.lang.String getEfServicioWSAddress() {
        return EfServicioWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EfServicioWSWSDDServiceName = "EfServicioWS";

    public java.lang.String getEfServicioWSWSDDServiceName() {
        return EfServicioWSWSDDServiceName;
    }

    public void setEfServicioWSWSDDServiceName(java.lang.String name) {
        EfServicioWSWSDDServiceName = name;
    }

    public com.greenaall.ge.ef.ws.EfServicioWS getEfServicioWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EfServicioWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEfServicioWS(endpoint);
    }

    public com.greenaall.ge.ef.ws.EfServicioWS getEfServicioWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.greenaall.ge.ef.ws.EfServicioWSSoapBindingStub _stub = new com.greenaall.ge.ef.ws.EfServicioWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getEfServicioWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEfServicioWSEndpointAddress(java.lang.String address) {
        EfServicioWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.greenaall.ge.ef.ws.EfServicioWS.class.isAssignableFrom(serviceEndpointInterface)) {
                com.greenaall.ge.ef.ws.EfServicioWSSoapBindingStub _stub = new com.greenaall.ge.ef.ws.EfServicioWSSoapBindingStub(new java.net.URL(EfServicioWS_address), this);
                _stub.setPortName(getEfServicioWSWSDDServiceName());
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
        if ("EfServicioWS".equals(inputPortName)) {
            return getEfServicioWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.ef.gos.greenaall.es", "EfServicioWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.ef.gos.greenaall.es", "EfServicioWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EfServicioWS".equals(portName)) {
            setEfServicioWSEndpointAddress(address);
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
