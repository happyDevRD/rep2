package com.greenaall.util;

import java.util.Calendar;

import com.greenaall.exception.CtrError;
import com.greenaall.exception.ErrorFicheroTeuException;
import com.greenaall.models.gf.entity.GfTablonEdictal;
import com.greenaall.models.pe.entity.ModeloTeu;
import com.greenaall.models.pe.entity.Notificacion;
import com.greenaall.models.pe.entity.PersonaEntidad;

public class GenerarFicheroTEU extends ProcesoFicheroXML{

	private GfTablonEdictal oDatosTablonEdictal = null;
	private ModeloTeu oDatosModelo = null;
	private Notificacion oDatosNotificacion = null;
	private PersonaEntidad poPersona = null;
	
	public String inicializarDatos(GfTablonEdictal ficheroTeu, ModeloTeu oModeloTeu, Notificacion oNotificacion, PersonaEntidad oPersonaEntidad) {
		
		try {
			oDatosTablonEdictal = ficheroTeu;
			oDatosModelo = oModeloTeu;
			oDatosNotificacion = oNotificacion;
			poPersona = oPersonaEntidad;
			String ruta = this.crearFichero();
			this.generarEtiquetasCabecera();
			if (this.getFicheroXML() != null) {
		       this.getFicheroXML().finFicheroXML();
		     }else {
		    	 throw new ErrorFicheroTeuException();
		     }
			return ruta;
		} catch (CtrError e) {
			e.printStackTrace();
			throw new ErrorFicheroTeuException();
		}

	}
	
	public void generarEtiquetasCabecera() throws CtrError {
				this.insertarElementoAtributo("envio", "xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");		
				this.insertarElementoHoja("version", "1.0.0" );
				this.generarBloqueCabecera();	
	}
	
	
	private void insertarElementoAtributo(String pEtiqueta, String atributo,
			String valor) throws CtrError {
		this.getFicheroXML().insertarElemento(
				new ElementoXML(pEtiqueta, new AtributoXML[] { new AtributoXML(
						atributo, valor) }, null));
	}
	
	private void insertarElemento(String pEtiqueta) throws CtrError {
		this.getFicheroXML().insertarElemento(
				new ElementoXML(pEtiqueta, null, null));
	}
	
	private void insertarElementoHoja(String pEtiqueta, Object pValor)
			throws CtrError {
		this.getFicheroXML().insertarElementoHoja(
				new ElementoXML(pEtiqueta, null, pValor));
	}
	
	@SuppressWarnings("unused")
	private void insertarElementoHoja2(String pEtiqueta, Object pValor)
			throws CtrError {
		this.getFicheroXML().insertarElementoHoja2(
				new ElementoXML(pEtiqueta, null, pValor));
	}
	
	private void insertarElementoHojaAtributo(String pEtiqueta,
			String atributo, String valAtrib, Object pValor) throws CtrError {
		this.getFicheroXML().insertarElementoHoja(
				new ElementoXML(pEtiqueta, new AtributoXML[] { new AtributoXML(
						atributo, valAtrib) }, pValor));
	}
	
	private void insertarElementoHojaAtributo2(String pEtiqueta,
			String atributo, String valAtrib, String atributo2, String valAtrib2, Object pValor) throws CtrError {
		this.getFicheroXML().insertarElementoHoja(
				new ElementoXML(pEtiqueta, new AtributoXML[] { new AtributoXML(
						atributo, valAtrib), new AtributoXML(atributo2, valAtrib2) }, pValor));
	}
	
	private void insertarElementoHojaAtributo3(String pEtiqueta,
			String atributo, String valAtrib, Object pValor) throws CtrError {
		this.getFicheroXML().insertarElementoHoja2(
				new ElementoXML(pEtiqueta, new AtributoXML[] { new AtributoXML(
						atributo, valAtrib) }, pValor));
	}
	
