package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InventoryReservationResponse {

    private String orderId;
    private String facilityId;
    private String shipGroupSeqId;
    private List<InventoryReservationItemResponse> items;
}
