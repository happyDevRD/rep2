/**
 * RetornoObtenerEstadosLoteDocumentos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.greenaall.ge.ef.ln;

public class RetornoObtenerEstadosLoteDocumentos  implements java.io.Serializable {
    private long[] devueltos;

    private long[] firmados;

    private long[] pendientes;

    public RetornoObtenerEstadosLoteDocumentos() {
    }

    public RetornoObtenerEstadosLoteDocumentos(
           long[] devueltos,
           long[] firmados,
           long[] pendientes) {
           this.devueltos = devueltos;
           this.firmados = firmados;
           this.pendientes = pendientes;
    }


    /**
     * Gets the devueltos value for this RetornoObtenerEstadosLoteDocumentos.
     * 
     * @return devueltos
     */
    public long[] getDevueltos() {
        return devueltos;
    }


    /**
     * Sets the devueltos value for this RetornoObtenerEstadosLoteDocumentos.
     * 
     * @param devueltos
     */
    public void setDevueltos(long[] devueltos) {
        this.devueltos = devueltos;
    }


    /**
     * Gets the firmados value for this RetornoObtenerEstadosLoteDocumentos.
     * 
     * @return firmados
     */
    public long[] getFirmados() {
        return firmados;
    }


    /**
     * Sets the firmados value for this RetornoObtenerEstadosLoteDocumentos.
     * 
     * @param firmados
     */
    public void setFirmados(long[] firmados) {
        this.firmados = firmados;
    }


    /**
     * Gets the pendientes value for this RetornoObtenerEstadosLoteDocumentos.
     * 
     * @return pendientes
     */
    public long[] getPendientes() {
        return pendientes;
    }


    /**
     * Sets the pendientes value for this RetornoObtenerEstadosLoteDocumentos.
     * 
     * @param pendientes
     */
    public void setPendientes(long[] pendientes) {
        this.pendientes = pendientes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoObtenerEstadosLoteDocumentos)) return false;
        RetornoObtenerEstadosLoteDocumentos other = (RetornoObtenerEstadosLoteDocumentos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.devueltos==null && other.getDevueltos()==null) || 
             (this.devueltos!=null &&
              java.util.Arrays.equals(this.devueltos, other.getDevueltos()))) &&
            ((this.firmados==null && other.getFirmados()==null) || 
             (this.firmados!=null &&
              java.util.Arrays.equals(this.firmados, other.getFirmados()))) &&
            ((this.pendientes==null && other.getPendientes()==null) || 
             (this.pendientes!=null &&
              java.util.Arrays.equals(this.pendientes, other.getPendientes())));
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
        if (getDevueltos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDevueltos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDevueltos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFirmados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirmados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirmados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPendientes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPendientes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPendientes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetornoObtenerEstadosLoteDocumentos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "RetornoObtenerEstadosLoteDocumentos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devueltos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "devueltos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.ef.gos.greenaall.es", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmados");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "firmados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.ef.gos.greenaall.es", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendientes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "pendientes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.ef.gos.greenaall.es", "item"));
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
