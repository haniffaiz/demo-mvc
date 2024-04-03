package com.haniffaizh.demomvc.service;

import com.haniffaizh.demomvc.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;


@Service
public class ProductService {

    private static List<Product> products = new ArrayList<Product>(){

    };



    public List<Product> findAll(){
        return products;
    }

    public void addProduct(Product product){
        product.setId(System.currentTimeMillis());
       products.add(product);
    }

}
