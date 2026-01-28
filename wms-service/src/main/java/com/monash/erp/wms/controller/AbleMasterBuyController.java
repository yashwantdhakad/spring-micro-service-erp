package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.AbleMasterBuy;
import com.monash.erp.wms.service.AbleMasterBuyService;
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
@RequestMapping("/api/able-master-buys")
public class AbleMasterBuyController {

    private final AbleMasterBuyService service;

    public AbleMasterBuyController(AbleMasterBuyService service) {
        this.service = service;
    }

    @GetMapping
    public List<AbleMasterBuy> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public AbleMasterBuy get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<AbleMasterBuy> create(@RequestBody AbleMasterBuy entity) {
        AbleMasterBuy created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public AbleMasterBuy update(@PathVariable Long id, @RequestBody AbleMasterBuy entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}