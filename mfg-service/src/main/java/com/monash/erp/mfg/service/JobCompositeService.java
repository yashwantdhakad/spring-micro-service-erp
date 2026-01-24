package com.monash.erp.mfg.service;

import com.monash.erp.mfg.dto.JobCreateRequest;
import com.monash.erp.mfg.dto.JobDetailResponse;
import com.monash.erp.mfg.dto.JobGoodStandardDto;
import com.monash.erp.mfg.dto.JobListItem;
import com.monash.erp.mfg.dto.JobListResponse;
import com.monash.erp.mfg.dto.JobListResponseMap;
import com.monash.erp.mfg.dto.JobMaterialRequest;
import com.monash.erp.mfg.dto.WmsProductAssocDto;
import com.monash.erp.mfg.dto.WmsProductDetailResponse;
import com.monash.erp.mfg.entity.WorkEffort;
import com.monash.erp.mfg.entity.WorkEffortGoodStandard;
import com.monash.erp.mfg.repository.WorkEffortGoodStandardRepository;
import com.monash.erp.mfg.repository.WorkEffortRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class JobCompositeService {

    private static final String PURPOSE_PRODUCTION_RUN = "WEPT_PRODUCTION_RUN";
    private static final String TYPE_PRODUCTION_HEADER = "PROD_ORDER_HEADER";
    private static final String TYPE_PRODUCTION_TASK = "PROD_ORDER_TASK";
    private static final String STATUS_CREATED = "PRUN_CREATED";
    private static final String WEGS_STATUS_CREATED = "WEGS_CREATED";
    private static final String WEGS_TYPE_PRODUCE = "PRUN_PROD_DELIV";
    private static final String WEGS_TYPE_CONSUME = "PRUNT_PROD_NEEDED";

    private final WorkEffortRepository workEffortRepository;
    private final WorkEffortGoodStandardRepository workEffortGoodStandardRepository;
    private final RestTemplate restTemplate;
    private final String wmsBaseUrl;
    private final String wmsServiceToken;

    public JobCompositeService(
            WorkEffortRepository workEffortRepository,
            WorkEffortGoodStandardRepository workEffortGoodStandardRepository,
            RestTemplate restTemplate,
            @Value("${wms.base-url:http://localhost:8080/wms}") String wmsBaseUrl,
            @Value("${wms.service-token:}") String wmsServiceToken
    ) {
        this.workEffortRepository = workEffortRepository;
        this.workEffortGoodStandardRepository = workEffortGoodStandardRepository;
        this.restTemplate = restTemplate;
        this.wmsBaseUrl = wmsBaseUrl;
        this.wmsServiceToken = wmsServiceToken;
    }

    public JobListResponse listJobs(int page, int size, String queryString) {
        PageRequest pageable = PageRequest.of(Math.max(page, 0), Math.max(size, 1), Sort.by("id").descending());
        Page<WorkEffort> jobs;
        if (isBlank(queryString)) {
            jobs = workEffortRepository.findByWorkEffortPurposeTypeId(PURPOSE_PRODUCTION_RUN, pageable);
        } else {
            jobs = workEffortRepository.findByWorkEffortPurposeTypeIdAndWorkEffortNameContainingIgnoreCase(
                    PURPOSE_PRODUCTION_RUN,
                    queryString,
                    pageable
            );
        }

        List<JobListItem> items = jobs.getContent().stream()
                .map(this::toListItem)
                .collect(Collectors.toList());

        return new JobListResponse(new JobListResponseMap(items, jobs.getTotalElements()));
    }

    public JobDetailResponse getJob(String workEffortId) {
        WorkEffort workEffort = findWorkEffort(workEffortId);
        List<WorkEffort> tasks = workEffortRepository.findByWorkEffortParentId(workEffort.getWorkEffortId());

        List<JobGoodStandardDto> produceList = workEffortGoodStandardRepository.findByWorkEffortId(workEffort.getWorkEffortId())
                .stream()
                .filter(item -> isProduceType(item.getWorkEffortGoodStdTypeId()))
                .map(this::toGoodStandardDto)
                .collect(Collectors.toList());

        List<JobGoodStandardDto> consumeList = new ArrayList<>();
        for (WorkEffort task : tasks) {
            List<JobGoodStandardDto> taskConsumes = workEffortGoodStandardRepository.findByWorkEffortId(task.getWorkEffortId())
                    .stream()
                    .filter(item -> isConsumeType(item.getWorkEffortGoodStdTypeId()))
                    .map(this::toGoodStandardDto)
                    .collect(Collectors.toList());
            consumeList.addAll(taskConsumes);
        }

        return new JobDetailResponse(workEffort, produceList, consumeList, tasks);
    }

    public WorkEffort createJob(JobCreateRequest request) {
        if (request == null || isBlank(request.getWorkEffortName())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "workEffortName is required");
        }
        if (isBlank(request.getFacilityId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "facilityId is required");
        }
        if (isBlank(request.getProduceProductId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "produceProductId is required");
        }

        WorkEffort header = new WorkEffort();
        header.setWorkEffortId(generateWorkEffortId());
        header.setWorkEffortTypeId(TYPE_PRODUCTION_HEADER);
        header.setWorkEffortPurposeTypeId(normalizePurpose(request.getPurposeEnumId()));
        header.setCurrentStatusId(STATUS_CREATED);
        header.setLastStatusUpdate(LocalDateTime.now());
        header.setWorkEffortName(request.getWorkEffortName());
        header.setFacilityId(request.getFacilityId());
        header.setEstimatedStartDate(request.getEstimatedStartDate());
        header.setEstimatedMilliSeconds(request.getEstimatedWorkDuration());
        header.setQuantityToProduce(request.getProduceEstimatedQuantity());
        header.setCreatedDate(LocalDateTime.now());
        header.setId(null);

        WorkEffort savedHeader = workEffortRepository.save(header);

        WorkEffortGoodStandard produce = new WorkEffortGoodStandard();
        produce.setWorkEffortId(savedHeader.getWorkEffortId());
        produce.setProductId(request.getProduceProductId());
        produce.setWorkEffortGoodStdTypeId(WEGS_TYPE_PRODUCE);
        produce.setFromDate(LocalDateTime.now());
        produce.setStatusId(WEGS_STATUS_CREATED);
        produce.setEstimatedQuantity(request.getProduceEstimatedQuantity());
        produce.setEstimatedCost(request.getProduceEstimatedAmount());
        produce.setId(null);
        workEffortGoodStandardRepository.save(produce);

        WorkEffort task = new WorkEffort();
        task.setWorkEffortId(generateWorkEffortId());
        task.setWorkEffortTypeId(TYPE_PRODUCTION_TASK);
        task.setWorkEffortPurposeTypeId(normalizePurpose(request.getPurposeEnumId()));
        task.setCurrentStatusId(STATUS_CREATED);
        task.setLastStatusUpdate(LocalDateTime.now());
        task.setWorkEffortName(request.getWorkEffortName() + " Task");
        task.setWorkEffortParentId(savedHeader.getWorkEffortId());
        task.setFacilityId(request.getFacilityId());
        task.setEstimatedStartDate(request.getEstimatedStartDate());
        task.setEstimatedMilliSeconds(request.getEstimatedWorkDuration());
        task.setQuantityToProduce(request.getProduceEstimatedQuantity());
        task.setCreatedDate(LocalDateTime.now());
        task.setId(null);
        WorkEffort savedTask = workEffortRepository.save(task);

        List<JobMaterialRequest> consumeItems = request.getConsumeItems();
        if (consumeItems == null || consumeItems.isEmpty()) {
            consumeItems = fetchBom(request.getProduceProductId());
        }

        for (JobMaterialRequest consume : consumeItems) {
            WorkEffortGoodStandard goodStandard = new WorkEffortGoodStandard();
            goodStandard.setWorkEffortId(savedTask.getWorkEffortId());
            goodStandard.setProductId(consume.getProductId());
            goodStandard.setWorkEffortGoodStdTypeId(WEGS_TYPE_CONSUME);
            goodStandard.setFromDate(LocalDateTime.now());
            goodStandard.setStatusId(WEGS_STATUS_CREATED);
            goodStandard.setEstimatedQuantity(consume.getEstimatedQuantity());
            goodStandard.setId(null);
            workEffortGoodStandardRepository.save(goodStandard);
        }

        return savedHeader;
    }

    public List<JobMaterialRequest> fetchBom(String productId) {
        if (isBlank(productId)) {
            return Collections.emptyList();
        }

        String url = String.format("%s/api/products/%s", wmsBaseUrl, productId);
        HttpHeaders headers = new HttpHeaders();
        String authHeader = resolveAuthorizationHeader();
        if (!isBlank(authHeader)) {
            headers.set(HttpHeaders.AUTHORIZATION, authHeader);
        }
        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);
        ResponseEntity<WmsProductDetailResponse> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                requestEntity,
                WmsProductDetailResponse.class
        );
        WmsProductDetailResponse response = responseEntity.getBody();
        if (response == null || response.getAssocs() == null) {
            return Collections.emptyList();
        }

        return response.getAssocs().stream()
                .filter(this::isBomAssoc)
                .map(this::toMaterial)
                .collect(Collectors.toList());
    }

    private JobListItem toListItem(WorkEffort effort) {
        JobListItem item = new JobListItem();
        item.setWorkEffortId(effort.getWorkEffortId());
        item.setWorkEffortName(effort.getWorkEffortName());
        item.setFacilityId(effort.getFacilityId());
        item.setStatusId(effort.getCurrentStatusId());
        item.setEstimatedStartDate(effort.getEstimatedStartDate());
        return item;
    }

    private JobGoodStandardDto toGoodStandardDto(WorkEffortGoodStandard wegs) {
        JobGoodStandardDto dto = new JobGoodStandardDto();
        dto.setProductId(wegs.getProductId());
        dto.setEstimatedQuantity(wegs.getEstimatedQuantity());
        dto.setWorkEffortGoodStdTypeId(wegs.getWorkEffortGoodStdTypeId());
        return dto;
    }

    private JobMaterialRequest toMaterial(WmsProductAssocDto assoc) {
        JobMaterialRequest request = new JobMaterialRequest();
        if (assoc.getToProduct() != null) {
            request.setProductId(assoc.getToProduct().getProductId());
        }
        request.setEstimatedQuantity(Optional.ofNullable(assoc.getQuantity()).orElse("1"));
        return request;
    }

    private boolean isProduceType(String typeId) {
        return WEGS_TYPE_PRODUCE.equalsIgnoreCase(typeId) || isBlank(typeId) == false && typeId.contains("DELIV");
    }

    private boolean isConsumeType(String typeId) {
        return WEGS_TYPE_CONSUME.equalsIgnoreCase(typeId) || isBlank(typeId) == false && typeId.contains("NEEDED");
    }

    private boolean isBomAssoc(WmsProductAssocDto assoc) {
        if (assoc == null || assoc.getToProduct() == null) {
            return false;
        }
        String typeId = assoc.getType() == null ? null : assoc.getType().getProductAssocTypeId();
        if (isBlank(typeId)) {
            return true;
        }
        return typeId.contains("COMPONENT") || typeId.contains("BOM");
    }

    private WorkEffort findWorkEffort(String workEffortId) {
        Optional<WorkEffort> byWorkEffortId = workEffortRepository.findByWorkEffortId(workEffortId);
        if (byWorkEffortId.isPresent()) {
            return byWorkEffortId.get();
        }
        if (isNumeric(workEffortId)) {
            long id = Long.parseLong(workEffortId);
            return workEffortRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffort %s not found".formatted(workEffortId)));
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffort %s not found".formatted(workEffortId));
    }

    private String generateWorkEffortId() {
        return "WE-" + UUID.randomUUID().toString().replace("-", "").substring(0, 10).toUpperCase(Locale.ROOT);
    }

    private String normalizePurpose(String purposeEnumId) {
        if (isBlank(purposeEnumId)) {
            return PURPOSE_PRODUCTION_RUN;
        }
        if ("WepProductionRun".equalsIgnoreCase(purposeEnumId)) {
            return PURPOSE_PRODUCTION_RUN;
        }
        return purposeEnumId;
    }

    private boolean isBlank(String value) {
        return value == null || value.isBlank();
    }

    private boolean isNumeric(String value) {
        if (isBlank(value)) {
            return false;
        }
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isDigit(value.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private String getAuthorizationHeader() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes == null) {
            return null;
        }
        return attributes.getRequest().getHeader(HttpHeaders.AUTHORIZATION);
    }

    private String resolveAuthorizationHeader() {
        String header = getAuthorizationHeader();
        if (!isBlank(header)) {
            return header;
        }
        if (isBlank(wmsServiceToken)) {
            return null;
        }
        if (wmsServiceToken.startsWith("Bearer ") || wmsServiceToken.startsWith("Basic ")) {
            return wmsServiceToken;
        }
        return "Bearer " + wmsServiceToken;
    }
}
