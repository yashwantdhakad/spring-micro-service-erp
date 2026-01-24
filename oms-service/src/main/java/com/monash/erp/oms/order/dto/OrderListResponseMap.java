package com.monash.erp.oms.order.dto;

import java.util.List;

public class OrderListResponseMap {

    private List<OrderListItem> orderList;
    private long orderListCount;

    public OrderListResponseMap() {
    }

    public OrderListResponseMap(List<OrderListItem> orderList, long orderListCount) {
        this.orderList = orderList;
        this.orderListCount = orderListCount;
    }

    public List<OrderListItem> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderListItem> orderList) {
        this.orderList = orderList;
    }

    public long getOrderListCount() {
        return orderListCount;
    }

    public void setOrderListCount(long orderListCount) {
        this.orderListCount = orderListCount;
    }
}
