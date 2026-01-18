package com.monash.erp.oms.common.controller;

import com.monash.erp.oms.common.entity.PortletAttribute;
import com.monash.erp.oms.common.service.PortletAttributeService;
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
@RequestMapping("/api/common/portlet-attributes")
public class PortletAttributeController {

    private final PortletAttributeService service;

    public PortletAttributeController(PortletAttributeService service) {
        this.service = service;
    }

    @GetMapping
    public List<PortletAttribute> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PortletAttribute get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PortletAttribute> create(@RequestBody PortletAttribute entity) {
        PortletAttribute created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PortletAttribute update(@PathVariable Long id, @RequestBody PortletAttribute entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
