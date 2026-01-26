package com.upb.agripos.controller;

import com.upb.agripos.model.Product;
import com.upb.agripos.service.ProductService;

public class ProductController {
    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    public Product add(String code, String name, double price, int stock) {
        Product p = new Product(code, name, price, stock);
        service.insert(p);
        return p;
    }
}