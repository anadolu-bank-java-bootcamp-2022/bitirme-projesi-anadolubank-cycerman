package com.cycerman.javabootcamp.anadolubankbitirme.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TBL_CUSTOMER")
@Data
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="first_name", length=20)
    private String firstName;

    @Column(name="last_name", length=20)
    private String last_name;

    @Column(name="tc_number", length=11)
    private String tc_number;

    @Column(name="phone_number", length=11)
    private String phone_number;

    @Column(name="email_address", length=50)
    private String email_address;
}
