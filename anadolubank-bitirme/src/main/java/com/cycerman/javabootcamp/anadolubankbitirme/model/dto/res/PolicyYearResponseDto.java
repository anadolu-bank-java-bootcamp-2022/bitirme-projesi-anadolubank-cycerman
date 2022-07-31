package com.cycerman.javabootcamp.anadolubankbitirme.model.dto.res;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PolicyYearResponseDto {

    public PolicyYearResponseDto(int newYear, BigDecimal newTotalPrice){
        this.year = newYear;
        this.totalPrice = newTotalPrice;
    }

    private int year;
    private BigDecimal totalPrice;
}
