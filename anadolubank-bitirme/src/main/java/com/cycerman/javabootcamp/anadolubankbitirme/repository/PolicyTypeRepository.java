package com.cycerman.javabootcamp.anadolubankbitirme.repository;

import com.cycerman.javabootcamp.anadolubankbitirme.model.entity.PolicyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyTypeRepository extends JpaRepository<PolicyType, Long> {

}
