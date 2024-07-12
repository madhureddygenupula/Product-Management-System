package com.practice.Product.Management.System;

import com.practice.Product.Management.System.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product) {

        return productService.createProduct(product);

    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getById(id);

    }

    @GetMapping("/product")
    public List<Product> getAllProducts(@RequestBody Product product) {
        return productService.getAllProducts(product);
    }

    @PatchMapping("/product/{id}")
    public Product updateProducts(@RequestBody Product product, @PathVariable int id) {
        return productService.UpdateProducts(product,id);
    }

    @DeleteMapping("/product/{id}")
    public boolean deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }
}
