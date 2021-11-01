package com.grupo4.fruverapp.controller;

import java.util.ArrayList;
import java.util.Optional;

import com.sprint5.fruverapp.models.clienteModel;
import com.sprint5.fruverapp.services.clienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class clienteController {
    @Autowired
    private clienteService vService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ArrayList<clienteModel> obtenercliente(){
        return this.vService.obtenercliente();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public clienteModel guardarUsuario(@RequestBody clienteModel cliente){
        return this.vService.guardarcliente(cliente);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<clienteModel> obtenerCliente(@PathVariable int id){
        return this.vService.obtenerCliente(id);
    }

}