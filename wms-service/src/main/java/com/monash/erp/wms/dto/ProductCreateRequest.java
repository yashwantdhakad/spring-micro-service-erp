package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductCreateRequest {

    private String productName;
    private String productTypeId;
    private String description;
    private String price;
    private String currencyUomId;
}
