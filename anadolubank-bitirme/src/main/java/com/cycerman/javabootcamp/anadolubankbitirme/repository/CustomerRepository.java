package com.cycerman.javabootcamp.anadolubankbitirme.repository;

import com.cycerman.javabootcamp.anadolubankbitirme.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findCustomerById (Long id);

    @Override
    <S extends Customer> S save(S entity);

    @Override
    List<Customer> findAll();

    @Override
    void deleteById(Long aLong);
}
