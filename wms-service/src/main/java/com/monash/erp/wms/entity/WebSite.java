package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WebSite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productStoreId;
    private String allowProductStoreChange;
    private String hostedPathAlias;
    private String isDefault;
    private String displayMaintenancePage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getAllowProductStoreChange() {
        return allowProductStoreChange;
    }

    public void setAllowProductStoreChange(String allowProductStoreChange) {
        this.allowProductStoreChange = allowProductStoreChange;
    }

    public String getHostedPathAlias() {
        return hostedPathAlias;
    }

    public void setHostedPathAlias(String hostedPathAlias) {
        this.hostedPathAlias = hostedPathAlias;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public String getDisplayMaintenancePage() {
        return displayMaintenancePage;
    }

    public void setDisplayMaintenancePage(String displayMaintenancePage) {
        this.displayMaintenancePage = displayMaintenancePage;
    }

}