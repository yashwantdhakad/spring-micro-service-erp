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
@RequestMapping("/api/migrations")
public class ProductRelatedMigrationController {

    private final JobLauncher jobLauncher;
    private final JobExplorer jobExplorer;
    private final Job productCategoryMigrationJob;
    private final Job productCategoryMemberMigrationJob;
    private final Job productPriceMigrationJob;
    private final Job productIdentificationMigrationJob;
    private final Job productAssocMigrationJob;

    public ProductRelatedMigrationController(
            JobLauncher jobLauncher,
            JobExplorer jobExplorer,
            @Qualifier("productCategoryMigrationJob") Job productCategoryMigrationJob,
            @Qualifier("productCategoryMemberMigrationJob") Job productCategoryMemberMigrationJob,
            @Qualifier("productPriceMigrationJob") Job productPriceMigrationJob,
            @Qualifier("productIdentificationMigrationJob") Job productIdentificationMigrationJob,
            @Qualifier("productAssocMigrationJob") Job productAssocMigrationJob
    ) {
        this.jobLauncher = jobLauncher;
        this.jobExplorer = jobExplorer;
        this.productCategoryMigrationJob = productCategoryMigrationJob;
        this.productCategoryMemberMigrationJob = productCategoryMemberMigrationJob;
        this.productPriceMigrationJob = productPriceMigrationJob;
        this.productIdentificationMigrationJob = productIdentificationMigrationJob;
        this.productAssocMigrationJob = productAssocMigrationJob;
    }

    @PostMapping("/product-categories/run")
    public ResponseEntity<MigrationResponse> runProductCategories() {
        return runJob(productCategoryMigrationJob);
    }

    @PostMapping("/product-category-members/run")
    public ResponseEntity<MigrationResponse> runProductCategoryMembers() {
        return runJob(productCategoryMemberMigrationJob);
    }

    @PostMapping("/product-prices/run")
    public ResponseEntity<MigrationResponse> runProductPrices() {
        return runJob(productPriceMigrationJob);
    }

    @PostMapping("/product-identifications/run")
    public ResponseEntity<MigrationResponse> runProductIdentifications() {
        return runJob(productIdentificationMigrationJob);
    }

    @PostMapping("/product-assocs/run")
    public ResponseEntity<MigrationResponse> runProductAssocs() {
        return runJob(productAssocMigrationJob);
    }

    private ResponseEntity<MigrationResponse> runJob(Job job) {
        Set<JobExecution> running = jobExplorer.findRunningJobExecutions(job.getName());
        if (!running.isEmpty()) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(new MigrationResponse(null, "RUNNING", "Job is already running"));
        }
        try {
            JobParametersBuilder params = new JobParametersBuilder();
            params.addLong("run.id", Instant.now().toEpochMilli());
            JobExecution execution = jobLauncher.run(job, params.toJobParameters());
            return ResponseEntity.ok(new MigrationResponse(
                    execution.getId(),
                    execution.getStatus().name(),
                    "Started"
            ));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new MigrationResponse(null, "FAILED", ex.getMessage()));
        }
    }

    public record MigrationResponse(Long executionId, String status, String message) {
    }
}
