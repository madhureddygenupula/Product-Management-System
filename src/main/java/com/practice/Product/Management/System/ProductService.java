package com.practice.Product.Management.System;

import com.practice.Product.Management.System.entity.Product;
import com.practice.Product.Management.System.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product getById(int id) {
        Optional<Product> products = productRepository.findById(id);
        if (products.isPresent()) {
            return products.get();
        }
        return null;


    }

    public List<Product> getAllProducts(Product product) {
        return productRepository.findAll();

    }

    public Product UpdateProducts(Product product, int id) {

        Product existingProduct = getById(id);

        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setCost(product.getCost());
            existingProduct.setCompany(product.getCompany());

            return productRepository.save(existingProduct);

        }
        return null;
    }

    public boolean deleteProduct(int id) {
        Product product = getById(id);

        if (product != null) {
            productRepository.delete(product);
            return true;
        } else
            return false;
    }
}
