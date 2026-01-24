package com.monash.erp.oms.order.dto;

public class OrderListResponse {

    private OrderListResponseMap responseMap;

    public OrderListResponse() {
    }

    public OrderListResponse(OrderListResponseMap responseMap) {
        this.responseMap = responseMap;
    }

    public OrderListResponseMap getResponseMap() {
        return responseMap;
    }

    public void setResponseMap(OrderListResponseMap responseMap) {
        this.responseMap = responseMap;
    }
}
