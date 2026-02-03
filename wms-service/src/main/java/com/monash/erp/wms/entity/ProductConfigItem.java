package com.monash.erp.wms.entity;

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
public class ProductConfigItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String configItemId;
    private String configItemTypeId;
    private String configItemName;
    private String description;
    private String longDescription;
    private String imageUrl;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setConfigItemId(String configItemId) {
        this.configItemId = configItemId;
    }
public void setConfigItemTypeId(String configItemTypeId) {
        this.configItemTypeId = configItemTypeId;
    }
public void setConfigItemName(String configItemName) {
        this.configItemName = configItemName;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}
