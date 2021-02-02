package com.fincityltd.implementation;

import com.fincityltd.entity.Product;
import com.fincityltd.repository.ProductRepository;
import com.fincityltd.service.ProductService;

import java.util.List;

public class ProductServiceImplementation implements ProductService {


    private ProductRepository productRepository;

    public ProductServiceImplementation(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> delete(long id) {
        productRepository.deleteById(id);
        return productRepository.findAll();
    }

    @Override
    public List<Product> updateProduct(long id, Product product) {
        Product obj = productRepository.findById(id).get();
        obj.setName(product.getName());
        productRepository.save(obj);
        return productRepository.findAll();
    }

    @Override
    public List<Product> createProduct(Product product) {
        productRepository.save(product);
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id) {
        return productRepository.findById(id).get();
    }
}
