package com.monash.erp.oms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class OrderItemAssociation extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String salesOrderId;
    private String soItemSeqId;
    private String purchaseOrderId;
    private String poItemSeqId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSalesOrderId() {
        return salesOrderId;
    }

    public void setSalesOrderId(String salesOrderId) {
        this.salesOrderId = salesOrderId;
    }

    public String getSoItemSeqId() {
        return soItemSeqId;
    }

    public void setSoItemSeqId(String soItemSeqId) {
        this.soItemSeqId = soItemSeqId;
    }

    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getPoItemSeqId() {
        return poItemSeqId;
    }

    public void setPoItemSeqId(String poItemSeqId) {
        this.poItemSeqId = poItemSeqId;
    }




}