package com.fincityltd.controller;

import com.fincityltd.entity.Product;
import com.fincityltd.service.ProductService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") long id){
        return ResponseEntity.ok(productService.getProduct(id));
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts (){
        HttpHeaders responseHttpHeaders = new HttpHeaders();
        responseHttpHeaders.set("Version", "fincityltd.v1");
        responseHttpHeaders.set("Operation", "Get List");
        return ResponseEntity
                .ok()
                .headers(responseHttpHeaders)
                .body(productService.getProducts());
    }

    @PostMapping
    public ResponseEntity <List<Product>> createProduct(@RequestBody Product product){
        List<Product> set = productService.createProduct(product);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("Version", "fincityltd.v1")
                .header("Operation", "Create")
                .body(set);
    }

    @DeleteMapping(value = "/{id}")
    public List<Product> deleteProduct(@PathVariable("id") long id){
        return productService.delete(id);
    }

    @PutMapping(value = "/{id}")
    public List<Product> updateProduct(@PathVariable("id") long id, @RequestBody Product product){
        return productService.updateProduct(id, product);
    }
}
