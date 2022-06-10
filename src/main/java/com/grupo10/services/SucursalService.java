package com.grupo10.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.grupo10.converters.SucursalConverter;
import com.grupo10.entities.SucursalEntity;
import com.grupo10.models.SucursalModel;
import com.grupo10.repositories.ISucursalRepository;
import com.grupo10.services.implementation.ISucursalService;

@Service("sucursalService")
public class SucursalService implements ISucursalService {

	@Autowired
	@Qualifier("sucursalRepository")
	private ISucursalRepository sucursalRepository;

	@Autowired
	@Qualifier("sucursalConverter")
	private SucursalConverter sucursalConverter;

	
	public List<SucursalModel> traerSucursales() {
		List<SucursalModel> sucursales = new ArrayList<SucursalModel>();
		for (SucursalEntity sucursal : sucursalRepository.findAll()) {
			sucursales.add(sucursalConverter.entityToModel(sucursal));
		}
		return sucursales;
	}

}
