package com.parejo.msvc_producto.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Table(name = "categories")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@SuperBuilder
public class Category extends AuditableEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    private String type;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

    private Boolean isActive;

}
