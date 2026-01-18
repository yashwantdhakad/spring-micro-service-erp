package com.monash.erp.oms.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SystemProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String systemResourceId;

    private String systemPropertyId;

    private String systemPropertyValue;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSystemResourceId() {
        return systemResourceId;
    }

    public void setSystemResourceId(String systemResourceId) {
        this.systemResourceId = systemResourceId;
    }

    public String getSystemPropertyId() {
        return systemPropertyId;
    }

    public void setSystemPropertyId(String systemPropertyId) {
        this.systemPropertyId = systemPropertyId;
    }

    public String getSystemPropertyValue() {
        return systemPropertyValue;
    }

    public void setSystemPropertyValue(String systemPropertyValue) {
        this.systemPropertyValue = systemPropertyValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
