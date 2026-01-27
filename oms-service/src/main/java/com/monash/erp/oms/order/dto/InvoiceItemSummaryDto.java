package com.monash.erp.oms.order.dto;

import java.math.BigDecimal;

public class InvoiceItemSummaryDto {

    private String productId;
    private BigDecimal quantity;
    private BigDecimal amount;

    public InvoiceItemSummaryDto() {
    }

    public InvoiceItemSummaryDto(String productId, BigDecimal quantity, BigDecimal amount) {
        this.productId = productId;
        this.quantity = quantity;
        this.amount = amount;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
