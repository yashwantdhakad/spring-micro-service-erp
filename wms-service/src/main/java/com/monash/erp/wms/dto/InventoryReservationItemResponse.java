package com.monash.erp.wms.dto;

import java.math.BigDecimal;
import java.util.List;

public class InventoryReservationItemResponse {

    private String orderItemSeqId;
    private String productId;
    private BigDecimal requestedQuantity;
    private BigDecimal reservedQuantity;
    private BigDecimal notAvailableQuantity;
    private List<InventoryReservationAllocationDto> allocations;

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getRequestedQuantity() {
        return requestedQuantity;
    }

    public void setRequestedQuantity(BigDecimal requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public BigDecimal getReservedQuantity() {
        return reservedQuantity;
    }

    public void setReservedQuantity(BigDecimal reservedQuantity) {
        this.reservedQuantity = reservedQuantity;
    }

    public BigDecimal getNotAvailableQuantity() {
        return notAvailableQuantity;
    }

    public void setNotAvailableQuantity(BigDecimal notAvailableQuantity) {
        this.notAvailableQuantity = notAvailableQuantity;
    }

    public List<InventoryReservationAllocationDto> getAllocations() {
        return allocations;
    }

    public void setAllocations(List<InventoryReservationAllocationDto> allocations) {
        this.allocations = allocations;
    }
}
