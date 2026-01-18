package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ShippingDocument;
import com.monash.erp.wms.service.ShippingDocumentService;
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
@RequestMapping("/ofbiz/shipping-documents")
public class ShippingDocumentController {

    private final ShippingDocumentService service;

    public ShippingDocumentController(ShippingDocumentService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShippingDocument> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShippingDocument get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShippingDocument> create(@RequestBody ShippingDocument entity) {
        ShippingDocument created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShippingDocument update(@PathVariable Long id, @RequestBody ShippingDocument entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}