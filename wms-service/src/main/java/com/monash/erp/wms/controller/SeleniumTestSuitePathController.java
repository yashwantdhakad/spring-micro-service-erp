package com.monash.erp.wms.controller;

import com.monash.erp.wms.entity.SeleniumTestSuitePath;
import com.monash.erp.wms.service.SeleniumTestSuitePathService;
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
@RequestMapping("/api/selenium-test-suite-paths")
public class SeleniumTestSuitePathController {

    private final SeleniumTestSuitePathService service;

    public SeleniumTestSuitePathController(SeleniumTestSuitePathService service) {
        this.service = service;
    }

    @GetMapping
    public List<SeleniumTestSuitePath> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public SeleniumTestSuitePath get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<SeleniumTestSuitePath> create(@RequestBody SeleniumTestSuitePath entity) {
        SeleniumTestSuitePath created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public SeleniumTestSuitePath update(@PathVariable Long id, @RequestBody SeleniumTestSuitePath entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}