package com.cycerman.javabootcamp.anadolubankbitirme.service;

import com.cycerman.javabootcamp.anadolubankbitirme.model.dto.req.PolicyRequestDto;
import com.cycerman.javabootcamp.anadolubankbitirme.model.dto.res.PolicyYearResponseDto;
import com.cycerman.javabootcamp.anadolubankbitirme.model.entity.Policy;
import com.cycerman.javabootcamp.anadolubankbitirme.repository.CustomerRepository;
import com.cycerman.javabootcamp.anadolubankbitirme.repository.PolicyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PolicyService {
    private final PolicyRepository policyRepository;
    private final CustomerRepository customerRepository;

    public Policy saveFinancialData(PolicyRequestDto req){

        Policy financialData = new Policy();
//        financialData.setCustomer(customerRepository.findById(req.getCustomerId()).orElse(null));

        financialData.setPrice(req.getPrice());
        financialData.setPolicy_start_date(req.getCreatedDate());

        return policyRepository.save(financialData);
    }

    public List<PolicyYearResponseDto> getAllPoliciesDataOfYear(){

        var policies = policyRepository.findAll();

        var minStartDate = policies.stream().min((p1,p2) -> p1.getPolicy_start_date().compareTo(p2.getPolicy_start_date()))
                .get().getPolicy_start_date();

        var minYear = minStartDate.getYear();
        var response = new ArrayList<PolicyYearResponseDto>();
        int index = 0;

        BigDecimal totalPrice;
        for(; minYear <= LocalDateTime.now().getYear(); minYear++){
            totalPrice = BigDecimal.valueOf(0);
            for (var policy : policies) {
                if(policy.getPolicy_start_date().getYear() == minYear){
                    totalPrice = totalPrice.add(policy.getPrice());
                }
            }
            response.add(index, new PolicyYearResponseDto(minYear, totalPrice));
            index++;
        }

       return response;
    }

    public List<PolicyYearResponseDto> getAllPoliciesDataOfMonth(){

        var policies = policyRepository.findAll();

        return null;
    }

    public void deleteFinancialDataById(Long id){
        policyRepository.deleteById(id);
    }
}
