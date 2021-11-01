package com.grupo4.fruverapp.controller;

import java.util.ArrayList;
import com.Sprint5.fruverapp.models.uModel; 
import com.Sprint5.fruverapp.services.uService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario") 
public class uController {
    @Autowired
    private uService uService;
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String validarUsuario(@RequestBody uModel usuario){
        //Obtengo todos los usuarios
        ArrayList<uModel> users = uService.obtenerUsuarios();
        //El codigo se usa para validar que el usuario y contraseña que esten en la base de datos
        for (uModel userTemp : users) {
            if (userTemp.getNick_usuario().equals(usuario.getNick_usuario())) {
                if (userTemp.getContra_usuario().equals(usuario.getContra_usuario())) {
                    return userTemp.getRol_usuario();
                }
            }
        }
        return "error";
    }  
    
}