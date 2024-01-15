package com.github.daneillima.springbootmongodb.service;

import com.github.daneillima.springbootmongodb.exception.ResourceNotFoundException;
import com.github.daneillima.springbootmongodb.model.Product;
import com.github.daneillima.springbootmongodb.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProduct() {
        return productRepository.findAll();
    }

    public Product getProductById(String productId) {
        Optional<Product> product = productRepository.findById(productId);
        if (product.isPresent()) {
            return product.get();
        } else {
            throw new ResourceNotFoundException("Record with id = " + productId + " was not found");
        }
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(String productId, Product updatedProduct) {
        Optional<Product> productOptional = productRepository.findById(productId);

        if(productOptional.isPresent()) {
            Product existingProduct = productOptional.get();
            existingProduct.setProductName(updatedProduct.getProductName());
            existingProduct.setProductPrice(updatedProduct.getProductPrice());
            existingProduct.setProductDescription(updatedProduct.getProductDescription());
            return productRepository.save(existingProduct);
        } else {
            throw new ResourceNotFoundException("Record with id = " + productId + " was not found");
        }
    }

    public void deleteProduct(String productId) {
        Optional<Product> product = productRepository.findById(productId);

        if (product.isPresent()) {
            productRepository.deleteById(productId);
        } else {
            throw new ResourceNotFoundException("Record with id = " + productId + " was not found");
        }
    }

}
