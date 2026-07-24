package com.greenaall.ge.dto;

import java.io.Serializable;

public class Etiquetas implements Serializable {

	private static final long serialVersionUID = -4873733466026739220L;

	// Comunes
	private String nomAyto;
	private String usuario;
	private String departamento;
	private String ciudad;
	private String cpAyto;
	private String domAyto;
	private String ttoAyto;
	private String nomAlcal;
	private String nomSecre;
	private String nomIntev;
	private String nomTesor;
	private String firma01;
	private String firma02;
	private String firma03;
	private String firma04;
	private String firma05;
	private String firma06;
	private String fecEmisi;
	private String diaEmisi;
	private String diaSemEmisi;
	private String mesEmisi;
	private String anoEmisi;
	private String fecha;
	private String fecDiaNumer;
	private String fecMesNumer;
	private String fecAnoNumer;
	private String fecAnoDosDigit;
	private String fecDiaLetra;
	private String fecMesLetra;
	private String fecAnoLetra;

	// Expedientes
	private String desProce;
	private String desExped;
	private String desTarea;
	private String desFase;
	private String ejeExped;
	private String numExped;

	// Interesado
	private String nomInter;
	private String numDocInter;
	private String domInter;
	private String copInter;
	private String proInter;
	private String munInter;

	// Representante
	private String nomRepre;
	private String numDocRepre;
	private String domRepre;
	private String copRepre;
	private String proRepre;
	private String munRepre;

	// Atributos
	private String etiAtr01;
	private String valAtr01;
	private String etiAtr02;
	private String valAtr02;
	private String etiAtr03;
	private String valAtr03;
	private String etiAtr04;
	private String valAtr04;
	private String etiAtr05;
	private String valAtr05;
	private String etiAtr06;
	private String valAtr06;
	private String etiAtr07;
	private String valAtr07;
	private String etiAtr08;
	private String valAtr08;
	private String etiAtr09;
	private String valAtr09;
	private String etiAtr10;
	private String valAtr10;
	
	// volante de empadronamiento
	private String nombreCompleto;
	private String numDocum;
	private String desMunNacim;
	private String domicilio;
	private String fecPadro;
	
	// Certificado de deuda
	private String contribuyente;
	private String ejeRecib000;
	private String ejeRecib001;
	private String ejeRecib002;
	private String ejeRecib003;
	private String ejeRecib004;
	private String ejeRecib005;
	private String numRecib000;
	private String numRecib001;
	private String numRecib002;
	private String numRecib003;
	private String numRecib004;
	private String numRecib005;
	private String desObjTribu000;
	private String desObjTribu001;
	private String desObjTribu002;
	private String desObjTribu003;
	private String desObjTribu004;
	private String desObjTribu005;
	private String impRecibo000;
	private String impRecibo001;
	private String impRecibo002;
	private String impRecibo003;
	private String impRecibo004;
	private String impRecibo005;
	private String totalImporte;
	
	//Liquidacion
	private String perImpos;
	private String ejeLiqui;
	private String numLiqui;
	private String codBarCsb;
	private String carConLiqui;
	private String dniPropi;
	private String nomPropi;
	private String domPropi;
	private String cpPropi;
	private String pobPropi;
	private String proPropi;
	private String dniRepre;
	private String cpRepre;
	private String pobRepre;
	private String cuoLiqui;
	private String impBonLiqui;
	private String impSanci;
	private String impVario;
	private String intDemor;
	private String totLiqui;
	private String fecLiqui;
	private String desObjTribu;
	private String desCon001;
	private String impCon0001;
	private String observaciones;
	private String emisora;
	private String referencia;
	private String identificacion;
	
	public String getNomAyto() {
		return nomAyto;
	}

