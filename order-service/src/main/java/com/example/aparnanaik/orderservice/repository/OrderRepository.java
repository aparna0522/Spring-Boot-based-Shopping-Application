package com.example.aparnanaik.orderservice.repository;

import com.example.aparnanaik.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
