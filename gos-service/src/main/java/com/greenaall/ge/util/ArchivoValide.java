package com.greenaall.ge.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.Vector;

import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.xml.sax.SAXException;
import org.docx4j.model.fields.merge.DataFieldName;
import org.docx4j.model.fields.merge.MailMerger.OutputField;
import com.greenaall.ge.dto.Etiquetas;
import com.greenaall.models.ge.entity.Archivo;
import com.greenaall.util.Utiles;

import com.sun.star.beans.PropertyValue;
import com.sun.star.frame.XComponentLoader;
import com.sun.star.uno.UnoRuntime;
import com.sun.star.uno.XComponentContext;
import com.sun.star.text.XTextFieldsSupplier;

import ooo.connector.BootstrapSocketConnector;

import com.sun.star.lang.XComponent;
import com.sun.star.lang.XMultiComponentFactory;
import com.sun.star.container.XEnumeration;
import com.sun.star.container.XEnumerationAccess;
import com.sun.star.text.XTextField;
import com.sun.star.beans.XPropertySet;
import com.sun.star.util.XRefreshable;

public class ArchivoValide {

	private static XPropertySet[] aoArrayVariables;

	public static String dameRutaFlow(String sInstalacion, Short ejercicio, Integer numero) {
		String ruta = null;
		if (sInstalacion != null) {
			String tipoArchivo = "expediente";

			if (sInstalacion.equals("C:\\iflow") || sInstalacion.equals("C:\\iflow\\")
					|| sInstalacion.equals("c:\\iflow") || sInstalacion.equals("c:\\iflow\\")) {
				ruta = "C:\\iflow\\textos\\ex\\" + tipoArchivo + "\\" + ejercicio.toString() + "\\" + numero.toString();
			} else if (sInstalacion.equals("C:\\Greenaall\\iflow\\") || sInstalacion.equals("C:\\Greenaall\\iflow")
					|| sInstalacion.equals("c:\\Greenaall\\iflow\\") || sInstalacion.equals("c:\\Greenaall\\iflow")) {
				ruta = "C:\\Greenaall\\iflow\\textos\\ex\\" + tipoArchivo + "\\" + ejercicio.toString() + "\\"
						+ numero.toString();
			} else {
				ruta = "/srv/iflow/textos/ex/" + tipoArchivo + "/" + ejercicio.toString() + "/" + numero.toString();
			}

			File directorio = new File(ruta);
			if (!directorio.exists()) {
				if (directorio.mkdirs()) {
					System.out.println("Directorio creado");
				} else {
					System.err.println("Error al crear directorio");
				}
			}
		}
		return ruta;
	}

