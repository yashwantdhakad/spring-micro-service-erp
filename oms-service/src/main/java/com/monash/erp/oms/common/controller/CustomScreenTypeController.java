package com.monash.erp.oms.common.controller;

import com.monash.erp.oms.common.entity.CustomScreenType;
import com.monash.erp.oms.common.service.CustomScreenTypeService;
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
@RequestMapping("/api/common/custom-screen-types")
public class CustomScreenTypeController {

    private final CustomScreenTypeService service;

    public CustomScreenTypeController(CustomScreenTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustomScreenType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CustomScreenType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CustomScreenType> create(@RequestBody CustomScreenType entity) {
        CustomScreenType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CustomScreenType update(@PathVariable Long id, @RequestBody CustomScreenType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
