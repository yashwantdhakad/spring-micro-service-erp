package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InventoryReservationRequest {

    private String orderId;
    private String shipGroupSeqId;
    private String facilityId;
    private List<InventoryReservationItemRequest> items;
}
