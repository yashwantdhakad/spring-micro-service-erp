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
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productTypeId;
    private String parentTypeId;
    private String isPhysical;
    private String isDigital;
    private String hasTable;
    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }
public void setParentTypeId(String parentTypeId) {
        this.parentTypeId = parentTypeId;
    }
public void setIsPhysical(String isPhysical) {
        this.isPhysical = isPhysical;
    }
public void setIsDigital(String isDigital) {
        this.isDigital = isDigital;
    }
public void setHasTable(String hasTable) {
        this.hasTable = hasTable;
    }
public void setDescription(String description) {
        this.description = description;
    }

}
