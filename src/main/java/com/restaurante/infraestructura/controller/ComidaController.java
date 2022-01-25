package com.restaurante.infraestructura.controller;

import com.restaurante.aplicacion.ComidaService;
import com.restaurante.dominio.Comida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comida")
public class ComidaController {


    @Autowired
    private ComidaService comidaService;

    @RequestMapping("/ingresar")
    public Comida ingresarComida(@RequestBody Comida comidaRequest) {
        return comidaService.save(comidaRequest);
    }
}
