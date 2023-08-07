package com.vinimanfrin.course.repositories;

import com.vinimanfrin.course.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
