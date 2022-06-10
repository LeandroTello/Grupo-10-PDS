package com.grupo10.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo10.entities.SucursalEntity;

@Repository("sucursalRepository")
public interface ISucursalRepository extends JpaRepository<SucursalEntity, Serializable> {

}
