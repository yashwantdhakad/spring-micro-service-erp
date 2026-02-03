package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReservedOrderItemDto {

    private String orderItemSeqId;
    private String productId;
    private String description;
    private BigDecimal reservedQuantity;
    private String inventoryItemId;
    private String shipGroupSeqId;
}
