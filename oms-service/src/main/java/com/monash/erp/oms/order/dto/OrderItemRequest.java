package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderItemRequest {

    private String orderId;
    private String orderPartSeqId;
    private String productId;
    private BigDecimal quantity;
    private BigDecimal unitAmount;
    private String itemDescription;
    private LocalDateTime requiredByDate;
    private String itemTypeEnumId;
    private LocalDateTime shipBeforeDate;
    private LocalDateTime estimatedDeliveryDate;
}
