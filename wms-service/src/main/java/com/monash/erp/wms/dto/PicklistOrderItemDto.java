package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PicklistOrderItemDto {

    private String orderItemSeqId;
    private String inventoryItemId;
    private String itemStatusId;
    private BigDecimal quantity;
    private String productId;
    private String productName;
    private String location;
    private String lotId;
}
