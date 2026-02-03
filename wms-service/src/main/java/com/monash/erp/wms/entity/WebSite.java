package com.monash.erp.wms.entity;

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
public class WebSite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productStoreId;
    private String allowProductStoreChange;
    private String hostedPathAlias;
    private String isDefault;
    private String displayMaintenancePage;
public void setId(Long id) {
        this.id = id;
    }
public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
public void setAllowProductStoreChange(String allowProductStoreChange) {
        this.allowProductStoreChange = allowProductStoreChange;
    }
public void setHostedPathAlias(String hostedPathAlias) {
        this.hostedPathAlias = hostedPathAlias;
    }
public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }
public void setDisplayMaintenancePage(String displayMaintenancePage) {
        this.displayMaintenancePage = displayMaintenancePage;
    }

}
