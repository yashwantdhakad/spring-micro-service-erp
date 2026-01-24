package com.monash.erp.oms.order.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderItemDto {

    private String productId;
    private ProductDto product;
    private String itemDescription;
    private ItemTypeDto itemType;
    private LocalDateTime requiredByDate;
    private BigDecimal unitAmount;
    private BigDecimal quantity;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public ItemTypeDto getItemType() {
        return itemType;
    }

    public void setItemType(ItemTypeDto itemType) {
        this.itemType = itemType;
    }

    public LocalDateTime getRequiredByDate() {
        return requiredByDate;
    }

    public void setRequiredByDate(LocalDateTime requiredByDate) {
        this.requiredByDate = requiredByDate;
    }

    public BigDecimal getUnitAmount() {
        return unitAmount;
    }

    public void setUnitAmount(BigDecimal unitAmount) {
        this.unitAmount = unitAmount;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
}
