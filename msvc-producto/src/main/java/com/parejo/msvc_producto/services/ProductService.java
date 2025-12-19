package com.parejo.msvc_producto.services;

import com.parejo.msvc_producto.dtos.req.ProductReqDTO;
import com.parejo.msvc_producto.dtos.res.ProductResDTO;
import com.parejo.msvc_producto.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<ProductResDTO> findAll(Pageable pageable);
    Product save(ProductReqDTO dto);
    Product findById(Long id);
}
