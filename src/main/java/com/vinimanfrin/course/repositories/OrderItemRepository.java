package com.vinimanfrin.course.repositories;

import com.vinimanfrin.course.entites.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
