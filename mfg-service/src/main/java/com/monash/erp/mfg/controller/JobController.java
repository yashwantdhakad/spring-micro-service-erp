package com.monash.erp.mfg.controller;

import com.monash.erp.mfg.dto.JobConsumableCreateRequest;
import com.monash.erp.mfg.dto.JobCreateRequest;
import com.monash.erp.mfg.dto.JobDetailResponse;
import com.monash.erp.mfg.dto.JobDto;
import com.monash.erp.mfg.dto.JobGoodStandardDto;
import com.monash.erp.mfg.dto.JobListResponse;
import com.monash.erp.mfg.dto.JobMaterialRequest;
import com.monash.erp.mfg.dto.JobProduceRequest;
import com.monash.erp.mfg.dto.JobProduceResponse;
import com.monash.erp.mfg.dto.WorkEffortInventoryActionRequest;
import com.monash.erp.mfg.dto.WorkEffortInventoryActionResponse;
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
            @RequestParam(defaultValue = "") String queryString) {
        return service.listJobs(page, size, queryString);
    }

    @GetMapping("/{workEffortId}")
    public JobDetailResponse get(@PathVariable String workEffortId) {
        return service.getJob(workEffortId);
    }

    @PostMapping
    public ResponseEntity<JobDto> create(@RequestBody JobCreateRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createJob(request));
    }

    @PostMapping("/{workEffortId}/approve")
    public JobDto approve(@PathVariable String workEffortId) {
        return service.approveJob(workEffortId);
    }

    @PostMapping("/{workEffortId}/start")
    public JobDto start(@PathVariable String workEffortId) {
        return service.startJob(workEffortId);
    }

    @PostMapping("/{workEffortId}/complete")
    public JobDto complete(@PathVariable String workEffortId) {
        return service.completeJob(workEffortId);
    }

    @PostMapping("/{workEffortId}/close")
    public JobDto close(@PathVariable String workEffortId) {
        return service.closeJob(workEffortId);
    }

    @PostMapping("/{workEffortId}/produce")
    public JobProduceResponse produce(
            @PathVariable String workEffortId,
            @RequestBody JobProduceRequest request) {
        return service.produceItem(workEffortId, request);
    }

    @PostMapping("/{workEffortId}/consumables")
    public ResponseEntity<JobGoodStandardDto> addConsumable(
            @PathVariable String workEffortId,
            @RequestBody JobConsumableCreateRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.addConsumableItem(workEffortId, request));
    }

    @PostMapping("/{workEffortId}/consumables/{wegsId}/reserve")
    public WorkEffortInventoryActionResponse reserveConsumable(
            @PathVariable String workEffortId,
            @PathVariable Long wegsId,
            @RequestBody WorkEffortInventoryActionRequest request) {
        return service.reserveConsumable(workEffortId, wegsId, request);
    }

    @PostMapping("/{workEffortId}/consumables/{wegsId}/release")
    public WorkEffortInventoryActionResponse releaseConsumable(
            @PathVariable String workEffortId,
            @PathVariable Long wegsId,
            @RequestBody WorkEffortInventoryActionRequest request) {
        return service.releaseConsumable(workEffortId, wegsId, request);
    }

    @PostMapping("/{workEffortId}/consumables/{wegsId}/issue")
    public WorkEffortInventoryActionResponse issueConsumable(
            @PathVariable String workEffortId,
            @PathVariable Long wegsId,
            @RequestBody WorkEffortInventoryActionRequest request) {
        return service.issueConsumable(workEffortId, wegsId, request);
    }

    @PostMapping("/{workEffortId}/consumables/{wegsId}/cancel")
    public WorkEffortInventoryActionResponse cancelConsumable(
            @PathVariable String workEffortId,
            @PathVariable Long wegsId) {
        return service.cancelConsumable(workEffortId, wegsId);
    }

    @GetMapping("/bom")
    public List<JobMaterialRequest> getBom(@RequestParam String productId) {
        return service.fetchBom(productId);
    }
}
