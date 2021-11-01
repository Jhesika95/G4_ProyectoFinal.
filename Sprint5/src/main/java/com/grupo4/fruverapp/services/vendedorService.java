package com.grupo4.fruverapp.services;

import java.util.ArrayList;
import java.util.Optional;

import com.sprint5.fruverapp.models.vendedorModel;
import com.sprint5.fruverapp.repositories.vendedorRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class vendedorService {
    @Autowired
    private vendedorRepositorio vendedorr;

    //Retorna todo el ArrayList que capturo y le pide que encuentre todos
    public ArrayList<vendedorModel> obtenerVendedor(){
        return (ArrayList<vendedorModel>) vendedorr.findAll();
    }

    public Optional<vendedorModel> obtenerVendedor(int id){
        return vendedorr.findById(id);
    }

    public vendedorModel guardarVendedor(vendedorModel vendedor){
        return vendedorr.save(vendedor);
    }

}