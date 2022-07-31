package com.cycerman.javabootcamp.anadolubankbitirme.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="TBL_POLICY_TYPES")
@Data
public class PolicyType {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="name", length=20)
    private String name;

}
