package com.monash.erp.wms.controller;

import com.monash.erp.wms.dto.ShipmentCreateRequest;
import com.monash.erp.wms.dto.ShipmentDetailResponse;
import com.monash.erp.wms.dto.ShipmentListResponse;
import com.monash.erp.wms.service.ShipmentCompositeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentController {

    private final ShipmentCompositeService service;

    public ShipmentController(ShipmentCompositeService service) {
        this.service = service;
    }

    @GetMapping
    public ShipmentListResponse list(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size,
            @RequestParam(name = "queryString", defaultValue = "") String queryString
    ) {
        return service.listShipments(page, size, queryString);
    }

    @GetMapping("/{shipmentId}")
    public ShipmentDetailResponse get(@PathVariable String shipmentId) {
        return service.getShipment(shipmentId);
    }

    @PostMapping
    public ResponseEntity<ShipmentDetailResponse> create(@RequestBody ShipmentCreateRequest request) {
        ShipmentDetailResponse created = service.createShipment(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{shipmentId}")
    public ShipmentDetailResponse update(@PathVariable String shipmentId, @RequestBody ShipmentCreateRequest request) {
        return service.updateShipment(shipmentId, request);
    }

    @DeleteMapping("/{shipmentId}")
    public ResponseEntity<Void> delete(@PathVariable String shipmentId) {
        service.deleteShipment(shipmentId);
        return ResponseEntity.noContent().build();
    }
}
