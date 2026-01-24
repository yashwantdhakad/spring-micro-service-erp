package com.monash.erp.wms.dto;

import com.monash.erp.wms.entity.InventoryItem;

import java.util.List;

public class AssetListResponseMap {

    private List<InventoryItem> resultList;
    private long total;

    public AssetListResponseMap() {
    }

    public AssetListResponseMap(List<InventoryItem> resultList, long total) {
        this.resultList = resultList;
        this.total = total;
    }

    public List<InventoryItem> getResultList() {
        return resultList;
    }

    public void setResultList(List<InventoryItem> resultList) {
        this.resultList = resultList;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
