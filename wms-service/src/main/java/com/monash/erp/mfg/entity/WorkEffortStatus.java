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
public class WorkEffortStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workEffortId;
    private String statusId;
    private LocalDateTime statusDatetime;
    private String setByUserLogin;
    private String reason;
public void setId(Long id) {
        this.id = id;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setStatusDatetime(LocalDateTime statusDatetime) {
        this.statusDatetime = statusDatetime;
    }
public void setSetByUserLogin(String setByUserLogin) {
        this.setByUserLogin = setByUserLogin;
    }
public void setReason(String reason) {
        this.reason = reason;
    }

}
