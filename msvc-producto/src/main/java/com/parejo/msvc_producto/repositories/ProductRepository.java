package com.parejo.msvc_producto.repositories;

import com.parejo.msvc_producto.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // metodo para buscar por categoría
    List<Product> findByCategory(String category);
}
