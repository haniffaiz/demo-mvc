package com.haniffaizh.demomvc.service;

import com.haniffaizh.demomvc.entity.Product;
import com.haniffaizh.demomvc.utils.RandomNumber;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService {

    private static List<Product> products = new ArrayList<Product>(){

    };



    public List<Product> findAll(){
        return products;
    }

    public void addProduct(Product product){
        product.setId(RandomNumber.getRandom(1000,9999));
       products.add(product);
    }

    public void deleteById(long id){
        products.removeIf(product -> product.getId()==id);
    }

    public Optional<Product> findById(long id){
        return products.stream().filter(product -> product.getId()==id).findFirst();
    }

    public void updateProduct(Product product){
        deleteById(product.getId());
        products.add(product);
    }

}
