package com.monash.erp.wms.controller;

import com.monash.erp.wms.dto.PurchaseOrderReceiveRequest;
import com.monash.erp.wms.dto.PurchaseOrderReceiveResponse;
import com.monash.erp.wms.entity.ShipmentReceipt;
import com.monash.erp.wms.service.PurchaseOrderReceiveService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/purchase-orders")
public class PurchaseOrderReceiveController {

    private final PurchaseOrderReceiveService purchaseOrderReceiveService;

    public PurchaseOrderReceiveController(PurchaseOrderReceiveService purchaseOrderReceiveService) {
        this.purchaseOrderReceiveService = purchaseOrderReceiveService;
    }

    @PostMapping("/{orderId}/receive")
    public ResponseEntity<PurchaseOrderReceiveResponse> receive(
            @PathVariable String orderId,
            @RequestBody PurchaseOrderReceiveRequest request
    ) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(purchaseOrderReceiveService.receive(orderId, request));
    }

    @GetMapping("/{orderId}/receipts")
    public List<ShipmentReceipt> listReceipts(@PathVariable String orderId) {
        return purchaseOrderReceiveService.listReceipts(orderId);
    }
}
