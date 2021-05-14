package com.proyectoweb.libreria.web.rest.frontDto;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class ClienteFrontDto implements Serializable {

    private static final long serialVersionUID = 7806900485017028709L;

    private Long idcliente;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String direccion;
    private Integer telefono;
    private String email;
    private Date fecNacimiento;
    private Integer cestaIdCesta;

    public ClienteFrontDto() {}

    public Long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Long idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecNacimiento() {
        return fecNacimiento;
    }

    public void setFecNacimiento(Date fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }

    public Integer getCestaIdCesta() {
        return cestaIdCesta;
    }

    public void setCestaIdCesta(Integer cestaIdCesta) {
        this.cestaIdCesta = cestaIdCesta;
    }
}
