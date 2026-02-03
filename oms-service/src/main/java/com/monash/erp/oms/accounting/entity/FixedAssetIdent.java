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
public class FixedAssetIdent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fixedAssetId;

    private String fixedAssetIdentTypeId;

    private String idValue;
public void setId(Long id) {
        this.id = id;
    }
public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }
public void setFixedAssetIdentTypeId(String fixedAssetIdentTypeId) {
        this.fixedAssetIdentTypeId = fixedAssetIdentTypeId;
    }
public void setIdValue(String idValue) {
        this.idValue = idValue;
    }
}
