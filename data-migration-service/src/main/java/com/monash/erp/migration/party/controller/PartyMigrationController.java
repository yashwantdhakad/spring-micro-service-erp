package com.monash.erp.migration.party.controller;

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
@RequestMapping("/api/migrations/party")
public class PartyMigrationController {

    private final JobLauncher jobLauncher;
    private final JobExplorer jobExplorer;
    private final Job partyMigrationJob;
    private final Job personMigrationJob;
    private final Job partyGroupMigrationJob;
    private final Job partyRoleMigrationJob;
    private final Job partyIdentificationMigrationJob;
    private final Job partyContactMechMigrationJob;
    private final Job partyContactMechPurposeMigrationJob;
    private final Job postalAddressMigrationJob;
    private final Job telecomNumberMigrationJob;

    public PartyMigrationController(
            JobLauncher jobLauncher,
            JobExplorer jobExplorer,
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

    @PostMapping("/parties/run")
    public ResponseEntity<MigrationResponse> runParties() {
        return runJob(partyMigrationJob);
    }

    @PostMapping("/persons/run")
    public ResponseEntity<MigrationResponse> runPersons() {
        return runJob(personMigrationJob);
    }

    @PostMapping("/party-groups/run")
    public ResponseEntity<MigrationResponse> runPartyGroups() {
        return runJob(partyGroupMigrationJob);
    }

    @PostMapping("/party-roles/run")
    public ResponseEntity<MigrationResponse> runPartyRoles() {
        return runJob(partyRoleMigrationJob);
    }

    @PostMapping("/party-identifications/run")
    public ResponseEntity<MigrationResponse> runPartyIdentifications() {
        return runJob(partyIdentificationMigrationJob);
    }

    @PostMapping("/party-contact-mechs/run")
    public ResponseEntity<MigrationResponse> runPartyContactMechs() {
        return runJob(partyContactMechMigrationJob);
    }

    @PostMapping("/party-contact-mech-purposes/run")
    public ResponseEntity<MigrationResponse> runPartyContactMechPurposes() {
        return runJob(partyContactMechPurposeMigrationJob);
    }

    @PostMapping("/postal-addresses/run")
    public ResponseEntity<MigrationResponse> runPostalAddresses() {
        return runJob(postalAddressMigrationJob);
    }

    @PostMapping("/telecom-numbers/run")
    public ResponseEntity<MigrationResponse> runTelecomNumbers() {
        return runJob(telecomNumberMigrationJob);
    }

    @PostMapping("/run-all")
    public ResponseEntity<MigrationBatchResponse> runAll() {
        MigrationBatchResponse response = new MigrationBatchResponse();
        try {
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
