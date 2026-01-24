package com.monash.erp.oms.order.dto;

import com.monash.erp.oms.common.entity.StatusItem;
import java.util.List;

public class OrderDisplayInfoResponse {

    private OrderHeaderDto orderHeader;
    private StatusItem statusItem;
    private List<OrderNoteDto> orderNoteList;
    private FirstPartInfoDto firstPartInfo;
    private FirstPartDto firstPart;
    private List<OrderRoleDto> orderRoleList;
    private List<OrderContactMechDto> orderContactMechList;
    private List<OrderAdjustmentDto> orderAdjustmentList;
    private List<OrderStatusDto> orderStatusList;

    public OrderHeaderDto getOrderHeader() {
        return orderHeader;
    }

    public void setOrderHeader(OrderHeaderDto orderHeader) {
        this.orderHeader = orderHeader;
    }

    public StatusItem getStatusItem() {
        return statusItem;
    }

    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }

    public List<OrderNoteDto> getOrderNoteList() {
        return orderNoteList;
    }

    public void setOrderNoteList(List<OrderNoteDto> orderNoteList) {
        this.orderNoteList = orderNoteList;
    }

    public FirstPartInfoDto getFirstPartInfo() {
        return firstPartInfo;
    }

    public void setFirstPartInfo(FirstPartInfoDto firstPartInfo) {
        this.firstPartInfo = firstPartInfo;
    }

    public FirstPartDto getFirstPart() {
        return firstPart;
    }

    public void setFirstPart(FirstPartDto firstPart) {
        this.firstPart = firstPart;
    }

    public List<OrderRoleDto> getOrderRoleList() {
        return orderRoleList;
    }

    public void setOrderRoleList(List<OrderRoleDto> orderRoleList) {
        this.orderRoleList = orderRoleList;
    }

    public List<OrderContactMechDto> getOrderContactMechList() {
        return orderContactMechList;
    }

    public void setOrderContactMechList(List<OrderContactMechDto> orderContactMechList) {
        this.orderContactMechList = orderContactMechList;
    }

    public List<OrderAdjustmentDto> getOrderAdjustmentList() {
        return orderAdjustmentList;
    }

    public void setOrderAdjustmentList(List<OrderAdjustmentDto> orderAdjustmentList) {
        this.orderAdjustmentList = orderAdjustmentList;
    }

    public List<OrderStatusDto> getOrderStatusList() {
        return orderStatusList;
    }

    public void setOrderStatusList(List<OrderStatusDto> orderStatusList) {
        this.orderStatusList = orderStatusList;
    }
}
