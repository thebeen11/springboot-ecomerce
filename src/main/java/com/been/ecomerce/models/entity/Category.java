package com.been.ecomerce.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "tbl_categories")
public class Category implements Serializable{
    @Id
    private String id;
    private String name;
}
