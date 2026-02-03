package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShipmentListItem {

    private String shipmentId;
    private String shipmentTypeId;
    private String statusId;
    private String primaryOrderId;
    private String originFacilityId;
    private String destinationFacilityId;
    private LocalDateTime estimatedShipDate;
    private LocalDateTime createdDate;
}
