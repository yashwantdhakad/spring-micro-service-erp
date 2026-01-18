package com.monash.erp.oms.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class PortalPageColumn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String portalPageId;

    private String columnSeqId;

    private BigDecimal columnWidthPixels;

    private BigDecimal columnWidthPercentage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPortalPageId() {
        return portalPageId;
    }

    public void setPortalPageId(String portalPageId) {
        this.portalPageId = portalPageId;
    }

    public String getColumnSeqId() {
        return columnSeqId;
    }

    public void setColumnSeqId(String columnSeqId) {
        this.columnSeqId = columnSeqId;
    }

    public BigDecimal getColumnWidthPixels() {
        return columnWidthPixels;
    }

    public void setColumnWidthPixels(BigDecimal columnWidthPixels) {
        this.columnWidthPixels = columnWidthPixels;
    }

    public BigDecimal getColumnWidthPercentage() {
        return columnWidthPercentage;
    }

    public void setColumnWidthPercentage(BigDecimal columnWidthPercentage) {
        this.columnWidthPercentage = columnWidthPercentage;
    }
}
