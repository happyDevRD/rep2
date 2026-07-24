package com.greenaall.gf.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.ge.dto.Etiquetas;
import com.greenaall.ge.util.ArchivoValide;
import com.greenaall.gf.dto.ReciboCabeceraDto;
import com.greenaall.models.ex.entity.AtributoExpediente;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.Procedimiento;
import com.greenaall.models.ex.service.AtributoExpedienteoServiceImpl;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.ProcedimientoServiceImpl;
import com.greenaall.models.ge.entity.ParametroSistema;
import com.greenaall.models.ge.entity.ParametroSistemaPK;
import com.greenaall.models.ge.service.IParametroSistemaService;
import com.greenaall.models.gf.entity.Impuesto;
import com.greenaall.models.gf.entity.ObjetoTributario;
import com.greenaall.models.gf.entity.ObjetoTributarioPK;
import com.greenaall.models.gf.entity.ReciboCabecera;
import com.greenaall.models.gf.entity.ReciboCabeceraPK;
import com.greenaall.models.gf.service.IObjetoTributarioService;
import com.greenaall.models.gf.service.ImpuestoServiceImpl;
import com.greenaall.models.gf.service.ReciboCabeceraServiceImpl;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.service.PersonaEntidadServiceImpl;
import com.greenaall.util.Cadena;
import com.greenaall.util.ConvertirPDF;
import com.greenaall.util.Fecha;
import com.greenaall.util.Formateador;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class ReciboCabeceraController {
	
	@Autowired
	private ReciboCabeceraServiceImpl serviceReciboCabecera;
	
	@Autowired
	private PersonaEntidadServiceImpl servicePersonaEntidad;
	
	@Autowired
	private ImpuestoServiceImpl serviceImpuesto;
	
	@Autowired
	private IParametroSistemaService parametroSistemaService;
	
	@Autowired
	private ExpedienteServiceImpl serviceExpediente;
	
	@Autowired
	private AtributoExpedienteoServiceImpl atributoExpedienteService;
	
	@Autowired
	private ProcedimientoServiceImpl serviceProcedimiento;
	
	@Autowired
	private IObjetoTributarioService objetoTributarioService;
	
	@GetMapping("/reciboCabecera/listarPendientes/{numDocum}")
	public List<ReciboCabeceraDto> listarPendientes(@PathVariable("numDocum") String numDocum){
		
		PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findByNumDocum(numDocum);
		
		if(oPersonaEntidad == null) {
			throw new NoDataFoundException();
		}
		
		List<ReciboCabecera> aReciboCabecera = serviceReciboCabecera.findByRecibosPendientes(oPersonaEntidad.getIdHisPerso(), oPersonaEntidad.getIdPerso());
		
		if(aReciboCabecera == null || aReciboCabecera.isEmpty()) {
			throw new NoDataFoundException();
		}
		
		List<ReciboCabeceraDto> aReciboCabeceraDto = new ArrayList<>();
		
		for(int i = 0; i < aReciboCabecera.size(); i++ ) {
			
			ReciboCabeceraDto oReciboCabeceraDto = new ReciboCabeceraDto();
			
			if(aReciboCabecera.get(i).getIdHisRecib() != null) {
				oReciboCabeceraDto.setIdHisRecib(aReciboCabecera.get(i).getIdHisRecib());
			}
			
			if(aReciboCabecera.get(i).getIdRecib() != null) {
				oReciboCabeceraDto.setIdRecib(aReciboCabecera.get(i).getIdRecib());
			}
			
			if(aReciboCabecera.get(i).getEjeRecib() != null) {
				oReciboCabeceraDto.setEjeRecib(aReciboCabecera.get(i).getEjeRecib());
			}
			
			if(aReciboCabecera.get(i).getNumRecib() != null) {
				oReciboCabeceraDto.setNumRecib(aReciboCabecera.get(i).getNumRecib());
			}
			
			if(aReciboCabecera.get(i).getNomPadro() != null) {
				oReciboCabeceraDto.setNomPadro(aReciboCabecera.get(i).getNomPadro());
			}
			
			if(aReciboCabecera.get(i).getImpRecib() != null) {
				oReciboCabeceraDto.setImpRecib(aReciboCabecera.get(i).getImpRecib());
			}
			
			if(aReciboCabecera.get(i).getImpPrinc() != null) {
				oReciboCabeceraDto.setImpPrinc(aReciboCabecera.get(i).getImpPrinc());
			}
			
			if(aReciboCabecera.get(i).getImpCobro() != null) {
				oReciboCabeceraDto.setImpCobro(aReciboCabecera.get(i).getImpCobro());
			}
			
			if(aReciboCabecera.get(i).getImpRecar() != null) {
				oReciboCabeceraDto.setImpRecar(aReciboCabecera.get(i).getImpRecar());
			}
			
			if(aReciboCabecera.get(i).getImpInter() != null) {
				oReciboCabeceraDto.setImpInter(aReciboCabecera.get(i).getImpInter());
			}
			
			if(aReciboCabecera.get(i).getImpOtros() != null) {
				oReciboCabeceraDto.setImpOtros(aReciboCabecera.get(i).getImpOtros());
			}
			
			if(aReciboCabecera.get(i).getModPerte() != null) {
				oReciboCabeceraDto.setModPerte(aReciboCabecera.get(i).getModPerte());
			}
			
			if(aReciboCabecera.get(i).getCodEntid() != null) {
				oReciboCabeceraDto.setCodEntid(aReciboCabecera.get(i).getCodEntid());
			}
			
			if(aReciboCabecera.get(i).getIdImpue() != null) {
				Impuesto oImpuesto = serviceImpuesto.findById(aReciboCabecera.get(i).getIdImpue());
				if(oImpuesto != null) {
					oReciboCabeceraDto.setDesImpue(oImpuesto.getDesImpue());
				}
			}
			
			if(aReciboCabecera.get(i).getFecRecib() != null) {
				oReciboCabeceraDto.setFecRecib(aReciboCabecera.get(i).getFecRecib());
			}
			
			aReciboCabeceraDto.add(oReciboCabeceraDto);			
		}
		
		return aReciboCabeceraDto;
	}
	
	@GetMapping("/reciboCabecera/ver/{idHisRecib}/{idRecib}")
	public ReciboCabeceraDto detalle(@PathVariable Long idHisRecib, @PathVariable Long idRecib){
		
		ReciboCabeceraPK oReciboCabeceraPk = new ReciboCabeceraPK(idHisRecib, idRecib);
		ReciboCabecera oReciboCabecera = serviceReciboCabecera.findById(oReciboCabeceraPk);
		
		if(oReciboCabecera == null) {
			throw new NoDataFoundException();
		}
		
		ReciboCabeceraDto oReciboCabeceraDto = new ReciboCabeceraDto();
		
		if(oReciboCabecera.getIdHisRecib() != null) {
			oReciboCabeceraDto.setIdHisRecib(oReciboCabecera.getIdHisRecib());
		}
		
		if(oReciboCabecera.getIdRecib() != null) {
			oReciboCabeceraDto.setIdRecib(oReciboCabecera.getIdRecib());
		}
		
		if(oReciboCabecera.getEjeRecib() != null) {
			oReciboCabeceraDto.setEjeRecib(oReciboCabecera.getEjeRecib());
		}
		
		if(oReciboCabecera.getNumRecib() != null) {
			oReciboCabeceraDto.setNumRecib(oReciboCabecera.getNumRecib());
		}
		
		if(oReciboCabecera.getNomPadro() != null) {
			oReciboCabeceraDto.setNomPadro(oReciboCabecera.getNomPadro());
		}
		
		if(oReciboCabecera.getImpRecib() != null) {
			oReciboCabeceraDto.setImpRecib(oReciboCabecera.getImpRecib());
		}
		
		if(oReciboCabecera.getImpPrinc() != null) {
			oReciboCabeceraDto.setImpPrinc(oReciboCabecera.getImpPrinc());
		}
		
		if(oReciboCabecera.getImpCobro() != null) {
			oReciboCabeceraDto.setImpCobro(oReciboCabecera.getImpCobro());
		}
		
		if(oReciboCabecera.getImpRecar() != null) {
			oReciboCabeceraDto.setImpRecar(oReciboCabecera.getImpRecar());
		}
		
		if(oReciboCabecera.getImpInter() != null) {
			oReciboCabeceraDto.setImpInter(oReciboCabecera.getImpInter());
		}
		
		if(oReciboCabecera.getImpOtros() != null) {
			oReciboCabeceraDto.setImpOtros(oReciboCabecera.getImpOtros());
		}
		
		if(oReciboCabecera.getModPerte() != null) {
			oReciboCabeceraDto.setModPerte(oReciboCabecera.getModPerte());
		}
		
		if(oReciboCabecera.getCodEntid() != null) {
			oReciboCabeceraDto.setCodEntid(oReciboCabecera.getCodEntid());
		}
		
		if(oReciboCabecera.getIdImpue() != null) {
			Impuesto oImpuesto = serviceImpuesto.findById(oReciboCabecera.getIdImpue());
			if(oImpuesto != null) {
				oReciboCabeceraDto.setDesImpue(oImpuesto.getDesImpue());
			}
		}
		
		if(oReciboCabecera.getFecRecib() != null) {
			oReciboCabeceraDto.setFecRecib(oReciboCabecera.getFecRecib());
		}
		
		return oReciboCabeceraDto;	
	}
	
	@GetMapping("/reciboCabecera/certificadoDeuda/{numDocum}/{id}/{usuario}")
	public void certificadoDeuda(@PathVariable String numDocum, @PathVariable Long id, @PathVariable String usuario,
			HttpServletResponse response) {

		PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findByNumDocum(numDocum);
		
		if(oPersonaEntidad == null) {
			throw new NoDataFoundException();
		}
		
		List<ReciboCabecera> aReciboCabecera = serviceReciboCabecera.findByRecibosPendientes(oPersonaEntidad.getIdHisPerso(), oPersonaEntidad.getIdPerso());
		
		if(aReciboCabecera == null || aReciboCabecera.isEmpty()) {
			throw new NoDataFoundException();
		}
		
		String ruta = null;
		String tipoArchivo = "cer_deuda_es.odt";

		Boolean fusion = null;
		Etiquetas oEtiquetas = getEtiquetas(usuario, id, aReciboCabecera, oPersonaEntidad);

		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) 9300));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);
		
		String sInstalacion = oParametroSistema.getValor();
		
		if (sInstalacion.equals("C:\\iflow") || sInstalacion.equals("C:\\iflow\\")
				|| sInstalacion.equals("c:\\iflow") || sInstalacion.equals("c:\\iflow\\")) {
			ruta = "C:\\iflow\\formatos\\gf\\" + tipoArchivo;
		} else {
			ruta = "/srv/iflow/formatos/gf/" + tipoArchivo;
		}
		
		ParametroSistemaPK oParametroSistema2Pk = new ParametroSistemaPK(Long.valueOf((long) 1),
				Long.valueOf((long) 0), "es", Short.valueOf((short) 9307));
		ParametroSistema oParametroSistema2 = parametroSistemaService.findById(oParametroSistema2Pk);

		fusion = ArchivoValide.fusionDocumentoODT(ruta, oEtiquetas,	oParametroSistema2.getValor());

		if (!fusion) {
			System.err.println("Se ha producido un error en la fusión ODF");
		}
		
		String rutaPdf = ConvertirPDF.convertirPDF(ruta, ".odt");

		try {
			File file = new File(rutaPdf);
			FileInputStream fis;
			fis = new FileInputStream(file);
			response.setContentType("application/force-download");
			response.addHeader("Content-disposition", "attachment;fileName=" + "cer_deuda_es.pdf");
			OutputStream os = response.getOutputStream();
			byte[] buf = new byte[1024];
			int len = 0;
			while ((len = fis.read(buf)) != -1) {
				os.write(buf, 0, len);
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public Etiquetas getEtiquetas(String usuario, Long idExped, List<ReciboCabecera> aReciboCabecera, PersonaEntidad oPersonaEntidad) {

		Etiquetas oEtiquetas = new Etiquetas();
		Locale oLocale = Locale.of("es", "ES");

		oEtiquetas.setNomAyto(getValParam(Short.valueOf((short) 19)));
		oEtiquetas.setCiudad(getValParam(Short.valueOf((short) 20)));
		oEtiquetas.setCpAyto(getValParam(Short.valueOf((short) 36)));
		oEtiquetas.setDomAyto(getValParam(Short.valueOf((short) 47)));
		oEtiquetas.setTtoAyto(getValParam(Short.valueOf((short) 21)));
		oEtiquetas.setNomAlcal(getValParam(Short.valueOf((short) 22)));
		oEtiquetas.setNomSecre(getValParam(Short.valueOf((short) 23)));
		oEtiquetas.setNomIntev(getValParam(Short.valueOf((short) 24)));
		oEtiquetas.setNomTesor(getValParam(Short.valueOf((short) 25)));
		oEtiquetas.setFirma01(getValParam(Short.valueOf((short) 26)));
		oEtiquetas.setFirma02(getValParam(Short.valueOf((short) 27)));
		oEtiquetas.setFirma03(getValParam(Short.valueOf((short) 28)));
		oEtiquetas.setFirma04(getValParam(Short.valueOf((short) 29)));
		oEtiquetas.setFirma05(getValParam(Short.valueOf((short) 264)));
		oEtiquetas.setFirma06(getValParam(Short.valueOf((short) 275)));

		oEtiquetas.setFecEmisi(Fecha.formatear(new Date(), Formateador.FECHA_CORTA, oLocale));
		oEtiquetas.setDiaEmisi(
				Cadena.padCadena(Fecha.formatear(new Date(), Formateador.NUMERO_DIA, oLocale), 2, true, true));
		oEtiquetas.setDiaSemEmisi(Fecha.formatear(new Date(), Formateador.LETRA_DIA, oLocale));
		oEtiquetas.setMesEmisi(Fecha.formatear(new Date(), Formateador.LETRA_MES, oLocale));
		oEtiquetas.setAnoEmisi(Cadena.padCadena(Fecha.formatear(new Date(), Formateador.AÑO, oLocale), 4, true, true));

		oEtiquetas.setFecha(Fecha.formatear(new Date(), Formateador.FECHA_CORTA, oLocale));
		oEtiquetas.setFecDiaNumer(
				Cadena.padCadena(Fecha.formatear(new Date(), Formateador.NUMERO_DIA, oLocale), 2, true, true));
		oEtiquetas.setFecMesNumer(
				Cadena.padCadena(Fecha.formatear(new Date(), Formateador.NUMERO_MES, oLocale), 2, true, true));
		oEtiquetas
				.setFecAnoNumer(Cadena.padCadena(Fecha.formatear(new Date(), Formateador.AÑO, oLocale), 4, true, true));

		oEtiquetas.setFecAnoDosDigit(Fecha.formatear(new Date(), Formateador.AÑO_CORTO, oLocale));
		oEtiquetas.setFecDiaLetra(Fecha.formatear(new Date(), Formateador.LETRA_DIA, oLocale));
		oEtiquetas.setFecMesLetra(Fecha.formatear(new Date(), Formateador.LETRA_MES, oLocale));
		oEtiquetas.setUsuario(usuario);

		Expediente oExpediente = serviceExpediente.findById(idExped);
		if (oExpediente != null) {
			List<AtributoExpediente> aAtributos = atributoExpedienteService.findByIdExped(oExpediente.getId());
			if (aAtributos != null && !aAtributos.isEmpty()) {
				if (aAtributos.size() == 1) {
					oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
					oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
				} else if (aAtributos.size() == 2) {
					oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
					oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
					oEtiquetas.setEtiAtr02(aAtributos.get(1).getEtiGruAtrib());
					oEtiquetas.setValAtr02(aAtributos.get(1).getValor());
				} else if (aAtributos.size() == 3) {
					oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
					oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
					oEtiquetas.setEtiAtr02(aAtributos.get(1).getEtiGruAtrib());
					oEtiquetas.setValAtr02(aAtributos.get(1).getValor());
					oEtiquetas.setEtiAtr03(aAtributos.get(2).getEtiGruAtrib());
					oEtiquetas.setValAtr03(aAtributos.get(2).getValor());
				} else if (aAtributos.size() == 4) {
					oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
					oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
					oEtiquetas.setEtiAtr02(aAtributos.get(1).getEtiGruAtrib());
					oEtiquetas.setValAtr02(aAtributos.get(1).getValor());
					oEtiquetas.setEtiAtr03(aAtributos.get(2).getEtiGruAtrib());
					oEtiquetas.setValAtr03(aAtributos.get(2).getValor());
					oEtiquetas.setEtiAtr04(aAtributos.get(3).getEtiGruAtrib());
					oEtiquetas.setValAtr04(aAtributos.get(3).getValor());
				} else if (aAtributos.size() == 5) {
					oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
					oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
					oEtiquetas.setEtiAtr02(aAtributos.get(1).getEtiGruAtrib());
					oEtiquetas.setValAtr02(aAtributos.get(1).getValor());
					oEtiquetas.setEtiAtr03(aAtributos.get(2).getEtiGruAtrib());
					oEtiquetas.setValAtr03(aAtributos.get(2).getValor());
					oEtiquetas.setEtiAtr04(aAtributos.get(3).getEtiGruAtrib());
					oEtiquetas.setValAtr04(aAtributos.get(3).getValor());
					oEtiquetas.setEtiAtr05(aAtributos.get(4).getEtiGruAtrib());
					oEtiquetas.setValAtr05(aAtributos.get(4).getValor());
				} else if (aAtributos.size() == 6) {
					oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
					oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
					oEtiquetas.setEtiAtr02(aAtributos.get(1).getEtiGruAtrib());
					oEtiquetas.setValAtr02(aAtributos.get(1).getValor());
					oEtiquetas.setEtiAtr03(aAtributos.get(2).getEtiGruAtrib());
					oEtiquetas.setValAtr03(aAtributos.get(2).getValor());
					oEtiquetas.setEtiAtr04(aAtributos.get(3).getEtiGruAtrib());
					oEtiquetas.setValAtr04(aAtributos.get(3).getValor());
					oEtiquetas.setEtiAtr05(aAtributos.get(4).getEtiGruAtrib());
					oEtiquetas.setValAtr05(aAtributos.get(4).getValor());
					oEtiquetas.setEtiAtr06(aAtributos.get(5).getEtiGruAtrib());
					oEtiquetas.setValAtr06(aAtributos.get(5).getValor());
				} else if (aAtributos.size() == 7) {
					oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
					oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
					oEtiquetas.setEtiAtr02(aAtributos.get(1).getEtiGruAtrib());
					oEtiquetas.setValAtr02(aAtributos.get(1).getValor());
					oEtiquetas.setEtiAtr03(aAtributos.get(2).getEtiGruAtrib());
					oEtiquetas.setValAtr03(aAtributos.get(2).getValor());
					oEtiquetas.setEtiAtr04(aAtributos.get(3).getEtiGruAtrib());
					oEtiquetas.setValAtr04(aAtributos.get(3).getValor());
					oEtiquetas.setEtiAtr05(aAtributos.get(4).getEtiGruAtrib());
					oEtiquetas.setValAtr05(aAtributos.get(4).getValor());
					oEtiquetas.setEtiAtr06(aAtributos.get(5).getEtiGruAtrib());
					oEtiquetas.setValAtr06(aAtributos.get(5).getValor());
					oEtiquetas.setEtiAtr07(aAtributos.get(6).getEtiGruAtrib());
					oEtiquetas.setValAtr07(aAtributos.get(6).getValor());
				} else if (aAtributos.size() == 8) {
					oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
					oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
					oEtiquetas.setEtiAtr02(aAtributos.get(1).getEtiGruAtrib());
					oEtiquetas.setValAtr02(aAtributos.get(1).getValor());
					oEtiquetas.setEtiAtr03(aAtributos.get(2).getEtiGruAtrib());
					oEtiquetas.setValAtr03(aAtributos.get(2).getValor());
					oEtiquetas.setEtiAtr04(aAtributos.get(3).getEtiGruAtrib());
					oEtiquetas.setValAtr04(aAtributos.get(3).getValor());
					oEtiquetas.setEtiAtr05(aAtributos.get(4).getEtiGruAtrib());
					oEtiquetas.setValAtr05(aAtributos.get(4).getValor());
					oEtiquetas.setEtiAtr06(aAtributos.get(5).getEtiGruAtrib());
					oEtiquetas.setValAtr06(aAtributos.get(5).getValor());
					oEtiquetas.setEtiAtr07(aAtributos.get(6).getEtiGruAtrib());
					oEtiquetas.setValAtr07(aAtributos.get(6).getValor());
					oEtiquetas.setEtiAtr08(aAtributos.get(7).getEtiGruAtrib());
					oEtiquetas.setValAtr08(aAtributos.get(7).getValor());
				} else if (aAtributos.size() == 9) {
					oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
					oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
					oEtiquetas.setEtiAtr02(aAtributos.get(1).getEtiGruAtrib());
					oEtiquetas.setValAtr02(aAtributos.get(1).getValor());
					oEtiquetas.setEtiAtr03(aAtributos.get(2).getEtiGruAtrib());
					oEtiquetas.setValAtr03(aAtributos.get(2).getValor());
					oEtiquetas.setEtiAtr04(aAtributos.get(3).getEtiGruAtrib());
					oEtiquetas.setValAtr04(aAtributos.get(3).getValor());
					oEtiquetas.setEtiAtr05(aAtributos.get(4).getEtiGruAtrib());
					oEtiquetas.setValAtr05(aAtributos.get(4).getValor());
					oEtiquetas.setEtiAtr06(aAtributos.get(5).getEtiGruAtrib());
					oEtiquetas.setValAtr06(aAtributos.get(5).getValor());
					oEtiquetas.setEtiAtr07(aAtributos.get(6).getEtiGruAtrib());
					oEtiquetas.setValAtr07(aAtributos.get(6).getValor());
					oEtiquetas.setEtiAtr08(aAtributos.get(7).getEtiGruAtrib());
					oEtiquetas.setValAtr08(aAtributos.get(7).getValor());
					oEtiquetas.setEtiAtr09(aAtributos.get(8).getEtiGruAtrib());
					oEtiquetas.setValAtr09(aAtributos.get(8).getValor());
				} else if (aAtributos.size() == 10) {
					oEtiquetas.setEtiAtr01(aAtributos.get(0).getEtiGruAtrib());
					oEtiquetas.setValAtr01(aAtributos.get(0).getValor());
					oEtiquetas.setEtiAtr02(aAtributos.get(1).getEtiGruAtrib());
					oEtiquetas.setValAtr02(aAtributos.get(1).getValor());
					oEtiquetas.setEtiAtr03(aAtributos.get(2).getEtiGruAtrib());
					oEtiquetas.setValAtr03(aAtributos.get(2).getValor());
					oEtiquetas.setEtiAtr04(aAtributos.get(3).getEtiGruAtrib());
					oEtiquetas.setValAtr04(aAtributos.get(3).getValor());
					oEtiquetas.setEtiAtr05(aAtributos.get(4).getEtiGruAtrib());
					oEtiquetas.setValAtr05(aAtributos.get(4).getValor());
					oEtiquetas.setEtiAtr06(aAtributos.get(5).getEtiGruAtrib());
					oEtiquetas.setValAtr06(aAtributos.get(5).getValor());
					oEtiquetas.setEtiAtr07(aAtributos.get(6).getEtiGruAtrib());
					oEtiquetas.setValAtr07(aAtributos.get(6).getValor());
					oEtiquetas.setEtiAtr08(aAtributos.get(7).getEtiGruAtrib());
					oEtiquetas.setValAtr08(aAtributos.get(7).getValor());
					oEtiquetas.setEtiAtr09(aAtributos.get(8).getEtiGruAtrib());
					oEtiquetas.setValAtr09(aAtributos.get(8).getValor());
					oEtiquetas.setEtiAtr10(aAtributos.get(9).getEtiGruAtrib());
					oEtiquetas.setValAtr10(aAtributos.get(9).getValor());
				}
			}

			Procedimiento oProcedimiento = serviceProcedimiento.findById(oExpediente.getProcedimiento());
			if (oProcedimiento != null) {
				oEtiquetas.setDesProce(oProcedimiento.getDescripcion());
				oEtiquetas.setDepartamento(oProcedimiento.getDepartamento().getDesEleme());
			}
			oEtiquetas.setEjeExped(oExpediente.getEjercicio().toString());
			oEtiquetas.setNumExped(oExpediente.getNumero().toString());
			oEtiquetas.setDesExped(oExpediente.getTitulo());
			
			oEtiquetas.setContribuyente(oPersonaEntidad.getDesPerEntid());
			oEtiquetas.setNumDocum(oPersonaEntidad.getNumDocum());
			BigDecimal oImporteTotal = new BigDecimal("0.00");
			
			for(int i = 0; i < 6; i++) {
				if(i == 0 && aReciboCabecera.get(0) != null ) {
					oEtiquetas.setEjeRecib000(aReciboCabecera.get(0).getEjeRecib().toString());
					oEtiquetas.setNumRecib000(aReciboCabecera.get(0).getNumRecib().toString());
					
					ObjetoTributarioPK oObjetoTributarioPk = new ObjetoTributarioPK();
					oObjetoTributarioPk.setIdHisObjTribu(aReciboCabecera.get(0).getIdHisObjTribu());
					oObjetoTributarioPk.setIdObjTribu(aReciboCabecera.get(0).getIdObjTribu());
					ObjetoTributario oObjetoTributario = objetoTributarioService.findById(oObjetoTributarioPk);
					if(oObjetoTributario != null && oObjetoTributario.getDesObjTribu() != null) {
						oEtiquetas.setDesObjTribu000(oObjetoTributario.getDesObjTribu());
					}
					
					oEtiquetas.setImpRecibo000(aReciboCabecera.get(0).getImpRecib().toString());
					oImporteTotal = oImporteTotal.add(aReciboCabecera.get(0).getImpRecib());
				}
				
				if(i == 1 && aReciboCabecera.get(1) != null ) {
					oEtiquetas.setEjeRecib001(aReciboCabecera.get(1).getEjeRecib().toString());
					oEtiquetas.setNumRecib001(aReciboCabecera.get(1).getNumRecib().toString());
					
					ObjetoTributarioPK oObjetoTributarioPk = new ObjetoTributarioPK();
					oObjetoTributarioPk.setIdHisObjTribu(aReciboCabecera.get(1).getIdHisObjTribu());
					oObjetoTributarioPk.setIdObjTribu(aReciboCabecera.get(1).getIdObjTribu());
					ObjetoTributario oObjetoTributario = objetoTributarioService.findById(oObjetoTributarioPk);
					if(oObjetoTributario != null && oObjetoTributario.getDesObjTribu() != null) {
						oEtiquetas.setDesObjTribu001(oObjetoTributario.getDesObjTribu());
					}
					
					oEtiquetas.setImpRecibo001(aReciboCabecera.get(1).getImpRecib().toString());
					oImporteTotal = oImporteTotal.add(aReciboCabecera.get(1).getImpRecib());
				}
				
				if(i == 2 && aReciboCabecera.get(2) != null ) {
					oEtiquetas.setEjeRecib002(aReciboCabecera.get(2).getEjeRecib().toString());
					oEtiquetas.setNumRecib002(aReciboCabecera.get(2).getNumRecib().toString());
					
					ObjetoTributarioPK oObjetoTributarioPk = new ObjetoTributarioPK();
					oObjetoTributarioPk.setIdHisObjTribu(aReciboCabecera.get(2).getIdHisObjTribu());
					oObjetoTributarioPk.setIdObjTribu(aReciboCabecera.get(2).getIdObjTribu());
					ObjetoTributario oObjetoTributario = objetoTributarioService.findById(oObjetoTributarioPk);
					if(oObjetoTributario != null && oObjetoTributario.getDesObjTribu() != null) {
						oEtiquetas.setDesObjTribu002(oObjetoTributario.getDesObjTribu());
					}
					
					oEtiquetas.setImpRecibo002(aReciboCabecera.get(2).getImpRecib().toString());
					oImporteTotal = oImporteTotal.add(aReciboCabecera.get(2).getImpRecib());
				}
				
				if(i == 3 && aReciboCabecera.get(3) != null ) {
					oEtiquetas.setEjeRecib003(aReciboCabecera.get(3).getEjeRecib().toString());
					oEtiquetas.setNumRecib003(aReciboCabecera.get(3).getNumRecib().toString());
					
					ObjetoTributarioPK oObjetoTributarioPk = new ObjetoTributarioPK();
					oObjetoTributarioPk.setIdHisObjTribu(aReciboCabecera.get(3).getIdHisObjTribu());
					oObjetoTributarioPk.setIdObjTribu(aReciboCabecera.get(3).getIdObjTribu());
					ObjetoTributario oObjetoTributario = objetoTributarioService.findById(oObjetoTributarioPk);
					if(oObjetoTributario != null && oObjetoTributario.getDesObjTribu() != null) {
						oEtiquetas.setDesObjTribu003(oObjetoTributario.getDesObjTribu());
					}
					
					oEtiquetas.setImpRecibo003(aReciboCabecera.get(3).getImpRecib().toString());
					oImporteTotal = oImporteTotal.add(aReciboCabecera.get(3).getImpRecib());
				}
				
				if(i == 4 && aReciboCabecera.get(4) != null ) {
					oEtiquetas.setEjeRecib004(aReciboCabecera.get(4).getEjeRecib().toString());
					oEtiquetas.setNumRecib004(aReciboCabecera.get(4).getNumRecib().toString());
					
					ObjetoTributarioPK oObjetoTributarioPk = new ObjetoTributarioPK();
					oObjetoTributarioPk.setIdHisObjTribu(aReciboCabecera.get(4).getIdHisObjTribu());
					oObjetoTributarioPk.setIdObjTribu(aReciboCabecera.get(4).getIdObjTribu());
					ObjetoTributario oObjetoTributario = objetoTributarioService.findById(oObjetoTributarioPk);
					if(oObjetoTributario != null && oObjetoTributario.getDesObjTribu() != null) {
						oEtiquetas.setDesObjTribu004(oObjetoTributario.getDesObjTribu());
					}
					
					oEtiquetas.setImpRecibo004(aReciboCabecera.get(4).getImpRecib().toString());
					oImporteTotal = oImporteTotal.add(aReciboCabecera.get(4).getImpRecib());
				}
				
				if(i == 5 && aReciboCabecera.get(5) != null ) {
					oEtiquetas.setEjeRecib005(aReciboCabecera.get(5).getEjeRecib().toString());
					oEtiquetas.setNumRecib005(aReciboCabecera.get(5).getNumRecib().toString());
					
					ObjetoTributarioPK oObjetoTributarioPk = new ObjetoTributarioPK();
					oObjetoTributarioPk.setIdHisObjTribu(aReciboCabecera.get(5).getIdHisObjTribu());
					oObjetoTributarioPk.setIdObjTribu(aReciboCabecera.get(5).getIdObjTribu());
					ObjetoTributario oObjetoTributario = objetoTributarioService.findById(oObjetoTributarioPk);
					if(oObjetoTributario != null && oObjetoTributario.getDesObjTribu() != null) {
						oEtiquetas.setDesObjTribu005(oObjetoTributario.getDesObjTribu());
					}
					
					oEtiquetas.setImpRecibo005(aReciboCabecera.get(5).getImpRecib().toString());
					oImporteTotal = oImporteTotal.add(aReciboCabecera.get(5).getImpRecib());
				}
			}
			oEtiquetas.setTotalImporte(oImporteTotal.toString());
		}

		return oEtiquetas;
	}

	public String getValParam(Short numValor) {

		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) numValor));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

		if (oParametroSistema != null && oParametroSistema.getValor() != null) {
			return oParametroSistema.getValor();
		}

		return null;
	}

}
