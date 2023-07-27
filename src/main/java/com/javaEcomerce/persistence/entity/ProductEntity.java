package com.javaEcomerce.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Integer idProduct;

    @Column(nullable = false, columnDefinition = "VARCHAR(30)", unique = true)
    private String name;

    @Column(nullable = false, columnDefinition = "Decimal(5,2)")
    private Double price;

    @Column(columnDefinition = "VARCHAR(150)")
    private String description;

    @ManyToMany(mappedBy = "products")
    private Set<OrderEntity> orders  = new HashSet<>();

    @ManyToMany(mappedBy = "products")
    private Set<CategoryEntity> categories  = new HashSet<>();
}
