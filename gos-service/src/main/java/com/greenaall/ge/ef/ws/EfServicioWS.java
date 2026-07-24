/**
 * EfServicioWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.greenaall.ge.ef.ws;

public interface EfServicioWS extends java.rmi.Remote {
    public com.greenaall.ge.ef.ln.RetornoInsertarPeticion insertarPeticion(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5, java.lang.String in6, byte in7, java.util.Calendar in8, java.util.Calendar in9, java.lang.String in10, java.lang.Short in11) throws java.rmi.RemoteException;
    public com.greenaall.ge.ef.ln.RetornoInsertarDocumento insertarDocumento(long in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5, byte in6, java.lang.String in7) throws java.rmi.RemoteException;
    public com.greenaall.ge.ef.ln.RetornoInsertarFirmante insertarFirmante(long in0, long in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5, short in6, java.lang.String in7) throws java.rmi.RemoteException;
    public com.greenaall.ge.ef.ln.RetornoEntregarPeticion entregarPeticion(long in0, java.lang.String in1) throws java.rmi.RemoteException;
    public com.greenaall.ge.ef.ln.InformacionDocumento getInfoDocumento(long in0) throws java.rmi.RemoteException;
    public com.greenaall.ge.ef.ln.RetornoEliminarDocumento eliminarDocumento(long in0) throws java.rmi.RemoteException;
    public com.greenaall.ge.ef.ln.RetornoObtenerInformeFirma getInformeFirma(long in0, java.lang.String in1) throws java.rmi.RemoteException;
    public com.greenaall.ge.ef.ln.RetornoObtenerFirmaDocumento getFirmaDocumento(long in0) throws java.rmi.RemoteException;
    public com.greenaall.ge.ef.ln.RetornoObtenerEstadosLoteDocumentos getEstadosLoteDocumentos(long[] in0) throws java.rmi.RemoteException;
}
