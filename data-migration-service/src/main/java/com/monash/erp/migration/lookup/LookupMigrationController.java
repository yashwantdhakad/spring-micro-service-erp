package com.monash.erp.migration.lookup;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/migration/lookups")
public class LookupMigrationController {

    private final LookupMigrationService lookupMigrationService;

    public LookupMigrationController(LookupMigrationService lookupMigrationService) {
        this.lookupMigrationService = lookupMigrationService;
    }

    @PostMapping
    public ResponseEntity<?> run(@RequestParam(name = "service", required = false) String service) {
        if (service == null || service.isBlank()) {
            return ResponseEntity.ok(lookupMigrationService.migrateAll());
        }
        return ResponseEntity.ok(lookupMigrationService.migrateService(service));
    }
}
