package com.monash.erp.mfg.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WorkEffortInventoryActionRequest {

    private String inventoryItemId;
    private String quantity;
}
