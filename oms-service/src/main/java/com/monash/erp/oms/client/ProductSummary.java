package com.monash.erp.oms.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ProductSummary(String sku, String name, String description) {
}