	public static Archivo insertarArcExpd(Archivo oArchivo) {

		File oFichero = new File(oArchivo.getDesArchiFlow());
		try {
			byte[] fileContent;
			fileContent = Files.readAllBytes(oFichero.toPath());
			oArchivo.setArcExpd(fileContent);
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
		return oArchivo;
	}
	
	public static Archivo altaPlantilla(String sInstalacion, String ejercicio, String numero, String plantillaDefecto) {
		
		if (sInstalacion != null) {
			String rutaOrigenDoc = sInstalacion + File.separator + "formatos" + File.separator  + "ex" + File.separator +
			plantillaDefecto + ".docx";
			String rutaOrigenODt = sInstalacion + File.separator + "formatos" + File.separator  + "ex" + File.separator +
					plantillaDefecto + ".odt";
			
			String rutaDestino = sInstalacion + File.separator + "textos" + File.separator  + "ex" + 
					File.separator + "expediente" + File.separator + ejercicio + File.separator +		
				   numero +File.separator;
				   
			File directorio = new File(rutaDestino);
			if (!directorio.exists()) {
				if (directorio.mkdirs()) {
					System.out.println("Directorio creado");
				} else {
					System.out.println("Error al crear directorio");
				}
			}
					
			File oPlantillaDoc = new File(rutaOrigenDoc);
			File oPlantillaOdt = new File(rutaOrigenODt);
			Archivo oArchivo = new Archivo();
			if (oPlantillaDoc.exists()) {
				try {
					File fileDestino = new File(rutaDestino + plantillaDefecto + ".docx");
					if(fileDestino.exists()) {
						return null;
					}else {
						Path origenPath = Paths.get(oPlantillaDoc.getAbsolutePath());
		                Path destinoPath = Paths.get(fileDestino.getAbsolutePath());
						Files.copy(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
						oArchivo.setDesArchi(rutaDestino + plantillaDefecto + ".docx");
						oArchivo.setDesArchiFlow(rutaDestino + plantillaDefecto + ".docx");
						oArchivo.setDesDocum(plantillaDefecto+".docx");
					}
		        } catch (IOException e) {
		            System.err.println(e);
		        }
			}else {
				oArchivo.setDesArchi("C:\\iflow\\textos\\ex\\expediente\\2025\\2\\plantillaTest1.docx");
				oArchivo.setDesArchiFlow(rutaDestino + plantillaDefecto + ".docx");
				oArchivo.setDesDocum(plantillaDefecto+".docx");
			}
			
			if (oPlantillaOdt.exists()) {
				try {
					File fileDestino = new File(rutaDestino + plantillaDefecto + ".odt");
					if(fileDestino.exists()) {
						return null;
					}else {
						Path origenPath = Paths.get(oPlantillaDoc.getAbsolutePath());
		                Path destinoPath = Paths.get(fileDestino.getAbsolutePath());
						Files.copy(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
						oArchivo.setDesArchi(rutaDestino + plantillaDefecto + ".odt");
						oArchivo.setDesArchiFlow(rutaDestino + plantillaDefecto + ".odt");
						oArchivo.setDesDocum(plantillaDefecto+".odt");
					}
		        } catch (IOException e) {
		            System.err.println(e);
		        }
			}
		
			
			oArchivo.setModulo(Short.valueOf((short) 22));
			oArchivo.setTipFiche(Short.valueOf((short) 1));
			oArchivo.setCodProgr(Long.valueOf((long) 0));
			oArchivo.setFecGenera(new Date());
			oArchivo.setTipDocum(Long.valueOf((long) 1));
			oArchivo.setEstado(Short.valueOf((short) 1));
			oArchivo.setCodEntid(Short.valueOf((short) 1));
			oArchivo.setFecContr(new Date());
			oArchivo.setTipFiche(Short.valueOf((short) 4));

			return oArchivo;
		}
		return null;
		
	}

	/** Ruta absoluta del fichero (misma lógica que {@link #altaArchivo}). */
	public static String rutaArchivoExpediente(String sInstalacion, Short ejercicio, Integer numero,
			String nombreArchivo, int tipo) {
		if (sInstalacion == null || ejercicio == null || numero == null || nombreArchivo == null) {
			return null;
		}
		String tipoArchivo = (tipo == 1) ? "solicitud" : "expediente";
		if (sInstalacion.equals("C:\\iflow") || sInstalacion.equals("C:\\iflow\\")
				|| sInstalacion.equals("c:\\iflow") || sInstalacion.equals("c:\\iflow\\")) {
			return "C:\\iflow\\textos\\ex\\" + tipoArchivo + "\\" + ejercicio + "\\" + numero + "\\" + nombreArchivo;
		}
		if (sInstalacion.equals("C:\\Greenaall\\iflow\\") || sInstalacion.equals("C:\\Greenaall\\iflow")
				|| sInstalacion.equals("c:\\Greenaall\\iflow\\") || sInstalacion.equals("c:\\Greenaall\\iflow")) {
			return "C:\\Greenaall\\iflow\\textos\\ex\\" + tipoArchivo + "\\" + ejercicio + "\\" + numero + "\\"
					+ nombreArchivo;
		}
		return "/srv/iflow/textos/ex/" + tipoArchivo + "/" + ejercicio + "/" + numero + "/" + tipoArchivo + "/"
				+ nombreArchivo;
	}

	public static Archivo altaArchivo(String fichero64, String sInstalacion, Short ejercicio, Integer numero,
			String nombreArchivo, int tipo) {

		if (sInstalacion != null) {
			String ruta = null;
			Archivo oArchivo = new Archivo();
			String tipoArchivo = null;
			if (tipo == 1) {
				tipoArchivo = "solicitud";
			} else {
				tipoArchivo = "expediente";
			}
			if (sInstalacion.equals("C:\\iflow") || sInstalacion.equals("C:\\iflow\\")
					|| sInstalacion.equals("c:\\iflow") || sInstalacion.equals("c:\\iflow\\")) {
				ruta = "C:\\iflow\\textos\\ex\\" + tipoArchivo + "\\" + ejercicio.toString() + "\\" + numero.toString();
				oArchivo.setDesArchiFlow(ruta + "\\" + nombreArchivo);
			} else if (sInstalacion.equals("C:\\Greenaall\\iflow\\") || sInstalacion.equals("C:\\Greenaall\\iflow")
					|| sInstalacion.equals("c:\\Greenaall\\iflow\\") || sInstalacion.equals("c:\\Greenaall\\iflow")) {
				ruta = "C:\\Greenaall\\iflow\\textos\\ex\\" + tipoArchivo + "\\" + ejercicio.toString() + "\\"
						+ numero.toString();
				oArchivo.setDesArchiFlow(ruta + "\\" + nombreArchivo);
			} else {
				ruta = "/srv/iflow/textos/ex/" + tipoArchivo + "/" + ejercicio.toString() + "/" + numero.toString();
				oArchivo.setDesArchiFlow(ruta + "/" + tipoArchivo + "/" + nombreArchivo);
			}

			File directorio = new File(ruta);
			if (!directorio.exists()) {
				if (directorio.mkdirs()) {
					System.out.println("Directorio creado");
				} else {
					System.out.println("Error al crear directorio");
				}
			}

			File oFichero = new File(oArchivo.getDesArchiFlow());
			try {
				if (oFichero != null) {
					if (oFichero.exists()) {
						// oFichero.delete();
						// Utiles.parseBase64toFile(oArchivo.getDesArchiFlow(), fichero64);
						return null;
					} else {
						Utiles.parseBase64toFile(oArchivo.getDesArchiFlow(), fichero64);
					}
				}
				byte[] fileContent;
				fileContent = Files.readAllBytes(oFichero.toPath());
				oArchivo.setArcExpd(fileContent);
			} catch (java.lang.Exception e) {
				e.printStackTrace();
			}

			oArchivo.setModulo(Short.valueOf((short) 22));
			oArchivo.setDesArchi(oArchivo.getDesArchiFlow());
			oArchivo.setDesArchiFlow(oArchivo.getDesArchiFlow());
			oArchivo.setTipFiche(Short.valueOf((short) 1));
			oArchivo.setCodProgr(Long.valueOf((long) 0));
			oArchivo.setDesDocum(nombreArchivo);
			oArchivo.setFecGenera(new Date());
			oArchivo.setTipDocum(Long.valueOf((long) 1));
			oArchivo.setEstado(Short.valueOf((short) 1));
			oArchivo.setCodEntid(Short.valueOf((short) 1));
			oArchivo.setFecContr(new Date());
			oArchivo.setTipFiche(Short.valueOf((short) 4));

			return oArchivo;
		}
		return null;
	}

	public static Archivo altaArchivoNuevo(String sInstalacion, Short ejercicio, Integer numero, String nombreArchivo) {
		if (sInstalacion != null) {
			String ruta = null;
			Archivo oArchivo = new Archivo();
			String tipoArchivo = "expediente";

			if (sInstalacion.equals("C:\\iflow") || sInstalacion.equals("C:\\iflow\\")
					|| sInstalacion.equals("c:\\iflow") || sInstalacion.equals("c:\\iflow\\")) {
				ruta = "C:\\iflow\\textos\\ex\\" + tipoArchivo + "\\" + ejercicio.toString() + "\\" + numero.toString();
				oArchivo.setDesArchiFlow(ruta + "\\" + nombreArchivo);
			} else if (sInstalacion.equals("C:\\Greenaall\\iflow\\") || sInstalacion.equals("C:\\Greenaall\\iflow")
					|| sInstalacion.equals("c:\\Greenaall\\iflow\\") || sInstalacion.equals("c:\\Greenaall\\iflow")) {
				ruta = "C:\\Greenaall\\iflow\\textos\\ex\\" + tipoArchivo + "\\" + ejercicio.toString() + "\\"
						+ numero.toString();
				oArchivo.setDesArchiFlow(ruta + "\\" + nombreArchivo);
			} else {
				ruta = "/srv/iflow/textos/ex/" + tipoArchivo + "/" + ejercicio.toString() + "/" + numero.toString();
				oArchivo.setDesArchiFlow(ruta + "/" + tipoArchivo + "/" + nombreArchivo);
			}

			File directorio = new File(ruta);
			if (!directorio.exists()) {
				if (directorio.mkdirs()) {
					System.out.println("Directorio creado");
				} else {
					System.err.println("Error al crear directorio");
				}
			}

			File oFichero = new File(oArchivo.getDesArchiFlow());
			try {
				if (oFichero.createNewFile())
					System.out.println("El fichero se ha creado correctamente");
				else
					System.err.println("No ha podido ser creado el fichero");
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			UUID uuid = UUID.randomUUID();
			String getCve, firmaCsv = null;

			try {
				getCve = Utiles.getCve(uuid);
				firmaCsv = new String(java.util.Base64.getEncoder().encodeToString(getCve.getBytes()));
			} catch (java.lang.Exception e) {
				e.printStackTrace();
			}
			oArchivo.setModulo(Short.valueOf((short) 22));
			oArchivo.setDesArchi(oArchivo.getDesArchiFlow());
			oArchivo.setDesArchiFlow(oArchivo.getDesArchiFlow());
			oArchivo.setTipFiche(Short.valueOf((short) 1));
			oArchivo.setCodProgr(Long.valueOf((long) 0));
			oArchivo.setDesDocum(nombreArchivo);
			oArchivo.setRefGesDocum(nombreArchivo);
			oArchivo.setHuella(firmaCsv);
			oArchivo.setFecGenera(new Date());
			oArchivo.setTipDocum(Long.valueOf((long) 1));
			oArchivo.setEstado(Short.valueOf((short) 1));
			oArchivo.setCodEntid(Short.valueOf((short) 1));
			oArchivo.setFecContr(new Date());
			oArchivo.setTipFiche(Short.valueOf((short) 4));

			return oArchivo;
		}
		return null;
	}

	public static Archivo altaArchivoVisualizacion(String sInstalacion, Short ejercicio, Integer numero,
			List<Archivo> aArchivoTarea) {

		if (sInstalacion != null) {
			String ruta = null;
			Archivo oArchivo = new Archivo();
			String tipoArchivo = "expediente";
			String nombreArchivo = "EE" + ejercicio.toString() + numero.toString() + ".properties";

			if (sInstalacion.equals("C:\\iflow") || sInstalacion.equals("C:\\iflow\\")
					|| sInstalacion.equals("c:\\iflow") || sInstalacion.equals("c:\\iflow\\")) {
				ruta = "C:\\iflow\\textos\\ex\\" + tipoArchivo + "\\" + ejercicio.toString() + "\\" + numero.toString();
				oArchivo.setDesArchiFlow(ruta + "\\" + nombreArchivo);
			} else if (sInstalacion.equals("C:\\Greenaall\\iflow\\") || sInstalacion.equals("C:\\Greenaall\\iflow")
					|| sInstalacion.equals("c:\\Greenaall\\iflow\\") || sInstalacion.equals("c:\\Greenaall\\iflow")) {
				ruta = "C:\\Greenaall\\iflow\\textos\\ex\\" + tipoArchivo + "\\" + ejercicio.toString() + "\\"
						+ numero.toString();
				oArchivo.setDesArchiFlow(ruta + "\\" + nombreArchivo);
			} else {
				ruta = "/srv/iflow/textos/ex/" + tipoArchivo + "/" + ejercicio.toString() + "/" + numero.toString();
				oArchivo.setDesArchiFlow(ruta + "/" + tipoArchivo + "/" + nombreArchivo);
			}

			File directorio = new File(ruta);
			if (!directorio.exists()) {
				if (directorio.mkdirs()) {
					System.out.println("Directorio creado");
				} else {
					System.err.println("Error al crear directorio");
				}
			}

			File oFichero = new File(oArchivo.getDesArchiFlow());
			try {
				if (oFichero.createNewFile())
					System.out.println("El fichero se ha creado correctamente");
				else
					System.err.println("No ha podido ser creado el fichero");
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}

			try {
				Properties oPropiedades = new Properties(System.getProperties());
				FileOutputStream oFicheroResument;
				oFicheroResument = new FileOutputStream(oArchivo.getDesArchiFlow());
				oPropiedades.setProperty("Total", Integer.toString(aArchivoTarea.size()));
				for (int i = 0; i < aArchivoTarea.size(); i++) {
					String numberAsString = Integer.toString(i + 1);
					oPropiedades.setProperty("Archivo" + numberAsString, aArchivoTarea.get(i).getCodArchi().toString());
					oPropiedades.setProperty("Nombre" + numberAsString, aArchivoTarea.get(i).getDesDocum());
					if(aArchivoTarea.get(i).getHuellaCSV() != null) {
						oPropiedades.setProperty("Huella" + numberAsString, aArchivoTarea.get(i).getHuellaCSV());
					}else if(aArchivoTarea.get(i).getHuella() != null){
						oPropiedades.setProperty("Huella" + numberAsString, aArchivoTarea.get(i).getHuella());
					}else {
						oPropiedades.setProperty("Huella" + numberAsString, "sin huella");
					}
					
				}
				oPropiedades.store(oFicheroResument, "Indice Expedinte: " + ejercicio.toString() + numero.toString());
				oFicheroResument.close();
			} catch (IOException e) {
				System.err.println("Error al crear el fichero de resumen.");
				e.printStackTrace();
			}

			oArchivo.setModulo(Short.valueOf((short) 22));
			oArchivo.setDesArchi(oArchivo.getDesArchiFlow());
			oArchivo.setDesArchiFlow(oArchivo.getDesArchiFlow());
			oArchivo.setTipFiche(Short.valueOf((short) 1));
			oArchivo.setCodProgr(Long.valueOf((long) 0));
			oArchivo.setDesDocum(nombreArchivo);
			oArchivo.setRefGesDocum(nombreArchivo);
			oArchivo.setFecGenera(new Date());
			oArchivo.setTipDocum(Long.valueOf((long) 1));
			oArchivo.setEstado(Short.valueOf((short) 1));
			oArchivo.setCodEntid(Short.valueOf((short) 1));
			oArchivo.setFecContr(new Date());
			oArchivo.setTipFiche(Short.valueOf((short) 4));

			return oArchivo;
		}
		return null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean fusionDocumentoODT(String rutaArchivo, Etiquetas oEtiquetas, String oooExeFolder) {

		boolean mergedOutput = true;

		try {
			XComponentContext xContext = BootstrapSocketConnector.bootstrap(oooExeFolder);
			System.out.println("Connected to a running office ...");

			XMultiComponentFactory xServiceManager = xContext.getServiceManager();
			Object desktop = xServiceManager.createInstanceWithContext("com.sun.star.frame.Desktop", xContext);

			XComponentLoader xComponentLoader = UnoRuntime.queryInterface(XComponentLoader.class, desktop);

			String loadURL = "file:///" + rutaArchivo.replace('\\', '/');
			PropertyValue[] loadProps = new PropertyValue[0];
			XComponent xComponent = xComponentLoader.loadComponentFromURL(loadURL, "_blank", 0, loadProps);

			if (xComponent != null) {
				System.out.println("Documento cargado correctamente!!.");
				XTextFieldsSupplier oXTextFieldsSupplier = (XTextFieldsSupplier) UnoRuntime
						.queryInterface(XTextFieldsSupplier.class, xComponent);
				XEnumerationAccess oXEnumeratedFields = oXTextFieldsSupplier.getTextFields();
				XEnumeration oXParaEnum = oXEnumeratedFields.createEnumeration();

				Vector oVariables = new Vector();

				while (oXParaEnum.hasMoreElements()) {
					XTextField oXTextField = (XTextField) UnoRuntime.queryInterface(XTextField.class,
							oXParaEnum.nextElement());

					XPropertySet oXSet = (XPropertySet) UnoRuntime.queryInterface(XPropertySet.class, oXTextField);

					if (oXSet.getPropertySetInfo().hasPropertyByName("VariableName")
							&& oXSet.getPropertySetInfo().hasPropertyByName("Content")) {
						oVariables.add(oXSet);
					}
				}

				aoArrayVariables = new XPropertySet[oVariables.size()];
				oVariables.copyInto(aoArrayVariables);

				String sValEtiq = "";
				for (int i = 0; i < aoArrayVariables.length; i++) {
					// Buscar el Valor de la Variable en la Lista de Variables del Maestro
					sValEtiq = aoArrayVariables[i].getPropertyValue("VariableName").toString().toUpperCase();
					if (sValEtiq.equals("TTOAYTO")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getTtoAyto());
					} else if (sValEtiq.equals("CIUDAD")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getCiudad());
					} else if (sValEtiq.equals("NOMAYTO")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNomAyto());
					} else if (sValEtiq.equals("SECRETARIO")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNomSecre());
					} else if (sValEtiq.equals("ALCALDE")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNomAlcal());
					} else if (sValEtiq.equals("INTERVENTOR")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNomIntev());
					} else if (sValEtiq.equals("TESORERO")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNomTesor());
					} else if (sValEtiq.equals("FECDIANUM")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getFecDiaNumer());
					} else if (sValEtiq.equals("FECMESLET")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getFecMesLetra());
					} else if (sValEtiq.equals("FECANONUM")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getFecAnoNumer());
					} else if (sValEtiq.equals("USUARIO")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getUsuario());
					} else if (sValEtiq.equals("DEPARTAMENTO")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDepartamento());	
					} else if (sValEtiq.equals("CODPOSTAAYTO")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getCpAyto());	
					} else if (sValEtiq.equals("DOMAYTO")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDomAyto());		
					} else if (sValEtiq.equals("FIRMA01")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getFirma01());		
					} else if (sValEtiq.equals("FIRMA02")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getFirma02());
					} else if (sValEtiq.equals("FIRMA03")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getFirma03());
					} else if (sValEtiq.equals("FIRMA04")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getFirma04());
					} else if (sValEtiq.equals("FIRMA05")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getFirma05());
					} else if (sValEtiq.equals("FIRMA06")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getFirma06());
					} else if (sValEtiq.equals("FECEMISION")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getFecEmisi());	
					} else if (sValEtiq.equals("DIAEMISION")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDiaEmisi());		
					} else if (sValEtiq.equals("MESEMISION")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getMesEmisi());	
					} else if (sValEtiq.equals("ANOEMISION")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getAnoEmisi());	
					} else if (sValEtiq.equals("DIASEMEMISION")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDiaSemEmisi());	
					} else if (sValEtiq.equals("FECMESNUM")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getFecMesNumer());	
					} else if (sValEtiq.equals("FECANODOSDIGITOS")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getFecAnoDosDigit());	
					} else if (sValEtiq.equals("FECDIALETRA")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getFecDiaLetra());	
					} else if (sValEtiq.equals("FECANOLETRA")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getFecAnoLetra());		
					} else if (sValEtiq.equals("FECHA")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getFecha());		
					} else if (sValEtiq.equals("EJEEXPED")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEjeExped());		
					} else if (sValEtiq.equals("NUMEXPED")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNumExped());	
					} else if (sValEtiq.equals("DESEXPED")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDesExped());		
					} else if (sValEtiq.equals("DESPROCE")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDesProce());		
					} else if (sValEtiq.equals("DESTAREA")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDesTarea());	
					} else if (sValEtiq.equals("NOMINTER")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNomInter());		
					} else if (sValEtiq.equals("NUMDOCUMINTER")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNumDocInter());		
					} else if (sValEtiq.equals("DIRPOSTAINTER")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDomInter());	
					} else if (sValEtiq.equals("CODPOSTAINTER")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getCopInter());		
					} else if (sValEtiq.equals("PROVINCIAINTER")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getProInter());	
					} else if (sValEtiq.equals("MUNICIPIOINTER")) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getMunInter());		
					} else if (sValEtiq.equals("NOMREPRE") && oEtiquetas.getNomRepre() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNomRepre());	
					} else if (sValEtiq.equals("NUMDOCUMREPRE") && oEtiquetas.getNumDocRepre() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNumDocRepre());		
					} else if (sValEtiq.equals("DIRPOSTAREPRE") && oEtiquetas.getDomRepre() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDomRepre());		
					} else if (sValEtiq.equals("CODPOSTAREPRE") && oEtiquetas.getCopRepre() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getCopRepre());	
					} else if (sValEtiq.equals("PROVINCIAREPRE") && oEtiquetas.getProRepre() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getProRepre());		
					} else if (sValEtiq.equals("MUNICIPIOREPRE") && oEtiquetas.getMunRepre() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getMunRepre());		
					} else if (sValEtiq.equals("ETIATRIB01") && oEtiquetas.getEtiAtr01() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEtiAtr01());
					} else if (sValEtiq.equals("VALATRIB01") && oEtiquetas.getValAtr01() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getValAtr01());				
					} else if (sValEtiq.equals("ETIATRIB02") && oEtiquetas.getEtiAtr02() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEtiAtr02());
					} else if (sValEtiq.equals("VALATRIB02") && oEtiquetas.getValAtr02() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getValAtr02());	
					} else if (sValEtiq.equals("ETIATRIB03") && oEtiquetas.getEtiAtr03() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEtiAtr03());
					} else if (sValEtiq.equals("VALATRIB03") && oEtiquetas.getValAtr03() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getValAtr03());				
					} else if (sValEtiq.equals("ETIATRIB04") && oEtiquetas.getEtiAtr04() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEtiAtr04());
					} else if (sValEtiq.equals("VALATRIB04") && oEtiquetas.getValAtr04() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getValAtr04());												
					} else if (sValEtiq.equals("ETIATRIB05") && oEtiquetas.getEtiAtr05() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEtiAtr05());
					} else if (sValEtiq.equals("VALATRIB05") && oEtiquetas.getValAtr05() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getValAtr05());				
					} else if (sValEtiq.equals("ETIATRIB06") && oEtiquetas.getEtiAtr06() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEtiAtr06());
					} else if (sValEtiq.equals("VALATRIB06") && oEtiquetas.getValAtr06() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getValAtr06());		
					} else if (sValEtiq.equals("ETIATRIB07") && oEtiquetas.getEtiAtr07() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEtiAtr07());
					} else if (sValEtiq.equals("VALATRIB07") && oEtiquetas.getValAtr07() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getValAtr07());										
					} else if (sValEtiq.equals("ETIATRIB08") && oEtiquetas.getEtiAtr08() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEtiAtr08());
					} else if (sValEtiq.equals("VALATRIB08") && oEtiquetas.getValAtr08() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getValAtr08());		
					} else if (sValEtiq.equals("ETIATRIB09") && oEtiquetas.getEtiAtr09() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEtiAtr09());
					} else if (sValEtiq.equals("VALATRIB09") && oEtiquetas.getValAtr09() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getValAtr09());		
					} else if (sValEtiq.equals("ETIATRIB010") && oEtiquetas.getEtiAtr10() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEtiAtr10());
					} else if (sValEtiq.equals("VALATRIB010") && oEtiquetas.getValAtr10() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getValAtr10());		
					} else if (sValEtiq.equals("NOMBRECOMPLETO") && oEtiquetas.getNombreCompleto() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNombreCompleto());							
					} else if (sValEtiq.equals("NUMDOCUM") && oEtiquetas.getNumDocum() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNumDocum());					
					} else if (sValEtiq.equals("DESMUNNACIM") && oEtiquetas.getDesMunNacim() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDesMunNacim());						
					} else if (sValEtiq.equals("DOMICILIO") && oEtiquetas.getDomicilio() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDomicilio());					
					} else if (sValEtiq.equals("FECPADRO") && oEtiquetas.getFecPadro() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getFecPadro());					
					} else if (sValEtiq.equals("DESMUNIC") && oEtiquetas.getCiudad() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getCiudad());
					} else if (sValEtiq.equals("CONTRIBUYENTE") && oEtiquetas.getContribuyente() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getContribuyente());	
					} else if (sValEtiq.equals("EJERECIB000") && oEtiquetas.getEjeRecib000() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEjeRecib000());					
					} else if (sValEtiq.equals("EJERECIB001") && oEtiquetas.getEjeRecib001() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEjeRecib001());	
					} else if (sValEtiq.equals("EJERECIB002") && oEtiquetas.getEjeRecib002() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEjeRecib002());	
					} else if (sValEtiq.equals("EJERECIB003") && oEtiquetas.getEjeRecib003() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEjeRecib003());	
					} else if (sValEtiq.equals("EJERECIB004") && oEtiquetas.getEjeRecib004() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEjeRecib004());	
					} else if (sValEtiq.equals("EJERECIB005") && oEtiquetas.getEjeRecib005() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEjeRecib005());		
					} else if (sValEtiq.equals("NUMRECIB000") && oEtiquetas.getNumRecib000() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNumRecib000());							
					} else if (sValEtiq.equals("NUMRECIB001") && oEtiquetas.getNumRecib001() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNumRecib001());	
					} else if (sValEtiq.equals("NUMRECIB002") && oEtiquetas.getNumRecib002() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNumRecib002());	
					} else if (sValEtiq.equals("NUMRECIB003") && oEtiquetas.getNumRecib003() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNumRecib003());	
					} else if (sValEtiq.equals("NUMRECIB004") && oEtiquetas.getNumRecib004() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNumRecib004());	
					} else if (sValEtiq.equals("NUMRECIB005") && oEtiquetas.getNumRecib005() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNumRecib005());	
					} else if (sValEtiq.equals("DESOBJTRIBU000") && oEtiquetas.getDesObjTribu000() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDesObjTribu000());					
					} else if (sValEtiq.equals("DESOBJTRIBU001") && oEtiquetas.getDesObjTribu001() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDesObjTribu001());	
					} else if (sValEtiq.equals("DESOBJTRIBU002") && oEtiquetas.getDesObjTribu002() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDesObjTribu002());	
					} else if (sValEtiq.equals("DESOBJTRIBU003") && oEtiquetas.getDesObjTribu003() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDesObjTribu003());	
					} else if (sValEtiq.equals("DESOBJTRIBU004") && oEtiquetas.getDesObjTribu004() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDesObjTribu004());	
					} else if (sValEtiq.equals("DESOBJTRIBU005") && oEtiquetas.getDesObjTribu005() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDesObjTribu005());	
					} else if (sValEtiq.equals("IMPRECIBO000") && oEtiquetas.getImpRecibo000() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getImpRecibo000());					
					} else if (sValEtiq.equals("IMPRECIBO001") && oEtiquetas.getImpRecibo001() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getImpRecibo001());	
					} else if (sValEtiq.equals("IMPRECIBO002") && oEtiquetas.getImpRecibo002() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getImpRecibo002());	
					} else if (sValEtiq.equals("IMPRECIBO003") && oEtiquetas.getImpRecibo003() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getImpRecibo003());	
					} else if (sValEtiq.equals("IMPRECIBO004") && oEtiquetas.getImpRecibo004() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getImpRecibo004());	
					} else if (sValEtiq.equals("IMPRECIBO005") && oEtiquetas.getImpRecibo005() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getImpRecibo005());							
					} else if (sValEtiq.equals("TOTALIMPORTE") && oEtiquetas.getTotalImporte() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getTotalImporte());			
					} else if (sValEtiq.equals("PERIMPOS") && oEtiquetas.getPerImpos() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getPerImpos());	
					} else if (sValEtiq.equals("EJELIQUI") && oEtiquetas.getEjeLiqui() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEjeLiqui());	
					} else if (sValEtiq.equals("NUMLIQUI") && oEtiquetas.getNumLiqui() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNumLiqui());
					} else if (sValEtiq.equals("CODBARCSB") && oEtiquetas.getCodBarCsb() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getCodBarCsb());
					} else if (sValEtiq.equals("CARCONLIQUI") && oEtiquetas.getCarConLiqui() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getCarConLiqui());
					} else if (sValEtiq.equals("DNIPROPI") && oEtiquetas.getDniPropi() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDniPropi());
					} else if (sValEtiq.equals("NOMPROPI") && oEtiquetas.getNomPropi() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getNomPropi());
					} else if (sValEtiq.equals("DOMPROPI") && oEtiquetas.getDomPropi() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDomPropi());
					} else if (sValEtiq.equals("CPPROPI") && oEtiquetas.getCpPropi() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getCpPropi());
					} else if (sValEtiq.equals("POBPROPI") && oEtiquetas.getPobPropi() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getPobPropi());
					} else if (sValEtiq.equals("PROPROPI") && oEtiquetas.getProPropi() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getProPropi());
					} else if (sValEtiq.equals("DESOBJTRIBU") && oEtiquetas.getDesObjTribu() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDesObjTribu());
					} else if (sValEtiq.equals("DESCON001") && oEtiquetas.getDesCon001() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getDesCon001());
					} else if (sValEtiq.equals("IMPCON001") && oEtiquetas.getImpCon0001() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getImpCon0001());
					} else if (sValEtiq.equals("CUOLIQUI") && oEtiquetas.getCuoLiqui() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getCuoLiqui());
					} else if (sValEtiq.equals("IMPBONLIQUI") && oEtiquetas.getImpBonLiqui() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getImpBonLiqui());
					} else if (sValEtiq.equals("IMPSANCI") && oEtiquetas.getImpSanci() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getImpSanci());
					} else if (sValEtiq.equals("IMPVARIO") && oEtiquetas.getImpVario() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getImpVario());
					} else if (sValEtiq.equals("IMPVARIO") && oEtiquetas.getImpVario() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getImpVario());
					} else if (sValEtiq.equals("INTDEMOR") && oEtiquetas.getIntDemor() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getIntDemor());	
					} else if (sValEtiq.equals("TOTLIQUI") && oEtiquetas.getTotLiqui() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getTotLiqui());		
					} else if (sValEtiq.equals("EMISORA") && oEtiquetas.getEmisora() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getEmisora());
					} else if (sValEtiq.equals("REFERENCIA") && oEtiquetas.getReferencia() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getReferencia());
					} else if (sValEtiq.equals("IDENTIFICACION") && oEtiquetas.getIdentificacion() != null ) {
						aoArrayVariables[i].setPropertyValue("Content", oEtiquetas.getIdentificacion());
					}else {
						aoArrayVariables[i].setPropertyValue("Content", " ");
					}
				}

				((XRefreshable) UnoRuntime.queryInterface(XRefreshable.class, oXEnumeratedFields)).refresh();

				com.sun.star.beans.PropertyValue[] aoSaveProperties = new com.sun.star.beans.PropertyValue[1];

				aoSaveProperties[0] = new com.sun.star.beans.PropertyValue();
				aoSaveProperties[0].Name = "Overwrite";
				aoSaveProperties[0].Value = Boolean.TRUE;

				com.sun.star.frame.XStorable oXStore = (com.sun.star.frame.XStorable) UnoRuntime
						.queryInterface(com.sun.star.frame.XStorable.class, xComponent);

				oXStore.storeAsURL(loadURL, aoSaveProperties);
				closeDocument(xComponent);

			} else {
				System.out.println("Error al cargar el documento.");
			}
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}

		return mergedOutput;
	}

	public static boolean fusionDocumentoDOC(String rutaArchivo, Etiquetas oEtiquetas) {

		boolean mergedOutput = true;

		try {
			WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(new java.io.File(rutaArchivo));
			List<Map<DataFieldName, String>> data = new ArrayList<Map<DataFieldName, String>>();

			Map<DataFieldName, String> map = new HashMap<DataFieldName, String>();
			map.put(new DataFieldName("TTOAYTO"), oEtiquetas.getTtoAyto());
			map.put(new DataFieldName("AYTO"), oEtiquetas.getNomAyto());
			map.put(new DataFieldName("SECRETARIO"), oEtiquetas.getNomSecre());
			map.put(new DataFieldName("ALCALDE"), oEtiquetas.getNomAlcal());
			map.put(new DataFieldName("INTERVENTOR"), oEtiquetas.getNomIntev());
			map.put(new DataFieldName("TESORERO"), oEtiquetas.getNomTesor());
			map.put(new DataFieldName("CIUDAD"), oEtiquetas.getCiudad());
			map.put(new DataFieldName("FECDIANUM"), oEtiquetas.getFecDiaNumer());
			map.put(new DataFieldName("FECMESLET"), oEtiquetas.getFecMesLetra());
			map.put(new DataFieldName("FECANONUM"), oEtiquetas.getFecAnoNumer());
			map.put(new DataFieldName("USUARIO"), oEtiquetas.getUsuario());
			map.put(new DataFieldName("DEPARTAMENTO"), oEtiquetas.getDepartamento());
			map.put(new DataFieldName("CODPOSTAAYTO"), oEtiquetas.getCpAyto());
			map.put(new DataFieldName("DOMAYTO"), oEtiquetas.getDomAyto());
			map.put(new DataFieldName("FIRMA01"), oEtiquetas.getFirma01());
			map.put(new DataFieldName("FIRMA02"), oEtiquetas.getFirma02());
			map.put(new DataFieldName("FIRMA03"), oEtiquetas.getFirma03());
			map.put(new DataFieldName("FIRMA04"), oEtiquetas.getFirma04());
			map.put(new DataFieldName("FIRMA05"), oEtiquetas.getFirma05());
			map.put(new DataFieldName("FIRMA06"), oEtiquetas.getFirma06());
			map.put(new DataFieldName("FECEMISION"), oEtiquetas.getFecEmisi());
			map.put(new DataFieldName("DIAEMISION"), oEtiquetas.getDiaEmisi());
			map.put(new DataFieldName("MESEMISION"), oEtiquetas.getMesEmisi());
			map.put(new DataFieldName("ANOEMISION"), oEtiquetas.getAnoEmisi());
			map.put(new DataFieldName("DIASEMEMISION"), oEtiquetas.getDiaSemEmisi());
			map.put(new DataFieldName("FECMESNUM"), oEtiquetas.getFecMesNumer());
			map.put(new DataFieldName("FECANODOSDIGITOS"), oEtiquetas.getFecAnoDosDigit());
			map.put(new DataFieldName("FECDIALETRA"), oEtiquetas.getFecDiaLetra());
			map.put(new DataFieldName("FECANOLETRA"), oEtiquetas.getFecAnoLetra());
			map.put(new DataFieldName("FECHA"), oEtiquetas.getFecha());

			map.put(new DataFieldName("EJEEXPED"), oEtiquetas.getEjeExped());
			map.put(new DataFieldName("NUMEXPED"), oEtiquetas.getNumExped());
			map.put(new DataFieldName("DESEXPED"), oEtiquetas.getDesExped());
			map.put(new DataFieldName("DESPROCE"), oEtiquetas.getDesProce());
			map.put(new DataFieldName("DESTAREA"), oEtiquetas.getDesTarea());

			map.put(new DataFieldName("NOMINTER"), oEtiquetas.getNomInter());
			map.put(new DataFieldName("NUMDOCUMINTER"), oEtiquetas.getNumDocInter());
			map.put(new DataFieldName("DIRPOSTAINTER"), oEtiquetas.getDomInter());
			map.put(new DataFieldName("CODPOSTAINTER"), oEtiquetas.getCopInter());
			map.put(new DataFieldName("PROVINCIAINTER"), oEtiquetas.getProInter());
			map.put(new DataFieldName("MUNICIPIOINTER"), oEtiquetas.getMunInter());

			if (oEtiquetas.getNomRepre() != null) {
				map.put(new DataFieldName("NOMREPRE"), oEtiquetas.getNomRepre());
			}

			if (oEtiquetas.getNumDocRepre() != null) {
				map.put(new DataFieldName("NUMDOCUMREPRE"), oEtiquetas.getNumDocRepre());
			}

			if (oEtiquetas.getDomRepre() != null) {
				map.put(new DataFieldName("DIRPOSTAREPRE"), oEtiquetas.getDomRepre());
			}

			if (oEtiquetas.getCopRepre() != null) {
				map.put(new DataFieldName("CODPOSTAREPRE"), oEtiquetas.getCopRepre());
			}

			if (oEtiquetas.getProRepre() != null) {
				map.put(new DataFieldName("PROVINCIAREPRE"), oEtiquetas.getProRepre());
			}

			if (oEtiquetas.getMunRepre() != null) {
				map.put(new DataFieldName("MUNICIPIOREPRE"), oEtiquetas.getMunRepre());
			}

			if (oEtiquetas.getEtiAtr01() != null) {
				map.put(new DataFieldName("ETIATRIB01"), oEtiquetas.getEtiAtr01());
				map.put(new DataFieldName("VALATRIB01"), oEtiquetas.getValAtr01());
			}

			if (oEtiquetas.getEtiAtr02() != null) {
				map.put(new DataFieldName("ETIATRIB02"), oEtiquetas.getEtiAtr02());
				map.put(new DataFieldName("VALATRIB02"), oEtiquetas.getValAtr02());
			}

			if (oEtiquetas.getEtiAtr03() != null) {
				map.put(new DataFieldName("ETIATRIB03"), oEtiquetas.getEtiAtr03());
				map.put(new DataFieldName("VALATRIB03"), oEtiquetas.getValAtr03());
			}

			if (oEtiquetas.getEtiAtr04() != null) {
				map.put(new DataFieldName("ETIATRIB04"), oEtiquetas.getEtiAtr04());
				map.put(new DataFieldName("VALATRIB04"), oEtiquetas.getValAtr04());
			}

			if (oEtiquetas.getEtiAtr05() != null) {
				map.put(new DataFieldName("ETIATRIB05"), oEtiquetas.getEtiAtr05());
				map.put(new DataFieldName("VALATRIB05"), oEtiquetas.getValAtr05());
			}

			if (oEtiquetas.getEtiAtr06() != null) {
				map.put(new DataFieldName("ETIATRIB06"), oEtiquetas.getEtiAtr06());
				map.put(new DataFieldName("VALATRIB06"), oEtiquetas.getValAtr06());
			}

			if (oEtiquetas.getEtiAtr07() != null) {
				map.put(new DataFieldName("ETIATRIB07"), oEtiquetas.getEtiAtr07());
				map.put(new DataFieldName("VALATRIB07"), oEtiquetas.getValAtr07());
			}

			if (oEtiquetas.getEtiAtr08() != null) {
				map.put(new DataFieldName("ETIATRIB08"), oEtiquetas.getEtiAtr08());
				map.put(new DataFieldName("VALATRIB08"), oEtiquetas.getValAtr08());
			}

			if (oEtiquetas.getEtiAtr09() != null) {
				map.put(new DataFieldName("ETIATRIB09"), oEtiquetas.getEtiAtr09());
				map.put(new DataFieldName("VALATRIB09"), oEtiquetas.getValAtr09());
			}

			if (oEtiquetas.getEtiAtr10() != null) {
				map.put(new DataFieldName("ETIATRIB10"), oEtiquetas.getEtiAtr10());
				map.put(new DataFieldName("VALATRIB10"), oEtiquetas.getValAtr10());
			}

			data.add(map);
			org.docx4j.model.fields.merge.MailMerger.setMERGEFIELDInOutput(OutputField.KEEP_MERGEFIELD);

			for (Map<DataFieldName, String> thismap : data) {
				org.docx4j.model.fields.merge.MailMerger.performMerge(wordMLPackage, thismap, true);
				wordMLPackage.save(new java.io.File(rutaArchivo));
			}

		} catch (Docx4JException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			mergedOutput = false;
		}

		return mergedOutput;
	}

	protected static void closeDocument(XComponent poXComponent) throws SAXException {
		if (poXComponent == null) {
			return;
		}

		com.sun.star.frame.XModel oXModel = (com.sun.star.frame.XModel) UnoRuntime
				.queryInterface(com.sun.star.frame.XModel.class, poXComponent);

		if (oXModel != null) {
			com.sun.star.util.XCloseable oXCloseable = (com.sun.star.util.XCloseable) UnoRuntime
					.queryInterface(com.sun.star.util.XCloseable.class, oXModel);

			if (oXCloseable != null) {
				try {
					oXCloseable.close(true);
				} catch (com.sun.star.util.CloseVetoException ex) {
					closeDocument(poXComponent);
				}
			}

			com.sun.star.lang.XComponent oXDisposeable = (com.sun.star.lang.XComponent) UnoRuntime
					.queryInterface(com.sun.star.lang.XComponent.class, oXModel);

			if (oXDisposeable != null) {

				int i = 0;

				try {
					while (i == 0) {
						oXDisposeable.dispose();
					}
				} catch (Exception ex) {
					i = 1;
				}
			}
		}
	}
}
