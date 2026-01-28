package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.PosTerminalInternTx;
import com.monash.erp.wms.service.PosTerminalInternTxService;
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
@RequestMapping("/api/pos-terminal-intern-txes")
public class PosTerminalInternTxController {

    private final PosTerminalInternTxService service;

    public PosTerminalInternTxController(PosTerminalInternTxService service) {
        this.service = service;
    }

    @GetMapping
    public List<PosTerminalInternTx> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PosTerminalInternTx get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PosTerminalInternTx> create(@RequestBody PosTerminalInternTx entity) {
        PosTerminalInternTx created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PosTerminalInternTx update(@PathVariable Long id, @RequestBody PosTerminalInternTx entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}