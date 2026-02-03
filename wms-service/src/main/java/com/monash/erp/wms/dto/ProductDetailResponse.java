package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import com.monash.erp.wms.entity.Product;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDetailResponse {

    private Product product;
    private List<ProductPriceDto> prices;
    private List<ProductCategoryDto> categories;
    private List<ProductContentDto> contents;
    private List<ProductAssocDto> assocs;
    private List<ProductAssocDto> toAssocs;
}
