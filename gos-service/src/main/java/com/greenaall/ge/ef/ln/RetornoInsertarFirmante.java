/**
 * RetornoInsertarFirmante.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.greenaall.ge.ef.ln;

public class RetornoInsertarFirmante  implements java.io.Serializable {
    private java.lang.String codErr;

    private java.lang.String desErr;

    private long idFirmante;

    public RetornoInsertarFirmante() {
    }

    public RetornoInsertarFirmante(
           java.lang.String codErr,
           java.lang.String desErr,
           long idFirmante) {
           this.codErr = codErr;
           this.desErr = desErr;
           this.idFirmante = idFirmante;
    }


    /**
     * Gets the codErr value for this RetornoInsertarFirmante.
     * 
     * @return codErr
     */
    public java.lang.String getCodErr() {
        return codErr;
    }


    /**
     * Sets the codErr value for this RetornoInsertarFirmante.
     * 
     * @param codErr
     */
    public void setCodErr(java.lang.String codErr) {
        this.codErr = codErr;
    }


    /**
     * Gets the desErr value for this RetornoInsertarFirmante.
     * 
     * @return desErr
     */
    public java.lang.String getDesErr() {
        return desErr;
    }


    /**
     * Sets the desErr value for this RetornoInsertarFirmante.
     * 
     * @param desErr
     */
    public void setDesErr(java.lang.String desErr) {
        this.desErr = desErr;
    }


    /**
     * Gets the idFirmante value for this RetornoInsertarFirmante.
     * 
     * @return idFirmante
     */
    public long getIdFirmante() {
        return idFirmante;
    }


    /**
     * Sets the idFirmante value for this RetornoInsertarFirmante.
     * 
     * @param idFirmante
     */
    public void setIdFirmante(long idFirmante) {
        this.idFirmante = idFirmante;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoInsertarFirmante)) return false;
        RetornoInsertarFirmante other = (RetornoInsertarFirmante) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codErr==null && other.getCodErr()==null) || 
             (this.codErr!=null &&
              this.codErr.equals(other.getCodErr()))) &&
            ((this.desErr==null && other.getDesErr()==null) || 
             (this.desErr!=null &&
              this.desErr.equals(other.getDesErr()))) &&
            this.idFirmante == other.getIdFirmante();
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
        if (getCodErr() != null) {
            _hashCode += getCodErr().hashCode();
        }
        if (getDesErr() != null) {
            _hashCode += getDesErr().hashCode();
        }
        _hashCode += new Long(getIdFirmante()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetornoInsertarFirmante.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "RetornoInsertarFirmante"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codErr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "codErr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desErr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "desErr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idFirmante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "idFirmante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
