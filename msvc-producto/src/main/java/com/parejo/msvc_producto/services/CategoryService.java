package com.parejo.msvc_producto.services;

import com.parejo.msvc_producto.dtos.req.CategoryReqDTO;
import com.parejo.msvc_producto.dtos.res.CategoryResDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CategoryService {
    Page<CategoryResDTO> findAll(Pageable pageable);
    CategoryResDTO save(CategoryReqDTO dto);
    CategoryResDTO findById(Long id);
    void deleteById(Long id);
    CategoryResDTO update(Long id, CategoryReqDTO dto);
}
