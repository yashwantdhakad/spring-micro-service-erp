package com.monash.erp.migration.controller;

import java.time.Instant;
import java.util.Set;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/migrations/products")
public class ProductMigrationController {

    private final JobLauncher jobLauncher;
    private final JobExplorer jobExplorer;
    private final Job productMigrationJob;

    public ProductMigrationController(
            JobLauncher jobLauncher,
            JobExplorer jobExplorer,
            @Qualifier("productMigrationJob") Job productMigrationJob
    ) {
        this.jobLauncher = jobLauncher;
        this.jobExplorer = jobExplorer;
        this.productMigrationJob = productMigrationJob;
    }

    @PostMapping("/run")
    public ResponseEntity<ProductMigrationResponse> run() {
        Set<JobExecution> running = jobExplorer.findRunningJobExecutions(productMigrationJob.getName());
        if (!running.isEmpty()) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(new ProductMigrationResponse(null, "RUNNING", "Job is already running"));
        }
        try {
            JobParametersBuilder params = new JobParametersBuilder();
            params.addLong("run.id", Instant.now().toEpochMilli());
            JobExecution execution = jobLauncher.run(productMigrationJob, params.toJobParameters());
            return ResponseEntity.ok(new ProductMigrationResponse(
                    execution.getId(),
                    execution.getStatus().name(),
                    "Started"
            ));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ProductMigrationResponse(null, "FAILED", ex.getMessage()));
        }
    }

    public record ProductMigrationResponse(Long executionId, String status, String message) {
    }
}
