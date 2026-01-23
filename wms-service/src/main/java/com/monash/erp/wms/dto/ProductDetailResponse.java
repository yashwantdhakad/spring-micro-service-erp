package com.monash.erp.wms.dto;

import com.monash.erp.wms.entity.Product;
import java.util.List;

public class ProductDetailResponse {

    private Product product;
    private List<ProductPriceDto> prices;
    private List<ProductCategoryDto> categories;
    private List<ProductContentDto> contents;
    private List<ProductAssocDto> assocs;
    private List<ProductAssocDto> toAssocs;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<ProductPriceDto> getPrices() {
        return prices;
    }

    public void setPrices(List<ProductPriceDto> prices) {
        this.prices = prices;
    }

    public List<ProductCategoryDto> getCategories() {
        return categories;
    }

    public void setCategories(List<ProductCategoryDto> categories) {
        this.categories = categories;
    }

    public List<ProductContentDto> getContents() {
        return contents;
    }

    public void setContents(List<ProductContentDto> contents) {
        this.contents = contents;
    }

    public List<ProductAssocDto> getAssocs() {
        return assocs;
    }

    public void setAssocs(List<ProductAssocDto> assocs) {
        this.assocs = assocs;
    }

    public List<ProductAssocDto> getToAssocs() {
        return toAssocs;
    }

    public void setToAssocs(List<ProductAssocDto> toAssocs) {
        this.toAssocs = toAssocs;
    }
}
