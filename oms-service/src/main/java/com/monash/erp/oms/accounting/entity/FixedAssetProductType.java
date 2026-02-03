package com.monash.erp.oms.accounting.entity;

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
public class FixedAssetProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fixedAssetProductTypeId;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setFixedAssetProductTypeId(String fixedAssetProductTypeId) {
        this.fixedAssetProductTypeId = fixedAssetProductTypeId;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
