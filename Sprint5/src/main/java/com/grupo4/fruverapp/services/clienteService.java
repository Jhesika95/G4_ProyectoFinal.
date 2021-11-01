package com.grupo4.fruverapp.services;

import java.util.ArrayList;
import java.util.Optional;

import com.sprint5.fruverapp.models.clienteModel;
import com.sprint5.fruverapp.repositories.clienteRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class clienteService {
    @Autowired
    private clienteRepositorio clienter;

    public ArrayList<clienteModel> obtenercliente(){ 
        return (ArrayList<clienteModel>) clienter.findAll();
    }

    public Optional<clienteModel> obtenerCliente(int id){
        return clienter.findById(id);
    }

    public clienteModel guardarcliente(clienteModel cliente){
        return clienter.save(cliente);
    }

}