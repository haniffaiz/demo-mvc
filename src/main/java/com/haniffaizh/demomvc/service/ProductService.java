package com.haniffaizh.demomvc.service;

import com.haniffaizh.demomvc.entity.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private static List<Product> products = Arrays.asList(
            new Product(1L, "001", "Product 001",1000.0),
            new Product(2L, "002", "Product 002",2000.0),
            new Product(3L, "003", "Product 003",3000.0),
            new Product(4L, "004", "Product 004",4000.0),
            new Product(5L, "005", "Product 005",5000.0)
    );

    public List<Product> findAll(){
        return products;
    }

}
