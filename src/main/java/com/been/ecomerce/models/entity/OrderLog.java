package com.been.ecomerce.models.entity;

import java.io.Serializable;
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
@Table(name = "tbl_order_log")
public class OrderLog implements Serializable {
    
    @Id
    private String id;

    @JoinColumn
    @ManyToOne
    private Order order;

    @JoinColumn
    @ManyToOne
    private Users users;

    private Integer log_type;
    
    private String log_message;

    @Temporal(TemporalType.TIMESTAMP)
    private Date time;
}
