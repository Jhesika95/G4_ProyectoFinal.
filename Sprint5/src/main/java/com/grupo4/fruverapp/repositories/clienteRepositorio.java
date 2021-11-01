package com.grupo4.fruverapp.repositories;

import com.sprint5.fruverapp.models.clienteModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clienteRepositorio  extends CrudRepository<clienteModel,Integer>{
}