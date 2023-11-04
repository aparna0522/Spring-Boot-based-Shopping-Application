package com.example.aparnanaik.productService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.aparnanaik.productService.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
