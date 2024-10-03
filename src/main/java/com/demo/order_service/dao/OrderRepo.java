package com.demo.order_service.dao;

import java.util.List;

import com.demo.order_service.entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order,Long> {
    List<Order> findByCid(Long id);
}
