package com.monash.erp.party.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class PartyProfileDefault {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyId;
    private String productStoreId;
    private String defaultShipAddr;
    private String defaultBillAddr;
    private String defaultPayMeth;
    private String defaultShipMeth;
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

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getDefaultShipAddr() {
        return defaultShipAddr;
    }

    public void setDefaultShipAddr(String defaultShipAddr) {
        this.defaultShipAddr = defaultShipAddr;
    }

    public String getDefaultBillAddr() {
        return defaultBillAddr;
    }

    public void setDefaultBillAddr(String defaultBillAddr) {
        this.defaultBillAddr = defaultBillAddr;
    }

    public String getDefaultPayMeth() {
        return defaultPayMeth;
    }

    public void setDefaultPayMeth(String defaultPayMeth) {
        this.defaultPayMeth = defaultPayMeth;
    }

    public String getDefaultShipMeth() {
        return defaultShipMeth;
    }

    public void setDefaultShipMeth(String defaultShipMeth) {
        this.defaultShipMeth = defaultShipMeth;
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