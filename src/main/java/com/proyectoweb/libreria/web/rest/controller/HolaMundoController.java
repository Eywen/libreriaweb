package com.proyectoweb.libreria.web.rest.controller;

import com.proyectoweb.libreria.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*  @RestController: sustituye al uso de @Controller + @ResponseBody,
   @Controller: Con esta anotación Spring podrá detectar la clase SampleController cuando realice el escaneo de componentes
   @ResponseBody: Con ella definimos lo que será el cuerpo de la respuesta del servicio
*/
@RestController
public class HolaMundoController {

    //Con esta anotación especificamos la ruta desde la que escuchará el servicio, y qué método le corresponde.
    @RequestMapping("/")
    public String holaMundo() {

        return "Hola Mundo";
    }

    @GetMapping(value = "/mensaje")
    public String mensaje (){
        return "mensaje";
    }

}
