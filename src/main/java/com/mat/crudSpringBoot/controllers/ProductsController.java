package com.mat.crudSpringBoot.controllers;

import com.mat.crudSpringBoot.model.Products;
import com.mat.crudSpringBoot.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsRepository productsRepository;

    @GetMapping
    public ResponseEntity getAllProducts() {
        var allProducts = productsRepository.findAll();
        return ResponseEntity.ok(allProducts);
    }

}
