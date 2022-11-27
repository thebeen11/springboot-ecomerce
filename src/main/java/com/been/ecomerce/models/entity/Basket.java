package com.been.ecomerce.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
@Table(name = "tbl_basket")
public class Basket implements Serializable{
    
    @Id
    private String id;

    @JoinColumn
    @ManyToOne
    private Product product;

    @JoinColumn
    @ManyToOne
    private Users users;

    private double quantity;

    private BigDecimal price;

    private BigDecimal total;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
}
