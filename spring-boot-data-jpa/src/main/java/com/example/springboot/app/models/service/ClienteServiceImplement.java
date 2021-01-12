package com.example.springboot.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.app.models.dao.IClienteDao;
import com.example.springboot.app.models.entity.Cliente;

@Service
public class ClienteServiceImplement implements IClienteService{

	/**
	 * Tengo los mismos metodos del dao. Puede haber mas de un dao
	 * se usa el patron fachade. Accedo al dao desde acá y manejo las transacciones desde acá
	 */
	@Autowired
	private IClienteDao clienteDao;
	
	@Transactional(readOnly = true)
	@Override
	public List<Cliente> findAll() {
		return clienteDao.findAll();
	}

	@Transactional
	@Override
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
		
	}

	@Transactional(readOnly = true)
	@Override
	public Cliente findOne(Long id) {
		return clienteDao.findOne(id);
	}

	@Transactional
	@Override
	public void delete(Long id) {
		clienteDao.delete(id);
		
	}

}
