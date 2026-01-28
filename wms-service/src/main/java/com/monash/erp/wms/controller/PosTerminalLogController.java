package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.PosTerminalLog;
import com.monash.erp.wms.service.PosTerminalLogService;
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
@RequestMapping("/api/pos-terminal-logs")
public class PosTerminalLogController {

    private final PosTerminalLogService service;

    public PosTerminalLogController(PosTerminalLogService service) {
        this.service = service;
    }

    @GetMapping
    public List<PosTerminalLog> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PosTerminalLog get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PosTerminalLog> create(@RequestBody PosTerminalLog entity) {
        PosTerminalLog created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PosTerminalLog update(@PathVariable Long id, @RequestBody PosTerminalLog entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}