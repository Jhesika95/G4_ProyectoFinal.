package com.grupo4.fruverapp.controller;

import java.util.ArrayList;
import java.util.Optional;

import com.sprint5.fruverapp.models.usuarioModel; 
import com.sprint5.fruverapp.services.vendedorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //para que reconozca que este es un controlador
//localhost:8080/vendedor/
@RequestMapping("/vendedor") //indica el link con el que el va a poder controlar los metodos POST, GET
public class vendedorController {
    @Autowired 
    private vendedorService vService;

    //Trae el metodo obtenerDocente
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ArrayList<vendedorModel> obtenerVendedor(){
        return this.vService.obtenerVendedor();
    }

    //Guardar docente
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public vendedorModel guardarUsuario(@RequestBody vendedorModel vendedor){
        return this.vService.guardarVendedor(vendedor);
    }

    //obtner docente en especifico
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<vendedorModel> obtenerVendedor(@PathVariable int id){
        return this.vService.obtenerVendedor(id);
    }
}