package com.monash.erp.wms.controller;

import com.monash.erp.wms.dto.InventoryReservationRequest;
import com.monash.erp.wms.dto.InventoryReservationResponse;
import com.monash.erp.wms.dto.SalesOrderPicklistRequest;
import com.monash.erp.wms.dto.SalesOrderPicklistResponse;
import com.monash.erp.wms.service.SalesOrderFulfillmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fulfillment")
public class SalesOrderFulfillmentController {

    private final SalesOrderFulfillmentService service;

    public SalesOrderFulfillmentController(SalesOrderFulfillmentService service) {
        this.service = service;
    }

    @PostMapping("/inventory/reserve")
    public ResponseEntity<InventoryReservationResponse> reserve(@RequestBody InventoryReservationRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.reserveInventory(request));
    }

    @PostMapping("/sales-orders/{orderId}/picklist")
    public ResponseEntity<SalesOrderPicklistResponse> createPicklist(
            @PathVariable String orderId,
            @RequestBody SalesOrderPicklistRequest request
    ) {
        request.setOrderId(orderId);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createPicklist(request));
    }
}
