package com.haniffaizh.demomvc.service;

import com.haniffaizh.demomvc.entity.Product;
import com.haniffaizh.demomvc.repo.ProductRepo;
import com.haniffaizh.demomvc.utils.RandomNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo repo;



    public Iterable<Product> findAll(){
        return repo.findAll();
    }

    public void addProduct(Product product){
       repo.save(product);
    }

    public void deleteById(long id){
        repo.deleteById(id);
    }

    public Optional<Product> findById(long id){
        return repo.findById(id);
    }

    public void updateProduct(Product product){
        repo.save(product);
    }

    public List<Product> findByName(String keyword){
        return repo.findByNameContains(keyword);
    }

}
