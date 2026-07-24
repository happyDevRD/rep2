package com.greenaall.util.fiscal;

import java.math.BigDecimal;

public class GestionFiscalConstantes {

	/**
	 * Constantes auxiliares
	 */
	public static final Short SHORT_CERO = Short.valueOf("0");
	public static final Short SHORT_UNO = Short.valueOf("1");
	public static final Integer INTEGER_CERO = Integer.valueOf("0");
	public static final Integer INTEGER_UNO = Integer.valueOf("1");
	public static final Long LONG_CERO = Long.valueOf("0");
	public static final Long LONG_UNO = Long.valueOf("1");
	public static final Double DOUBLE_CERO = Double.valueOf("0");
	public static final String STRING_UNO = "1";
	public static final BigDecimal BIGDECIMAL_CERO = new BigDecimal("0.00");
	public static final BigDecimal BIGDECIMAL_UNO = new BigDecimal("1.00");
	public static final BigDecimal BIGDECIMAL_CIEN = new BigDecimal("100.00");
	public static final String CADENA_VACIA = "";
	public static final String ESPACIO = " ";
	public static final String SI = "SI";
	public static final String NO = "NO";
	public static final String CERO = "0";
	public static final String UNO = "1";
	public static final String COMA = ",";
	public static final String PUNTO_COMA = ";";
	public static final String GUION_BAJO = "_";

	public static final Integer SIN_BONIFICACION = Integer.valueOf("0");
	public static final Integer EXENTO = Integer.valueOf("1");
	public static final Integer BONIFICADO = Integer.valueOf("2");

	/**
	 * MODULOS DE GESTION FISCAL
	 */
	public static final Short M_AGUA = Short.valueOf((short) 4);
	static public final Short M_VEHICULOS = Short.valueOf((short) 5);
	static public final Short M_PLUSVALIAS = Short.valueOf((short) 6);
	public static final Short M_TRIBUTOS = Short.valueOf((short) 7);
	public static final Short M_IAE = Short.valueOf((short) 9);
	static public final Short M_RECAUDACION = Short.valueOf((short) 10);
	static public final Short M_URBANISMO = Short.valueOf((short) 12);
	public static final Short M_URBANA = Short.valueOf((short) 13);
	public static final Short M_CEMENTERIO = Short.valueOf((short) 14);
	static public final Short M_RUSTICA = Short.valueOf((short) 16);
	static public final Short M_MULTAS = Short.valueOf((short) 17);
	public static final Short M_ELECTRICIDAD = Short.valueOf((short) 24);
	static public final Short M_GESTION_FISCAL = Short.valueOf((short) 34);

	/**
	 * FICHERO GENERICO CSB60
	 */
	public static final String FICHERO_GENERICO_CSB60 = "recibo.txt";

	/**
	 * CODIGOS DE MOVIMIENTO
	 */
	public static final String COD_MOVIMIENTO_TODOS = "TODOS";
	public static final String COD_MOVIMIENTO_ALTA = "A";
	public static final String COD_MOVIMIENTO_BAJA = "B";

	/**
	 * TIPO DE COBRO O FORMA DE PAGO. gf_recibo_cabecera.tip_cobro
	 */

	public static final Short TIP_COBRO_NO_PROCEDE = Short.valueOf("1");
	public static final Short TIP_COBRO_EFECTIVO = Short.valueOf("2");
	public static final Short TIP_COBRO_CHEQUE = Short.valueOf("3");
	public static final Short TIP_COBRO_TRANSFERENCIA = Short.valueOf("4");
	public static final Short TIP_COBRO_CAJERO_AUTOM = Short.valueOf("5");
	public static final Short TIP_COBRO_INTERNET = Short.valueOf("6");
	public static final Short TIP_COBRO_SIN_RECARGO = Short.valueOf("7");
	public static final Short TIP_COBRO_SIN_PASE_EJE = Short.valueOf("8");
	public static final Short TIP_COBRO_BANCO = Short.valueOf("9");
	public static final Short TIP_COBRO_COMPENSACION = Short.valueOf("10");

	/**
	 * TIPO DE EXACCION gf_recibo_cabecera.tip_exac
	 */
	public static final Short TIP_EXAC_RECIBO = Short.valueOf("1");
	public static final Short TIP_EXAC_LIQUIDACION = Short.valueOf("2");
	public static final Short TIP_EXAC_AUTOLIQUIDACION = Short.valueOf("3");

