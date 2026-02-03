package com.monash.erp.wms.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import com.monash.erp.wms.entity.ProductCategory;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductCategoryDetailResponse {

    private ProductCategory category;
    private List<CategoryProductDto> products;
}
