package com.proyectoweb.libreria.repository;

import com.proyectoweb.libreria.domain.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity,Long> {

    /*@Query("select cliente from Cliente where cliente.nombre =:userName")*/
    ClienteEntity findByNombre(@Param("userName") String userName);

}
