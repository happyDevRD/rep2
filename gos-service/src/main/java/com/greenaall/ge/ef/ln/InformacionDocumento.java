/**
 * InformacionDocumento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.greenaall.ge.ef.ln;

public class InformacionDocumento  implements java.io.Serializable {
    private java.lang.String desDoc;

    private java.lang.String ecm;

    private byte estado;

    private java.util.Calendar fechaEstado;

    private long idDoc;

    private long idPeticion;

    private byte multifirma;

    private java.lang.String tags;

    private java.lang.String texto;

    public InformacionDocumento() {
    }

    public InformacionDocumento(
           java.lang.String desDoc,
           java.lang.String ecm,
           byte estado,
           java.util.Calendar fechaEstado,
           long idDoc,
           long idPeticion,
           byte multifirma,
           java.lang.String tags,
           java.lang.String texto) {
           this.desDoc = desDoc;
           this.ecm = ecm;
           this.estado = estado;
           this.fechaEstado = fechaEstado;
           this.idDoc = idDoc;
           this.idPeticion = idPeticion;
           this.multifirma = multifirma;
           this.tags = tags;
           this.texto = texto;
    }


    /**
     * Gets the desDoc value for this InformacionDocumento.
     * 
     * @return desDoc
     */
    public java.lang.String getDesDoc() {
        return desDoc;
    }


    /**
     * Sets the desDoc value for this InformacionDocumento.
     * 
     * @param desDoc
     */
    public void setDesDoc(java.lang.String desDoc) {
        this.desDoc = desDoc;
    }


    /**
     * Gets the ecm value for this InformacionDocumento.
     * 
     * @return ecm
     */
    public java.lang.String getEcm() {
        return ecm;
    }


    /**
     * Sets the ecm value for this InformacionDocumento.
     * 
     * @param ecm
     */
    public void setEcm(java.lang.String ecm) {
        this.ecm = ecm;
    }


    /**
     * Gets the estado value for this InformacionDocumento.
     * 
     * @return estado
     */
    public byte getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this InformacionDocumento.
     * 
     * @param estado
     */
    public void setEstado(byte estado) {
        this.estado = estado;
    }


    /**
     * Gets the fechaEstado value for this InformacionDocumento.
     * 
     * @return fechaEstado
     */
    public java.util.Calendar getFechaEstado() {
        return fechaEstado;
    }


    /**
     * Sets the fechaEstado value for this InformacionDocumento.
     * 
     * @param fechaEstado
     */
    public void setFechaEstado(java.util.Calendar fechaEstado) {
        this.fechaEstado = fechaEstado;
    }


    /**
     * Gets the idDoc value for this InformacionDocumento.
     * 
     * @return idDoc
     */
    public long getIdDoc() {
        return idDoc;
    }


    /**
     * Sets the idDoc value for this InformacionDocumento.
     * 
     * @param idDoc
     */
    public void setIdDoc(long idDoc) {
        this.idDoc = idDoc;
    }


    /**
     * Gets the idPeticion value for this InformacionDocumento.
     * 
     * @return idPeticion
     */
    public long getIdPeticion() {
        return idPeticion;
    }


    /**
     * Sets the idPeticion value for this InformacionDocumento.
     * 
     * @param idPeticion
     */
    public void setIdPeticion(long idPeticion) {
        this.idPeticion = idPeticion;
    }


    /**
     * Gets the multifirma value for this InformacionDocumento.
     * 
     * @return multifirma
     */
    public byte getMultifirma() {
        return multifirma;
    }


    /**
     * Sets the multifirma value for this InformacionDocumento.
     * 
     * @param multifirma
     */
    public void setMultifirma(byte multifirma) {
        this.multifirma = multifirma;
    }


    /**
     * Gets the tags value for this InformacionDocumento.
     * 
     * @return tags
     */
    public java.lang.String getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this InformacionDocumento.
     * 
     * @param tags
     */
    public void setTags(java.lang.String tags) {
        this.tags = tags;
    }


    /**
     * Gets the texto value for this InformacionDocumento.
     * 
     * @return texto
     */
    public java.lang.String getTexto() {
        return texto;
    }


    /**
     * Sets the texto value for this InformacionDocumento.
     * 
     * @param texto
     */
    public void setTexto(java.lang.String texto) {
        this.texto = texto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformacionDocumento)) return false;
        InformacionDocumento other = (InformacionDocumento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.desDoc==null && other.getDesDoc()==null) || 
             (this.desDoc!=null &&
              this.desDoc.equals(other.getDesDoc()))) &&
            ((this.ecm==null && other.getEcm()==null) || 
             (this.ecm!=null &&
              this.ecm.equals(other.getEcm()))) &&
            this.estado == other.getEstado() &&
            ((this.fechaEstado==null && other.getFechaEstado()==null) || 
             (this.fechaEstado!=null &&
              this.fechaEstado.equals(other.getFechaEstado()))) &&
            this.idDoc == other.getIdDoc() &&
            this.idPeticion == other.getIdPeticion() &&
            this.multifirma == other.getMultifirma() &&
            ((this.tags==null && other.getTags()==null) || 
             (this.tags!=null &&
              this.tags.equals(other.getTags()))) &&
            ((this.texto==null && other.getTexto()==null) || 
             (this.texto!=null &&
              this.texto.equals(other.getTexto())));
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
        if (getDesDoc() != null) {
            _hashCode += getDesDoc().hashCode();
        }
        if (getEcm() != null) {
            _hashCode += getEcm().hashCode();
        }
        _hashCode += getEstado();
        if (getFechaEstado() != null) {
            _hashCode += getFechaEstado().hashCode();
        }
        _hashCode += new Long(getIdDoc()).hashCode();
        _hashCode += new Long(getIdPeticion()).hashCode();
        _hashCode += getMultifirma();
        if (getTags() != null) {
            _hashCode += getTags().hashCode();
        }
        if (getTexto() != null) {
            _hashCode += getTexto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformacionDocumento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "InformacionDocumento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "desDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "ecm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaEstado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "fechaEstado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "idDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPeticion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "idPeticion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multifirma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "multifirma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "tags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("texto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ln.ef.gos.greenaall.es", "texto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
