package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SalesOrderPicklistRequest {

    private String orderId;
    private String facilityId;
    private String shipGroupSeqId;
    private String shipmentMethodTypeId;
    private List<SalesOrderPicklistItemRequest> items;
}
