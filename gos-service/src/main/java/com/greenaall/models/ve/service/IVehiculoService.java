package com.greenaall.models.ve.service;

import java.util.List;

import com.greenaall.models.ve.entity.Vehiculo;

public interface IVehiculoService {

	public List<Vehiculo> findByMatForma(String matricula);
}
