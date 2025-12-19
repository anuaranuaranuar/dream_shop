package com.parejo.msvc_producto.dtos.res;

import com.parejo.msvc_producto.entities.Product;

import java.util.List;

public record CategoryResDTO(
        Long
        id,

        String
        name,

        String
        type,

        List<Product>
        products
) {

}
