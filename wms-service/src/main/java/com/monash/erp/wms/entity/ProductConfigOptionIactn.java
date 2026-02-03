package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class ProductConfigOptionIactn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String configItemId;
    private String configOptionId;
    private String configItemIdTo;
    private String configOptionIdTo;
    private BigDecimal sequenceNum;
    private String configIactnTypeId;
    private String description;
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
public void setConfigOptionId(String configOptionId) {
        this.configOptionId = configOptionId;
    }
public void setConfigItemIdTo(String configItemIdTo) {
        this.configItemIdTo = configItemIdTo;
    }
public void setConfigOptionIdTo(String configOptionIdTo) {
        this.configOptionIdTo = configOptionIdTo;
    }
public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
public void setConfigIactnTypeId(String configIactnTypeId) {
        this.configIactnTypeId = configIactnTypeId;
    }
public void setDescription(String description) {
        this.description = description;
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
