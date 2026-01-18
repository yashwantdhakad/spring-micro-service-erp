package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ItemIssuanceRole;
import com.monash.erp.wms.service.ItemIssuanceRoleService;
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
@RequestMapping("/ofbiz/item-issuance-roles")
public class ItemIssuanceRoleController {

    private final ItemIssuanceRoleService service;

    public ItemIssuanceRoleController(ItemIssuanceRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<ItemIssuanceRole> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ItemIssuanceRole get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ItemIssuanceRole> create(@RequestBody ItemIssuanceRole entity) {
        ItemIssuanceRole created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ItemIssuanceRole update(@PathVariable Long id, @RequestBody ItemIssuanceRole entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}