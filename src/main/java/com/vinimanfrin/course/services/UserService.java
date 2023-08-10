package com.vinimanfrin.course.services;

import com.vinimanfrin.course.entites.User;
import com.vinimanfrin.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository repository ;

    public List<User> findAll(){
        return repository.findAll();
    }
    public User findByID(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
    public User insert(User obj){
         return repository.save(obj); // o save automaticamente retorna
    }

}
