package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.CustomerPartNumber;
import com.monash.erp.wms.service.CustomerPartNumberService;
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
@RequestMapping("/api/customer-part-numbers")
public class CustomerPartNumberController {

    private final CustomerPartNumberService service;

    public CustomerPartNumberController(CustomerPartNumberService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustomerPartNumber> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CustomerPartNumber get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CustomerPartNumber> create(@RequestBody CustomerPartNumber entity) {
        CustomerPartNumber created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CustomerPartNumber update(@PathVariable Long id, @RequestBody CustomerPartNumber entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}