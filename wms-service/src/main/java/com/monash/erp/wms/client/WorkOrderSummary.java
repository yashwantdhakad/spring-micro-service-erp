package com.monash.erp.wms.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.Instant;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WorkOrderSummary(Long id, String sku, String status, int quantity, Instant scheduledDate) {
}

