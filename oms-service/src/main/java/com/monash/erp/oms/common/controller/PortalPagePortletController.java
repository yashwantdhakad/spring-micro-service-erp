package com.monash.erp.oms.common.controller;

import com.monash.erp.oms.common.entity.PortalPagePortlet;
import com.monash.erp.oms.common.service.PortalPagePortletService;
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
@RequestMapping("/common/portal-page-portlets")
public class PortalPagePortletController {

    private final PortalPagePortletService service;

    public PortalPagePortletController(PortalPagePortletService service) {
        this.service = service;
    }

    @GetMapping
    public List<PortalPagePortlet> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PortalPagePortlet get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PortalPagePortlet> create(@RequestBody PortalPagePortlet entity) {
        PortalPagePortlet created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PortalPagePortlet update(@PathVariable Long id, @RequestBody PortalPagePortlet entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
