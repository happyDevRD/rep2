package com.greenaall.ge.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.ge.dto.PlazoDto;
import com.greenaall.models.ex.entity.TareaProcedimiento;
import com.greenaall.models.ex.entity.TareaTramiteExpediente;
import com.greenaall.models.ex.entity.enums.EnumTipoPlazoTarea;
import com.greenaall.models.ex.service.TareaProcedimientoServiceImpl;
import com.greenaall.models.ex.service.TareaTramiteExpedienteServiceImpl;
import com.greenaall.models.ge.entity.DiaFestivo;
import com.greenaall.models.ge.service.DiaFestivoServiceImpl;
import com.greenaall.util.DiaHabil;
import com.greenaall.util.Fecha;

/**
*
* @author jmmoyano
*/

@RestController
public class DiaFestivoController {
	
	@Autowired
	private DiaFestivoServiceImpl serviceDiaFestivo;
	
	@Autowired
	private TareaTramiteExpedienteServiceImpl serviceTareaTramiteExpediente;
	
	@Autowired
	private TareaProcedimientoServiceImpl serviceTareaProcedimiento;
	
	@GetMapping("diaFestivo/listar")
	public List<DiaFestivo> listar(){
		return (List<DiaFestivo>) serviceDiaFestivo.findAll();
	}
	
	@GetMapping("diaFestivo/plazo/{idTarea}")
	public PlazoDto plazo(@PathVariable Long idTarea){
		
		PlazoDto oPlazoDto = new PlazoDto();
		Date oFechaHoy = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
		String sAno = dateFormat.format(oFechaHoy);
		String fechaInicio = sAno + '/' + "01" + "/"+ "01";
		String fechaFin = sAno + '/' + "12" + "/"+ "31";
		String color = "VERDE";
		int dias = 0;
		TareaTramiteExpediente oTareaTramiteExp = serviceTareaTramiteExpediente.findById(idTarea);
		
		if(oTareaTramiteExp != null && oTareaTramiteExp.getFecInicio() != null) {
			
			TareaProcedimiento oTareaProcedimeinto = serviceTareaProcedimiento.findById(oTareaTramiteExp.getTareaProcedimiento());
			
			if(oTareaProcedimeinto != null && (oTareaProcedimeinto.getPlazo() == null || oTareaProcedimeinto.getPlazo() == null)) {
				throw new NoDataFoundException();
			}
			
			if(!oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.SINPLAZO)) {
				if(oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.SEMANAS)){
					dias = oTareaProcedimeinto.getPlazo() * 7;
				}else if(oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.MESES)) {
					dias = oTareaProcedimeinto.getPlazo() * 30;
				}else if(oTareaProcedimeinto.getTipoPlazo().equals(EnumTipoPlazoTarea.ANOS)) {
					dias = oTareaProcedimeinto.getPlazo() * 360;
				}
			}
	
			List<DiaFestivo> aDiaFestivo = serviceDiaFestivo.findByFecFesti(fechaInicio, fechaFin);
			
			if(aDiaFestivo != null && !aDiaFestivo.isEmpty()) {
				try {
					Date oFecha = new Date();
					oFecha = DiaHabil.dameFechaHabil(oTareaTramiteExp.getFecInicio(), false, dias, false, aDiaFestivo);
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					String fechaTope = sdf.format(oFecha);
					
					int diferencia = Fecha.diferenciaFechaDias(oFechaHoy, oFecha);
					
					if(diferencia >= 7 && diferencia <= 10) {
						color = "AMARILLO";
					}else if(diferencia < 7) {
						color = "ROJO";
					}
					oPlazoDto.setFecha(fechaTope);
					oPlazoDto.setColor(color);
					
				} catch (Exception e) {
					throw new NoDataFoundException();
				}
			}
			
		}else {
			throw new NoDataFoundException();
		}
		return oPlazoDto;
	}

}
