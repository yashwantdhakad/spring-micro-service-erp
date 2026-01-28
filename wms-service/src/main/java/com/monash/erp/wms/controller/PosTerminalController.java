package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.PosTerminal;
import com.monash.erp.wms.service.PosTerminalService;
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
@RequestMapping("/api/pos-terminals")
public class PosTerminalController {

    private final PosTerminalService service;

    public PosTerminalController(PosTerminalService service) {
        this.service = service;
    }

    @GetMapping
    public List<PosTerminal> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PosTerminal get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PosTerminal> create(@RequestBody PosTerminal entity) {
        PosTerminal created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PosTerminal update(@PathVariable Long id, @RequestBody PosTerminal entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}