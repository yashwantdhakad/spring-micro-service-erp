package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ServerHitType;
import com.monash.erp.wms.service.ServerHitTypeService;
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
@RequestMapping("/api/server-hit-types")
public class ServerHitTypeController {

    private final ServerHitTypeService service;

    public ServerHitTypeController(ServerHitTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<ServerHitType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ServerHitType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ServerHitType> create(@RequestBody ServerHitType entity) {
        ServerHitType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ServerHitType update(@PathVariable Long id, @RequestBody ServerHitType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}