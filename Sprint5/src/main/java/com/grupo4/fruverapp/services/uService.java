package com.grupo4.fruverapp.services;

import java.util.ArrayList;
import java.util.Optional;

import com.sprint5.fruverapp.models.uModel; 
import com.sprint5.fruverapp.repositories.*; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class uService {
    @Autowired
    private uRepositorio usuarior;

    //Trae todos los usuarios que se encuentran en el usuario modelo
    public ArrayList<uModel> obtenerUsuarios(){
        return (ArrayList<uModel>) usuarior.findAll();
    }

    //Para encontrar solo un usuario el que se le indique con Long id
    public Optional<uModel> obtenerUsuario(Long id){
        return usuarior.findById(id);
    }

    //Para guardar el ususario dentro de la base de datos
    public uModel guardarUsuario(uModel usuario){
        return usuarior.save(usuario);
    }

    //para borrar el elemento que se indica
    public void borrarUsuario(long id){
        usuarior.deleteById(id);
    }

}
