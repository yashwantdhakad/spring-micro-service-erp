package com.monash.erp.mfg.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WmsInventoryItemDto {

    private String inventoryItemId;
    private String productId;
    private String quantityOnHandTotal;
    private String availableToPromiseTotal;
    private String accountingQuantityTotal;
}
