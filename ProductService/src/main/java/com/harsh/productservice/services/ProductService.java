package com.harsh.productservice.services;

import com.harsh.productservice.Models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);

    List<Product> getAllProducts();
}
