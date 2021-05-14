package com.proyectoweb.libreria.service;

import com.proyectoweb.libreria.domain.ClienteEntity;
import com.proyectoweb.libreria.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
La anotación @Service permite que Spring reconozca a SampleService como servicio al escanear los componentes de la aplicación.
 */
@Service
public class ClienteServiceImpl implements  ClienteService{

    //con la anotación @Autowired Spring está inyectando la capa de servicio, y por eso no tenemos que instanciarla.
    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public ClienteEntity holaCliente(String userName) {
        return clienteRepository.findByNombre(userName);
    }
}
