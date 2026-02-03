package com.monash.erp.oms.entity;

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
public class CustRequestStatus extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String custRequestStatusId;
    private String statusId;
    private String custRequestId;
    private String custRequestItemSeqId;
    private LocalDateTime statusDatetime;
public void setId(Long id) {
        this.id = id;
    }
public void setCustRequestStatusId(String custRequestStatusId) {
        this.custRequestStatusId = custRequestStatusId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setCustRequestId(String custRequestId) {
        this.custRequestId = custRequestId;
    }
public void setCustRequestItemSeqId(String custRequestItemSeqId) {
        this.custRequestItemSeqId = custRequestItemSeqId;
    }
public void setStatusDatetime(LocalDateTime statusDatetime) {
        this.statusDatetime = statusDatetime;
    }

}
