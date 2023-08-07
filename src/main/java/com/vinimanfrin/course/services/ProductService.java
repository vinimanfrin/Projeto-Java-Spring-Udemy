package com.vinimanfrin.course.services;

import com.vinimanfrin.course.entites.Product;
import com.vinimanfrin.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository ;

    public List<Product> findAll(){
        return repository.findAll();
    }
    public Product findByID(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
