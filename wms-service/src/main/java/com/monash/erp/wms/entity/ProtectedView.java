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
public class ProtectedView {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String groupId;
    private String viewNameId;
    private BigDecimal maxHits;
    private BigDecimal maxHitsDuration;
    private BigDecimal tarpitDuration;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
public void setViewNameId(String viewNameId) {
        this.viewNameId = viewNameId;
    }
public void setMaxHits(BigDecimal maxHits) {
        this.maxHits = maxHits;
    }
public void setMaxHitsDuration(BigDecimal maxHitsDuration) {
        this.maxHitsDuration = maxHitsDuration;
    }
public void setTarpitDuration(BigDecimal tarpitDuration) {
        this.tarpitDuration = tarpitDuration;
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
