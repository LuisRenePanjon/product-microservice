package com.spring.productmicroservice.controller;


import com.spring.productmicroservice.entity.ProductEntity;
import com.spring.productmicroservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll(Sort.sort(ProductEntity.class).by(ProductEntity::getProductName).ascending());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductEntity productEntity){
        productRepository.save(productEntity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteProduct(@PathVariable String id){
        productRepository.deleteById(id);
    }

}
