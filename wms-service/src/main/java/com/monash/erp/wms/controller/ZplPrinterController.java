package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.ZplPrinter;
import com.monash.erp.wms.service.ZplPrinterService;
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
@RequestMapping("/api/zpl-printers")
public class ZplPrinterController {

    private final ZplPrinterService service;

    public ZplPrinterController(ZplPrinterService service) {
        this.service = service;
    }

    @GetMapping
    public List<ZplPrinter> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ZplPrinter get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<ZplPrinter> create(@RequestBody ZplPrinter entity) {
        ZplPrinter created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ZplPrinter update(@PathVariable Long id, @RequestBody ZplPrinter entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}