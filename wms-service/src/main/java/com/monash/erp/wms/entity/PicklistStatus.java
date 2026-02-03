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
public class PicklistStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String picklistId;
    private LocalDateTime statusDate;
    private String changeByUserLoginId;
    private String statusId;
    private String statusIdTo;
public void setId(Long id) {
        this.id = id;
    }
public void setPicklistId(String picklistId) {
        this.picklistId = picklistId;
    }
public void setStatusDate(LocalDateTime statusDate) {
        this.statusDate = statusDate;
    }
public void setChangeByUserLoginId(String changeByUserLoginId) {
        this.changeByUserLoginId = changeByUserLoginId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setStatusIdTo(String statusIdTo) {
        this.statusIdTo = statusIdTo;
    }

}
