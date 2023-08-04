package com.vinimanfrin.course.services;

import com.vinimanfrin.course.entites.Order;
import com.vinimanfrin.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findByID(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }


}
