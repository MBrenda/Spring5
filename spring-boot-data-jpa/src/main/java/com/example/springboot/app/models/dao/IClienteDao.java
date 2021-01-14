package com.example.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.springboot.app.models.entity.Cliente;

//CrudRepository propia de spring DATA Jpa que tiene los metodos CRUD
//JpaRepository es otra opcion con mas metodos
public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
