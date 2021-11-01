package com.grupo4.fruverapp.repositories;

import com.sprint5.fruverapp.models.uModel; 

//se importan dos librerias 
import org.springframework.data.repository.CrudRepository; 
import org.springframework.stereotype.Repository;

//codigo indica que el archivo es un repositorio y que la clase es una interfaz usRepositorio y se le indica que se extienda para trabajar con CrudRepository (es una libreria que permite grabar, actualizar y tiene preprogramadas funciones) se agrega Lon como tipo de dato depnde de la primary Key y el tipo de dato usado debe ser el mismo
@Repository
public interface uRepositorio  extends CrudRepository<uModel,Long>{
 // extends libreria + nombre del modelo + tipo de dato
}