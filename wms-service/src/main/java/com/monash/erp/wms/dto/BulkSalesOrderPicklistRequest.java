package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BulkSalesOrderPicklistRequest {
    private String facilityId;
    private List<SalesOrderPicklistRequest> orders;
}
