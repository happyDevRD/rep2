package com.greenaall.models.ge.service;

import com.greenaall.models.ge.entity.Archivo;

public interface IArchivoService {

	public void deleteById(Long id);
	public Archivo save(Archivo oArchivo);
	public Archivo findById(Long id);
	public Archivo findByDesArchi(String desArchi);
}
