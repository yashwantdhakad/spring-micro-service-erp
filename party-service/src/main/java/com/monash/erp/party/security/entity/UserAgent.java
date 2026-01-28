package com.monash.erp.party.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class UserAgent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userAgentId;
    private String browserTypeId;
    private String platformTypeId;
    private String protocolTypeId;
    private String userAgentTypeId;
    private String userAgentMethodTypeId;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserAgentId() {
        return userAgentId;
    }

    public void setUserAgentId(String userAgentId) {
        this.userAgentId = userAgentId;
    }

    public String getBrowserTypeId() {
        return browserTypeId;
    }

    public void setBrowserTypeId(String browserTypeId) {
        this.browserTypeId = browserTypeId;
    }

    public String getPlatformTypeId() {
        return platformTypeId;
    }

    public void setPlatformTypeId(String platformTypeId) {
        this.platformTypeId = platformTypeId;
    }

    public String getProtocolTypeId() {
        return protocolTypeId;
    }

    public void setProtocolTypeId(String protocolTypeId) {
        this.protocolTypeId = protocolTypeId;
    }

    public String getUserAgentTypeId() {
        return userAgentTypeId;
    }

    public void setUserAgentTypeId(String userAgentTypeId) {
        this.userAgentTypeId = userAgentTypeId;
    }

    public String getUserAgentMethodTypeId() {
        return userAgentMethodTypeId;
    }

    public void setUserAgentMethodTypeId(String userAgentMethodTypeId) {
        this.userAgentMethodTypeId = userAgentMethodTypeId;
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

}