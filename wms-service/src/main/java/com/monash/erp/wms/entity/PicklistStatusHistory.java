package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class PicklistStatusHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String picklistId;
    private LocalDateTime changeDate;
    private String changeUserLoginId;
    private String statusId;
    private String statusIdTo;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setPicklistId(String picklistId) {
        this.picklistId = picklistId;
    }
public void setChangeDate(LocalDateTime changeDate) {
        this.changeDate = changeDate;
    }
public void setChangeUserLoginId(String changeUserLoginId) {
        this.changeUserLoginId = changeUserLoginId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setStatusIdTo(String statusIdTo) {
        this.statusIdTo = statusIdTo;
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
