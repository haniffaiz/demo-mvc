package com.haniffaizh.demomvc.repo;

import com.haniffaizh.demomvc.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {
}
