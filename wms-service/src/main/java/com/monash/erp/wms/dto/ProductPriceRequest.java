package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductPriceRequest {

    private String productPriceTypeId;
    private String productPricePurposeId;
    private String price;
    private String currencyUomId;
}
