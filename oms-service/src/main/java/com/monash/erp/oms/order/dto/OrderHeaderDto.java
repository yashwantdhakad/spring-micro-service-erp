package com.monash.erp.oms.order.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class OrderHeaderDto {
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
    private LocalDateTime createdStamp;
    private LocalDateTime lastUpdatedStamp;
}
