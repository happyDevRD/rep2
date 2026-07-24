package com.greenaall.models.ge.service;

import java.util.List;

import com.greenaall.models.ge.entity.Firma;

public interface IFirmaService {
	public Firma findById(Integer id);
	List<Firma> findByIdProFirma(Integer idProFirma);

}
