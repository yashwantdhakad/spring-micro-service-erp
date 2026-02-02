package com.monash.erp.oms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class OrderBlacklist extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String blacklistString;
    private String orderBlacklistTypeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBlacklistString() {
        return blacklistString;
    }

    public void setBlacklistString(String blacklistString) {
        this.blacklistString = blacklistString;
    }

    public String getOrderBlacklistTypeId() {
        return orderBlacklistTypeId;
    }

    public void setOrderBlacklistTypeId(String orderBlacklistTypeId) {
        this.orderBlacklistTypeId = orderBlacklistTypeId;
    }




}