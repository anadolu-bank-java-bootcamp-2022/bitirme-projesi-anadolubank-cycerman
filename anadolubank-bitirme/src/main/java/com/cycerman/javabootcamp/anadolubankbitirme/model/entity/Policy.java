package com.cycerman.javabootcamp.anadolubankbitirme.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="TBL_POLICIES")
@Data
public class Policy {

    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name="price")
    private BigDecimal price;

    @Column(name="policy_start_date")
    private LocalDateTime policy_start_date;

    @Column(name="policy_end_date")
    private LocalDateTime policy_end_date;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "policy_type_id")
    private PolicyType policyType;
}
