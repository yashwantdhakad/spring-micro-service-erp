package com.monash.erp.oms.common.controller;

import com.monash.erp.oms.common.entity.TelecomMethodType;
import com.monash.erp.oms.common.service.TelecomMethodTypeService;
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
@RequestMapping("/api/common/telecom-method-types")
public class TelecomMethodTypeController {

    private final TelecomMethodTypeService service;

    public TelecomMethodTypeController(TelecomMethodTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<TelecomMethodType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public TelecomMethodType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<TelecomMethodType> create(@RequestBody TelecomMethodType entity) {
        TelecomMethodType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public TelecomMethodType update(@PathVariable Long id, @RequestBody TelecomMethodType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
