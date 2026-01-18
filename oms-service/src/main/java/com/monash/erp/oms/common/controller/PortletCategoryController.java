package com.monash.erp.oms.common.controller;

import com.monash.erp.oms.common.entity.PortletCategory;
import com.monash.erp.oms.common.service.PortletCategoryService;
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
@RequestMapping("/api/common/portlet-categorys")
public class PortletCategoryController {

    private final PortletCategoryService service;

    public PortletCategoryController(PortletCategoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<PortletCategory> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PortletCategory get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PortletCategory> create(@RequestBody PortletCategory entity) {
        PortletCategory created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PortletCategory update(@PathVariable Long id, @RequestBody PortletCategory entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
