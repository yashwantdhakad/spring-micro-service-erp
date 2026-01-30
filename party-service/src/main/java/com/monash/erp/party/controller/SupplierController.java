package com.monash.erp.party.controller;

import com.monash.erp.party.dto.SupplierCreateRequest;
import com.monash.erp.party.dto.SupplierDetailResponse;
import com.monash.erp.party.dto.SupplierListResponse;
import com.monash.erp.party.dto.SupplierSummary;
import com.monash.erp.party.dto.SupplierUpdateRequest;
import com.monash.erp.party.service.SupplierService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("/suppliers")
    public SupplierListResponse listSuppliers(@RequestParam(defaultValue = "0") int page,
                                              @RequestParam(defaultValue = "10") int pageSize,
                                              @RequestParam(defaultValue = "") String query,
                                              @RequestParam(required = false) String sortBy,
                                              @RequestParam(required = false) String sortDirection) {
        return supplierService.listSuppliers(page, pageSize, query, sortBy, sortDirection);
    }

    @PostMapping("/suppliers")
    public ResponseEntity<SupplierSummary> createSupplier(@RequestBody SupplierCreateRequest request) {
        SupplierSummary created = supplierService.createSupplier(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping("/suppliers/{partyId}")
    public SupplierDetailResponse getSupplier(@PathVariable String partyId) {
        return supplierService.getSupplier(partyId);
    }

    @PutMapping("/suppliers/{partyId}")
    public SupplierDetailResponse updateSupplier(@PathVariable String partyId, @RequestBody SupplierUpdateRequest request) {
        return supplierService.updateSupplier(partyId, request);
    }
}
