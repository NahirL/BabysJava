package com.javaEcomerce.controllers;

import com.javaEcomerce.persistence.entity.ProductEntity;
import com.javaEcomerce.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<Iterable<ProductEntity>> getAll(){
        return ResponseEntity.ok(this.productService.getAll());
    }
}
