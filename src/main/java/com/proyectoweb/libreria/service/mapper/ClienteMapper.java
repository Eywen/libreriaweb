package com.proyectoweb.libreria.service.mapper;

import com.proyectoweb.libreria.domain.ClienteEntity;
import com.proyectoweb.libreria.web.rest.frontDto.ClienteFrontDto;
import org.mapstruct.Mapper;

@Mapper
public interface ClienteMapper {

    ClienteFrontDto convertClienteToClienteDto (ClienteEntity clienteEntity);
}
