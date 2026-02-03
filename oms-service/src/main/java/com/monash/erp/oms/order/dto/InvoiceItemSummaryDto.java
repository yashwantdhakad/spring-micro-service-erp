package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InvoiceItemSummaryDto {

    private String productId;
    private BigDecimal quantity;
    private BigDecimal amount;
}
