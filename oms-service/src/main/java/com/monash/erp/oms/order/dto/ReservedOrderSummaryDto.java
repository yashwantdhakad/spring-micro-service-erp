package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReservedOrderSummaryDto {

    private String orderId;
    private String facilityId;
    private String statusId;
    private LocalDateTime createdDate;
    private BigDecimal pickQuantity;
    private int itemCount;
}
