package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PurchaseOrderReceiptDto {

    private String orderItemSeqId;
    private String receiptId;
    private String inventoryItemId;
    private String quantityAccepted;
}
