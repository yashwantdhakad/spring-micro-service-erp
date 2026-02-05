package com.monash.erp.migration.lookup;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/migration/wms-operational")
public class WmsOperationalMigrationController {

    private final WmsOperationalMigrationService migrationService;

    public WmsOperationalMigrationController(WmsOperationalMigrationService migrationService) {
        this.migrationService = migrationService;
    }

    @PostMapping
    public ResponseEntity<?> run() {
        return ResponseEntity.ok(migrationService.migrateAll());
    }
}
