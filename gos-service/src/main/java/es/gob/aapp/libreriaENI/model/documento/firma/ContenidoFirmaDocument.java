package es.gob.aapp.libreriaENI.model.documento.firma;

import java.io.Serializable;


public abstract class ContenidoFirmaDocument implements Cloneable, Serializable{


    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public Object clone () throws CloneNotSupportedException  {
    	if(this instanceof ContenidoFirmaCertificadoContenidoBinario){
    		ContenidoFirmaCertificadoContenidoBinario yo = (ContenidoFirmaCertificadoContenidoBinario) this;
    		ContenidoFirmaCertificadoContenidoBinario ret = new ContenidoFirmaCertificadoContenidoBinario();
    		ret.setIdentificadorRepositorio(yo.getIdentificadorRepositorio());
    		ret.setMime(yo.getMime());
    		ret.setValorBinario(yo.getValorBinario());
    		
    		return ret;
    	}else if(this instanceof ContenidoFirmaCertificadoDsSignature){
    		ContenidoFirmaCertificadoDsSignature yo = (ContenidoFirmaCertificadoDsSignature) this;
    		ContenidoFirmaCertificadoDsSignature ret = new ContenidoFirmaCertificadoDsSignature();
    		ret.setIdentificadorRepositorio(yo.getIdentificadorRepositorio());
    		ret.setMime(yo.getMime());
    		ret.setValorBinario(yo.getValorBinario());
    		
    		return ret;
    	}else if(this instanceof ContenidoFirmaCSV){
    		ContenidoFirmaCSV ret = new ContenidoFirmaCSV();
    		ContenidoFirmaCSV yo = (ContenidoFirmaCSV) this;
    		ret.setRegulacionGeneracionCSV(yo.getRegulacionGeneracionCSV());
    		ret.setValorCSV(yo.getValorCSV());
    		return ret;
    	}else{
    		throw new CloneNotSupportedException("No se como clonar un contenido de Firma " + this.getClass());
    	}
    	
    }

}