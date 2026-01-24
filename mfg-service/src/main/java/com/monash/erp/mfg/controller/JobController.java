package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.dto.JobCreateRequest;
import com.monash.erp.mfg.dto.JobDetailResponse;
import com.monash.erp.mfg.dto.JobListResponse;
import com.monash.erp.mfg.dto.JobMaterialRequest;
import com.monash.erp.mfg.entity.WorkEffort;
import com.monash.erp.mfg.service.JobCompositeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    private final JobCompositeService service;

    public JobController(JobCompositeService service) {
        this.service = service;
    }

    @GetMapping
    public JobListResponse list(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "") String queryString
    ) {
        return service.listJobs(page, size, queryString);
    }

    @GetMapping("/{workEffortId}")
    public JobDetailResponse get(@PathVariable String workEffortId) {
        return service.getJob(workEffortId);
    }

    @PostMapping
    public ResponseEntity<WorkEffort> create(@RequestBody JobCreateRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createJob(request));
    }

    @GetMapping("/bom")
    public List<JobMaterialRequest> getBom(@RequestParam String productId) {
        return service.fetchBom(productId);
    }
}
