/**
 * RetornoInsertarPeticion_Helper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2beta3 Aug 01, 2004 (05:59:22 PDT) WSDL2Java emitter.
 */

package com.greenaall.ge.ef.ln;

public class RetornoInsertarPeticion_Helper {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetornoInsertarPeticion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "RetornoInsertarPeticion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codErr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "codErr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desErr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "desErr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPeticion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "idPeticion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
