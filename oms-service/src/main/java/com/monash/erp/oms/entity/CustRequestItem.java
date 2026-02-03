package com.monash.erp.oms.entity;

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
public class CustRequestItem extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String custRequestId;
    private String custRequestItemSeqId;
    private String custRequestResolutionId;
    private String statusId;
    private BigDecimal priority;
    private BigDecimal sequenceNum;
    private LocalDateTime requiredByDate;
    private String productId;
    private BigDecimal quantity;
    private BigDecimal selectedAmount;
    private BigDecimal maximumAmount;
    private LocalDateTime reservStart;
    private BigDecimal reservLength;
    private BigDecimal reservPersons;
    private String configId;
    private String description;
    private String story;
public void setId(Long id) {
        this.id = id;
    }
public void setCustRequestId(String custRequestId) {
        this.custRequestId = custRequestId;
    }
public void setCustRequestItemSeqId(String custRequestItemSeqId) {
        this.custRequestItemSeqId = custRequestItemSeqId;
    }
public void setCustRequestResolutionId(String custRequestResolutionId) {
        this.custRequestResolutionId = custRequestResolutionId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setPriority(BigDecimal priority) {
        this.priority = priority;
    }
public void setSequenceNum(BigDecimal sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
public void setRequiredByDate(LocalDateTime requiredByDate) {
        this.requiredByDate = requiredByDate;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setSelectedAmount(BigDecimal selectedAmount) {
        this.selectedAmount = selectedAmount;
    }
public void setMaximumAmount(BigDecimal maximumAmount) {
        this.maximumAmount = maximumAmount;
    }
public void setReservStart(LocalDateTime reservStart) {
        this.reservStart = reservStart;
    }
public void setReservLength(BigDecimal reservLength) {
        this.reservLength = reservLength;
    }
public void setReservPersons(BigDecimal reservPersons) {
        this.reservPersons = reservPersons;
    }
public void setConfigId(String configId) {
        this.configId = configId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setStory(String story) {
        this.story = story;
    }

}
