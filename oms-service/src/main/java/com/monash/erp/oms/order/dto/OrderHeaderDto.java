package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderHeaderDto {

    private String orderId;
    private LocalDateTime entryDate;
    private String currencyUomId;
    private String productStoreId;
    private BigDecimal grandTotal;
}
