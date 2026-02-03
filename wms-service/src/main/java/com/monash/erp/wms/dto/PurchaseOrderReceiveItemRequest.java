package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PurchaseOrderReceiveItemRequest {

    private String orderItemSeqId;
    private String productId;
    private String quantity;
    private String unitCost;
    private String locationSeqId;
}
