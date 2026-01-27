package com.monash.erp.wms.dto;

import java.math.BigDecimal;

public class InventoryReservationAllocationDto {

    private String inventoryItemId;
    private BigDecimal quantity;

    public InventoryReservationAllocationDto() {
    }

    public InventoryReservationAllocationDto(String inventoryItemId, BigDecimal quantity) {
        this.inventoryItemId = inventoryItemId;
        this.quantity = quantity;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
}
