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
public class PortalPage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String portalPageId;

    private String portalPageName;

    private String description;

    private String ownerUserLoginId;

    private String originalPortalPageId;

    private String parentPortalPageId;

    private BigDecimal sequenceNum;

    private String securityGroupId;
public void setId(Long id) {
        this.id = id;
    }
public void setPortalPageId(String portalPageId) {
        this.portalPageId = portalPageId;
    }
public void setPortalPageName(String portalPageName) {
        this.portalPageName = portalPageName;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setOwnerUserLoginId(String ownerUserLoginId) {
        this.ownerUserLoginId = ownerUserLoginId;
    }
public void setOriginalPortalPageId(String originalPortalPageId) {
        this.originalPortalPageId = originalPortalPageId;
    }
public void setParentPortalPageId(String parentPortalPageId) {
        this.parentPortalPageId = parentPortalPageId;
    }
public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }
}
