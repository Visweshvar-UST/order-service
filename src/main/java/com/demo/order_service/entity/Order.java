package com.demo.order_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "order_details")
public class Order {
    @Id
    @Column(name = "order_id")
    private Long oId;
    @Column(name = "order_name")
    private String oname;
    @Column(name = "customer_id")
    private Long cid;
    
}
