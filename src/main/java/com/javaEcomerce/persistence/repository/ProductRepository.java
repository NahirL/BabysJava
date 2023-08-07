package com.javaEcomerce.persistence.repository;

import com.javaEcomerce.persistence.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {

}
