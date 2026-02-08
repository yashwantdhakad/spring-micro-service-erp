package com.monash.erp.oms.party.entity;

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
public class PartySkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyId;
    private String skillTypeId;
    private BigDecimal yearsExperience;
    private BigDecimal rating;
    private BigDecimal skillLevel;
    private LocalDateTime startedUsingDate;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setSkillTypeId(String skillTypeId) {
        this.skillTypeId = skillTypeId;
    }
public void setYearsExperience(BigDecimal yearsExperience) {
        this.yearsExperience = yearsExperience;
    }
public void setRating(BigDecimal rating) {
        this.rating = rating;
    }
public void setSkillLevel(BigDecimal skillLevel) {
        this.skillLevel = skillLevel;
    }
public void setStartedUsingDate(LocalDateTime startedUsingDate) {
        this.startedUsingDate = startedUsingDate;
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
