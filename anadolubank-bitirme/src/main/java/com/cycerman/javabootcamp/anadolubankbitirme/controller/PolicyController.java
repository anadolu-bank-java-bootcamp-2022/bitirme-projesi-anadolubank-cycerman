package com.cycerman.javabootcamp.anadolubankbitirme.controller;

import com.cycerman.javabootcamp.anadolubankbitirme.model.dto.req.PolicyRequestDto;
import com.cycerman.javabootcamp.anadolubankbitirme.model.dto.res.PolicyYearResponseDto;
import com.cycerman.javabootcamp.anadolubankbitirme.model.entity.Policy;
import com.cycerman.javabootcamp.anadolubankbitirme.service.PolicyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/policy")
@RequiredArgsConstructor
public class PolicyController {
    private final PolicyService policyService;

    @PostMapping("/saveFinancialData")
    public ResponseEntity<Policy> saveFinancialData(@Validated @RequestBody PolicyRequestDto request) {
        return new ResponseEntity<>(policyService.saveFinancialData(request), HttpStatus.CREATED);
    }

    @GetMapping("/getAllPoliciesData")
    public ResponseEntity<List<PolicyYearResponseDto>> getAllPoliciesData() {
        return new ResponseEntity<>(policyService.getAllPoliciesDataOfYear(), HttpStatus.CREATED);
    }
}
