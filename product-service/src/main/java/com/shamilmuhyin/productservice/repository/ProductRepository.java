package com.shamilmuhyin.productservice.repository;

import com.shamilmuhyin.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
