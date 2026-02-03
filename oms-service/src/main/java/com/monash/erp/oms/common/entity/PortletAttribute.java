package com.monash.erp.oms.common.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class PortletAttribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String portalPageId;

    private String portalPortletId;

    private String portletSeqId;

    private String attrName;

    private String attrValue;

    private String attrDescription;

    private String attrType;
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
public void setAttrName(String attrName) {
        this.attrName = attrName;
    }
public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }
public void setAttrDescription(String attrDescription) {
        this.attrDescription = attrDescription;
    }
public void setAttrType(String attrType) {
        this.attrType = attrType;
    }
}
