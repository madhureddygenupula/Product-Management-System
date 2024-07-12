package com.practice.Product.Management.System.repository;

import com.practice.Product.Management.System.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
