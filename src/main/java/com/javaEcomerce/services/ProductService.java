package com.javaEcomerce.services;

import com.javaEcomerce.persistence.entity.ProductEntity;
import com.javaEcomerce.persistence.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Iterable<ProductEntity> getAll(){
        return this.productRepository.findAll();
    }


}
