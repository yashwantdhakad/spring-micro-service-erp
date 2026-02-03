package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductAssocUpdateRequest {
    private String quantity;
    private String fromDate;
    private String sequenceNum;
}
