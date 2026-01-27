package com.monash.erp.oms.order.dto;

import java.util.List;

public class PurchaseOrderReceiveResponse {

    private String shipmentId;
    private List<PurchaseOrderReceiptDto> receipts;

    public PurchaseOrderReceiveResponse() {
    }

    public PurchaseOrderReceiveResponse(String shipmentId, List<PurchaseOrderReceiptDto> receipts) {
        this.shipmentId = shipmentId;
        this.receipts = receipts;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public List<PurchaseOrderReceiptDto> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<PurchaseOrderReceiptDto> receipts) {
        this.receipts = receipts;
    }
}
