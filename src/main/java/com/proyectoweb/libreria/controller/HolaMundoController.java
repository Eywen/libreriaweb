package com.proyectoweb.libreria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @RequestMapping("/")
    public String holaMundo() {

        return "Hola Mundo a todos";
    }
}
