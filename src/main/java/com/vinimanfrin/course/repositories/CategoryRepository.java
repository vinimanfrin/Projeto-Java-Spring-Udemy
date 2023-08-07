package com.vinimanfrin.course.repositories;

import com.vinimanfrin.course.entites.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
