package com.been.ecomerce.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "tbl_order_items")
public class OrderItems implements Serializable {
    
    @Id
    private String id;

    @JoinColumn
    @ManyToOne
    private Order order;

    @JoinColumn
    @ManyToOne
    private Product product;

    private String description;

    private double quantity;

    private BigDecimal price;

    private BigDecimal total;
}
