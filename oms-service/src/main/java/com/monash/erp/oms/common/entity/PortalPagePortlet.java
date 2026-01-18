package com.monash.erp.oms.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class PortalPagePortlet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String portalPageId;

    private String portalPortletId;

    private String portletSeqId;

    private String columnSeqId;

    private BigDecimal sequenceNum;

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

    public String getPortalPortletId() {
        return portalPortletId;
    }

    public void setPortalPortletId(String portalPortletId) {
        this.portalPortletId = portalPortletId;
    }

    public String getPortletSeqId() {
        return portletSeqId;
    }

    public void setPortletSeqId(String portletSeqId) {
        this.portletSeqId = portletSeqId;
    }

    public String getColumnSeqId() {
        return columnSeqId;
    }

    public void setColumnSeqId(String columnSeqId) {
        this.columnSeqId = columnSeqId;
    }

    public BigDecimal getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
}
