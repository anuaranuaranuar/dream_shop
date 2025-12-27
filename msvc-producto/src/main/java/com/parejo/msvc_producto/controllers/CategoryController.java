package com.parejo.msvc_producto.controllers;

import com.parejo.msvc_producto.dtos.req.CategoryReqDTO;
import com.parejo.msvc_producto.dtos.res.CategoryResDTO;
import com.parejo.msvc_producto.services.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<Page<CategoryResDTO>> getAll(
            @PageableDefault(sort = "name") Pageable pageable) {
        return ResponseEntity.ok(categoryService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryResDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(categoryService.findById(id));
    }

    @PostMapping
    public ResponseEntity<CategoryResDTO> create(@Valid @RequestBody CategoryReqDTO dto) {
        CategoryResDTO categorySaved = categoryService.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(categorySaved);
    }

    @PutMapping("/disable/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        categoryService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{categoryId}")
    public ResponseEntity<CategoryResDTO> update(@PathVariable Long id, @Valid @RequestBody CategoryReqDTO dto) {
        return ResponseEntity.ok(categoryService.update(id, dto));
    }
}