	/**
	 * TIPO DE ESTADO gf_autoliquidacion_internet.estado
	 */
	public static final Short TIP_NO_PROCESADO = Short.valueOf("1");
	public static final Short TIP_COBRADO = Short.valueOf("2");
	public static final Short TIP_ERROR_EN_COBRO = Short.valueOf("3");
	public static final Short PRO_UNICAJA = Short.valueOf("4");
	public static final Short CAN_USUARIO = Short.valueOf("5");
	public static final Short DES_USUARIO = Short.valueOf("6");

	/**
	 * SITUACION DE LA NOTIFICACION gf_notificacion.situacion
	 */
	public static final Short NOTIFICACION_GENERADA = Short.valueOf("1");
	public static final Short NOTIFICACION_ENVIADA = Short.valueOf("2");
	public static final Short NOTIFICACION_RECEPCIONADA = Short.valueOf("3");
	public static final Short NOTIFICACION_DEVUELTA = Short.valueOf("4");
	public static final Short NOTIFICACION_COBRADA = Short.valueOf("5");
	public static final Short NOTIFICACION_ANULADA = Short.valueOf("6");
	public static final Short NOTIFICACION_NOTIFICA_GENERADA = Short.valueOf("7");
	public static final Short NOTIFICACION_NOTIFICA_ENVIADA = Short.valueOf("8");
	public static final Short NOTIFICACION_CADUCADA = Short.valueOf("9");
	public static final Short NOTIFICACION_RECHAZADA = Short.valueOf("10");

	/**
	 * SITUACION BOP DE LA NOTIFICACION gf_notificacion.bop
	 */
	public static final Short NOTIFICACION_BOP_NA = Short.valueOf("0");
	public static final Short NOTIFICACION_BOP_ENVIADO = Short.valueOf("1");
	public static final Short NOTIFICACION_BOP_PUBLICADO = Short.valueOf("2");

	/**
	 * ESTADO DEL RECIBO gf_estado_recibo.est_recib
	 */
	public static final Short ESTADO_TODOS_EXCEPTO_PROVISIONAL = Short.valueOf("-1");
	public static final Short ESTADO_PROVISIONAL = Short.valueOf("1");
	public static final Short ESTADO_COBRO_ENTREGA_VOL = Short.valueOf("9");
	public static final Short ESTADO_ENTREGA_CUENTA_VOL = Short.valueOf("10");
	public static final Short ESTADO_ENTREGA_CUENTA_EJE = Short.valueOf("28");
	public static final Short ESTADO_COBRO_ENTREGA_EJE = Short.valueOf("34");

	/**
	 * SITUACION DEL ESTADO DEL RECIBO gf_estado_recibo.situacion
	 */
	public static final Short SITUACION_VOLUNTARIA = Short.valueOf("1");
	public static final Short SITUACION_EJECUTIVA = Short.valueOf("2");

	/**
	 * TIPO DE RECIBO gf_estado_recibo.tipo
	 */
	public static final Short TIP_ESTADO_PENDIENTE_COBRO = Short.valueOf("1");
	public static final Short TIP_ESTADO_COBRADO = Short.valueOf("2");
	public static final Short TIP_ESTADO_ANULADO = Short.valueOf("3");
	public static final Short TIP_ESTADO_TRANSITORIO = Short.valueOf("4");
	public static final Short TIP_ESTADO_COBRO_SIN_APLIC = Short.valueOf("5");

	/**
	 * Codigos de movimiento
	 */
	public static final String MOVIMIENTO_ALTA = "A";
	public static final String MOVIMIENTO_MODIFICACION = "M";
	public static final String MOVIMIENTO_BAJA = "B";

	/**
	 * ESTADO DEL PADRON gf_nombre_padron.est_padro
	 */
	public static final Short PADRON_PROVISIONAL = Short.valueOf("0");
	public static final Short PADRON_DEFINITIVO = Short.valueOf("1");
	public static final Short PADRON_PARCIALMENTE_CARGADO_VOLUNTARIA = Short.valueOf("2");
	public static final Short PADRON_CARGADO_VOLUNTARIA = Short.valueOf("3");
	public static final Short PADRON_CARGADO_EJECUTIVA = Short.valueOf("4");
	public static final Short PADRON_PARCIALMENTE_CARGADO_EJECUTIVA = Short.valueOf("5");

	/**
	 * TIPO DE PADRON gf_nombre_padron.tip_padro
	 */
	public static final Short TIP_PADRO_PADRON = Short.valueOf("0");
	public static final Short TIP_PADRO_LIQ_DIRECTA = Short.valueOf("1");
	public static final Short TIP_PADRO_LIQ_ESPECIFICA = Short.valueOf("2");

