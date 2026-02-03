package com.monash.erp.mfg.entity;

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
public class WorkEffortAssoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workEffortIdFrom;
    private String workEffortIdTo;
    private String workEffortAssocTypeId;
    private String sequenceNum;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
public void setId(Long id) {
        this.id = id;
    }
public void setWorkEffortIdFrom(String workEffortIdFrom) {
        this.workEffortIdFrom = workEffortIdFrom;
    }
public void setWorkEffortIdTo(String workEffortIdTo) {
        this.workEffortIdTo = workEffortIdTo;
    }
public void setWorkEffortAssocTypeId(String workEffortAssocTypeId) {
        this.workEffortAssocTypeId = workEffortAssocTypeId;
    }
public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }

}
