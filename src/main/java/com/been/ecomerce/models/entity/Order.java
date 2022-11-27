package com.been.ecomerce.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.been.ecomerce.models.enums.OrderStatus;

import lombok.Data;

@Entity
@Data
@Table(name = "tbl_order")
public class Order implements Serializable{
    @Id
    private String id;

    private String number;

    @Temporal(TemporalType.DATE)
    private Date date;

    @JoinColumn
    @ManyToOne
    private Users user;

    private String shipping_address;

    private BigDecimal quantity;

    private BigDecimal delivery_price;

    private BigDecimal total;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
}
