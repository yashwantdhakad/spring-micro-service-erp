package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PurchaseOrderReceiptDto {

    private String orderItemSeqId;
    private String receiptId;
    private String inventoryItemId;
    private BigDecimal quantityAccepted;
}
