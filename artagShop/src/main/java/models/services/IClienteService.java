package models.services;

import java.util.List;

import models.entity.Cliente;



public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long Id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Cliente cliente);
	

}