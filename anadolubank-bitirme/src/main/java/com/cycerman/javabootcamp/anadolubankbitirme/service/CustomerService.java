package com.cycerman.javabootcamp.anadolubankbitirme.service;

import com.cycerman.javabootcamp.anadolubankbitirme.model.entity.Customer;
import com.cycerman.javabootcamp.anadolubankbitirme.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public Customer saveCustomer(Customer req){
        return customerRepository.save(req);
    }

    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

    public Customer findCustomerById(Long id){
        return customerRepository.findCustomerById(id);
    }

    public void deleteCustomerById(Long id){
        customerRepository.deleteById(id);
    }



    public void initializeData(){

    }
}
