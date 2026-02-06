package com.monash.erp.wms.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhysicalInventoryVarianceRequest {
    private String varianceReasonId;
    private String availableToPromiseVar;
    private String quantityOnHandVar;
    private String comments;
}
