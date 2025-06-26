package com.kayy.microservices.order_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "t_orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderNumber;
    @Column(name = "sku_code") // Explicitly map 'skuCode' Java field to 'sku_code' DB column
    private String skuCode;

    @Column(name = "price") // Explicitly map 'price' Java field to 'price' DB column
    private BigDecimal price;

    @Column(name = "quantity") // Explicitly map 'quantity' Java field to 'quantity' DB column
    private Integer quantity;
//    private String skuCode;
//    private BigDecimal price;
//    private Integer quantity;


}
