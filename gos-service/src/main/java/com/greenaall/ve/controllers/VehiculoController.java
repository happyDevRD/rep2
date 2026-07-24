package com.greenaall.ve.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.greenaall.exception.NoDataFoundException;
import com.greenaall.models.pe.entity.PersonaEntidad;
import com.greenaall.models.pe.entity.PersonaEntidadPK;
import com.greenaall.models.pe.service.PersonaEntidadServiceImpl;
import com.greenaall.models.te.entity.Municipio;
import com.greenaall.models.te.entity.MunicipioPK;
import com.greenaall.models.te.entity.Provincia;
import com.greenaall.models.te.service.MunicipioServiceImpl;
import com.greenaall.models.te.service.ProvinciaServiceImpl;
import com.greenaall.models.ve.entity.MarcaModelo;
import com.greenaall.models.ve.entity.Vehiculo;
import com.greenaall.models.ve.service.IVehiculoService;
import com.greenaall.models.ve.service.MarcaModeloServiceImpl;
import com.greenaall.pe.dto.PersonaEntidadDto;
import com.greenaall.pe.util.PersonaEntidadValide;
import com.greenaall.ve.dto.VehiculoDto;

@RestController
public class VehiculoController {

	@Autowired
	private IVehiculoService vehiculoService;
	
	@Autowired
	private PersonaEntidadServiceImpl servicePersonaEntidad;
	
	@Autowired
	private ProvinciaServiceImpl serviceProvincia;

	@Autowired
	private MunicipioServiceImpl serviceMuncipio;
	
	@Autowired
	private MarcaModeloServiceImpl serviceMarcaModelo;
	
	@GetMapping("/vehiculo/ver/{matricula}")
	public VehiculoDto detalle(@PathVariable String matricula){
				
		List<Vehiculo> aVehiculo = vehiculoService.findByMatForma(matricula);
		
		if(aVehiculo == null || aVehiculo.isEmpty()) {
			throw new NoDataFoundException();
		}
		
		VehiculoDto oVehiculoDto = new VehiculoDto();
		
		PersonaEntidadPK oPersonaEntidadPK = new PersonaEntidadPK();
		oPersonaEntidadPK.setIdHisPerso(aVehiculo.get(0).getIdHisPerso());
		oPersonaEntidadPK.setIdPerso(aVehiculo.get(0).getIdPerso());
		
		PersonaEntidad oPersonaEntidad = servicePersonaEntidad.findById(oPersonaEntidadPK);
		if (oPersonaEntidad != null) {
			PersonaEntidadDto oPersonaEntidadDto = PersonaEntidadValide.getPersonaDto(oPersonaEntidad);
			if (oPersonaEntidad.getCodProvi() > 0) {
				Long codProvi = Long.valueOf(oPersonaEntidad.getCodProvi());
				Provincia oProvincia = serviceProvincia.findById(codProvi);
				if (oProvincia != null) {
					oVehiculoDto.setProvincia(oProvincia.getDesProvi());
				}
				if (oPersonaEntidad.getCodMunic() > 0) {
					MunicipioPK MunicipioPK = new MunicipioPK();
					MunicipioPK.setCodProvi(oPersonaEntidad.getCodProvi());
					MunicipioPK.setCodMunic(oPersonaEntidad.getCodMunic());
					Municipio oMunicipio = serviceMuncipio.findById(MunicipioPK);
					if (oMunicipio != null) {
						oVehiculoDto.setMunicipio(oMunicipio.getDesMunic());
					}
				}
			}
			oVehiculoDto.setDesPerEntid(oPersonaEntidadDto.getDesPerEntid());
			oVehiculoDto.setDomicilio(oPersonaEntidadDto.getDirPosta());
			oVehiculoDto.setNumDocum(oPersonaEntidadDto.getNumDocum());
			if(oPersonaEntidadDto.getCodPosta() > 0) {
				String xText = Integer.toString(oPersonaEntidadDto.getCodPosta());
				if(xText.length() == 4) {
					xText = "0 "+ xText;
				}
				oVehiculoDto.setCp(xText);
			}
		}
		oVehiculoDto.setMatricula(aVehiculo.get(0).getMatForma());
		oVehiculoDto.setBastidor(aVehiculo.get(0).getNumBasti());
		
		if (aVehiculo.get(0).getCodTipVehic() != null) {

			switch (aVehiculo.get(0).getCodTipVehic()) {
			case "TU":
				oVehiculoDto.setTipoVehiculo("Turismo");
				break;
			case "AG":
				oVehiculoDto.setTipoVehiculo("Vehículo Especial");
				break;
			case "BU":
				oVehiculoDto.setTipoVehiculo("Autobús");
				break;
			case "CA":
				oVehiculoDto.setTipoVehiculo("Camión");
				break;
			case "CI":
				oVehiculoDto.setTipoVehiculo("Ciclomotor");
				break;
			case "CT":
				oVehiculoDto.setTipoVehiculo("Camión Taller");
				break;
			case "MO":
				oVehiculoDto.setTipoVehiculo("Motocicleta");
				break;
			case "RE":
				oVehiculoDto.setTipoVehiculo("Remolque");
				break;
			case "SE":
				oVehiculoDto.setTipoVehiculo("SemiRelmoque");
				break;
			case "TR":
				oVehiculoDto.setTipoVehiculo("Tractor");
				break;
			default:
				oVehiculoDto.setTipoVehiculo("Vehículo");
			}
		}
		
		if(aVehiculo.get(0).getNumModel() != null) {
			MarcaModelo oMarcaModelo = serviceMarcaModelo.findById(aVehiculo.get(0).getNumModel());
			if(oMarcaModelo != null) {
				oVehiculoDto.setMarca(oMarcaModelo.getMarca());
				oVehiculoDto.setModelo(oMarcaModelo.getModelo());
			}
		}
		return oVehiculoDto;
	}
}
