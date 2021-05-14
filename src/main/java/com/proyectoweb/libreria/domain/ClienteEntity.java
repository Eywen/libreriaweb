package com.proyectoweb.libreria.domain;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "cliente")
public class ClienteEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    private Long idcliente;

    @NotNull
    @Column(name = "nombre")
    private String nombre;

    @NotNull
    @Column(name = "primer_apellido")
    private String primerApellido;

    @Column(name = "segundo_apellido")
    private String segundoApellido;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private Integer telefono;

    @NotNull
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "fec_nacimiento")
    private Date fecNacimiento;

    @NotNull
    @Column(name = "cesta_idcesta")
    private Integer cesta_idcesta;

    public ClienteEntity() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public Integer getCesta_idcesta() {
        return cesta_idcesta;
    }

    public void setCesta_idcesta(Integer cesta_idcesta) {
        this.cesta_idcesta = cesta_idcesta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClienteEntity clienteEntity = (ClienteEntity) o;
        if (clienteEntity.idcliente == null || idcliente == null) {
            return false;
        }
        return Objects.equals(idcliente, clienteEntity.idcliente);
    }

    @Override
    public int hashCode() {
            return Objects.hashCode(idcliente);
        }
}