	public void setNomAyto(String nomAyto) {
		this.nomAyto = nomAyto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCpAyto() {
		return cpAyto;
	}

	public void setCpAyto(String cpAyto) {
		this.cpAyto = cpAyto;
	}

	public String getDomAyto() {
		return domAyto;
	}

	public void setDomAyto(String domAyto) {
		this.domAyto = domAyto;
	}

	public String getTtoAyto() {
		return ttoAyto;
	}

	public void setTtoAyto(String ttoAyto) {
		this.ttoAyto = ttoAyto;
	}

	public String getNomAlcal() {
		return nomAlcal;
	}

	public void setNomAlcal(String nomAlcal) {
		this.nomAlcal = nomAlcal;
	}

	public String getNomSecre() {
		return nomSecre;
	}

	public void setNomSecre(String nomSecre) {
		this.nomSecre = nomSecre;
	}

	public String getNomIntev() {
		return nomIntev;
	}

	public void setNomIntev(String nomIntev) {
		this.nomIntev = nomIntev;
	}

	public String getNomTesor() {
		return nomTesor;
	}

	public void setNomTesor(String nomTesor) {
		this.nomTesor = nomTesor;
	}

	public String getFirma01() {
		return firma01;
	}

	public void setFirma01(String firma01) {
		this.firma01 = firma01;
	}

	public String getFirma02() {
		return firma02;
	}

	public void setFirma02(String firma02) {
		this.firma02 = firma02;
	}

	public String getFirma03() {
		return firma03;
	}

	public void setFirma03(String firma03) {
		this.firma03 = firma03;
	}

	public String getFirma04() {
		return firma04;
	}

	public void setFirma04(String firma04) {
		this.firma04 = firma04;
	}

	public String getFirma05() {
		return firma05;
	}

	public void setFirma05(String firma05) {
		this.firma05 = firma05;
	}

	public String getFirma06() {
		return firma06;
	}

	public void setFirma06(String firma06) {
		this.firma06 = firma06;
	}

	public String getFecEmisi() {
		return fecEmisi;
	}

	public void setFecEmisi(String fecEmisi) {
		this.fecEmisi = fecEmisi;
	}

	public String getDiaEmisi() {
		return diaEmisi;
	}

	public void setDiaEmisi(String diaEmisi) {
		this.diaEmisi = diaEmisi;
	}

	public String getDiaSemEmisi() {
		return diaSemEmisi;
	}

	public void setDiaSemEmisi(String diaSemEmisi) {
		this.diaSemEmisi = diaSemEmisi;
	}

	public String getMesEmisi() {
		return mesEmisi;
	}

	public void setMesEmisi(String mesEmisi) {
		this.mesEmisi = mesEmisi;
	}

	public String getAnoEmisi() {
		return anoEmisi;
	}

	public void setAnoEmisi(String anoEmisi) {
		this.anoEmisi = anoEmisi;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getFecDiaNumer() {
		return fecDiaNumer;
	}

	public void setFecDiaNumer(String fecDiaNumer) {
		this.fecDiaNumer = fecDiaNumer;
	}

	public String getFecMesNumer() {
		return fecMesNumer;
	}

	public void setFecMesNumer(String fecMesNumer) {
		this.fecMesNumer = fecMesNumer;
	}

	public String getFecAnoNumer() {
		return fecAnoNumer;
	}

	public void setFecAnoNumer(String fecAnoNumer) {
		this.fecAnoNumer = fecAnoNumer;
	}

	public String getFecAnoDosDigit() {
		return fecAnoDosDigit;
	}

	public void setFecAnoDosDigit(String fecAnoDosDigit) {
		this.fecAnoDosDigit = fecAnoDosDigit;
	}

	public String getFecDiaLetra() {
		return fecDiaLetra;
	}

	public void setFecDiaLetra(String fecDiaLetra) {
		this.fecDiaLetra = fecDiaLetra;
	}

	public String getFecMesLetra() {
		return fecMesLetra;
	}

	public void setFecMesLetra(String fecMesLetra) {
		this.fecMesLetra = fecMesLetra;
	}

	public String getFecAnoLetra() {
		return fecAnoLetra;
	}

	public void setFecAnoLetra(String fecAnoLetra) {
		this.fecAnoLetra = fecAnoLetra;
	}

	public String getDesProce() {
		return desProce;
	}

	public void setDesProce(String desProce) {
		this.desProce = desProce;
	}

	public String getDesExped() {
		return desExped;
	}

	public void setDesExped(String desExped) {
		this.desExped = desExped;
	}

	public String getDesTarea() {
		return desTarea;
	}

	public void setDesTarea(String desTarea) {
		this.desTarea = desTarea;
	}

	public String getDesFase() {
		return desFase;
	}

	public void setDesFase(String desFase) {
		this.desFase = desFase;
	}

	public String getEjeExped() {
		return ejeExped;
	}

	public void setEjeExped(String ejeExped) {
		this.ejeExped = ejeExped;
	}

	public String getNumExped() {
		return numExped;
	}

	public void setNumExped(String numExped) {
		this.numExped = numExped;
	}

	public String getNomInter() {
		return nomInter;
	}

	public void setNomInter(String nomInter) {
		this.nomInter = nomInter;
	}

	public String getNumDocInter() {
		return numDocInter;
	}

	public void setNumDocInter(String numDocInter) {
		this.numDocInter = numDocInter;
	}

	public String getDomInter() {
		return domInter;
	}

	public void setDomInter(String domInter) {
		this.domInter = domInter;
	}

	public String getCopInter() {
		return copInter;
	}

	public void setCopInter(String copInter) {
		this.copInter = copInter;
	}

	public String getProInter() {
		return proInter;
	}

	public void setProInter(String proInter) {
		this.proInter = proInter;
	}

	public String getMunInter() {
		return munInter;
	}

	public void setMunInter(String munInter) {
		this.munInter = munInter;
	}

	public String getNomRepre() {
		return nomRepre;
	}

	public void setNomRepre(String nomRepre) {
		this.nomRepre = nomRepre;
	}

	public String getNumDocRepre() {
		return numDocRepre;
	}

	public void setNumDocRepre(String numDocRepre) {
		this.numDocRepre = numDocRepre;
	}

	public String getDomRepre() {
		return domRepre;
	}

	public void setDomRepre(String domRepre) {
		this.domRepre = domRepre;
	}

	public String getCopRepre() {
		return copRepre;
	}

	public void setCopRepre(String copRepre) {
		this.copRepre = copRepre;
	}

	public String getProRepre() {
		return proRepre;
	}

	public void setProRepre(String proRepre) {
		this.proRepre = proRepre;
	}

	public String getMunRepre() {
		return munRepre;
	}

	public void setMunRepre(String munRepre) {
		this.munRepre = munRepre;
	}

	public String getEtiAtr01() {
		return etiAtr01;
	}

	public void setEtiAtr01(String etiAtr01) {
		this.etiAtr01 = etiAtr01;
	}

	public String getValAtr01() {
		return valAtr01;
	}

	public void setValAtr01(String valAtr01) {
		this.valAtr01 = valAtr01;
	}

	public String getEtiAtr02() {
		return etiAtr02;
	}

	public void setEtiAtr02(String etiAtr02) {
		this.etiAtr02 = etiAtr02;
	}

	public String getValAtr02() {
		return valAtr02;
	}

	public void setValAtr02(String valAtr02) {
		this.valAtr02 = valAtr02;
	}

	public String getEtiAtr03() {
		return etiAtr03;
	}

	public void setEtiAtr03(String etiAtr03) {
		this.etiAtr03 = etiAtr03;
	}

	public String getValAtr03() {
		return valAtr03;
	}

	public void setValAtr03(String valAtr03) {
		this.valAtr03 = valAtr03;
	}

	public String getEtiAtr04() {
		return etiAtr04;
	}

	public void setEtiAtr04(String etiAtr04) {
		this.etiAtr04 = etiAtr04;
	}

	public String getValAtr04() {
		return valAtr04;
	}

	public void setValAtr04(String valAtr04) {
		this.valAtr04 = valAtr04;
	}

	public String getEtiAtr05() {
		return etiAtr05;
	}

	public void setEtiAtr05(String etiAtr05) {
		this.etiAtr05 = etiAtr05;
	}

	public String getValAtr05() {
		return valAtr05;
	}

	public void setValAtr05(String valAtr05) {
		this.valAtr05 = valAtr05;
	}

	public String getEtiAtr06() {
		return etiAtr06;
	}

	public void setEtiAtr06(String etiAtr06) {
		this.etiAtr06 = etiAtr06;
	}

	public String getValAtr06() {
		return valAtr06;
	}

	public void setValAtr06(String valAtr06) {
		this.valAtr06 = valAtr06;
	}

	public String getEtiAtr07() {
		return etiAtr07;
	}

	public void setEtiAtr07(String etiAtr07) {
		this.etiAtr07 = etiAtr07;
	}

	public String getValAtr07() {
		return valAtr07;
	}

	public void setValAtr07(String valAtr07) {
		this.valAtr07 = valAtr07;
	}

	public String getEtiAtr08() {
		return etiAtr08;
	}

	public void setEtiAtr08(String etiAtr08) {
		this.etiAtr08 = etiAtr08;
	}

	public String getValAtr08() {
		return valAtr08;
	}

	public void setValAtr08(String valAtr08) {
		this.valAtr08 = valAtr08;
	}

	public String getEtiAtr09() {
		return etiAtr09;
	}

	public void setEtiAtr09(String etiAtr09) {
		this.etiAtr09 = etiAtr09;
	}

	public String getValAtr09() {
		return valAtr09;
	}

	public void setValAtr09(String valAtr09) {
		this.valAtr09 = valAtr09;
	}

	public String getEtiAtr10() {
		return etiAtr10;
	}

	public void setEtiAtr10(String etiAtr10) {
		this.etiAtr10 = etiAtr10;
	}

	public String getValAtr10() {
		return valAtr10;
	}

	public void setValAtr10(String valAtr10) {
		this.valAtr10 = valAtr10;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getNumDocum() {
		return numDocum;
	}

	public void setNumDocum(String numDocum) {
		this.numDocum = numDocum;
	}

	public String getDesMunNacim() {
		return desMunNacim;
	}

	public void setDesMunNacim(String desMunNacim) {
		this.desMunNacim = desMunNacim;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getFecPadro() {
		return fecPadro;
	}

	public void setFecPadro(String fecPadro) {
		this.fecPadro = fecPadro;
	}

	public String getContribuyente() {
		return contribuyente;
	}

	public void setContribuyente(String contribuyente) {
		this.contribuyente = contribuyente;
	}

	public String getEjeRecib000() {
		return ejeRecib000;
	}

	public void setEjeRecib000(String ejeRecib000) {
		this.ejeRecib000 = ejeRecib000;
	}

	public String getEjeRecib001() {
		return ejeRecib001;
	}

	public void setEjeRecib001(String ejeRecib001) {
		this.ejeRecib001 = ejeRecib001;
	}

	public String getEjeRecib002() {
		return ejeRecib002;
	}

	public void setEjeRecib002(String ejeRecib002) {
		this.ejeRecib002 = ejeRecib002;
	}

	public String getEjeRecib003() {
		return ejeRecib003;
	}

	public void setEjeRecib003(String ejeRecib003) {
		this.ejeRecib003 = ejeRecib003;
	}

	public String getEjeRecib004() {
		return ejeRecib004;
	}

	public void setEjeRecib004(String ejeRecib004) {
		this.ejeRecib004 = ejeRecib004;
	}

	public String getEjeRecib005() {
		return ejeRecib005;
	}

	public void setEjeRecib005(String ejeRecib005) {
		this.ejeRecib005 = ejeRecib005;
	}

	public String getNumRecib000() {
		return numRecib000;
	}

	public void setNumRecib000(String numRecib000) {
		this.numRecib000 = numRecib000;
	}

	public String getNumRecib001() {
		return numRecib001;
	}

	public void setNumRecib001(String numRecib001) {
		this.numRecib001 = numRecib001;
	}

	public String getNumRecib002() {
		return numRecib002;
	}

	public void setNumRecib002(String numRecib002) {
		this.numRecib002 = numRecib002;
	}

	public String getNumRecib003() {
		return numRecib003;
	}

	public void setNumRecib003(String numRecib003) {
		this.numRecib003 = numRecib003;
	}

	public String getNumRecib004() {
		return numRecib004;
	}

	public void setNumRecib004(String numRecib004) {
		this.numRecib004 = numRecib004;
	}

	public String getNumRecib005() {
		return numRecib005;
	}

	public void setNumRecib005(String numRecib005) {
		this.numRecib005 = numRecib005;
	}

	public String getDesObjTribu000() {
		return desObjTribu000;
	}

	public void setDesObjTribu000(String desObjTribu000) {
		this.desObjTribu000 = desObjTribu000;
	}

	public String getDesObjTribu001() {
		return desObjTribu001;
	}

	public void setDesObjTribu001(String desObjTribu001) {
		this.desObjTribu001 = desObjTribu001;
	}

	public String getDesObjTribu002() {
		return desObjTribu002;
	}

	public void setDesObjTribu002(String desObjTribu002) {
		this.desObjTribu002 = desObjTribu002;
	}

	public String getDesObjTribu003() {
		return desObjTribu003;
	}

	public void setDesObjTribu003(String desObjTribu003) {
		this.desObjTribu003 = desObjTribu003;
	}

	public String getDesObjTribu004() {
		return desObjTribu004;
	}

	public void setDesObjTribu004(String desObjTribu004) {
		this.desObjTribu004 = desObjTribu004;
	}

	public String getDesObjTribu005() {
		return desObjTribu005;
	}

	public void setDesObjTribu005(String desObjTribu005) {
		this.desObjTribu005 = desObjTribu005;
	}

	public String getImpRecibo000() {
		return impRecibo000;
	}

	public void setImpRecibo000(String impRecibo000) {
		this.impRecibo000 = impRecibo000;
	}

	public String getImpRecibo001() {
		return impRecibo001;
	}

	public void setImpRecibo001(String impRecibo001) {
		this.impRecibo001 = impRecibo001;
	}

	public String getImpRecibo002() {
		return impRecibo002;
	}

	public void setImpRecibo002(String impRecibo002) {
		this.impRecibo002 = impRecibo002;
	}

	public String getImpRecibo003() {
		return impRecibo003;
	}

	public void setImpRecibo003(String impRecibo003) {
		this.impRecibo003 = impRecibo003;
	}

	public String getImpRecibo004() {
		return impRecibo004;
	}

	public void setImpRecibo004(String impRecibo004) {
		this.impRecibo004 = impRecibo004;
	}

	public String getImpRecibo005() {
		return impRecibo005;
	}

	public void setImpRecibo005(String impRecibo005) {
		this.impRecibo005 = impRecibo005;
	}

	public String getTotalImporte() {
		return totalImporte;
	}

	public void setTotalImporte(String totalImporte) {
		this.totalImporte = totalImporte;
	}

	public String getPerImpos() {
		return perImpos;
	}

	public void setPerImpos(String perImpos) {
		this.perImpos = perImpos;
	}

	public String getEjeLiqui() {
		return ejeLiqui;
	}

	public void setEjeLiqui(String ejeLiqui) {
		this.ejeLiqui = ejeLiqui;
	}

	public String getNumLiqui() {
		return numLiqui;
	}

	public void setNumLiqui(String numLiqui) {
		this.numLiqui = numLiqui;
	}

	public String getCodBarCsb() {
		return codBarCsb;
	}

	public void setCodBarCsb(String codBarCsb) {
		this.codBarCsb = codBarCsb;
	}

	public String getDniPropi() {
		return dniPropi;
	}

	public void setDniPropi(String dniPropi) {
		this.dniPropi = dniPropi;
	}

	public String getNomPropi() {
		return nomPropi;
	}

	public void setNomPropi(String nomPropi) {
		this.nomPropi = nomPropi;
	}

	public String getDomPropi() {
		return domPropi;
	}

	public void setDomPropi(String domPropi) {
		this.domPropi = domPropi;
	}

	public String getCpPropi() {
		return cpPropi;
	}

	public void setCpPropi(String cpPropi) {
		this.cpPropi = cpPropi;
	}

	public String getPobPropi() {
		return pobPropi;
	}

	public void setPobPropi(String pobPropi) {
		this.pobPropi = pobPropi;
	}

	public String getProPropi() {
		return proPropi;
	}

	public void setProPropi(String proPropi) {
		this.proPropi = proPropi;
	}

	public String getDniRepre() {
		return dniRepre;
	}

	public void setDniRepre(String dniRepre) {
		this.dniRepre = dniRepre;
	}

	public String getCpRepre() {
		return cpRepre;
	}

	public void setCpRepre(String cpRepre) {
		this.cpRepre = cpRepre;
	}

	public String getPobRepre() {
		return pobRepre;
	}

	public void setPobRepre(String pobRepre) {
		this.pobRepre = pobRepre;
	}

	public String getCuoLiqui() {
		return cuoLiqui;
	}

	public void setCuoLiqui(String cuoLiqui) {
		this.cuoLiqui = cuoLiqui;
	}

	public String getImpBonLiqui() {
		return impBonLiqui;
	}

	public void setImpBonLiqui(String impBonLiqui) {
		this.impBonLiqui = impBonLiqui;
	}

	public String getImpSanci() {
		return impSanci;
	}

	public void setImpSanci(String impSanci) {
		this.impSanci = impSanci;
	}

	public String getImpVario() {
		return impVario;
	}

	public void setImpVario(String impVario) {
		this.impVario = impVario;
	}

	public String getIntDemor() {
		return intDemor;
	}

	public void setIntDemor(String intDemor) {
		this.intDemor = intDemor;
	}

	public String getTotLiqui() {
		return totLiqui;
	}

	public void setTotLiqui(String totLiqui) {
		this.totLiqui = totLiqui;
	}

	public String getFecLiqui() {
		return fecLiqui;
	}

	public void setFecLiqui(String fecLiqui) {
		this.fecLiqui = fecLiqui;
	}

	public String getDesObjTribu() {
		return desObjTribu;
	}

	public void setDesObjTribu(String desObjTribu) {
		this.desObjTribu = desObjTribu;
	}

	public String getDesCon001() {
		return desCon001;
	}

	public void setDesCon001(String desCon001) {
		this.desCon001 = desCon001;
	}

	public String getImpCon0001() {
		return impCon0001;
	}

	public void setImpCon0001(String impCon0001) {
		this.impCon0001 = impCon0001;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getCarConLiqui() {
		return carConLiqui;
	}

	public void setCarConLiqui(String carConLiqui) {
		this.carConLiqui = carConLiqui;
	}

	public String getEmisora() {
		return emisora;
	}

	public void setEmisora(String emisora) {
		this.emisora = emisora;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
}
