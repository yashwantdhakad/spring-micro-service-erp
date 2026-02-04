package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductUpdateRequest {

    private String productName;
    private String description;
    private String internalName;
    private String taxable;
    private String returnable;
    private String includeInPromotions;
    private String serialized;
    private String requireInspection;
}
