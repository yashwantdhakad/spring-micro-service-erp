package com.monash.erp.mfg.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WmsInventoryItemSearchDto {

    private String inventoryItemId;
    private String productId;
    private String facilityId;
    private String availableToPromiseTotal;
    private String quantityOnHandTotal;
}
