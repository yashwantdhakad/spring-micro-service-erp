package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PurchaseOrderReceiveItemRequest {

    private String orderItemSeqId;
    private BigDecimal quantity;
    private String locationSeqId;
}
