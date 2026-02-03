package com.monash.erp.oms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "order_header",
        indexes = {
                @Index(name = "idx_order_header_order_id", columnList = "order_id"),
                @Index(name = "idx_order_header_order_type", columnList = "order_type_id"),
                @Index(name = "idx_order_header_status_id", columnList = "status_id"),
                @Index(name = "idx_order_header_type_order_id", columnList = "order_type_id, order_id"),
                @Index(name = "idx_order_header_type_order_name", columnList = "order_type_id, order_name")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class OrderHeader extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private String orderTypeId;
    private String orderName;
    private String externalId;
    private String salesChannelEnumId;
    private LocalDateTime orderDate;
    private String priority;
    private LocalDateTime entryDate;
    private LocalDateTime pickSheetPrintedDate;
    private String visitId;
    private String statusId;
    private String createdBy;
    private String firstAttemptOrderId;
    private String currencyUom;
    private String syncStatusId;
    private String billingAccountId;
    private String originFacilityId;
    private String webSiteId;
    private String productStoreId;
    private String terminalId;
    private String transactionId;
    private String autoOrderShoppingListId;
    private String needsInventoryIssuance;
    private String isRushOrder;
    private String internalCode;
    private BigDecimal remainingSubTotal;
    private BigDecimal grandTotal;
    private String isViewed;
    private String workEffortId;
    private String overrideCreditLimit;
public void setId(Long id) {
        this.id = id;
    }
public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
public void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId;
    }
public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
public void setSalesChannelEnumId(String salesChannelEnumId) {
        this.salesChannelEnumId = salesChannelEnumId;
    }
public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
public void setPriority(String priority) {
        this.priority = priority;
    }
public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }
public void setPickSheetPrintedDate(LocalDateTime pickSheetPrintedDate) {
        this.pickSheetPrintedDate = pickSheetPrintedDate;
    }
public void setVisitId(String visitId) {
        this.visitId = visitId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
public void setFirstAttemptOrderId(String firstAttemptOrderId) {
        this.firstAttemptOrderId = firstAttemptOrderId;
    }
public void setCurrencyUom(String currencyUom) {
        this.currencyUom = currencyUom;
    }
public void setSyncStatusId(String syncStatusId) {
        this.syncStatusId = syncStatusId;
    }
public void setBillingAccountId(String billingAccountId) {
        this.billingAccountId = billingAccountId;
    }
public void setOriginFacilityId(String originFacilityId) {
        this.originFacilityId = originFacilityId;
    }
public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId;
    }
public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }
public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
public void setAutoOrderShoppingListId(String autoOrderShoppingListId) {
        this.autoOrderShoppingListId = autoOrderShoppingListId;
    }
public void setNeedsInventoryIssuance(String needsInventoryIssuance) {
        this.needsInventoryIssuance = needsInventoryIssuance;
    }
public void setIsRushOrder(String isRushOrder) {
        this.isRushOrder = isRushOrder;
    }
public void setInternalCode(String internalCode) {
        this.internalCode = internalCode;
    }
public void setRemainingSubTotal(BigDecimal remainingSubTotal) {
        this.remainingSubTotal = remainingSubTotal;
    }
public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }
public void setIsViewed(String isViewed) {
        this.isViewed = isViewed;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setOverrideCreditLimit(String overrideCreditLimit) {
        this.overrideCreditLimit = overrideCreditLimit;
    }

}
