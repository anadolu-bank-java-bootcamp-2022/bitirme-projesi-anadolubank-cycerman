package com.cycerman.javabootcamp.anadolubankbitirme.model.dto.req;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PolicyRequestDto {

    private Long customerId;
    private BigDecimal price;
    private LocalDateTime createdDate;
}
