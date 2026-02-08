package com.monash.erp.mfg.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "work_effort_good_standard",
        indexes = {
                @Index(name = "idx_wegs_work_effort_id", columnList = "work_effort_id"),
                @Index(name = "idx_wegs_product_id", columnList = "product_id"),
                @Index(name = "idx_wegs_status_id", columnList = "status_id"),
                @Index(name = "idx_wegs_reference_number", columnList = "wegs_reference_number")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class WorkEffortGoodStandard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workEffortId;
    private String productId;
    private String workEffortGoodStdTypeId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String statusId;
    private String estimatedQuantity;
    private String estimatedCost;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
    private String drawingItemNumber;
    private String isNonProcurable;
    private String isCustomerSupplied;
    private String fromWholeAssembly;
    private String itemCondition;
    private String reasonEnumId;
    private String comment;
    private LocalDateTime expediteDate;
    private String isExpedite;
    private String cancelQuantity;
    private String recreateQuantity;
    private String wegsReferenceNumber;
    private String isPmaAllowed;
    private String noPmaAllowed;
    private String invAuthEnumId;
    private String mltrUseAuth;
    private String commUseAuth;
    private String mrgtAuth;
    private String mrslAuth;
    private String propRepAuth;
public void setId(Long id) {
        this.id = id;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setWorkEffortGoodStdTypeId(String workEffortGoodStdTypeId) {
        this.workEffortGoodStdTypeId = workEffortGoodStdTypeId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setEstimatedQuantity(String estimatedQuantity) {
        this.estimatedQuantity = estimatedQuantity;
    }
public void setEstimatedCost(String estimatedCost) {
        this.estimatedCost = estimatedCost;
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
public void setDrawingItemNumber(String drawingItemNumber) {
        this.drawingItemNumber = drawingItemNumber;
    }
public void setIsNonProcurable(String isNonProcurable) {
        this.isNonProcurable = isNonProcurable;
    }
public void setIsCustomerSupplied(String isCustomerSupplied) {
        this.isCustomerSupplied = isCustomerSupplied;
    }
public void setFromWholeAssembly(String fromWholeAssembly) {
        this.fromWholeAssembly = fromWholeAssembly;
    }
public void setItemCondition(String itemCondition) {
        this.itemCondition = itemCondition;
    }
public void setReasonEnumId(String reasonEnumId) {
        this.reasonEnumId = reasonEnumId;
    }
public void setComment(String comment) {
        this.comment = comment;
    }
public void setExpediteDate(LocalDateTime expediteDate) {
        this.expediteDate = expediteDate;
    }
public void setIsExpedite(String isExpedite) {
        this.isExpedite = isExpedite;
    }
public void setCancelQuantity(String cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }
public void setRecreateQuantity(String recreateQuantity) {
        this.recreateQuantity = recreateQuantity;
    }
public void setWegsReferenceNumber(String wegsReferenceNumber) {
        this.wegsReferenceNumber = wegsReferenceNumber;
    }
public void setIsPmaAllowed(String isPmaAllowed) {
        this.isPmaAllowed = isPmaAllowed;
    }
public void setNoPmaAllowed(String noPmaAllowed) {
        this.noPmaAllowed = noPmaAllowed;
    }
public void setInvAuthEnumId(String invAuthEnumId) {
        this.invAuthEnumId = invAuthEnumId;
    }
public void setMltrUseAuth(String mltrUseAuth) {
        this.mltrUseAuth = mltrUseAuth;
    }
public void setCommUseAuth(String commUseAuth) {
        this.commUseAuth = commUseAuth;
    }
public void setMrgtAuth(String mrgtAuth) {
        this.mrgtAuth = mrgtAuth;
    }
public void setMrslAuth(String mrslAuth) {
        this.mrslAuth = mrslAuth;
    }
public void setPropRepAuth(String propRepAuth) {
        this.propRepAuth = propRepAuth;
    }
}
