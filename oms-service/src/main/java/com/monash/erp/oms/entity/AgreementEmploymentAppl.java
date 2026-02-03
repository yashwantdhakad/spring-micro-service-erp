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
public class AgreementEmploymentAppl extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String agreementId;
    private String agreementItemSeqId;
    private String partyIdFrom;
    private String partyIdTo;
    private String roleTypeIdFrom;
    private String roleTypeIdTo;
    private LocalDateTime fromDate;
    private LocalDateTime agreementDate;
    private LocalDateTime thruDate;
public void setId(Long id) {
        this.id = id;
    }
public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }
public void setAgreementItemSeqId(String agreementItemSeqId) {
        this.agreementItemSeqId = agreementItemSeqId;
    }
public void setPartyIdFrom(String partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }
public void setPartyIdTo(String partyIdTo) {
        this.partyIdTo = partyIdTo;
    }
public void setRoleTypeIdFrom(String roleTypeIdFrom) {
        this.roleTypeIdFrom = roleTypeIdFrom;
    }
public void setRoleTypeIdTo(String roleTypeIdTo) {
        this.roleTypeIdTo = roleTypeIdTo;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setAgreementDate(LocalDateTime agreementDate) {
        this.agreementDate = agreementDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }

}
