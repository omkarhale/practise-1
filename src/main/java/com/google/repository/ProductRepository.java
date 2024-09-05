package com.google.repository;

import com.google.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Integer>{
    Product findByName(String name);
}
