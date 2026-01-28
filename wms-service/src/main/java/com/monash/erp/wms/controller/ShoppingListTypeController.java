package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ShoppingListType;
import com.monash.erp.wms.service.ShoppingListTypeService;
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
@RequestMapping("/api/shopping-list-types")
public class ShoppingListTypeController {

    private final ShoppingListTypeService service;

    public ShoppingListTypeController(ShoppingListTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ShoppingListType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ShoppingListType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ShoppingListType> create(@RequestBody ShoppingListType entity) {
        ShoppingListType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ShoppingListType update(@PathVariable Long id, @RequestBody ShoppingListType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}