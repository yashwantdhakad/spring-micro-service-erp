package com.monash.erp.wms.dto;

public class AssetListResponse {

    private AssetListResponseMap responseMap;

    public AssetListResponse() {
    }

    public AssetListResponse(AssetListResponseMap responseMap) {
        this.responseMap = responseMap;
    }

    public AssetListResponseMap getResponseMap() {
        return responseMap;
    }

    public void setResponseMap(AssetListResponseMap responseMap) {
        this.responseMap = responseMap;
    }
}
