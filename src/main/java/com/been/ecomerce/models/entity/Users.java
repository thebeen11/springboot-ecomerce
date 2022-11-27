package com.been.ecomerce.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "tbl_users")
public class Users implements Serializable {
    @Id
    private String id;
    private String password;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String roles;
    private boolean isActive;
}
