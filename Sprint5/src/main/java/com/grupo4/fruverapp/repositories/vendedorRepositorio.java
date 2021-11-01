package com.grupo4.fruverapp.repositories;

import com.sprint5.fruverapp.models.vendedorModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vendedorRepositorio  extends CrudRepository<vendedorModel,Integer>{
}