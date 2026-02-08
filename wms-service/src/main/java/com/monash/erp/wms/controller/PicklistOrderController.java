package com.monash.erp.wms.controller;

import com.monash.erp.wms.dto.PicklistOrderSummaryDto;
import com.monash.erp.wms.dto.PicklistOrderGroupDto;
import com.monash.erp.wms.service.PicklistOrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/picklists")
public class PicklistOrderController {

    private final PicklistOrderService service;

    public PicklistOrderController(PicklistOrderService service) {
        this.service = service;
    }

    @GetMapping("/by-order/{orderId}")
    public List<PicklistOrderSummaryDto> listByOrder(@PathVariable String orderId) {
        return service.listByOrder(orderId);
    }

    @GetMapping("/orders")
    public List<PicklistOrderGroupDto> listOrders(
            @RequestParam(required = false) String statusId,
            @RequestParam(required = false) String facilityId) {
        return service.listReservedOrders(statusId, facilityId);
    }

    @PostMapping("/{picklistId}/mark-picked")
    public ResponseEntity<PicklistOrderSummaryDto> markPicked(@PathVariable String picklistId) {
        return ResponseEntity.status(HttpStatus.OK).body(service.markPicked(picklistId));
    }

    @GetMapping("/orders/ids")
    public List<String> getOrdersInPicklists() {
        return service.getOrdersInPicklists();
    }
}
