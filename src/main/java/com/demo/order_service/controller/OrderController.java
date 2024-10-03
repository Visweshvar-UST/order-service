package com.demo.order_service.controller;

import java.util.List;

import com.demo.order_service.dao.OrderRepo;
import com.demo.order_service.entity.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    private OrderRepo orderRepo;

    @GetMapping("/order")
    public List<Order> getAllOrder(){
        return orderRepo.findAll();
    }
    @GetMapping("/order/{id}")
    public Order getAOrder(@PathVariable Long id){
        return orderRepo.findById(id).get();
    }
    @PostMapping("/order")
    public Order addOrder(@RequestBody Order order){
        return orderRepo.save(order);
    }
    @GetMapping("/order/cus/{id}")
    public List<Order> getAllOrderByCus(@PathVariable Long id){
        return orderRepo.findByCid(id);
    }
}
