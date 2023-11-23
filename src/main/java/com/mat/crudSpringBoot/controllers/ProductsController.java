package com.mat.crudSpringBoot.controllers;

import com.mat.crudSpringBoot.model.Products;
import com.mat.crudSpringBoot.model.ProductsDto;
import com.mat.crudSpringBoot.repository.ProductsRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

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

    @PostMapping
    public ResponseEntity registerProduct(@RequestBody @Valid ProductsDto data) {
        Products newProduct = new Products(data);
        productsRepository.save(newProduct);
        System.out.println(data);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateProduct(@RequestBody @Valid ProductsDto data){
        Optional<Products> optionalProduct = productsRepository.findById(data.id());
        if (optionalProduct.isPresent()) {
            Products product = optionalProduct.get();
            product.setName(data.name());
            product.setPrice(data.price());
            return ResponseEntity.ok(product);
        } else {
            throw new EntityNotFoundException();
        }
    }

}
