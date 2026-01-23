package com.monash.erp.wms.dto;

import com.monash.erp.wms.entity.ProductCategory;
import java.util.List;

public class ProductCategoryDetailResponse {

    private ProductCategory category;
    private List<CategoryProductDto> products;

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public List<CategoryProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<CategoryProductDto> products) {
        this.products = products;
    }
}
