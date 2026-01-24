package com.monash.erp.wms.dto;

import java.util.List;

public class ShipmentListResponseMap {

    private List<ShipmentListItem> resultList;
    private long total;

    public ShipmentListResponseMap() {
    }

    public ShipmentListResponseMap(List<ShipmentListItem> resultList, long total) {
        this.resultList = resultList;
        this.total = total;
    }

    public List<ShipmentListItem> getResultList() {
        return resultList;
    }

    public void setResultList(List<ShipmentListItem> resultList) {
        this.resultList = resultList;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
