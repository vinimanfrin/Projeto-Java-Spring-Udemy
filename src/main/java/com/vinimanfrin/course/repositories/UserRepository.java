package com.vinimanfrin.course.repositories;

import com.vinimanfrin.course.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
