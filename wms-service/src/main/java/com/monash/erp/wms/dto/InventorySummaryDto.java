package com.monash.erp.wms.dto;

import java.math.BigDecimal;

public class InventorySummaryDto {

    private String facilityId;
    private String facilityName;
    private BigDecimal atpTotal;
    private BigDecimal qohTotal;

    public InventorySummaryDto() {
    }

    public InventorySummaryDto(String facilityId, String facilityName, BigDecimal atpTotal, BigDecimal qohTotal) {
        this.facilityId = facilityId;
        this.facilityName = facilityName;
        this.atpTotal = atpTotal;
        this.qohTotal = qohTotal;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public BigDecimal getAtpTotal() {
        return atpTotal;
    }

    public void setAtpTotal(BigDecimal atpTotal) {
        this.atpTotal = atpTotal;
    }

    public BigDecimal getQohTotal() {
        return qohTotal;
    }

    public void setQohTotal(BigDecimal qohTotal) {
        this.qohTotal = qohTotal;
    }
}
