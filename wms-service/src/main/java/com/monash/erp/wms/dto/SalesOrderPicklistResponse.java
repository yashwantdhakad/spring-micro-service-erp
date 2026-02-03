package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SalesOrderPicklistResponse {

    private String picklistId;
    private String picklistBinId;
    private String shipmentId;
}
