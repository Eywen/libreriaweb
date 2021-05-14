package com.proyectoweb.libreria.web.rest.controller;

import com.proyectoweb.libreria.domain.ClienteEntity;
import com.proyectoweb.libreria.service.ClienteService;
import com.proyectoweb.libreria.service.mapper.ClienteMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*  @RestController: sustituye al uso de @Controller + @ResponseBody,
   @Controller: Con esta anotación Spring podrá detectar la clase SampleController cuando realice el escaneo de componentes
   @ResponseBody: Con ella definimos lo que será el cuerpo de la respuesta del servicio
*/
@RestController
public class ClienteController {

    //con la anotación @Autowired Spring está inyectando la capa de servicio, y por eso no tenemos que instanciarla.
    @Autowired
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    //http://localhost:8080/holacliente/juan
    @GetMapping(value = "/holacliente/{userName}")
    public String holaCliente (@PathVariable String userName) {
        ClienteEntity clienteEntity = clienteService.holaCliente(userName);
        ClienteMapper clienteMapper1 = Mappers.getMapper(ClienteMapper.class);

        //Todo: hacer el mapeo al frontDto
        return clienteMapper1.convertClienteToClienteDto(clienteEntity).getNombre();
    }
    //http://localhost:8080/prueba?hola=abc
    @GetMapping(value = "/prueba")
    public String mensajeprueba (@RequestParam String hola){
        return hola;
    }

    //http://localhost:8080/pruebapatvariable/pruebaPatVar
    @GetMapping(value = "/pruebapatvariable/{variable}")
    public String pruebapatvariable (@PathVariable String variable){
        return variable;
    }
}
