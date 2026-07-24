package com.greenaall.pa.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.HabintanteBajaException;
import com.greenaall.exception.NoDataFoundException;
import com.greenaall.ge.dto.Etiquetas;
import com.greenaall.ge.util.ArchivoValide;
import com.greenaall.models.ex.entity.AtributoExpediente;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.Procedimiento;
import com.greenaall.models.ex.service.AtributoExpedienteoServiceImpl;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.ProcedimientoServiceImpl;
import com.greenaall.models.ge.entity.ParametroSistema;
import com.greenaall.models.ge.entity.ParametroSistemaPK;
import com.greenaall.models.ge.service.IParametroSistemaService;
import com.greenaall.models.pa.entity.Habitante;
import com.greenaall.models.pa.entity.HabitantePK;
import com.greenaall.models.pa.service.IHabitanteService;
import com.greenaall.models.pe.entity.PersonaEntidadPK;
import com.greenaall.models.te.entity.Domicilio;
import com.greenaall.models.te.entity.DomicilioPK;
import com.greenaall.models.te.entity.Municipio;
import com.greenaall.models.te.entity.MunicipioPK;
import com.greenaall.models.te.entity.Provincia;
import com.greenaall.models.te.service.IDomicilioService;
import com.greenaall.models.te.service.MunicipioServiceImpl;
import com.greenaall.models.te.service.ProvinciaServiceImpl;
import com.greenaall.pa.dto.HabitanteBajaDto;
import com.greenaall.pa.dto.HabitanteDto;
import com.greenaall.util.Cadena;
import com.greenaall.util.Clonador;
import com.greenaall.util.ConvertirPDF;
import com.greenaall.util.Fecha;
import com.greenaall.util.Formateador;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class HabitanteController {

	@Autowired
	private IHabitanteService habitanteService;

	@Autowired
	private IDomicilioService domicilioService;

	@Autowired
	private ProvinciaServiceImpl serviceProvincia;

	@Autowired
	private MunicipioServiceImpl serviceMuncipio;

	@Autowired
	private IParametroSistemaService parametroSistemaService;

	@Autowired
	private ExpedienteServiceImpl serviceExpediente;

	@Autowired
	private AtributoExpedienteoServiceImpl atributoExpedienteService;

	@Autowired
	private ProcedimientoServiceImpl serviceProcedimiento;

	@PutMapping("/habitante/baja/{numDocum}")
	@ResponseStatus(HttpStatus.CREATED)
	public HabitanteDto baja(@RequestBody HabitanteBajaDto oHabitanteBajaDto, @PathVariable String numDocum) {

		List<Habitante> aHabitante = habitanteService.findByNumDocum(numDocum);

		if (aHabitante == null || aHabitante.isEmpty()) {
			throw new NoDataFoundException();
		}

		HabitanteDto oHabitanteDto = new HabitanteDto();

		HabitantePK oHabitantePK = new HabitantePK();
		oHabitantePK.setIdHisHabit(aHabitante.get(0).getIdHisHabit());
		oHabitantePK.setIdHabit(aHabitante.get(0).getIdHabit());
		Habitante oHabianteOriginal = habitanteService.findById(oHabitantePK);

		if (oHabianteOriginal.getCodMovim().equals("B")) {
			throw new HabintanteBajaException();
		}

		Habitante oHabianteNuevo = (Habitante) Clonador.deepCopy(oHabianteOriginal);

		oHabianteOriginal.setRegActiv(Short.valueOf((short) 0));
		habitanteService.save(oHabianteOriginal);

		oHabianteNuevo.setFecMovim(oHabitanteBajaDto.getFecMovim());
		oHabianteNuevo.setFecReal(oHabitanteBajaDto.getFecReal());
		oHabianteNuevo.setCodMovim("B");
		oHabianteNuevo.setRegActiv(Short.valueOf((short) 1));
		oHabianteNuevo.setIdHabit(oHabianteOriginal.getIdHabit());
		oHabianteNuevo.setIdHisHabit(null);

		if (oHabitanteBajaDto.getTipBaja().equals(Short.valueOf((short) 6))) {
			oHabitanteBajaDto.setTipBaja(Short.valueOf((short) 7));
		}
		oHabianteNuevo.setCauMovim(oHabitanteBajaDto.getTipBaja());

		if (oHabitanteBajaDto.getPaiProDesti() != null) {
			oHabianteNuevo.setPaiProDesti(oHabitanteBajaDto.getPaiProDesti());
		} else {
			oHabianteNuevo.setPaiProDesti(Short.valueOf((short) 108));
		}

		if (oHabitanteBajaDto.getProProDesti() != null && oHabitanteBajaDto.getMunProDesti() != null) {
			oHabianteNuevo.setProProDesti(oHabitanteBajaDto.getProProDesti());
			oHabianteNuevo.setMunProDesti(oHabitanteBajaDto.getMunProDesti());
		}

		if (oHabitanteBajaDto.getTipBaja().equals(Short.valueOf((short) 5))) {
			oHabianteNuevo.setPaiProDesti(oHabitanteBajaDto.getPaiProDesti());
			oHabianteNuevo.setProProDesti(Short.valueOf((short) 66));
			oHabianteNuevo.setMunProDesti(oHabitanteBajaDto.getPaiProDesti());
		}

		habitanteService.save(oHabianteNuevo);

		return oHabitanteDto;

	}

	@GetMapping("/habitante/ver/{numDocum}")
	public HabitanteDto detalle(@PathVariable String numDocum) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Habitante> aHabitante = habitanteService.findByNumDocum(numDocum);

		if (aHabitante == null || aHabitante.isEmpty()) {
			throw new NoDataFoundException();
		}

		DomicilioPK oDomicilioPk = new DomicilioPK();
		oDomicilioPk.setIdDomic(aHabitante.get(0).getIdDomic());
		oDomicilioPk.setIdHisDomic(aHabitante.get(0).getIdHisDomic());

		Domicilio oDomicilio = domicilioService.findById(oDomicilioPk);

		HabitanteDto oHabitanteDto = new HabitanteDto();

		if (oDomicilio != null && oDomicilio.getDirPosta() != null) {
			oHabitanteDto.setDomicilio(oDomicilio.getDirPosta());
		}

		if (aHabitante.get(0).getNombre() != null) {
			oHabitanteDto.setNombre(aHabitante.get(0).getNombre());
		}

		if (aHabitante.get(0).getParticula1() != null) {
			oHabitanteDto.setParticula1(aHabitante.get(0).getParticula1());
		}

		if (aHabitante.get(0).getApellido1() != null) {
			oHabitanteDto.setApellido1(aHabitante.get(0).getApellido1());
		}

		if (aHabitante.get(0).getParticula2() != null) {
			oHabitanteDto.setParticula2(aHabitante.get(0).getParticula2());
		}
		
		if (aHabitante.get(0).getApellido2() != null) {
			oHabitanteDto.setApellido2(aHabitante.get(0).getApellido2());
		}

		if (aHabitante.get(0).getDistrito() != null) {
			oHabitanteDto.setDistrito(aHabitante.get(0).getDistrito());
		}

		if (aHabitante.get(0).getSeccion() != null) {
			oHabitanteDto.setSeccion(aHabitante.get(0).getSeccion());
		}

		if (aHabitante.get(0).getEmail() != null) {
			oHabitanteDto.setEmail(aHabitante.get(0).getEmail());
		}

		if (aHabitante.get(0).getFecNacim() != null) {
			String fechaComoCadena = sdf.format(aHabitante.get(0).getFecNacim());
			oHabitanteDto.setFecNacim(fechaComoCadena);
		}

		if (aHabitante.get(0).getFecPadro() != null) {
			String fechaComoCadena = sdf.format(aHabitante.get(0).getFecPadro());
			oHabitanteDto.setFecPadro(fechaComoCadena);
		}

		if (aHabitante.get(0).getFecMovim() != null) {
			String fechaComoCadena = sdf.format(aHabitante.get(0).getFecMovim());
			oHabitanteDto.setFecSituacion(fechaComoCadena);
		}

		if (aHabitante.get(0).getMunNacim() != null && aHabitante.get(0).getProNacim() != null) {
			Long codProvi = Long.valueOf(aHabitante.get(0).getProNacim());
			Provincia oProvincia = serviceProvincia.findById(codProvi);
			if (oProvincia != null) {
				oHabitanteDto.setProNacim(oProvincia.getDesProvi());
			}
			MunicipioPK MunicipioPK = new MunicipioPK();
			MunicipioPK.setCodProvi(aHabitante.get(0).getProNacim());
			MunicipioPK.setCodMunic(aHabitante.get(0).getMunNacim());
			Municipio oMunicipio = serviceMuncipio.findById(MunicipioPK);
			if (oMunicipio != null) {
				oHabitanteDto.setMunNacim(oMunicipio.getDesMunic());
			}
		}

		if (aHabitante.get(0).getNumDocum() != null) {
			oHabitanteDto.setNumDocum(aHabitante.get(0).getNumDocum());
		}

		if (aHabitante.get(0).getNumFamil() != null) {
			oHabitanteDto.setNumFamil(aHabitante.get(0).getNumFamil());
		}

		if (aHabitante.get(0).getNumHojPadro() != null) {
			oHabitanteDto.setNumHojPadro(aHabitante.get(0).getNumHojPadro());
		}

		if (aHabitante.get(0).getNumOrden() != null) {
			oHabitanteDto.setNumOrden(aHabitante.get(0).getNumOrden());
		}

		if (aHabitante.get(0).getObservaciones() != null) {
			oHabitanteDto.setObservaciones(aHabitante.get(0).getObservaciones());
		}

		if (aHabitante.get(0).getTelefono() != null) {
			oHabitanteDto.setTelefono(aHabitante.get(0).getTelefono());
		}

		if (aHabitante.get(0).getTipDocum() != null) {
			if (aHabitante.get(0).getTipDocum().equals(Integer.valueOf((int) 0))) {
				oHabitanteDto.setTipDocum("Sin Documento");
			} else if (aHabitante.get(0).getTipDocum().equals(Integer.valueOf((int) 1))) {
				oHabitanteDto.setTipDocum("D.N.I.");
			} else if (aHabitante.get(0).getTipDocum().equals(Integer.valueOf((int) 2))) {
				oHabitanteDto.setTipDocum("Pasaporte");
			} else if (aHabitante.get(0).getTipDocum().equals(Integer.valueOf((int) 3))) {
				oHabitanteDto.setTipDocum("Tarj. Residencia");
			} else if (aHabitante.get(0).getTipDocum().equals(Integer.valueOf((int) 4))) {
				oHabitanteDto.setTipDocum("Otros");
			}
		}

		if (aHabitante.get(0).getCodMovim() != null) {
			if (aHabitante.get(0).getCodMovim().equals("A")) {
				switch (aHabitante.get(0).getCauMovim()) {
				case 1:
					oHabitanteDto.setSituacion("Alta por Omisión");
					break;
				case 2:
					oHabitanteDto.setSituacion("Alta por Cambio de Residencia");
					break;
				case 3:
					oHabitanteDto.setSituacion("Alta por Nacimiento");
					break;
				case 4:
					oHabitanteDto.setSituacion("Alta Incial");
					break;
				}
			} else if (aHabitante.get(0).getCodMovim().equals("B")) {
				switch (aHabitante.get(0).getCauMovim()) {
				case 1:
					oHabitanteDto.setSituacion("Baja por Fallecimiento");
					break;
				case 2:
					oHabitanteDto.setSituacion("Baja por Inclusión Indebida");
					break;
				case 3:
					oHabitanteDto.setSituacion("Baja por Duplicado");
					break;
				case 4:
					oHabitanteDto.setSituacion("Baja por Traslado");
					break;
				case 5:
					oHabitanteDto.setSituacion("Baja por Emigración");
					break;
				case 7:
					oHabitanteDto.setSituacion("Baja por Caducidad");
					break;
				}
			} else if (aHabitante.get(0).getCodMovim().equals("M")) {
				switch (aHabitante.get(0).getCauMovim()) {
				case 1:
					oHabitanteDto.setSituacion("Modificación por Datos Personales");
					break;
				case 2:
					oHabitanteDto.setSituacion("Modificación por Domicilio");
					break;
				case 3:
					oHabitanteDto.setSituacion("Modificación por Rectificación");
					break;
				case 4:
					oHabitanteDto.setSituacion("Modificación por Renovación");
					break;
				case 5:
					oHabitanteDto.setSituacion("Modificación por Confirmación");
					break;
				}
			}
		}

		return oHabitanteDto;
	}

	@GetMapping("/habitante/volante/{numDocum}/{id}/{usuario}")
	public void volante(@PathVariable String numDocum, @PathVariable Long id, @PathVariable String usuario,
			HttpServletResponse response) {

		List<Habitante> aHabitante = habitanteService.findByNumDocum(numDocum);
		String ruta = null;
		String tipoArchivo = "vol_emp_u_es.sxw";

		if (aHabitante == null || aHabitante.isEmpty()) {
			throw new NoDataFoundException();
		}

		Boolean fusion = null;
		Etiquetas oEtiquetas = getEtiquetas(usuario, id, aHabitante.get(0));

		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) 9300));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);
		
		String sInstalacion = oParametroSistema.getValor();
		
		if (sInstalacion.equals("C:\\iflow") || sInstalacion.equals("C:\\iflow\\")
				|| sInstalacion.equals("c:\\iflow") || sInstalacion.equals("c:\\iflow\\")) {
			ruta = "C:\\iflow\\formatos\\pa\\" + tipoArchivo;
		} else {
			ruta = "/srv/iflow/formatos/pa/" + tipoArchivo;
		}
		ParametroSistemaPK oParametroSistema2Pk = new ParametroSistemaPK(Long.valueOf((long) 1),
				Long.valueOf((long) 0), "es", Short.valueOf((short) 9307));
		ParametroSistema oParametroSistema2 = parametroSistemaService.findById(oParametroSistema2Pk);
		
		fusion = ArchivoValide.fusionDocumentoODT(ruta, oEtiquetas,	oParametroSistema2.getValor());

		if (!fusion) {
			System.err.println("Se ha producido un error en la fusión ODF");
		}
		
		String rutaPdf = ConvertirPDF.convertirPDF(ruta, ".sxw");

		try {
			File file = new File(rutaPdf);
			FileInputStream fis;
			fis = new FileInputStream(file);
			response.setContentType("application/force-download");
			response.addHeader("Content-disposition", "attachment;fileName=" + "vol_emp_u_es.pdf");
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
	
	@GetMapping("/habitante/certificadoEmp/{numDocum}/{id}/{usuario}")
	public void certificadoEmp(@PathVariable String numDocum, @PathVariable Long id, @PathVariable String usuario,
			HttpServletResponse response) {

		List<Habitante> aHabitante = habitanteService.findByNumDocum(numDocum);
		String ruta = null;
		String tipoArchivo = "cer_emp_u_es.sxw";

		if (aHabitante == null || aHabitante.isEmpty()) {
			throw new NoDataFoundException();
		}

		Boolean fusion = null;
		Etiquetas oEtiquetas = getEtiquetas(usuario, id, aHabitante.get(0));

		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) 9300));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);
		
		String sInstalacion = oParametroSistema.getValor();
		
		if (sInstalacion.equals("C:\\iflow") || sInstalacion.equals("C:\\iflow\\")
				|| sInstalacion.equals("c:\\iflow") || sInstalacion.equals("c:\\iflow\\")) {
			ruta = "C:\\iflow\\formatos\\pa\\" + tipoArchivo;
		} else {
			ruta = "/srv/iflow/formatos/pa/" + tipoArchivo;
		}
		
		ParametroSistemaPK oParametroSistema2Pk = new ParametroSistemaPK(Long.valueOf((long) 1),
				Long.valueOf((long) 0), "es", Short.valueOf((short) 9307));
		ParametroSistema oParametroSistema2 = parametroSistemaService.findById(oParametroSistema2Pk);

		fusion = ArchivoValide.fusionDocumentoODT(ruta, oEtiquetas,	oParametroSistema2.getValor());

		if (!fusion) {
			System.err.println("Se ha producido un error en la fusión ODF");
		}
		
		String rutaPdf = ConvertirPDF.convertirPDF(ruta, ".sxw");

		try {
			File file = new File(rutaPdf);
			FileInputStream fis;
			fis = new FileInputStream(file);
			response.setContentType("application/force-download");
			response.addHeader("Content-disposition", "attachment;fileName=" + "vol_emp_u_es.pdf");
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

	public Etiquetas getEtiquetas(String usuario, Long idExped, Habitante oHabitante) {

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
			PersonaEntidadPK oPersonaEntidadTituPK = new PersonaEntidadPK();
			oPersonaEntidadTituPK.setIdHisPerso(oExpediente.getIdHisPerso());
			oPersonaEntidadTituPK.setIdPerso(oExpediente.getIdPerso());

			if (oHabitante != null) {
				String nombreCompleto = null;

				if (oHabitante.getApellido2() != null) {
					nombreCompleto = oHabitante.getNombre() + " " + oHabitante.getApellido1() + " "
							+ oHabitante.getApellido2();
				} else {
					nombreCompleto = oHabitante.getNombre() + " " + oHabitante.getApellido1();
				}

				oEtiquetas.setNombreCompleto(nombreCompleto);
				oEtiquetas.setNumDocum(oHabitante.getNumDocum());

				DomicilioPK oDomicilioPK = new DomicilioPK();
				oDomicilioPK.setIdHisDomic(oHabitante.getIdHisDomic());
				oDomicilioPK.setIdDomic(oHabitante.getIdDomic());

				Domicilio oDomicilio = domicilioService.findById(oDomicilioPK);

				if (oDomicilio != null) {
					oEtiquetas.setDomicilio(oDomicilio.getDirPosta());
				}

				MunicipioPK MunicipioPK = new MunicipioPK();
				MunicipioPK.setCodProvi(oHabitante.getProNacim());
				MunicipioPK.setCodMunic(oHabitante.getMunNacim());
				Municipio oMunicipio = serviceMuncipio.findById(MunicipioPK);
				if (oMunicipio != null) {
					oEtiquetas.setDesMunNacim(oMunicipio.getDesMunic());
				}
			
		        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		        String dateString = formatter.format(oHabitante.getFecPadro());
		        oEtiquetas.setFecPadro(dateString);
			}

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

	public boolean isLong(String numero) {
		try {
			Long.parseLong(numero);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
