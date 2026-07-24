package com.greenaall.models.gf.service;

import java.util.List;

import com.greenaall.models.gf.entity.GfTarifaMd;
import com.greenaall.models.gf.entity.GfTarifaMdPK;

public interface ITarifaMdService {

	public List<GfTarifaMd> findAll();
	public GfTarifaMd findById(GfTarifaMdPK tarifaMdPK);
}
