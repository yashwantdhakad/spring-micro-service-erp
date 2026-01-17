package com.example.erp.oms.accounting.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FixedAssetIdentType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fixedAssetIdentTypeId;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFixedAssetIdentTypeId() {
        return fixedAssetIdentTypeId;
    }

    public void setFixedAssetIdentTypeId(String fixedAssetIdentTypeId) {
        this.fixedAssetIdentTypeId = fixedAssetIdentTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
