package com.greenaall.gf.liquidacion;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.exception.CtrError;
import com.greenaall.ge.dto.Etiquetas;
import com.greenaall.models.ad.entity.Contador;
import com.greenaall.models.ad.service.ContadorServiceImpl;
import com.greenaall.models.ex.entity.AtributoExpediente;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.entity.Interesado;
import com.greenaall.models.ex.entity.Procedimiento;
import com.greenaall.models.ex.service.AtributoExpedienteoServiceImpl;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ex.service.InteresadoServiceImpl;
import com.greenaall.models.ex.service.ProcedimientoServiceImpl;
import com.greenaall.models.ge.entity.DiaFestivo;
import com.greenaall.models.ge.entity.Entidad;
import com.greenaall.models.ge.entity.ParametroSistema;
import com.greenaall.models.ge.entity.ParametroSistemaPK;
import com.greenaall.models.ge.service.DiaFestivoServiceImpl;
import com.greenaall.models.ge.service.EntidadServiceImpl;
import com.greenaall.models.ge.service.IParametroSistemaService;
import com.greenaall.models.gf.entity.Concepto;
import com.greenaall.models.gf.entity.ContadorTipoObjetoTributario;
import com.greenaall.models.gf.entity.ImpuestoConcepto;
import com.greenaall.models.gf.entity.Liquidacion;
import com.greenaall.models.gf.entity.LiquidacionConcepto;
import com.greenaall.models.gf.entity.ObjetoTributario;
import com.greenaall.models.gf.entity.ReciboCabecera;
import com.greenaall.models.gf.entity.ReciboCabeceraPK;
import com.greenaall.models.gf.entity.ReciboConcepto;
import com.greenaall.models.gf.entity.TipoObjetoTributario;
import com.greenaall.models.gf.entity.TipoObjetoTributarioPK;
import com.greenaall.models.gf.service.ConceptoServiceImpl;
import com.greenaall.models.gf.service.ContadorTipoObjetoTributarioServiceImpl;
import com.greenaall.models.gf.service.ITipoObjetoTributarioService;
import com.greenaall.models.gf.service.ImpuestoConceptoServiceImpl;
import com.greenaall.models.gf.service.LiquidacionConceptoServiceImpl;
import com.greenaall.models.gf.service.LiquidacionServiceImpl;
import com.greenaall.models.gf.service.ObjetoTributarioServiceImpl;
import com.greenaall.models.gf.service.ReciboCabeceraServiceImpl;
import com.greenaall.models.gf.service.ReciboConceptoServiceImpl;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.entity.PersonaEntidadPK;
import com.greenaall.models.pe.service.PersonaEntidadServiceImpl;
import com.greenaall.models.te.entity.Municipio;
import com.greenaall.models.te.entity.MunicipioPK;
import com.greenaall.models.te.entity.Provincia;
import com.greenaall.models.te.service.MunicipioServiceImpl;
import com.greenaall.models.te.service.ProvinciaServiceImpl;
import com.greenaall.util.Cadena;
import com.greenaall.util.DiaHabil;
import com.greenaall.util.Fecha;
import com.greenaall.util.Formateador;
import com.greenaall.util.Utiles;

/**
 * Casos de uso de orquestación extraídos de {@code LiquidacionController}:
 * alta de una liquidación (con su objeto tributario y recibo asociados) y
 * construcción de las etiquetas de fusión de plantillas, incluyendo el
 * cálculo del código de barras CSB60.
 */
@Service
public class LiquidacionApplicationService {

	@Autowired
	private LiquidacionServiceImpl serviceLiquidacion;

	@Autowired
	private LiquidacionConceptoServiceImpl serviceLiquidacionConcepto;

	@Autowired
	private InteresadoServiceImpl serviceInteresado;

	@Autowired
	private ContadorServiceImpl serviceContador;

	@Autowired
	private ITipoObjetoTributarioService tipoObjetoTributarioService;

	@Autowired
	private ExpedienteServiceImpl serviceExpediente;

	@Autowired
	private IParametroSistemaService parametroSistemaService;

	@Autowired
	private AtributoExpedienteoServiceImpl atributoExpedienteService;

	@Autowired
	private ProcedimientoServiceImpl serviceProcedimiento;

	@Autowired
	private ConceptoServiceImpl serviceConcepto;

	@Autowired
	private ImpuestoConceptoServiceImpl serviceImpuestoConcepto;

	@Autowired
	private PersonaEntidadServiceImpl servicePersonaEntidad;

	@Autowired
	private EntidadServiceImpl serviceEntidad;

	@Autowired
	private ProvinciaServiceImpl serviceProvincia;

	@Autowired
	private MunicipioServiceImpl serviceMuncipio;

	@Autowired
	private DiaFestivoServiceImpl serviceDiaFestivo;

	@Autowired
	private ContadorTipoObjetoTributarioServiceImpl serviceContadorTipoObjetoTributario;

