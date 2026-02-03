package com.monash.erp.oms.order.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderAdjustmentDto {

    private String orderAdjustmentTypeId;
    private String orderItemSeqId;
    private String shipGroupSeqId;
    private String description;
    private BigDecimal amount;
}
