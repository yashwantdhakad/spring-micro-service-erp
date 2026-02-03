package com.monash.erp.oms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class ProdCatalog extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String prodCatalogId;
    private String catalogName;
    private String useQuickAdd;
    private String styleSheet;
    private String headerLogo;
    private String contentPathPrefix;
    private String templatePathPrefix;
    private String viewAllowPermReqd;
    private String purchaseAllowPermReqd;
public void setId(Long id) {
        this.id = id;
    }
public void setProdCatalogId(String prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
    }
public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }
public void setUseQuickAdd(String useQuickAdd) {
        this.useQuickAdd = useQuickAdd;
    }
public void setStyleSheet(String styleSheet) {
        this.styleSheet = styleSheet;
    }
public void setHeaderLogo(String headerLogo) {
        this.headerLogo = headerLogo;
    }
public void setContentPathPrefix(String contentPathPrefix) {
        this.contentPathPrefix = contentPathPrefix;
    }
public void setTemplatePathPrefix(String templatePathPrefix) {
        this.templatePathPrefix = templatePathPrefix;
    }
public void setViewAllowPermReqd(String viewAllowPermReqd) {
        this.viewAllowPermReqd = viewAllowPermReqd;
    }
public void setPurchaseAllowPermReqd(String purchaseAllowPermReqd) {
        this.purchaseAllowPermReqd = purchaseAllowPermReqd;
    }

}
