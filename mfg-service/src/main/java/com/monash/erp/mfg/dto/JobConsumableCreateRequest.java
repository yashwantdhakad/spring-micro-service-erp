package com.monash.erp.mfg.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JobConsumableCreateRequest {

    private String productId;
    private String estimatedQuantity;
    private String estimatedCost;
}
