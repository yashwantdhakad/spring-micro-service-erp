package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PicklistItemDetailDto {

    private String orderId;
    private String orderItemSeqId;
    private String shipGroupSeqId;
    private String inventoryItemId;
    private String itemStatusId;
    private BigDecimal quantity;
}
