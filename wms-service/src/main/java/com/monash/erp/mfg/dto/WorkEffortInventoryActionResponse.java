package com.monash.erp.mfg.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WorkEffortInventoryActionResponse {

    private Long workEffortGoodStandardId;
    private String inventoryItemId;
    private String statusId;
    private String message;
}
