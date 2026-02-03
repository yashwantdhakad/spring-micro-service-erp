package com.monash.erp.oms.common.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class PortalPagePortlet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String portalPageId;

    private String portalPortletId;

    private String portletSeqId;

    private String columnSeqId;

    private BigDecimal sequenceNum;
public void setId(Long id) {
        this.id = id;
    }
public void setPortalPageId(String portalPageId) {
        this.portalPageId = portalPageId;
    }
public void setPortalPortletId(String portalPortletId) {
        this.portalPortletId = portalPortletId;
    }
public void setPortletSeqId(String portletSeqId) {
        this.portletSeqId = portletSeqId;
    }
public void setColumnSeqId(String columnSeqId) {
        this.columnSeqId = columnSeqId;
    }
public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
}
