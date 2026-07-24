package com.greenaall.models.ge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greenaall.models.ge.dao.MetadatoGrupoAtribDao;
import com.greenaall.models.ge.entity.MetadatoGrupoAtributo;
import com.greenaall.models.ge.entity.MetadatoGrupoAtributoPK;

@Service
public class MetadatoGrupoAtribImpl implements IMetadatoGrupoAtribService{

	@Autowired
	private MetadatoGrupoAtribDao dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<MetadatoGrupoAtributo> findAll() {
		return (List<MetadatoGrupoAtributo>) dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public MetadatoGrupoAtributo findById(MetadatoGrupoAtributoPK oMetadatoGrupoAtribPk) {
		MetadatoGrupoAtributo oMetadatoGrupoAtributo = dao.findById(oMetadatoGrupoAtribPk).orElse(null);
		if(oMetadatoGrupoAtributo == null) {
			return null;
		}
		return oMetadatoGrupoAtributo;
	}

	@Override
	public List<MetadatoGrupoAtributo> findByIdGrupo(Long idGrupo) {
		List<MetadatoGrupoAtributo> aMetadatoGrupoAtributo = dao.findByIdGrupo(idGrupo);
		if(aMetadatoGrupoAtributo != null && !aMetadatoGrupoAtributo.isEmpty()) {
			return aMetadatoGrupoAtributo;
		}		
		return  null;
	}

	@Override
	@Transactional
	public MetadatoGrupoAtributo save(MetadatoGrupoAtributo MetadatoGrupoAtributo) {
		return dao.save(MetadatoGrupoAtributo);
	}

	@Override
	@Transactional(readOnly = true)
	public MetadatoGrupoAtributo findByEtiGruAtrib(String etiGruAtrib) {
		MetadatoGrupoAtributo oMetadatoGrupo = dao.findByEtiGruAtrib(etiGruAtrib);
		if(oMetadatoGrupo != null) {
			return oMetadatoGrupo;
		}
		return null;
	}

	@Override
	public MetadatoGrupoAtributo findByIdGrupoAndEtiGruAtrib(Long idGrupo, String etiGruAtrib) {
		MetadatoGrupoAtributo oMetadatoGrupo = dao.findByIdGrupoAndEtiGruAtrib(idGrupo, etiGruAtrib);
		if(oMetadatoGrupo != null) {
			return oMetadatoGrupo;
		}
		return null;
	}
	
	@Override
	@Transactional 
	public void deleteById(MetadatoGrupoAtributoPK oMetadatoGrupoAtributoPK) {
		dao.deleteById(oMetadatoGrupoAtributoPK);        
    }

	

}
