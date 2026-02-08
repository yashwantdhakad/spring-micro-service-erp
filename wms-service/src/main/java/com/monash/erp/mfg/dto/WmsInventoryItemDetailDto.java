package com.monash.erp.mfg.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WmsInventoryItemDetailDto {

    private String inventoryItemId;
    private String quantityOnHandDiff;
    private String itemIssuanceId;
}
