package com.greenaall.models.ge.service;

import com.greenaall.models.ge.entity.MetadatoGrupo;

public interface IMetadatoGrupoService {
	
	public void deleteById(Long id);
	public MetadatoGrupo save(MetadatoGrupo oMetadatoGrupo);
	public MetadatoGrupo findById(Long id);
	public MetadatoGrupo findByCodGrupo(String codGrupo);

}
