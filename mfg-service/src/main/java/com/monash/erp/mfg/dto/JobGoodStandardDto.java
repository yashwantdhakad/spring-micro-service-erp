package com.monash.erp.mfg.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JobGoodStandardDto {

    private Long id;
    private String productId;
    private String estimatedQuantity;
    private String workEffortGoodStdTypeId;
    private String statusId;
    private String workEffortId;
    private String reservedQuantity;
    private String issuedQuantity;
    private String remainingQuantity;
    private String produced;
    private String producedInventoryItemIds;
}
