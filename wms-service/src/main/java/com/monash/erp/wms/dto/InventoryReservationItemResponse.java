package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InventoryReservationItemResponse {

    private String orderItemSeqId;
    private String productId;
    private BigDecimal requestedQuantity;
    private BigDecimal reservedQuantity;
    private BigDecimal notAvailableQuantity;
    private List<InventoryReservationAllocationDto> allocations;
}
