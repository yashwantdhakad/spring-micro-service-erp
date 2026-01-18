package com.monash.erp.party.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class ProtectedView {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String groupId;

    private String viewNameId;

    private BigDecimal maxHits;

    private BigDecimal maxHitsDuration;

    private BigDecimal tarpitDuration;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getViewNameId() {
        return viewNameId;
    }

    public void setViewNameId(String viewNameId) {
        this.viewNameId = viewNameId;
    }

    public BigDecimal getMaxHits() {
        return maxHits;
    }

    public void setMaxHits(BigDecimal maxHits) {
        this.maxHits = maxHits;
    }

    public BigDecimal getMaxHitsDuration() {
        return maxHitsDuration;
    }

    public void setMaxHitsDuration(BigDecimal maxHitsDuration) {
        this.maxHitsDuration = maxHitsDuration;
    }

    public BigDecimal getTarpitDuration() {
        return tarpitDuration;
    }

    public void setTarpitDuration(BigDecimal tarpitDuration) {
        this.tarpitDuration = tarpitDuration;
    }
}
