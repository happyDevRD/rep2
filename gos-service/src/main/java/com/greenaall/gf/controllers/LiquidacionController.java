package com.greenaall.gf.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.ge.dto.Etiquetas;
import com.greenaall.ge.util.ArchivoValide;
import com.greenaall.gf.liquidacion.LiquidacionApplicationService;
import com.greenaall.models.ge.entity.ParametroSistema;
import com.greenaall.models.ge.entity.ParametroSistemaPK;
import com.greenaall.models.ge.service.IParametroSistemaService;
import com.greenaall.models.gf.entity.Liquidacion;
import com.greenaall.models.gf.service.LiquidacionServiceImpl;
import com.greenaall.util.ConvertirPDF;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class LiquidacionController {

	@Autowired
	private LiquidacionServiceImpl serviceLiquidacion;

	@Autowired
	private IParametroSistemaService parametroSistemaService;

	@Autowired
	private LiquidacionApplicationService liquidacionApplicationService;

	@PostMapping("/liquidacion/crear/{idTipObjTribu}/{idHisTipObjTribu}/{desObjTribu}")
	@ResponseStatus(HttpStatus.CREATED)
	public Liquidacion crear(@RequestBody Liquidacion oLiquidacion,
			@PathVariable Long idTipObjTribu, @PathVariable Long idHisTipObjTribu, @PathVariable String desObjTribu) {
		return liquidacionApplicationService.crear(oLiquidacion, idTipObjTribu, idHisTipObjTribu, desObjTribu);
	}

	@GetMapping("/liquidacion/liquidacionTributo/{idLqui}/{usuario}/{desObjTribu}")
	public void liquidacionTributo(@PathVariable Long idLqui, @PathVariable String usuario, 
			@PathVariable String desObjTribu, HttpServletResponse response) {

		Liquidacion oLiquidacion = serviceLiquidacion.findById(idLqui);
		String ruta = null;
		String tipoArchivo = "liq_tribu_es.sxw";

		if (oLiquidacion == null) {
			throw new NoDataFoundException();
		}

		Boolean fusion = null;
		Etiquetas oEtiquetas = liquidacionApplicationService.getEtiquetas(oLiquidacion, usuario, desObjTribu);

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
		
		String rutaPdf = ConvertirPDF.convertirPDF(ruta, ".sxw");

		try {
			File file = new File(rutaPdf);
			FileInputStream fis;
			fis = new FileInputStream(file);
			response.setContentType("application/force-download");
			response.addHeader("Content-disposition", "attachment;fileName=" + "liq_tribu_es.pdf");
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

}
