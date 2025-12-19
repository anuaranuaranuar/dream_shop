package com.parejo.msvc_producto.dtos.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public record CategoryReqDTO(
        @NotBlank(message = "El nombre no puede estar vacio")
        @Size(min = 3, max = 100, message = "El nombre debe tener entre 3 y 100 caracteres")
        String name,

        String type
) {}
