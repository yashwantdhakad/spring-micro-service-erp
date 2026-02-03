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
public class QuoteItem extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String quoteId;
    private String quoteItemSeqId;
    private String productId;
    private String productFeatureId;
    private String deliverableTypeId;
    private String skillTypeId;
    private String uomId;
    private String workEffortId;
    private String custRequestId;
    private String custRequestItemSeqId;
    private BigDecimal quantity;
    private BigDecimal selectedAmount;
    private BigDecimal quoteUnitPrice;
    private LocalDateTime reservStart;
    private BigDecimal reservLength;
    private BigDecimal reservPersons;
    private String configId;
    private LocalDateTime estimatedDeliveryDate;
    private String comments;
    private String isPromo;
    private BigDecimal leadTimeDays;
    private String externalId;
    private String itemCondition;
    private BigDecimal standardLeadTimeDays;
    private String trace;
    private String priorityCode;
public void setId(Long id) {
        this.id = id;
    }
public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }
public void setQuoteItemSeqId(String quoteItemSeqId) {
        this.quoteItemSeqId = quoteItemSeqId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }
public void setDeliverableTypeId(String deliverableTypeId) {
        this.deliverableTypeId = deliverableTypeId;
    }
public void setSkillTypeId(String skillTypeId) {
        this.skillTypeId = skillTypeId;
    }
public void setUomId(String uomId) {
        this.uomId = uomId;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setCustRequestId(String custRequestId) {
        this.custRequestId = custRequestId;
    }
public void setCustRequestItemSeqId(String custRequestItemSeqId) {
        this.custRequestItemSeqId = custRequestItemSeqId;
    }
public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
public void setSelectedAmount(BigDecimal selectedAmount) {
        this.selectedAmount = selectedAmount;
    }
public void setQuoteUnitPrice(BigDecimal quoteUnitPrice) {
        this.quoteUnitPrice = quoteUnitPrice;
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
public void setEstimatedDeliveryDate(LocalDateTime estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setIsPromo(String isPromo) {
        this.isPromo = isPromo;
    }
public void setLeadTimeDays(BigDecimal leadTimeDays) {
        this.leadTimeDays = leadTimeDays;
    }
public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
public void setItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
    }
public void setStandardLeadTimeDays(BigDecimal standardLeadTimeDays) {
        this.standardLeadTimeDays = standardLeadTimeDays;
    }
public void setTrace(String trace) {
        this.trace = trace;
    }
public void setPriorityCode(String priorityCode) {
        this.priorityCode = priorityCode;
    }

}
