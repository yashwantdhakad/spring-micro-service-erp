package com.monash.erp.wms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServerHitBinId() {
        return serverHitBinId;
    }

    public void setServerHitBinId(String serverHitBinId) {
        this.serverHitBinId = serverHitBinId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getHitTypeId() {
        return hitTypeId;
    }

    public void setHitTypeId(String hitTypeId) {
        this.hitTypeId = hitTypeId;
    }

    public String getServerIpAddress() {
        return serverIpAddress;
    }

    public void setServerIpAddress(String serverIpAddress) {
        this.serverIpAddress = serverIpAddress;
    }

    public String getServerHostName() {
        return serverHostName;
    }

    public void setServerHostName(String serverHostName) {
        this.serverHostName = serverHostName;
    }

    public LocalDateTime getBinStartDateTime() {
        return binStartDateTime;
    }

    public void setBinStartDateTime(LocalDateTime binStartDateTime) {
        this.binStartDateTime = binStartDateTime;
    }

    public LocalDateTime getBinEndDateTime() {
        return binEndDateTime;
    }

    public void setBinEndDateTime(LocalDateTime binEndDateTime) {
        this.binEndDateTime = binEndDateTime;
    }

    public BigDecimal getNumberHits() {
        return numberHits;
    }

    public void setNumberHits(BigDecimal numberHits) {
        this.numberHits = numberHits;
    }

    public BigDecimal getTotalTimeMillis() {
        return totalTimeMillis;
    }

    public void setTotalTimeMillis(BigDecimal totalTimeMillis) {
        this.totalTimeMillis = totalTimeMillis;
    }

    public BigDecimal getMinTimeMillis() {
        return minTimeMillis;
    }

    public void setMinTimeMillis(BigDecimal minTimeMillis) {
        this.minTimeMillis = minTimeMillis;
    }

    public BigDecimal getMaxTimeMillis() {
        return maxTimeMillis;
    }

    public void setMaxTimeMillis(BigDecimal maxTimeMillis) {
        this.maxTimeMillis = maxTimeMillis;
    }

    public LocalDateTime getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public LocalDateTime getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public LocalDateTime getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }

    public LocalDateTime getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public String getInternalContentId() {
        return internalContentId;
    }

    public void setInternalContentId(String internalContentId) {
        this.internalContentId = internalContentId;
    }

}