package com.monash.erp.wms.dto;

import com.monash.erp.wms.entity.InventoryItem;
import com.monash.erp.wms.entity.InventoryItemDetail;
import com.monash.erp.wms.entity.ItemIssuance;
import com.monash.erp.wms.entity.ShipmentReceipt;

import java.util.List;

public class AssetDetailResponse {

    private InventoryItem asset;
    private List<InventoryItemDetail> details;
    private List<ShipmentReceipt> receipts;
    private List<ItemIssuance> issuances;

    public AssetDetailResponse() {
    }

    public AssetDetailResponse(
            InventoryItem asset,
            List<InventoryItemDetail> details,
            List<ShipmentReceipt> receipts,
            List<ItemIssuance> issuances
    ) {
        this.asset = asset;
        this.details = details;
        this.receipts = receipts;
        this.issuances = issuances;
    }

    public InventoryItem getAsset() {
        return asset;
    }

    public void setAsset(InventoryItem asset) {
        this.asset = asset;
    }

    public List<InventoryItemDetail> getDetails() {
        return details;
    }

    public void setDetails(List<InventoryItemDetail> details) {
        this.details = details;
    }

    public List<ShipmentReceipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<ShipmentReceipt> receipts) {
        this.receipts = receipts;
    }

    public List<ItemIssuance> getIssuances() {
        return issuances;
    }

    public void setIssuances(List<ItemIssuance> issuances) {
        this.issuances = issuances;
    }
}
