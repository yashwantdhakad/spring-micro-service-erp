package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ShoppingListWorkEffort;
import com.monash.erp.wms.service.ShoppingListWorkEffortService;
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
@RequestMapping("/api/shopping-list-work-efforts")
public class ShoppingListWorkEffortController {

    private final ShoppingListWorkEffortService service;

    public ShoppingListWorkEffortController(ShoppingListWorkEffortService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShoppingListWorkEffort> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShoppingListWorkEffort get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShoppingListWorkEffort> create(@RequestBody ShoppingListWorkEffort entity) {
        ShoppingListWorkEffort created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShoppingListWorkEffort update(@PathVariable Long id, @RequestBody ShoppingListWorkEffort entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}