package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.entity.WorkEffortInvReservation;
import com.monash.erp.mfg.service.WorkEffortInvReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/work-effort-inv-reservations")
public class WorkEffortInvReservationController {

    private final WorkEffortInvReservationService service;

    public WorkEffortInvReservationController(WorkEffortInvReservationService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkEffortInvReservation> list(
            @RequestParam(name = "inventoryItemId", required = false) String inventoryItemId
    ) {
        return service.list(inventoryItemId);
    }

    @GetMapping("/{id}")
    public WorkEffortInvReservation get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<WorkEffortInvReservation> create(@RequestBody WorkEffortInvReservation entity) {
        WorkEffortInvReservation created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public WorkEffortInvReservation update(@PathVariable Long id, @RequestBody WorkEffortInvReservation entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
