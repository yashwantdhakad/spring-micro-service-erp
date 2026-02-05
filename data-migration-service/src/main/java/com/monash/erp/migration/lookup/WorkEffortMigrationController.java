package com.monash.erp.migration.lookup;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/migration/work-effort")
public class WorkEffortMigrationController {

    private final WorkEffortMigrationService workEffortMigrationService;

    public WorkEffortMigrationController(WorkEffortMigrationService workEffortMigrationService) {
        this.workEffortMigrationService = workEffortMigrationService;
    }

    @PostMapping
    public ResponseEntity<?> run() {
        return ResponseEntity.ok(workEffortMigrationService.migrateAll());
    }
}
