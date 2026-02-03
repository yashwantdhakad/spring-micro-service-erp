package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SalesOrderPicklistItemRequest {

    private String orderItemSeqId;
    private String productId;
    private String inventoryItemId;
    private BigDecimal quantity;
}
