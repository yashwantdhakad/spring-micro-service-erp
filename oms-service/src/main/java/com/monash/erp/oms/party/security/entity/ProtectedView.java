package com.monash.erp.oms.party.security.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;

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
}
