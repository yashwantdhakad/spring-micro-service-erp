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
public class Agreement extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String agreementId;
    private String productId;
    private String partyIdFrom;
    private String partyIdTo;
    private String roleTypeIdFrom;
    private String roleTypeIdTo;
    private String agreementTypeId;
    private LocalDateTime agreementDate;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String description;
    private String textData;
public void setId(Long id) {
        this.id = id;
    }
public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }
public void setProductId(String productId) {
        this.productId = productId;
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
public void setAgreementTypeId(String agreementTypeId) {
        this.agreementTypeId = agreementTypeId;
    }
public void setAgreementDate(LocalDateTime agreementDate) {
        this.agreementDate = agreementDate;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setTextData(String textData) {
        this.textData = textData;
    }

}
