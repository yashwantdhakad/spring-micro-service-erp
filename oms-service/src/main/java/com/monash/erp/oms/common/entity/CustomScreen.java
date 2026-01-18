package com.monash.erp.oms.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomScreen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customScreenId;

    private String customScreenTypeId;

    private String customScreenName;

    private String customScreenLocation;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomScreenId() {
        return customScreenId;
    }

    public void setCustomScreenId(String customScreenId) {
        this.customScreenId = customScreenId;
    }

    public String getCustomScreenTypeId() {
        return customScreenTypeId;
    }

    public void setCustomScreenTypeId(String customScreenTypeId) {
        this.customScreenTypeId = customScreenTypeId;
    }

    public String getCustomScreenName() {
        return customScreenName;
    }

    public void setCustomScreenName(String customScreenName) {
        this.customScreenName = customScreenName;
    }

    public String getCustomScreenLocation() {
        return customScreenLocation;
    }

    public void setCustomScreenLocation(String customScreenLocation) {
        this.customScreenLocation = customScreenLocation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