	/**
	 * TIPO DE LIQUIDACION. Estos valores son usados en varias tablas
	 */
	public static final Short TIP_LIQUI_LIQUIDACION = Short.valueOf("1");
	public static final Short TIP_LIQUI_AUTOLIQUIDACION = Short.valueOf("2");
	public static final Short TIP_LIQUI_COMPLEMENTARIA = Short.valueOf("3");

	/**
	 * TIPO DE CÃLCULO DEL CONCEPTO DEL IMPUESTO / TARIFA
	 * gf_impuesto_concepto.tip_calcu, gf_obj_tri_conce.tip_calcu,
	 * gf_tarifa_concepto.tip_calcu y ag_tarifa_concepto.tip_calcu
	 */
	public static final Short TIP_CALCU_CALCULADO = Short.valueOf("0");
	public static final Short TIP_CALCU_FIJO = Short.valueOf("1");
	public static final Short TIP_CALCU_ESPECIFICAR = TIP_CALCU_FIJO;
	public static final Short TIP_CALCU_FORMULA = Short.valueOf("2");
	public static final Short TIP_CALCU_PROGRAMA_CALCULO = Short.valueOf("3");
	// El tipo de cÃ¡lculo BLOQUE es Ãºnicamente para los conceptos de las tarifas
	// del mÃ³dulo de AGUA
	public static final Short TIP_CALCU_BLOQUE = Short.valueOf("4");

	/**
	 * TIPO DE SUJETO gf_obj_tri_conce.tip_sujet
	 */
	public static final Short TIP_SUJET_PASIVO_PROPIETARIO = Short.valueOf("1");
	public static final Short TIP_SUJET_OTRO = Short.valueOf("2");

	/**
	 * DATOS PARA GENERAR LIQUIDACIONES: TIPO DE COEFICIENTE
	 */
	public static final Short TIP_COEF_LIQUI_CORRECTOR = Short.valueOf("1");
	public static final Short TIP_COEF_LIQUI_PONDERACION = Short.valueOf("2");

	/**
	 * INDICADOR DEL TIPO DE APLICACIÃ“N AplicaciÃ³n Fiscal del Enlace Contable
	 * gf_aplicacion_fiscal.ind_tip_aplic
	 */
	public static final Short IND_TIP_APLIC_PROVISIONAL = Short.valueOf("1");
	public static final Short IND_TIP_APLIC_DEFINITIVO = Short.valueOf("2");

	/**
	 * INDICADOR DEL AREA DE LA APLICACIÃ“N AplicaciÃ³n Fiscal del Enlace Contable
	 * gf_aplicacion_fiscal.ind_area
	 */
	public static final Short IND_AREA_INGRESOS = Short.valueOf("1");
	public static final Short IND_AREA_GASTOS = Short.valueOf("2");
	public static final Short IND_AREA_NO_PRESUPUESTARIA = Short.valueOf("3");

	/**
	 * INDICADOR DE AGRUPACIÃ“N DE LA APLICACIÃ“N AplicaciÃ³n Fiscal del Enlace
	 * Contable gf_aplicacion_fiscal.ind_agrup
	 */
	public static final Short IND_AGRUP_SIN_AGRUPACION = Short.valueOf("0");
	public static final Short IND_AGRUP_CORRIENTES = Short.valueOf("1");
	public static final Short IND_AGRUP_CERRADOS = Short.valueOf("2");
	public static final Short IND_AGRUP_EJE_POSTERIORES = Short.valueOf("3");

	/**
	 * INDICADOR DE AGRUPACIÃ“N DE LA APLICACIÃ“N AplicaciÃ³n Fiscal del Enlace
	 */
	public static final Short TIPO_OBJETO_PERSONA = Short.valueOf("1");
	public static final Short TIPO_OBJETO_DOMICILIO = Short.valueOf("2");
	public static final Short TIPO_OBJETO_USUARIO = Short.valueOf("3");
	public static final Short TIPO_OBJETO_RESERVADO = Short.valueOf("4");

	/**
	 * INDICADOR DE TIPO DE OPERACIÃ“N
	 */
	public static final Short TIP_OPERA_TRANSITORIO = Short.valueOf("7");
	public static final Short TIP_OPERA_OTRAS = Short.valueOf("8");

	/**
	 * INDICADOR DE TIPO DE EXPEDICIÃ“N
	 */
	public static final Short TIP_EXPED_CARTA_CORTE = Short.valueOf("8");

	/**
	 * FORMA DE NOTIFICACIÃ“N
	 */
	public static final Short NOTIFICACION_PAPEL = Short.valueOf("0");
	public static final Short NOTIFICACION_TELEMATICA = Short.valueOf("1");
}

