package com.greenaall.inside.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenaall.ge.dto.IndiceENI;
import com.greenaall.models.ex.entity.Expediente;
import com.greenaall.models.ex.service.ExpedienteServiceImpl;
import com.greenaall.models.ge.entity.Archivo;
import com.greenaall.models.ge.service.IArchivoService;

@Service
public class InsideIndiceEniService {

	@Autowired
	private ExpedienteServiceImpl expedienteService;

	@Autowired
	private IArchivoService archivoService;

	public List<IndiceENI> obtenerIndicePorExpediente(Long expedienteId) throws Exception {
		List<IndiceENI> indice = new ArrayList<>();
		Expediente expediente = expedienteService.findById(expedienteId);
		if (expediente == null || expediente.getArchivo() == null) {
			return indice;
		}

		Archivo archivoVisualizacion = archivoService.findById(expediente.getArchivo());
		if (archivoVisualizacion == null || archivoVisualizacion.getDesArchi() == null) {
			return indice;
		}

		Properties propiedades = new Properties(System.getProperties());
		try (FileInputStream input = new FileInputStream(new File(archivoVisualizacion.getDesArchi()))) {
			propiedades.load(input);
		}

		String total = propiedades.getProperty("Total");
		if (total == null) {
			return indice;
		}

		int number = Integer.parseInt(total);
		for (int i = 0; i < number; i++) {
			String index = Integer.toString(i + 1);
			IndiceENI item = new IndiceENI();
			item.setArchivo(propiedades.getProperty("Archivo" + index));
			item.setHuella(propiedades.getProperty("Huella" + index));
			item.setNombre(propiedades.getProperty("Nombre" + index));
			indice.add(item);
		}

		return indice;
	}
}
