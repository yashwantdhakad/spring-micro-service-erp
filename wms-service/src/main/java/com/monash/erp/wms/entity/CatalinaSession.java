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
public class CatalinaSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sessionId;
    private BigDecimal sessionSize;
    private String sessionInfo;
    private String isValid;
    private BigDecimal maxIdle;
    private BigDecimal lastAccessed;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
public void setSessionSize(BigDecimal sessionSize) {
        this.sessionSize = sessionSize;
    }
public void setSessionInfo(String sessionInfo) {
        this.sessionInfo = sessionInfo;
    }
public void setIsValid(String isValid) {
        this.isValid = isValid;
    }
public void setMaxIdle(BigDecimal maxIdle) {
        this.maxIdle = maxIdle;
    }
public void setLastAccessed(BigDecimal lastAccessed) {
        this.lastAccessed = lastAccessed;
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