	private void generarBloqueCabecera() throws CtrError {

		this.insertarElemento("anuncios");
		this.insertarElemento("remitente");
			this.insertarElementoHojaAtributo2("nodoRemitente", "nivel", "1", "idDir3", "LA9999999", "ENTIDADES LOCALES");
			this.insertarElementoHojaAtributo2("nodoRemitente", "nivel", "2", "idDir3", oDatosTablonEdictal.getCodDir3(), oDatosTablonEdictal.getDesDir3());
		this.terminarElemento();
		
		this.insertarElementoHoja("fechaPub", Fecha.formatear(oDatosTablonEdictal.getFecSolic(), Formateador.FECHA_CORTA_SQLDATE));
		
		this.insertarElemento("infPub");
			this.insertarElementoHoja("urlSW", oDatosTablonEdictal.getUrl());
			this.insertarElementoHoja("email", oDatosTablonEdictal.getEmail());
		this.terminarElemento();
		
		this.insertarElemento("anuncio");
			this.insertarElemento("emisor");
			this.insertarElementoHojaAtributo2("nodoEmisor", "nivel", "1", "idDir3", "LA9999999", "ENTIDADES LOCALES");
			this.insertarElementoHojaAtributo2("nodoEmisor", "nivel", "2", "idDir3", oDatosTablonEdictal.getCodDir3(), oDatosTablonEdictal.getDesDir3());
			this.terminarElemento();
			this.insertarElemento("metadatos");
				Calendar fecha = Calendar.getInstance();
				int ano = fecha.get(Calendar.YEAR);
				String sId = String.valueOf(ano) + "/" + String.valueOf(oDatosTablonEdictal.getExpedicion());
				this.insertarElementoHoja("id", sId);
				String sFormPub = "";
				if(oDatosTablonEdictal.getForPubli().equals(Short.valueOf((short)1))) {
					sFormPub = "E";
				}else {
					sFormPub = "I";
				}
				this.insertarElementoHoja("formPub", sFormPub);
				String sDatPerso = "";
				if(oDatosTablonEdictal.getDatPerso()) {
					sDatPerso = "S";
				}else {
					sDatPerso = "N";
				}
				this.insertarElementoHoja("datosPersonales", sDatPerso);
				this.insertarElemento("materias");
				String sDesMat = "";
				String sIdMat = String.valueOf(oDatosTablonEdictal.getIndMater());
				if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)1))) {
					sDesMat = "Agricultura y Ganaderia";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)2))){
			    	 sDesMat = "Aguas";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)3))){
			    	 sDesMat = "Catastro";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)4))){
			    	 sDesMat = "Caza y Pesca";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)5))){
			    	 sDesMat = "Consumo";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)6))){
			    	 sDesMat = "Credito, Banca y Seguros";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)7))){
				     sDesMat = "Cultura y Espectaculos";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)8))){
					 sDesMat = "Deportes";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)9))){
			    	 sDesMat = "Economia y Comercio";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)10))){
			    	 sDesMat = "Empleados Publicos";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)11))){
			    	 sDesMat = "Empleo";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)12))){
			    	 sDesMat = "Energia";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)13))){
			    	 sDesMat = "Educacion";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)14))){
			    	 sDesMat = "Ensenanza Universitaria";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)15))){
			    	 sDesMat = "Estadisticas";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)16))){
			    	 sDesMat = "Expropiaciones";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)17))){
			    	 sDesMat = "Extranjeria";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)18))){
			    	 sDesMat = "Fuerzas Armadas";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)19))){
			    	 sDesMat = "Hacienda";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)20))){
			    	 sDesMat = "Industria y Artesania";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)21))){
			    	 sDesMat = "Inspeccion de Trabajo";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)22))){
			    	 sDesMat = "Juego";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)23))){
			    	 sDesMat = "Medio Ambiente y Sostenibilidad";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)24))){
			    	 sDesMat = "Metrologia";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)25))){
			    	 sDesMat = "Navegación Aerea";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)26))){
			    	 sDesMat = "Navegación Maritima, Puertos y Marina Mercante";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)27))){
			    	 sDesMat = "Notarias";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)28))){
			    	 sDesMat = "Urbanismo y Vivienda";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)29))){
			    	 sDesMat = "Padron Municipal de Habitantes";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)30))){
			    	 sDesMat = "Parimonio y Propiedades Publicas";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)31))){
			    	 sDesMat = "Propiedad Intelectual";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)32))){
			    	 sDesMat = "Propiedad Industrial";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)33))){
			    	 sDesMat = "Proteccion de Datos de Caracter Personal";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)34))){
			    	 sDesMat = "Registros de la Propiedad";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)35))){
			    	 sDesMat = "Responsabilidad Patrimonial";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)36))){
			    	 sDesMat = "Sanidad y Farmacia";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)37))){
			    	 sDesMat = "Seguridad Ciudadana y Proteccion Civil";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)38))){
			    	 sDesMat = "Prestaciones de Seguridad Social y de Accion Social Maritima";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)39))){
			    	 sDesMat = "Servicios Funerarios";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)40))){
			    	 sDesMat = "Servicios Sociales";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)41))){
			    	 sDesMat = "Subvenciones, Becas y otras Ayudas";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)42))){
			    	 sDesMat = "Telecomunicaciones y Nuevas Tecnologias";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)43))){
			    	 sDesMat = "Trafico, Circulacion y Seguridad Vial";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)44))){
			    	 sDesMat = "Transportes Terretres";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)45))){
			    	 sDesMat = "Turismo";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)46))){
			    	 sDesMat = "Otras";
			     }else if(oDatosTablonEdictal.getIndMater().equals(Short.valueOf((short)47))){
			    	 sDesMat = "Inscripción, Afiliación y Recaudación de la Seguridad Social";
				 }
				this.insertarElementoHojaAtributo("materia", "idMat", sIdMat, sDesMat);
				this.terminarElemento();
				String sLgt = "";
				if(oDatosTablonEdictal.getIncLgt()) {
					sLgt = "S";
				}else {
					sLgt = "N";
				}
				this.insertarElementoHoja("lgt", sLgt);
				String sPlural = "";
				if(oDatosTablonEdictal.getTexPlura()) {
					sPlural = "S";
				}else {
					sPlural = "N";
				}
				this.insertarElementoHojaAtributo("procedimiento", "plural", sPlural, oDatosTablonEdictal.getProcedimiento());
				this.terminarElemento();
				this.insertarElemento("contenido");
					this.insertarElementoAtributo("texto", "content-type", "application/xml");
						this.insertarElementoHojaAtributo("p", "class", "parrafo", oDatosModelo.getTexLegal());
						this.insertarElementoHojaAtributo("p", "class", "titulo", oDatosModelo.getTitModel());	
						this.insertarElemento("table");
							this.insertarElementoHoja("caption", oDatosModelo.getDesModel());
							this.insertarElemento("colgroup");
								this.insertarElementoHojaAtributo3("col", "class", "index:NIF", null);
								this.insertarElementoHojaAtributo3("col", "class", "index:NOMBRE", null);
								this.terminarElemento9();
								this.terminarElemento9();
								this.terminarElemento9();
								this.terminarElemento9();
							this.terminarElemento2();
							this.insertarElemento("thead");
								this.insertarElemento("tr");
									this.insertarElementoHoja("th", "DOCUMENTO");
									this.insertarElementoHoja("th", "NOMBRE");
									this.insertarElementoHoja("th", "EJERCIO EXPEDIENTE");
									this.insertarElementoHoja("th", "NÚMERO EXPEDIENTE");
									//this.insertarElementoHoja("th", oDatosModelo.getCamp05());
									//this.insertarElementoHoja("th", oDatosModelo.getCamp06());
								this.terminarElemento();
							this.terminarElemento();
							this.insertarElemento("tbody");
								procesarTabla();	
							this.terminarElemento();
						this.terminarElemento3();
					this.terminarElemento4();
					this.insertarElemento("pieFirma");
						this.insertarElementoHoja("lugar", oDatosTablonEdictal.getPobFirma());
						this.insertarElementoHoja("fecha", Fecha.formatear(oDatosTablonEdictal.getFecFirma(), Formateador.FECHA_CORTA_SQLDATE));
						this.insertarElementoHoja("firmante", oDatosTablonEdictal.getFirmante());
					this.terminarElemento();
					this.terminarElemento5();
				this.terminarElemento6();
		this.terminarElemento7();	
		this.terminarElemento8();		
	}
	
	private void procesarTabla() throws CtrError  {
						
		this.insertarElemento("tr");
		Short sEjeExped = ((Notificacion) oDatosNotificacion).getEjeExped();
		String sNumExped = ((Notificacion) oDatosNotificacion).getNumExped();
		
		String sDNI = null;
		int sTipPerso = 0;
		if(poPersona.getNumDocum() != null && poPersona.getTipPerso() != null 
				&& (poPersona.getTipPerso() >=0 && poPersona.getTipPerso()<=4)
				&& poPersona.getNumDocum().length() == 9 ) {
			sDNI = poPersona.getNumDocum();
			StringBuilder sDNITratado = new StringBuilder(sDNI);
			sTipPerso = poPersona.getTipPerso();
			sDNITratado.setCharAt(0, '*');
			sDNITratado.setCharAt(1, '*');
			sDNITratado.setCharAt(2, '*');
			sDNITratado.setCharAt(3, '*');
			sDNITratado.setCharAt(8, '*');
			sDNI = sDNITratado.toString();	
		}
		// Pasaporte ABC123456  *****3456
		if(poPersona.getNumDocum() != null && poPersona.getTipPerso() != null 
				&& poPersona.getTipPerso() == 5
				&& poPersona.getNumDocum().length() >= 9 ) {
			sDNI = poPersona.getNumDocum();
			StringBuilder sDNITratado = new StringBuilder(sDNI);
			sTipPerso = poPersona.getTipPerso();
			sDNITratado.setCharAt(0, '*');
			sDNITratado.setCharAt(1, '*');
			sDNITratado.setCharAt(2, '*');
			sDNITratado.setCharAt(3, '*');
			sDNITratado.setCharAt(4, '*');
			sDNI = sDNITratado.toString();
		}
		if(poPersona.getNumDocum() != null && poPersona.getTipPerso() != null 
				&& poPersona.getTipPerso() == 5 && (poPersona.getNumDocum().length() >= 6
				&& poPersona.getNumDocum().length() < 9) ) {
			sDNI = poPersona.getNumDocum();
			StringBuilder sDNITratado = new StringBuilder(sDNI);
			sTipPerso = poPersona.getTipPerso();
			sDNITratado.setCharAt(0, '*');
			sDNITratado.setCharAt(1, '*');
			sDNITratado.setCharAt(2, '*');
			sDNITratado.setCharAt(3, '*');
			sDNITratado.setCharAt(4, '*');
			sDNI = sDNITratado.toString();
		}
		if(poPersona.getNumDocum() != null && poPersona.getTipPerso() != null 
				&& poPersona.getTipPerso() == 5 && (poPersona.getNumDocum().length() >= 3
				&& poPersona.getNumDocum().length() < 6) ) {
			sDNI = poPersona.getNumDocum();
			StringBuilder sDNITratado = new StringBuilder(sDNI);
			sTipPerso = poPersona.getTipPerso();
			sDNITratado.setCharAt(0, '*');
			sDNITratado.setCharAt(1, '*');
			sDNI = sDNITratado.toString();
		}
		
		String sNombre = null;
		if((poPersona.getTipPerso() == 2 || poPersona.getTipPerso() == 3) && poPersona.getRazSocia() != null) {
			sNombre = poPersona.getRazSocia();
		}else if(poPersona.getTipPerso() == 1 && poPersona.getApellido2() != null && poPersona.getApellido1() != null) {
			sNombre = poPersona.getApellido1() + " " + poPersona.getApellido2() + " " + poPersona.getNombre();
		}else if(poPersona.getTipPerso() == 1 && poPersona.getApellido2() == null && poPersona.getApellido1() != null 
				&& poPersona.getNombre() != null){
			sNombre = poPersona.getApellido1() + " " + poPersona.getNombre();
		}else {
			sNombre = poPersona.getDesPerEntid();
		}
		
		this.insertarElementoHoja("td", sDNI);
		this.insertarElementoHoja("td", Utiles.normalizaSepa(sNombre));
		this.insertarElementoHoja("td", sEjeExped);
		this.insertarElementoHoja("td", sNumExped);
		//this.insertarElementoHoja("td", Utilidades.normalizaSepa(sObjetoModulo));
		//this.insertarElementoHoja("td", sImpRecib);
		this.terminarElemento();
        
	}
	
	private void terminarElemento() throws CtrError {
		this.getFicheroXML().terminarElemento();
	}
	
	private void terminarElemento2() throws CtrError {
		this.getFicheroXML().terminarElemento2();
	}
	
	private void terminarElemento3() throws CtrError {
		this.getFicheroXML().terminarElemento3();
	}
	
	private void terminarElemento4() throws CtrError {
		this.getFicheroXML().terminarElemento4();
	}
	
	private void terminarElemento5() throws CtrError {
		this.getFicheroXML().terminarElemento5();
	}
	
	private void terminarElemento6() throws CtrError {
		this.getFicheroXML().terminarElemento6();
	}
	
	private void terminarElemento7() throws CtrError {
		this.getFicheroXML().terminarElemento7();
	}
	
	private void terminarElemento8() throws CtrError {
		this.getFicheroXML().terminarElemento8();
	}
	
	private void terminarElemento9() throws CtrError {
		this.getFicheroXML().terminarElemento9();
	}
}
