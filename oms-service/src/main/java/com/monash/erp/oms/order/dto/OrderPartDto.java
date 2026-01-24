package com.monash.erp.oms.order.dto;

import com.monash.erp.oms.common.entity.StatusItem;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class OrderPartDto {

    private String orderPartSeqId;
    private StatusItem status;
    private TelecomDto telecom;
    private LocalDateTime shipBeforeDate;
    private BigDecimal partTotal;
    private FacilityDto facility;
    private CustomerPartyDto customer;
    private List<OrderItemDto> items;

    public String getOrderPartSeqId() {
        return orderPartSeqId;
    }

    public void setOrderPartSeqId(String orderPartSeqId) {
        this.orderPartSeqId = orderPartSeqId;
    }

    public StatusItem getStatus() {
        return status;
    }

    public void setStatus(StatusItem status) {
        this.status = status;
    }

    public TelecomDto getTelecom() {
        return telecom;
    }

    public void setTelecom(TelecomDto telecom) {
        this.telecom = telecom;
    }

    public LocalDateTime getShipBeforeDate() {
        return shipBeforeDate;
    }

    public void setShipBeforeDate(LocalDateTime shipBeforeDate) {
        this.shipBeforeDate = shipBeforeDate;
    }

    public BigDecimal getPartTotal() {
        return partTotal;
    }

    public void setPartTotal(BigDecimal partTotal) {
        this.partTotal = partTotal;
    }

    public FacilityDto getFacility() {
        return facility;
    }

    public void setFacility(FacilityDto facility) {
        this.facility = facility;
    }

    public CustomerPartyDto getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerPartyDto customer) {
        this.customer = customer;
    }

    public List<OrderItemDto> getItems() {
        return items;
    }

    public void setItems(List<OrderItemDto> items) {
        this.items = items;
    }
}
