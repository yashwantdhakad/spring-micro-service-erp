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
public class ServerHitBin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serverHitBinId;
    private String contentId;
    private String hitTypeId;
    private String serverIpAddress;
    private String serverHostName;
    private LocalDateTime binStartDateTime;
    private LocalDateTime binEndDateTime;
    private BigDecimal numberHits;
    private BigDecimal totalTimeMillis;
    private BigDecimal minTimeMillis;
    private BigDecimal maxTimeMillis;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String internalContentId;
public void setId(Long id) {
        this.id = id;
    }
public void setServerHitBinId(String serverHitBinId) {
        this.serverHitBinId = serverHitBinId;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setHitTypeId(String hitTypeId) {
        this.hitTypeId = hitTypeId;
    }
public void setServerIpAddress(String serverIpAddress) {
        this.serverIpAddress = serverIpAddress;
    }
public void setServerHostName(String serverHostName) {
        this.serverHostName = serverHostName;
    }
public void setBinStartDateTime(LocalDateTime binStartDateTime) {
        this.binStartDateTime = binStartDateTime;
    }
public void setBinEndDateTime(LocalDateTime binEndDateTime) {
        this.binEndDateTime = binEndDateTime;
    }
public void setNumberHits(BigDecimal numberHits) {
        this.numberHits = numberHits;
    }
public void setTotalTimeMillis(BigDecimal totalTimeMillis) {
        this.totalTimeMillis = totalTimeMillis;
    }
public void setMinTimeMillis(BigDecimal minTimeMillis) {
        this.minTimeMillis = minTimeMillis;
    }
public void setMaxTimeMillis(BigDecimal maxTimeMillis) {
        this.maxTimeMillis = maxTimeMillis;
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
public void setInternalContentId(String internalContentId) {
        this.internalContentId = internalContentId;
    }

}
