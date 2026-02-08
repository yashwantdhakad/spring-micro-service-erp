package com.monash.erp.mfg.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WmsInventoryItemDetailRequest {

    private String inventoryItemId;
    private String inventoryItemDetailSeqId;
    private LocalDateTime effectiveDate;
    private String quantityOnHandDiff;
    private String availableToPromiseDiff;
    private String accountingQuantityDiff;
    private String workEffortId;
    private String itemIssuanceId;
    private String description;
}
