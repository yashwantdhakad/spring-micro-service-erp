package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortIcalData;
import com.monash.erp.mfg.service.WorkEffortIcalDataService;
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
@RequestMapping("/ofbiz/work-effort-ical-datas")
public class WorkEffortIcalDataController {

    private final WorkEffortIcalDataService service;

    public WorkEffortIcalDataController(WorkEffortIcalDataService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortIcalData> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public WorkEffortIcalData get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortIcalData> create(@RequestBody WorkEffortIcalData entity) {
        WorkEffortIcalData created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortIcalData update(@PathVariable Long id, @RequestBody WorkEffortIcalData entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}