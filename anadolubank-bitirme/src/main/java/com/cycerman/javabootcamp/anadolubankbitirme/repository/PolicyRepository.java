package com.cycerman.javabootcamp.anadolubankbitirme.repository;

import com.cycerman.javabootcamp.anadolubankbitirme.model.entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<Policy, Long> {

}
