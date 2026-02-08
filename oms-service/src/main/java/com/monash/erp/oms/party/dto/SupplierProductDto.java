package com.monash.erp.oms.party.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class SupplierProductDto {
    private Long id;
    private String productId;
    private String partyId;
    private LocalDateTime availableFromDate;
    private LocalDateTime availableThruDate;
    private String supplierPrefOrderId;
    private String supplierRatingTypeId;
    private BigDecimal standardLeadTimeDays;
    private BigDecimal minimumOrderQuantity;
    private BigDecimal orderQtyIncrements;
    private BigDecimal unitsIncluded;
    private String quantityUomId;
    private String agreementId;
    private String agreementItemSeqId;
    private BigDecimal lastPrice;
    private String currencyUomId;
    private String supplierProductName;
    private String supplierProductId;
    private String canDropShip;
    private BigDecimal supplierCommissionPerc;
    private String comments;
    private String supplierQuantityUomId;

    // Enriched fields
    private String internalProductName;
}
