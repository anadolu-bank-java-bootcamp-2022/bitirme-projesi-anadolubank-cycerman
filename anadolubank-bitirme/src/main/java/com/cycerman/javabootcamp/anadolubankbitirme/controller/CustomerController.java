package com.cycerman.javabootcamp.anadolubankbitirme.controller;

import com.cycerman.javabootcamp.anadolubankbitirme.service.CustomerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;
    private final ObjectMapper objectMapper;

    /*

    @PostMapping
    public ResponseEntity<Customer> saveCustomer(@Validated @RequestBody CustomerRequestDto request) {
        Customer customer = objectMapper.convertValue(request, Customer.class);
        return new ResponseEntity<>(customerService.saveCustomer(customer), HttpStatus.CREATED);
    }

     */

}
