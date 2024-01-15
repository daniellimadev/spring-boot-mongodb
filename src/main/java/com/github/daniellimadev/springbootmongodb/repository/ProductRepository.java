package com.github.daniellimadev.springbootmongodb.repository;

import com.github.daniellimadev.springbootmongodb.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
