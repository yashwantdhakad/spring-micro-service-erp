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
public class AllMigrationController {

    private final JobLauncher jobLauncher;
    private final JobExplorer jobExplorer;
    private final Job productMigrationJob;
    private final Job productCategoryMigrationJob;
    private final Job productCategoryMemberMigrationJob;
    private final Job productPriceMigrationJob;
    private final Job productIdentificationMigrationJob;
    private final Job productAssocMigrationJob;
    private final Job partyMigrationJob;
    private final Job personMigrationJob;
    private final Job partyGroupMigrationJob;
    private final Job partyRoleMigrationJob;
    private final Job partyIdentificationMigrationJob;
    private final Job partyContactMechMigrationJob;
    private final Job partyContactMechPurposeMigrationJob;
    private final Job postalAddressMigrationJob;
    private final Job telecomNumberMigrationJob;

    public AllMigrationController(
            JobLauncher jobLauncher,
            JobExplorer jobExplorer,
            @Qualifier("productMigrationJob") Job productMigrationJob,
            @Qualifier("productCategoryMigrationJob") Job productCategoryMigrationJob,
            @Qualifier("productCategoryMemberMigrationJob") Job productCategoryMemberMigrationJob,
            @Qualifier("productPriceMigrationJob") Job productPriceMigrationJob,
            @Qualifier("productIdentificationMigrationJob") Job productIdentificationMigrationJob,
            @Qualifier("productAssocMigrationJob") Job productAssocMigrationJob,
            @Qualifier("partyMigrationJob") Job partyMigrationJob,
            @Qualifier("personMigrationJob") Job personMigrationJob,
            @Qualifier("partyGroupMigrationJob") Job partyGroupMigrationJob,
            @Qualifier("partyRoleMigrationJob") Job partyRoleMigrationJob,
            @Qualifier("partyIdentificationMigrationJob") Job partyIdentificationMigrationJob,
            @Qualifier("partyContactMechMigrationJob") Job partyContactMechMigrationJob,
            @Qualifier("partyContactMechPurposeMigrationJob") Job partyContactMechPurposeMigrationJob,
            @Qualifier("postalAddressMigrationJob") Job postalAddressMigrationJob,
            @Qualifier("telecomNumberMigrationJob") Job telecomNumberMigrationJob
    ) {
        this.jobLauncher = jobLauncher;
        this.jobExplorer = jobExplorer;
        this.productMigrationJob = productMigrationJob;
        this.productCategoryMigrationJob = productCategoryMigrationJob;
        this.productCategoryMemberMigrationJob = productCategoryMemberMigrationJob;
        this.productPriceMigrationJob = productPriceMigrationJob;
        this.productIdentificationMigrationJob = productIdentificationMigrationJob;
        this.productAssocMigrationJob = productAssocMigrationJob;
        this.partyMigrationJob = partyMigrationJob;
        this.personMigrationJob = personMigrationJob;
        this.partyGroupMigrationJob = partyGroupMigrationJob;
        this.partyRoleMigrationJob = partyRoleMigrationJob;
        this.partyIdentificationMigrationJob = partyIdentificationMigrationJob;
        this.partyContactMechMigrationJob = partyContactMechMigrationJob;
        this.partyContactMechPurposeMigrationJob = partyContactMechPurposeMigrationJob;
        this.postalAddressMigrationJob = postalAddressMigrationJob;
        this.telecomNumberMigrationJob = telecomNumberMigrationJob;
    }

    @PostMapping("/run-all")
    public ResponseEntity<MigrationBatchResponse> runAll() {
        MigrationBatchResponse response = new MigrationBatchResponse();
        try {
            response.products = runJobInternal(productMigrationJob);
            response.productCategories = runJobInternal(productCategoryMigrationJob);
            response.productCategoryMembers = runJobInternal(productCategoryMemberMigrationJob);
            response.productPrices = runJobInternal(productPriceMigrationJob);
            response.productIdentifications = runJobInternal(productIdentificationMigrationJob);
            response.productAssocs = runJobInternal(productAssocMigrationJob);
            response.parties = runJobInternal(partyMigrationJob);
            response.persons = runJobInternal(personMigrationJob);
            response.partyGroups = runJobInternal(partyGroupMigrationJob);
            response.partyRoles = runJobInternal(partyRoleMigrationJob);
            response.partyIdentifications = runJobInternal(partyIdentificationMigrationJob);
            response.partyContactMechs = runJobInternal(partyContactMechMigrationJob);
            response.partyContactMechPurposes = runJobInternal(partyContactMechPurposeMigrationJob);
            response.postalAddresses = runJobInternal(postalAddressMigrationJob);
            response.telecomNumbers = runJobInternal(telecomNumberMigrationJob);
            return ResponseEntity.ok(response);
        } catch (IllegalStateException ex) {
            response.error = ex.getMessage();
            return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
        } catch (Exception ex) {
            response.error = ex.getMessage();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    private MigrationResponse runJobInternal(Job job) throws Exception {
        Set<JobExecution> running = jobExplorer.findRunningJobExecutions(job.getName());
        if (!running.isEmpty()) {
            throw new IllegalStateException("Job is already running: " + job.getName());
        }
        JobParametersBuilder params = new JobParametersBuilder();
        params.addLong("run.id", Instant.now().toEpochMilli());
        JobExecution execution = jobLauncher.run(job, params.toJobParameters());
        return new MigrationResponse(execution.getId(), execution.getStatus().name(), "Started");
    }

    public record MigrationResponse(Long executionId, String status, String message) {
    }

    public static class MigrationBatchResponse {
        public MigrationResponse products;
        public MigrationResponse productCategories;
        public MigrationResponse productCategoryMembers;
        public MigrationResponse productPrices;
        public MigrationResponse productIdentifications;
        public MigrationResponse productAssocs;
        public MigrationResponse parties;
        public MigrationResponse persons;
        public MigrationResponse partyGroups;
        public MigrationResponse partyRoles;
        public MigrationResponse partyIdentifications;
        public MigrationResponse partyContactMechs;
        public MigrationResponse partyContactMechPurposes;
        public MigrationResponse postalAddresses;
        public MigrationResponse telecomNumbers;
        public String error;
    }
}
