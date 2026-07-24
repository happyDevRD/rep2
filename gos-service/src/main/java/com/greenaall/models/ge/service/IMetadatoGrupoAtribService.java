package com.greenaall.models.ge.service;

import java.util.List;

import com.greenaall.models.ge.entity.MetadatoGrupoAtributo;
import com.greenaall.models.ge.entity.MetadatoGrupoAtributoPK;

public interface IMetadatoGrupoAtribService {

	public List<MetadatoGrupoAtributo> findAll();
	public MetadatoGrupoAtributo findById(MetadatoGrupoAtributoPK oParametroSistemaPK);
	public void deleteById(MetadatoGrupoAtributoPK oMetadatoGrupoAtributoPK);
	public List<MetadatoGrupoAtributo> findByIdGrupo(Long idGrupo);
	public MetadatoGrupoAtributo save(MetadatoGrupoAtributo MetadatoGrupoAtributo);
	public MetadatoGrupoAtributo findByEtiGruAtrib(String etiGruAtrib);
	public MetadatoGrupoAtributo findByIdGrupoAndEtiGruAtrib(Long idGrupo, String etiGruAtrib);
}
