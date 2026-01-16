package com.example.erp.wms.ofbiz.controller;

import com.example.erp.wms.ofbiz.domain.ShipmentReceiptRole;
import com.example.erp.wms.ofbiz.service.ShipmentReceiptRoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ofbiz/shipment-receipt-roles")
public class ShipmentReceiptRoleController {

    private final ShipmentReceiptRoleService service;

    public ShipmentReceiptRoleController(ShipmentReceiptRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShipmentReceiptRole> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShipmentReceiptRole get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShipmentReceiptRole> create(@RequestBody ShipmentReceiptRole entity) {
        ShipmentReceiptRole created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShipmentReceiptRole update(@PathVariable Long id, @RequestBody ShipmentReceiptRole entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}