	@Autowired
	private ReciboCabeceraServiceImpl serviceReciboCabecera;

	@Autowired
	private ObjetoTributarioServiceImpl serviceObjetoTributario;

	@Autowired
	private ReciboConceptoServiceImpl serviceReciboConcepto;

	@SuppressWarnings("static-access")
	public Liquidacion crear(Liquidacion oLiquidacion, Long idTipObjTribu, Long idHisTipObjTribu, String desObjTribu) {

		Interesado oInteresado = serviceInteresado.findByExpedienteAndPrincipal(oLiquidacion.getIdExped());

		oLiquidacion.setIdHisPropi(oInteresado.getIdHisPerso());
		oLiquidacion.setIdPropi(oInteresado.getIdPerso());
		oLiquidacion.setCodEntid(Short.valueOf((short) 1));
		oLiquidacion.setModPerte(Short.valueOf((short) 7));
		Date oFechaHoy = new Date();

		oLiquidacion.setFecLiqui(new java.sql.Date(oFechaHoy.getTime()));

		int year = LocalDate.now().getYear();
		Short ano = Short.valueOf((short) year);
		oLiquidacion.setEjeLiqui(ano);

		Contador oContadorNumLiqui = serviceContador.findByAnnoAndModuloAndNumContaAndCodEntid(ano,
				Short.valueOf((short) 34), Short.valueOf((short) 4), Short.valueOf((short) 1));

		if (oContadorNumLiqui != null) {
			Integer oConta = oContadorNumLiqui.getValConta() + 1;
			oLiquidacion.setNumLiqui(oConta.toString());
			oContadorNumLiqui.setValConta(oConta);
			serviceContador.save(oContadorNumLiqui);
		} else {
			oLiquidacion.setNumLiqui(Integer.valueOf((int) 1).toString());
			Contador oContadorNuevo = new Contador();
			oContadorNuevo.setAnno(ano);
			oContadorNuevo.setCodEntid(Short.valueOf((short) 1));
			oContadorNuevo.setDesConta("LIQUIDACIONES");
			oContadorNuevo.setFecContr(new Date());
			oContadorNuevo.setModulo(Short.valueOf((short) 34));
			oContadorNuevo.setNumConta(Short.valueOf((short) 4));
			oContadorNuevo.setNumDigConta(Integer.valueOf((int) 12));
			oContadorNuevo.setValConta(Integer.valueOf((int) 1));
			oContadorNuevo.setUsuContr("gos");
			oContadorNuevo.setFecContr(new Date());

			serviceContador.save(oContadorNuevo);
		}

		oLiquidacion.setModPerte(Short.valueOf((short) 7));

		TipoObjetoTributarioPK oObjetoTributarioPK = new TipoObjetoTributarioPK();
		oObjetoTributarioPK.setIdHisTipObjTribu(idHisTipObjTribu);
		oObjetoTributarioPK.setIdTipObjTribu(idTipObjTribu);

		TipoObjetoTributario oTipoObjetoTributario = tipoObjetoTributarioService.findById(oObjetoTributarioPK);

		if (oTipoObjetoTributario != null) {
			oLiquidacion.setIdImpue(oTipoObjetoTributario.getIdImpue());
		}

		if (oLiquidacion.getPorBonif() == null) {
			oLiquidacion.setPorBonif(new BigDecimal("0.00"));
		}

		List<ImpuestoConcepto> aImpuestoConcepto = serviceImpuestoConcepto.findByIdImpue(oTipoObjetoTributario.getIdImpue());

		ObjetoTributario oObjetoTributario = new ObjetoTributario();
		oObjetoTributario.setDesObjTribu(desObjTribu);
		oObjetoTributario.setCodEntid(Short.valueOf((short) 1));
		oObjetoTributario.setIdHisTipObjTribu(idHisTipObjTribu);
		oObjetoTributario.setIdTipObjTribu(idTipObjTribu);

		ContadorTipoObjetoTributario oContadorTipo = serviceContadorTipoObjetoTributario.findById(idTipObjTribu);

		if (oContadorTipo != null) {
			oContadorTipo.setContador(Long.valueOf(oContadorTipo.getContador().longValue() + 1));
			serviceContadorTipoObjetoTributario.save(oContadorTipo);
		} else {
			oContadorTipo = new ContadorTipoObjetoTributario();
			oContadorTipo.setIdTipObjTribu(oObjetoTributario.getIdTipObjTribu());
			oContadorTipo.setCodEntid(oObjetoTributario.getCodEntid());
			oContadorTipo.setContador(Long.valueOf("1"));
			oContadorTipo.setUsuContr("gos");
			oContadorTipo.setFecContr(new Date());
			serviceContadorTipoObjetoTributario.save(oContadorTipo);
		}

		oObjetoTributario.setNumObjTribu(oContadorTipo.getContador());

		Contador oContadorIdObjTribu = serviceContador.findByAnnoAndModuloAndNumContaAndCodEntid(Short.valueOf("0"),
				Short.valueOf((short) 34), Short.valueOf((short) 9), Short.valueOf((short) 0));

		if (oContadorIdObjTribu != null) {
			Integer oConta = oContadorIdObjTribu.getValConta() + 1;
			oObjetoTributario.setIdObjTribu(Long.valueOf(oConta));
			oContadorIdObjTribu.setValConta(oConta);
			serviceContador.save(oContadorIdObjTribu);
		}

		oObjetoTributario.setIdHisSujPasiv(oLiquidacion.getIdHisPropi());
		oObjetoTributario.setIdSujPasiv(oLiquidacion.getIdPropi());
		oObjetoTributario.setFecAlta(new java.sql.Date(new java.util.Date().getTime()));
		oObjetoTributario.setFecMovim(new java.sql.Date(new java.util.Date().getTime()));
		oObjetoTributario.setCodMovim("A");
		oObjetoTributario.setCodCauMovim(Short.valueOf((short) 1));
		oObjetoTributario.setRegActiv(Short.valueOf((short) 1));

		Contador oContadorRefDomic = serviceContador.findByAnnoAndModuloAndNumContaAndCodEntid(Short.valueOf("0"),
				Short.valueOf((short) 34), Short.valueOf((short) 7), Short.valueOf((short) 0));

		if (oContadorRefDomic != null) {
			Integer oConta = oContadorRefDomic.getValConta() + 1;
			oObjetoTributario.setRefDomic(Long.valueOf(oConta));
			oContadorRefDomic.setValConta(oConta);
			serviceContador.save(oContadorRefDomic);
		}

		oObjetoTributario.setTarPerso(Short.valueOf((short) 1));
		if (oLiquidacion.getObservaciones() != null) {
			oObjetoTributario.setObservaciones(oLiquidacion.getObservaciones());
		}

		oObjetoTributario.setFecContr(new Date());
		if (oLiquidacion.getUsuContr() != null) {
			oObjetoTributario.setUsuContr(oLiquidacion.getUsuContr());
		} else {
			oObjetoTributario.setUsuContr("gos");
		}

		serviceObjetoTributario.save(oObjetoTributario);

		ObjetoTributario oObjetoTributarioNuevo = serviceObjetoTributario.findByIdObjTribu(oObjetoTributario.getIdObjTribu(), idHisTipObjTribu, idTipObjTribu);

		oLiquidacion.setIdHisObjTribu(oObjetoTributarioNuevo.getIdHisObjTribu());
		oLiquidacion.setIdObjTribu(oObjetoTributarioNuevo.getIdObjTribu());

		ReciboCabecera oReciboCabecera = new ReciboCabecera();

		Contador oContadorIdRecib = serviceContador.findByAnnoAndModuloAndNumContaAndCodEntid(Short.valueOf("0"),
				Short.valueOf((short) 34), Short.valueOf((short) 2), Short.valueOf((short) 0));

		if (oContadorIdRecib != null) {
			Integer oConta = oContadorIdRecib.getValConta() + 1;
			oReciboCabecera.setIdRecib(Long.valueOf(oConta));
			oContadorIdRecib.setValConta(oConta);
			serviceContador.save(oContadorIdRecib);
		}

		oReciboCabecera.setCodEntid(Short.valueOf((short) 1));
		oReciboCabecera.setModPerte(Short.valueOf((short) 7));
		oReciboCabecera.setNomPadro("LIQTRIBU");
		oReciboCabecera.setEjeRecib(ano);

		Contador oContadorNumRecib = serviceContador.findByAnnoAndModuloAndNumContaAndCodEntid(ano,
				Short.valueOf((short) 34), Short.valueOf((short) 3), Short.valueOf((short) 1));

		if (oContadorNumRecib != null) {
			Integer oConta = oContadorNumRecib.getValConta() + 1;
			oReciboCabecera.setNumRecib(oConta);
			oContadorNumRecib.setValConta(oConta);
			serviceContador.save(oContadorNumRecib);
		}

		oReciboCabecera.setFecMovim(new java.sql.Date(new java.util.Date().getTime()));
		oReciboCabecera.setCodMovim("A");
		oReciboCabecera.setCodCauMovim(Short.valueOf((short) 1));
		oReciboCabecera.setRegActiv(Short.valueOf((short) 1));
		oReciboCabecera.setTipExacc(oLiquidacion.getTipLiqui());
		oReciboCabecera.setIdImpue(oLiquidacion.getIdImpue());
		oReciboCabecera.setPerImpos(ano.toString());
		oReciboCabecera.setIdHisObjTribu(oObjetoTributarioNuevo.getIdHisObjTribu());
		oReciboCabecera.setIdObjTribu(oObjetoTributarioNuevo.getIdObjTribu());
		oReciboCabecera.setIdHisPerso(oLiquidacion.getIdHisPropi());
		oReciboCabecera.setIdPerso(oLiquidacion.getIdPropi());
		oReciboCabecera.setFecRecib(new java.sql.Date(new java.util.Date().getTime()));

		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) 105));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

		String fecLimit = oParametroSistema.getValor();

		DiaHabil oDiaHabil = new DiaHabil();

		java.sql.Date dFechaHabilSql = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
		String sAno = dateFormat.format(oFechaHoy);
		String fechaInicio = sAno + '/' + "01" + "/" + "01";
		String fechaFin = sAno + '/' + "12" + "/" + "31";
		List<DiaFestivo> aoDiaFesti = serviceDiaFestivo.findByFecFesti(fechaInicio, fechaFin);

		if (oDiaHabil.dameFechaHabil(oReciboCabecera.getFecRecib(), false,
				Integer.valueOf(fecLimit).intValue(), false, aoDiaFesti) != null) {
			dFechaHabilSql = new java.sql.Date(oDiaHabil.dameFechaHabil(
					oReciboCabecera.getFecRecib(), false,
					Integer.valueOf(fecLimit).intValue(), false, aoDiaFesti).getTime());
		}

		java.sql.Date dFechaHabil1Sql = null;

		if (oDiaHabil
				.dameFechaHabil(oReciboCabecera.getFecRecib(), false, 7, false, aoDiaFesti) != null) {
			dFechaHabil1Sql = new java.sql.Date(oDiaHabil.dameFechaHabil(
					oReciboCabecera.getFecRecib(), false, 7, false, aoDiaFesti).getTime());
		}

		if (fecLimit != null && fecLimit.length() > 0) {
			oReciboCabecera.setFecLimit(dFechaHabilSql);
		} else {
			oReciboCabecera.setFecLimit(dFechaHabil1Sql);
		}

		oReciboCabecera.setImpPrinc(oLiquidacion.getTotLiqui());
		oReciboCabecera.setImpRecib(oLiquidacion.getTotLiqui());

		if (oLiquidacion.getImpSanci() != null) {
			oReciboCabecera.setImpInter(oLiquidacion.getImpSanci());
		} else {
			oReciboCabecera.setImpInter(new BigDecimal("0.00"));
		}

		if (oLiquidacion.getImpVario() != null) {
			oReciboCabecera.setImpOtros(oLiquidacion.getImpVario());
		} else {
			oReciboCabecera.setImpOtros(new BigDecimal("0.00"));
		}

		oReciboCabecera.setImpRecar(new BigDecimal("0.00"));
		oReciboCabecera.setImpCobro(new BigDecimal("0.00"));
		oReciboCabecera.setImpPendi(new BigDecimal("0.00"));
		oReciboCabecera.setImpFracc(new BigDecimal("0.00"));
		oReciboCabecera.setImpCosta(new BigDecimal("0.00"));
		oReciboCabecera.setEstRecib(Short.valueOf((short) 2));
		oReciboCabecera.setRefDomic((oObjetoTributario.getRefDomic().intValue()));
		oReciboCabecera.setImpreso(Short.valueOf((short) 0));
		oReciboCabecera.setTipCobro(Short.valueOf((short) 0));

		if (oLiquidacion.getObservaciones() != null) {
			oReciboCabecera.setObservacion(oLiquidacion.getObservaciones());
		}

		Expediente oExpediente = serviceExpediente.findById(oLiquidacion.getIdExped());

		if (oExpediente != null) {
			oReciboCabecera.setNumExped(oExpediente.getNumero().toString());
			String fechaExpediente = "01" + "/" + "01" + "/" + oExpediente.getEjercicio().toString();
			dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			try {
				oReciboCabecera.setEjeExped(new java.sql.Date(dateFormat.parse(fechaExpediente).getTime()));
			} catch (ParseException e) {
				System.err.print(e.getMessage());
			}
		}

		oReciboCabecera.setFecContr(new Date());
		if (oLiquidacion.getUsuContr() != null) {
			oReciboCabecera.setUsuContr(oLiquidacion.getUsuContr());
		} else {
			oReciboCabecera.setUsuContr("gos");
		}

		serviceReciboCabecera.save(oReciboCabecera);

		ReciboCabecera oReciboNuevo = serviceReciboCabecera.findByIdRecibAndEjeRecib(oReciboCabecera.getIdRecib(), oReciboCabecera.getEjeRecib());

		oLiquidacion.setIdHisRecib(oReciboNuevo.getIdHisRecib());
		oLiquidacion.setIdRecib(oReciboNuevo.getIdRecib());
		oLiquidacion.setCuoAutol(new BigDecimal("0.00"));
		oLiquidacion.setImpBonAutol(new BigDecimal("0.00"));
		Liquidacion oLiquidacionNueva = serviceLiquidacion.save(oLiquidacion);

		LiquidacionConcepto oLiquidacionConcepto = new LiquidacionConcepto();

		oLiquidacionConcepto.setCodConce(aImpuestoConcepto.get(0).getCodConce());
		oLiquidacionConcepto.setEjeConce(ano);
		oLiquidacionConcepto.setFecContr(new Date());
		oLiquidacionConcepto.setIdLiqui(oLiquidacionNueva.getIdLiqui());
		oLiquidacionConcepto.setImpConce(oLiquidacion.getTotLiqui());
		oLiquidacionConcepto.setUsuContr("gos");

		serviceLiquidacionConcepto.save(oLiquidacionConcepto);

		ReciboConcepto oReciboConcepto = new ReciboConcepto();
		oReciboConcepto.setCodConce(oLiquidacionConcepto.getCodConce());
		oReciboConcepto.setEjeConce(oReciboNuevo.getEjeRecib());
		oReciboConcepto.setIdHisRecib(oReciboNuevo.getIdHisRecib());
		oReciboConcepto.setIdRecib(oReciboNuevo.getIdRecib());
		oReciboConcepto.setImpConce(oReciboNuevo.getImpRecib());
		oReciboConcepto.setUsuContr("gos");
		oReciboConcepto.setFecContr(new Date());

		serviceReciboConcepto.save(oReciboConcepto);

		return oLiquidacionNueva;
	}

	public Etiquetas getEtiquetas(Liquidacion oLiquidacion, String usuario, String desObjTribu) {

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

		Expediente oExpediente = serviceExpediente.findById(oLiquidacion.getIdExped());
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

			PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadTituPK);
			oEtiquetas.setDniPropi(oPersonaEntidad.getNumDocum());
			oEtiquetas.setNomPropi(oPersonaEntidad.getDesPerEntid());
			oEtiquetas.setDomPropi(oPersonaEntidad.getDirPosta());
			oEtiquetas.setCpPropi(Integer.toString(oPersonaEntidad.getCodPosta()));
			if (oPersonaEntidad.getCodProvi() > 0) {
				Long codProvi = Long.valueOf(oPersonaEntidad.getCodProvi());
				Provincia oProvincia = serviceProvincia.findById(codProvi);
				if (oProvincia != null) {
					oEtiquetas.setProPropi(oProvincia.getDesProvi());
				}
				if (oPersonaEntidad.getCodMunic() > 0) {
					MunicipioPK MunicipioPK = new MunicipioPK();
					MunicipioPK.setCodProvi(oPersonaEntidad.getCodProvi());
					MunicipioPK.setCodMunic(oPersonaEntidad.getCodMunic());
					Municipio oMunicipio = serviceMuncipio.findById(MunicipioPK);
					if (oMunicipio != null) {
						oEtiquetas.setPobPropi(oMunicipio.getDesMunic());
					}
				}
			}
			oEtiquetas.setDesObjTribu(desObjTribu);

			if (oLiquidacion != null) {

				List<LiquidacionConcepto> aLiquidacionConcepto = serviceLiquidacionConcepto.findByIdLiqui(oLiquidacion.getIdLiqui());

				if (aLiquidacionConcepto != null && aLiquidacionConcepto.get(0) != null) {
					oEtiquetas.setDesCon001(aLiquidacionConcepto.get(0).getCodConce());
					oEtiquetas.setImpCon0001(aLiquidacionConcepto.get(0).getImpConce().toString());
				}
				if (oLiquidacion.getObservaciones() != null) {
					oEtiquetas.setObservaciones(oLiquidacion.getObservaciones());
				}
				oEtiquetas.setCuoLiqui(oLiquidacion.getCuoLiqui().toString());
				oEtiquetas.setImpBonLiqui(oLiquidacion.getImpBonLiqui().toString());
				oEtiquetas.setImpSanci(oLiquidacion.getImpSanci().toString());
				oEtiquetas.setImpVario(oLiquidacion.getImpVario().toString());
				oEtiquetas.setIntDemor(oLiquidacion.getIntDemor().toString());
				oEtiquetas.setTotLiqui(oLiquidacion.getTotLiqui().toString());
				oEtiquetas.setEjeLiqui(oLiquidacion.getEjeLiqui().toString());
				oEtiquetas.setNumLiqui(oLiquidacion.getNumLiqui().toString());
				SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
				String dateString = formatter.format(oLiquidacion.getFecLiqui());
				oEtiquetas.setFecLiqui(dateString);

				if (oLiquidacion.getIdHisRecib() != null && oLiquidacion.getIdRecib() != null) {
					ReciboCabeceraPK oReciboCabeceraPK = new ReciboCabeceraPK();
					oReciboCabeceraPK.setIdHisRecib(oLiquidacion.getIdHisRecib());
					oReciboCabeceraPK.setIdRecib(oLiquidacion.getIdRecib());
					ReciboCabecera oReciboCabecera = serviceReciboCabecera.findById(oReciboCabeceraPK);

					if (oReciboCabecera != null) {
						String csb60;
						oEtiquetas.setPerImpos(oReciboCabecera.getPerImpos());
						try {
							csb60 = calcularCSB60(oLiquidacion.getTipLiqui(),
									oLiquidacion.getNumLiqui(), oLiquidacion.getTotLiqui(), oReciboCabecera);
							oEtiquetas.setCodBarCsb(csb60);
							oEtiquetas.setCarConLiqui(csb60);
							Entidad oEntidad = serviceEntidad.findById(Short.valueOf((short) 1));

							Short oCodProvi = null;
							Short oCodMunic = null;

							if (oEntidad != null) {
								oCodProvi = oEntidad.getCodProvi();
								oCodMunic = oEntidad.getCodMunic();
							}

							if (oCodProvi == null) {
								oCodProvi = Short.valueOf("0");
							}

							if (oCodMunic == null) {
								oCodMunic = Short.valueOf("0");
							}

							String sEmisora = Formateador.numero(oCodProvi, true, 2)
									+ Formateador.numero(oCodMunic, true, 3)
									+ Utiles.digitoEmisora(Formateador.numero(oCodProvi, true, 2)
											+ Formateador.numero(oCodMunic, true, 3));

							oEtiquetas.setEmisora(sEmisora);
							Date fFecFinPerio = getFecFinPeriodo(oReciboCabecera);
							String sIdentificacion = "1"
									+ Formateador
											.numero((this.getCodCSB60(oReciboCabecera) != null ? this
													.getCodCSB60(oReciboCabecera) : Short.valueOf("0")),
													true, 3)
									+ Formateador.numero(
											Integer.valueOf(
													(oReciboCabecera.getEjeRecib() == null ? 0
															: oReciboCabecera.getEjeRecib()
																	.intValue()) % 100),
											true, 2)
									+ Formateador.numero(
											Integer.valueOf(Fecha
													.devuelveAnoNumero(fFecFinPerio) % 10),
											true, 1)
									+ Formateador.numero(
											Integer.valueOf(Fecha
													.devuelveDiaJuliana(fFecFinPerio)),
											true, 3);
							oEtiquetas.setIdentificacion(sIdentificacion);

							String sReferencia = Formateador.numero(
									Integer.valueOf((oReciboCabecera.getEjeRecib() == null ? 0
											: oReciboCabecera.getEjeRecib().intValue()) % 100),
									true, 2)
									+ Formateador.numero(oReciboCabecera.getNumRecib(), true, 8)
									+ Utiles.CtrReferenciaRecibo60(
											sEmisora,
											Formateador.numero(
													Integer.valueOf(
															(oReciboCabecera.getEjeRecib() == null ? 0
																	: oReciboCabecera
																			.getEjeRecib()
																			.intValue()) % 100),
													true, 2)
													+ Formateador.numero(
															oReciboCabecera.getNumRecib(), true, 8),
											sIdentificacion, oLiquidacion.getTotLiqui());
							oEtiquetas.setReferencia(sReferencia);

						} catch (CtrError e) {
							System.err.println(e.getMessage());
						}
					}
				}
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

	@SuppressWarnings("static-access")
	private Date getFecFinPeriodo(ReciboCabecera poRecibo) {
		Date fFecFinPerio = null;
		Date oFechaHoy = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
		String sAno = dateFormat.format(oFechaHoy);
		String fechaInicio = sAno + '/' + "01" + "/" + "01";
		String fechaFin = sAno + '/' + "12" + "/" + "31";
		List<DiaFestivo> aoDiaFesti = serviceDiaFestivo.findByFecFesti(fechaInicio, fechaFin);
		ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
				"es", Short.valueOf((short) 105));
		ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

		String sNumeroDiasLimite = oParametroSistema.getValor();

		DiaHabil oDiaHabil = new DiaHabil();

		if (sNumeroDiasLimite != null
				&& sNumeroDiasLimite.length() > 0) {

			fFecFinPerio = oDiaHabil.getProximoDiaHabil(Fecha.truncar(Fecha.sumaDias(new Date(),
					Integer.valueOf(sNumeroDiasLimite).intValue())), aoDiaFesti);
		} else {
			fFecFinPerio = oDiaHabil.dameFechaHabil(
					poRecibo.getFecRecib(), false, 7, false, aoDiaFesti);
		}

		return fFecFinPerio;
	}

	@SuppressWarnings("static-access")
	public String calcularCSB60(Short poTipLiqui, String psNumAutol,
			BigDecimal poTotLiqui, ReciboCabecera poRecibo) throws CtrError {

		Date fFecFinPerio = null;
		Date oFechaHoy = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
		String sAno = dateFormat.format(oFechaHoy);
		String fechaInicio = sAno + '/' + "01" + "/" + "01";
		String fechaFin = sAno + '/' + "12" + "/" + "31";

		List<DiaFestivo> aoDiaFesti = serviceDiaFestivo.findByFecFesti(fechaInicio, fechaFin);

		if (poRecibo != null) {

			/* Obtener la entidad del recibo */

			Entidad oEntidad = serviceEntidad.findById(Short.valueOf((short) 1));

			Short oCodProvi = null;
			Short oCodMunic = null;

			/* Obtener la provincia y el municipio de la entidad */

			if (oEntidad != null) {
				oCodProvi = oEntidad.getCodProvi();
				oCodMunic = oEntidad.getCodMunic();
			}

			if (oCodProvi == null) {
				oCodProvi = Short.valueOf("0");
			}

			if (oCodMunic == null) {
				oCodMunic = Short.valueOf("0");
			}

			/* Calcular la emisora */

			String sEmisora = Formateador.numero(oCodProvi, true, 2)
					+ Formateador.numero(oCodMunic, true, 3)
					+ Utiles.digitoEmisora(Formateador.numero(oCodProvi, true, 2)
							+ Formateador.numero(oCodMunic, true, 3));

			// Se consulta el parámetrod del sistema 2003, que indica si se
			// generaran códigos de barras de la Autoliquidación o de la
			// Liquidación
			ParametroSistemaPK oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
					"es", Short.valueOf((short) 2003));
			ParametroSistema oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

			String sGenCodBarras = oParametroSistema.getValor();

			// Variable que marca si se generaran códigos de barras de la
			// Autoliquidación o de la Liquidación
			// dependiendo del parámetro del sistema
			boolean bGenCodBarLiquid = (sGenCodBarras != null)
					&& sGenCodBarras.equals("1");
			Calendar calFecLimit = null;
			Calendar calFecha = null;
			calFecha = Calendar.getInstance();
			calFecha.setTime(new java.sql.Date(new java.util.Date().getTime()));
			calFecha.set(Calendar.HOUR_OF_DAY, 0);
			calFecha.set(Calendar.MINUTE, 0);
			calFecha.set(Calendar.SECOND, 0);
			calFecha.set(Calendar.MILLISECOND, 0);

			calFecLimit = Calendar.getInstance();
			if (poRecibo.getFecLimit() != null) {
				calFecLimit.setTime(poRecibo.getFecLimit());
				calFecLimit.set(Calendar.HOUR_OF_DAY, 0);
				calFecLimit.set(Calendar.MINUTE, 0);
				calFecLimit.set(Calendar.SECOND, 0);
				calFecLimit.set(Calendar.MILLISECOND, 0);
			}

			/* Comprobar el tipo de la liquidación */
			if (poTipLiqui.equals(Short.valueOf("2")) && !bGenCodBarLiquid) { // CSB60
																				// Para
																				// Autoliquidación:
																				// MODALIDAD
																				// 3
				try {
					if (poRecibo.getFecLimit() == null) {
						oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
								"es", Short.valueOf((short) 105));
						oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

						String sNumeroDiasLimite = oParametroSistema.getValor();

						DiaHabil oDiaHabil = new DiaHabil();

						if (sNumeroDiasLimite != null
								&& sNumeroDiasLimite.length() > 0) {

							fFecFinPerio = oDiaHabil.getProximoDiaHabil(Fecha.truncar(Fecha.sumaDias(new Date(),
									Integer.valueOf(sNumeroDiasLimite).intValue())), aoDiaFesti);
						} else {
							fFecFinPerio = oDiaHabil.dameFechaHabil(
									poRecibo.getFecRecib(), false, 7, false, aoDiaFesti);
						}
					} else {
						/* Calcular la fecha de fin del período */
						oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
								"es", Short.valueOf((short) 9225));
						oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

						String sDiasEje = oParametroSistema.getValor();

						DiaHabil oDiaHabil = new DiaHabil();
						if (calFecLimit.compareTo(calFecha) < 0) {
							fFecFinPerio = oDiaHabil.dameFechaHabil(
									poRecibo.getFecLimit(), false, Integer.valueOf(
											sDiasEje).intValue(), false, aoDiaFesti);
						} else {
							fFecFinPerio = poRecibo.getFecLimit();
						}
					}
				} catch (Exception ex) {
					throw new CtrError(ex);
				}

				int iNumero = new BigInteger(Formateador.numero(
						(this.getCodCSB60(poRecibo) != null ? this
								.getCodCSB60(poRecibo) : Short.valueOf("0")), true,
						3)
						+ "4"
						+ Formateador.numero((psNumAutol != null ? psNumAutol
								: ""), true, 8))
						.add(new BigInteger(sEmisora))
						.mod(new BigInteger("7")).intValue();

				String sDigConJusti = iNumero == 0 ? "7" : Integer
						.toString(iNumero);

				String sReferencia = Formateador.numero(poRecibo.getNumRecib(),
						true, 10)
						+ Utiles.CtrReferenciaRecibo60(
								sEmisora,
								Formateador.numero(
										(poRecibo.getNumRecib() != null ? poRecibo
												.getNumRecib() : Integer.valueOf(
												"0")), true, 10),
								Formateador.numero(
										(this.getCodCSB60(poRecibo) != null ? this
												.getCodCSB60(poRecibo)
												: Short.valueOf("0")), true, 3)
										+ "4"
										+ Formateador
												.numero((psNumAutol != null ? psNumAutol
														: ""), true, 8)
										+ sDigConJusti, poTotLiqui);

				String sCodBarCsb = "90523"
						+ sEmisora
						+ sReferencia
						+ Formateador
								.numero((this.getCodCSB60(poRecibo) != null ? this
										.getCodCSB60(poRecibo) : Short.valueOf("0")),
										true, 3)
						+ "4"
						+ Formateador.numero((psNumAutol != null ? psNumAutol
								: ""), true, 8) + sDigConJusti;

				return sCodBarCsb;

			} else { // CSB60 Para Liquidación: MODALIDAD 2

				if (poRecibo.getFecLimit() == null) {
					oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
							"es", Short.valueOf((short) 105));
					oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);
					String sNumeroDiasLimite = oParametroSistema.getValor();

					DiaHabil oDiaHabil = new DiaHabil();

					if (sNumeroDiasLimite != null
							&& sNumeroDiasLimite.length() > 0) {
						try {
							fFecFinPerio = oDiaHabil.getProximoDiaHabil(Fecha.truncar(Fecha.sumaDias(new Date(),
									Integer.valueOf(sNumeroDiasLimite).intValue())), aoDiaFesti);
						} catch (NumberFormatException e) {
							e.printStackTrace();
						}
					} else {
						fFecFinPerio = oDiaHabil.dameFechaHabil(
								poRecibo.getFecRecib(), false, 7, false, aoDiaFesti);
					}
				} else {
					oParametroSistemaPk = new ParametroSistemaPK(Long.valueOf((long) 1), Long.valueOf((long) 0),
							"es", Short.valueOf((short) 9225));
					oParametroSistema = parametroSistemaService.findById(oParametroSistemaPk);

					String sDiasEje = oParametroSistema.getValor();
					DiaHabil oDiaHabil = new DiaHabil();
					if (calFecLimit.compareTo(calFecha) < 0) {
						fFecFinPerio = oDiaHabil.dameFechaHabil(
								poRecibo.getFecRecib(), false, Integer.valueOf(
										sDiasEje).intValue(), false, aoDiaFesti);
					} else {
						fFecFinPerio = poRecibo.getFecLimit();
					}
				}

				String sIdentificacion = "1"
						+ Formateador
								.numero((this.getCodCSB60(poRecibo) != null ? this
										.getCodCSB60(poRecibo) : Short.valueOf("0")),
										true, 3)
						+ Formateador.numero(
								Integer.valueOf(
										(poRecibo.getEjeRecib() == null ? 0
												: poRecibo.getEjeRecib()
														.intValue()) % 100),
								true, 2)
						+ Formateador.numero(
								Integer.valueOf(Fecha
										.devuelveAnoNumero(fFecFinPerio) % 10),
								true, 1)
						+ Formateador.numero(
								Integer.valueOf(Fecha
										.devuelveDiaJuliana(fFecFinPerio)),
								true, 3);

				String sReferencia = Formateador.numero(
						Integer.valueOf((poRecibo.getEjeRecib() == null ? 0
								: poRecibo.getEjeRecib().intValue()) % 100),
						true, 2)
						+ Formateador.numero(poRecibo.getNumRecib(), true, 8)
						+ Utiles.CtrReferenciaRecibo60(
								sEmisora,
								Formateador.numero(
										Integer.valueOf(
												(poRecibo.getEjeRecib() == null ? 0
														: poRecibo
																.getEjeRecib()
																.intValue()) % 100),
										true, 2)
										+ Formateador.numero(
												poRecibo.getNumRecib(), true, 8),
								sIdentificacion, poTotLiqui);

				String sCodBarCsb = "90521"
						+ sEmisora
						+ sReferencia
						+ sIdentificacion
						+ Formateador.numero(Integer.valueOf(poTotLiqui
								.movePointRight(2).intValue()), true, 8) + "0";

				return sCodBarCsb;
			}
		}

		return null;

	}

	public String getDCCBS(String sCodBarCsb) {
		return Utiles.ctrNum38(sCodBarCsb);
	}

	public Short getCodCSB60(ReciboCabecera poRecibo) throws CtrError {

		List<ImpuestoConcepto> aImpuestoConcepto = serviceImpuestoConcepto.findByIdImpue(poRecibo.getIdImpue());

		if (aImpuestoConcepto != null && !aImpuestoConcepto.isEmpty()) {
			Concepto oConcepto = serviceConcepto.findById(aImpuestoConcepto.get(0).getCodConce());
			if (oConcepto != null) {
				return oConcepto.getCodConCsb60();
			}
		}

		return Short.valueOf("73");
	}
}
