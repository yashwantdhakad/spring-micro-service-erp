package com.monash.erp.wms.dto;

import com.monash.erp.wms.entity.Product;

public class ProductCreateResponse {

    private Product product;
    private ProductPriceDto price;

    public ProductCreateResponse() {
    }

    public ProductCreateResponse(Product product, ProductPriceDto price) {
        this.product = product;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductPriceDto getPrice() {
        return price;
    }

    public void setPrice(ProductPriceDto price) {
        this.price = price;
    }
}
