package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import com.monash.erp.wms.entity.Product;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductCreateResponse {

    private Product product;
    private ProductPriceDto price;
}
