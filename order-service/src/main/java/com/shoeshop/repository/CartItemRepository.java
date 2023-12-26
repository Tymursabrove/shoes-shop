package com.shoeshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.shoeshop.entity.OrderItem;

@Repository
public interface CartItemRepository extends JpaRepository<OrderItem, Long> {
}
