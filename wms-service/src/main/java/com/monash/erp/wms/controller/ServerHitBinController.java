package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ServerHitBin;
import com.monash.erp.wms.service.ServerHitBinService;
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
@RequestMapping("/api/server-hit-bins")
public class ServerHitBinController {

    private final ServerHitBinService service;

    public ServerHitBinController(ServerHitBinService service) {
        this.service = service;
    }

    @GetMapping
    public List<ServerHitBin> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ServerHitBin get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ServerHitBin> create(@RequestBody ServerHitBin entity) {
        ServerHitBin created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ServerHitBin update(@PathVariable Long id, @RequestBody ServerHitBin entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}