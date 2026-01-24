package com.monash.erp.wms.dto;

public class AssetReceiveResponse {

    private String assetId;

    public AssetReceiveResponse() {
    }

    public AssetReceiveResponse(String assetId) {
        this.assetId = assetId;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }
}
