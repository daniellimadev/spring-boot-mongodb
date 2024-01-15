package com.github.daneillima.springbootmongodb.repository;

import com.github.daneillima.springbootmongodb.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
