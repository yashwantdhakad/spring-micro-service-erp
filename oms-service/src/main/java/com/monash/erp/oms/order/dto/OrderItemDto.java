package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderItemDto {

    private String orderItemSeqId;
    private String productId;
    private ProductDto product;
    private String itemDescription;
    private ItemTypeDto itemType;
    private LocalDateTime requiredByDate;
    private BigDecimal unitAmount;
    private BigDecimal quantity;
    private BigDecimal receivedQuantity;
    private BigDecimal remainingQuantity;
    private BigDecimal pickedQuantity;
}
