package com.parejo.msvc_producto.services;

import com.parejo.msvc_producto.dtos.req.ProductReqDTO;
import com.parejo.msvc_producto.dtos.res.ProductResDTO;
import com.parejo.msvc_producto.entities.Product;
import com.parejo.msvc_producto.mappers.ProductMapper;
import com.parejo.msvc_producto.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public Page<ProductResDTO> findAll(Pageable pageable) {
        Page<Product> products = productRepository.findAll(pageable);
        return products.map(productMapper::toResDTO);
    }

    @Override
    public Product save(ProductReqDTO dto) {
        Product product = productMapper.toEntity(dto);
        return productRepository.save(product);
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() ->
                        new NullPointerException("Producto no encontrado"));
        // todo crear exception personalizada
    }
}