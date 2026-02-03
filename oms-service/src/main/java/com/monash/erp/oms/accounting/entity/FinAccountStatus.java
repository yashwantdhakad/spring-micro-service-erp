package com.monash.erp.oms.accounting.entity;

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
public class FinAccountStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String finAccountId;

    private String statusId;

    private LocalDateTime statusDate;

    private LocalDateTime statusEndDate;

    private String changeByUserLoginId;
public void setId(Long id) {
        this.id = id;
    }
public void setFinAccountId(String finAccountId) {
        this.finAccountId = finAccountId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setStatusDate(LocalDateTime statusDate) {
        this.statusDate = statusDate;
    }
public void setStatusEndDate(LocalDateTime statusEndDate) {
        this.statusEndDate = statusEndDate;
    }
public void setChangeByUserLoginId(String changeByUserLoginId) {
        this.changeByUserLoginId = changeByUserLoginId;
    }
}
