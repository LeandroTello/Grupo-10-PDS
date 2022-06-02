package com.grupo10.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo10.entities.ProductoEntity;


@Repository("productoRepository")
public interface IProductoRepository extends JpaRepository<ProductoEntity, Serializable> {

}
