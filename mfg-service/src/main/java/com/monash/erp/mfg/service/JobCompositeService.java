package com.monash.erp.mfg.service;

import com.monash.erp.mfg.dto.JobConsumableCreateRequest;
import com.monash.erp.mfg.dto.JobCreateRequest;
import com.monash.erp.mfg.dto.JobDetailResponse;
import com.monash.erp.mfg.dto.JobGoodStandardDto;
import com.monash.erp.mfg.dto.JobListItem;
import com.monash.erp.mfg.dto.JobListResponse;
import com.monash.erp.mfg.dto.JobListResponseMap;
import com.monash.erp.mfg.dto.JobMaterialRequest;
import com.monash.erp.mfg.dto.JobProduceRequest;
import com.monash.erp.mfg.dto.JobProduceResponse;
import com.monash.erp.mfg.dto.WorkEffortInventoryActionRequest;
import com.monash.erp.mfg.dto.WorkEffortInventoryActionResponse;
import com.monash.erp.mfg.dto.WmsAssetReceiveRequest;
import com.monash.erp.mfg.dto.WmsAssetReceiveResponse;
import com.monash.erp.mfg.dto.WmsInventoryItemDetailRequest;
import com.monash.erp.mfg.dto.WmsInventoryItemDetailDto;
import com.monash.erp.mfg.dto.WmsInventoryItemDto;
import com.monash.erp.mfg.dto.WmsInventoryItemSearchDto;
import com.monash.erp.mfg.dto.WmsItemIssuanceRequest;
import com.monash.erp.mfg.dto.WmsProductAssocDto;
import com.monash.erp.mfg.dto.WmsProductDetailResponse;
import com.monash.erp.mfg.entity.WorkEffort;
import com.monash.erp.mfg.entity.WorkEffortGoodStandard;
import com.monash.erp.mfg.entity.WorkEffortInventoryProduced;
import com.monash.erp.mfg.entity.WorkEffortInvReservation;
import com.monash.erp.mfg.repository.WorkEffortGoodStandardRepository;
import com.monash.erp.mfg.repository.WorkEffortInventoryProducedRepository;
import com.monash.erp.mfg.repository.WorkEffortInvReservationRepository;
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
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JobCompositeService {

    private static final String PURPOSE_PRODUCTION_RUN = "WEPT_PRODUCTION_RUN";
    private static final String TYPE_PRODUCTION_HEADER = "PROD_ORDER_HEADER";
    private static final String TYPE_PRODUCTION_TASK = "PROD_ORDER_TASK";
    private static final String STATUS_CREATED = "PRUN_CREATED";
    private static final String STATUS_APPROVED = "PRUN_APPROVED";
    private static final String STATUS_RUNNING = "PRUN_RUNNING";
    private static final String STATUS_COMPLETED = "PRUN_COMPLETED";
    private static final String STATUS_CLOSED = "PRUN_CLOSED";
    private static final String WEGS_STATUS_CREATED = "WEGS_CREATED";
    private static final String WEGS_STATUS_RESERVED = "WEGS_RESERVED";
    private static final String WEGS_STATUS_ISSUED = "WEGS_ISSUED";
    private static final String WEGS_STATUS_CANCELLED = "WEGS_CANCELLED";
    private static final String WEGS_TYPE_PRODUCE = "PRUN_PROD_DELIV";
    private static final String WEGS_TYPE_CONSUME = "PRUNT_PROD_NEEDED";

    private final WorkEffortRepository workEffortRepository;
    private final WorkEffortGoodStandardRepository workEffortGoodStandardRepository;
    private final WorkEffortInvReservationRepository workEffortInvReservationRepository;
    private final WorkEffortInventoryProducedRepository workEffortInventoryProducedRepository;
    private final RestTemplate restTemplate;
    private final String wmsBaseUrl;
    private final String wmsServiceToken;

    public JobCompositeService(
            WorkEffortRepository workEffortRepository,
            WorkEffortGoodStandardRepository workEffortGoodStandardRepository,
            WorkEffortInvReservationRepository workEffortInvReservationRepository,
            WorkEffortInventoryProducedRepository workEffortInventoryProducedRepository,
            RestTemplate restTemplate,
            @Value("${wms.base-url:http://localhost:8080/wms}") String wmsBaseUrl,
            @Value("${wms.service-token:}") String wmsServiceToken
    ) {
        this.workEffortRepository = workEffortRepository;
        this.workEffortGoodStandardRepository = workEffortGoodStandardRepository;
        this.workEffortInvReservationRepository = workEffortInvReservationRepository;
        this.workEffortInventoryProducedRepository = workEffortInventoryProducedRepository;
        this.restTemplate = restTemplate;
        this.wmsBaseUrl = wmsBaseUrl;
        this.wmsServiceToken = wmsServiceToken;
    }

    public JobListResponse listJobs(int page, int size, String queryString) {
        PageRequest pageable = PageRequest.of(Math.max(page, 0), Math.max(size, 1), Sort.by("id").descending());
        Page<WorkEffort> jobs;
        if (isBlank(queryString)) {
            jobs = workEffortRepository.findByWorkEffortPurposeTypeIdAndWorkEffortTypeId(
                    PURPOSE_PRODUCTION_RUN,
                    TYPE_PRODUCTION_HEADER,
                    pageable
            );
        } else {
            jobs = workEffortRepository.findByWorkEffortPurposeTypeIdAndWorkEffortTypeIdAndWorkEffortNameContainingIgnoreCase(
                    PURPOSE_PRODUCTION_RUN,
                    TYPE_PRODUCTION_HEADER,
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

        WorkEffort header = TYPE_PRODUCTION_TASK.equalsIgnoreCase(workEffort.getWorkEffortTypeId())
                ? findWorkEffort(workEffort.getWorkEffortParentId())
                : workEffort;
        IssuedQuantityContext issuedContext = buildIssuedQuantityContext(header.getWorkEffortId());

        List<JobGoodStandardDto> produceList = workEffortGoodStandardRepository.findByWorkEffortId(workEffort.getWorkEffortId())
                .stream()
                .filter(item -> isProduceType(item.getWorkEffortGoodStdTypeId()))
                .map(this::toGoodStandardDto)
                .collect(Collectors.toList());
        attachProducedInventoryItemIds(header.getWorkEffortId(), produceList);

        List<JobGoodStandardDto> consumeList = new ArrayList<>();
        for (WorkEffort task : tasks) {
            List<JobGoodStandardDto> taskConsumes = workEffortGoodStandardRepository.findByWorkEffortId(task.getWorkEffortId())
                    .stream()
                    .filter(item -> isConsumeType(item.getWorkEffortGoodStdTypeId()))
                    .map(wegs -> toGoodStandardDtoWithQuantities(wegs, header.getWorkEffortId(), issuedContext))
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
        if (isBlank(savedHeader.getWorkEffortId())) {
            savedHeader.setWorkEffortId(String.valueOf(savedHeader.getId()));
            savedHeader = workEffortRepository.save(savedHeader);
        }

        WorkEffortGoodStandard produce = new WorkEffortGoodStandard();
        produce.setWorkEffortId(savedHeader.getWorkEffortId());
        produce.setProductId(request.getProduceProductId());
        produce.setWorkEffortGoodStdTypeId(WEGS_TYPE_PRODUCE);
        produce.setFromDate(LocalDateTime.now());
        produce.setStatusId(WEGS_STATUS_CREATED);
        produce.setEstimatedQuantity(request.getProduceEstimatedQuantity());
        produce.setEstimatedCost(request.getProduceEstimatedAmount());
        produce.setId(null);
        WorkEffortGoodStandard savedProduce = workEffortGoodStandardRepository.save(produce);
        ensureWegsReferenceNumber(savedProduce);

        WorkEffort task = new WorkEffort();
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
        if (isBlank(savedTask.getWorkEffortId())) {
            savedTask.setWorkEffortId(String.valueOf(savedTask.getId()));
            savedTask = workEffortRepository.save(savedTask);
        }

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
            WorkEffortGoodStandard savedConsume = workEffortGoodStandardRepository.save(goodStandard);
            ensureWegsReferenceNumber(savedConsume);
        }

        return savedHeader;
    }

    public WorkEffort approveJob(String workEffortId) {
        WorkEffort header = findWorkEffort(workEffortId);
        header.setCurrentStatusId(STATUS_APPROVED);
        header.setLastStatusUpdate(LocalDateTime.now());
        return workEffortRepository.save(header);
    }

    public WorkEffort startJob(String workEffortId) {
        WorkEffort header = findWorkEffort(workEffortId);
        header.setCurrentStatusId(STATUS_RUNNING);
        header.setLastStatusUpdate(LocalDateTime.now());
        if (header.getActualStartDate() == null) {
            header.setActualStartDate(LocalDateTime.now());
        }
        return workEffortRepository.save(header);
    }

    public WorkEffort completeJob(String workEffortId) {
        WorkEffort header = findWorkEffort(workEffortId);
        if (!STATUS_RUNNING.equalsIgnoreCase(header.getCurrentStatusId())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Job must be running to complete");
        }
        header.setCurrentStatusId(STATUS_COMPLETED);
        header.setLastStatusUpdate(LocalDateTime.now());
        return workEffortRepository.save(header);
    }

    public WorkEffort closeJob(String workEffortId) {
        WorkEffort header = findWorkEffort(workEffortId);
        if (!STATUS_COMPLETED.equalsIgnoreCase(header.getCurrentStatusId())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Job must be completed to close");
        }
        header.setCurrentStatusId(STATUS_CLOSED);
        header.setLastStatusUpdate(LocalDateTime.now());
        return workEffortRepository.save(header);
    }

    public JobProduceResponse produceItem(String workEffortId, JobProduceRequest request) {
        if (request == null || isBlank(request.getQuantity())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "quantity is required");
        }
        if (isBlank(request.getLocationSeqId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "locationSeqId is required");
        }

        WorkEffort base = findWorkEffort(workEffortId);
        WorkEffort header = TYPE_PRODUCTION_TASK.equalsIgnoreCase(base.getWorkEffortTypeId())
                ? findWorkEffort(base.getWorkEffortParentId())
                : base;

        String productId = resolveProduceProductId(header, request.getProductId());
        if (isBlank(header.getFacilityId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "facilityId is required");
        }

        WmsAssetReceiveRequest wmsRequest = new WmsAssetReceiveRequest();
        wmsRequest.setProductId(productId);
        wmsRequest.setFacilityId(header.getFacilityId());
        wmsRequest.setLocationSeqId(request.getLocationSeqId());
        wmsRequest.setQuantity(request.getQuantity());
        wmsRequest.setAcquireCost("0");
        wmsRequest.setReceivedDate(LocalDateTime.now());
        wmsRequest.setWorkEffortId(header.getWorkEffortId());

        WmsAssetReceiveResponse wmsResponse = receiveAsset(wmsRequest);
        if (wmsResponse == null || isBlank(wmsResponse.getAssetId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Unable to create inventory item");
        }

        WorkEffortInventoryProduced produced = new WorkEffortInventoryProduced();
        produced.setWorkEffortId(header.getWorkEffortId());
        produced.setInventoryItemId(wmsResponse.getAssetId());
        produced.setId(null);
        workEffortInventoryProducedRepository.save(produced);

        return new JobProduceResponse(wmsResponse.getAssetId());
    }

    public JobGoodStandardDto addConsumableItem(String workEffortId, JobConsumableCreateRequest request) {
        if (request == null || isBlank(request.getProductId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "productId is required");
        }
        WorkEffort base = findWorkEffort(workEffortId);
        WorkEffort task = resolveTask(base);

        WorkEffortGoodStandard goodStandard = new WorkEffortGoodStandard();
        goodStandard.setWorkEffortId(task.getWorkEffortId());
        goodStandard.setProductId(request.getProductId());
        goodStandard.setWorkEffortGoodStdTypeId(WEGS_TYPE_CONSUME);
        goodStandard.setFromDate(LocalDateTime.now());
        goodStandard.setStatusId(WEGS_STATUS_CREATED);
        goodStandard.setEstimatedQuantity(request.getEstimatedQuantity());
        goodStandard.setEstimatedCost(request.getEstimatedCost());
        goodStandard.setId(null);
        WorkEffortGoodStandard saved = workEffortGoodStandardRepository.save(goodStandard);
        ensureWegsReferenceNumber(saved);
        return toGoodStandardDto(saved);
    }

    public WorkEffortInventoryActionResponse reserveConsumable(
            String workEffortId,
            Long wegsId,
            WorkEffortInventoryActionRequest request
    ) {
        WorkEffortGoodStandard wegs = getConsumable(wegsId);
        ensureWegsReferenceNumber(wegs);
        ensureNotCancelled(wegs);
        WorkEffort header = resolveHeaderForWorkEffort(workEffortId, wegs);
        BigDecimal quantity = parseQuantity(request != null ? request.getQuantity() : null);
        if (quantity.compareTo(BigDecimal.ZERO) <= 0) {
            quantity = resolveRemainingQuantity(header, wegs);
        }
        if (quantity.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "quantity must be greater than zero");
        }
        String inventoryItemId = request != null ? request.getInventoryItemId() : null;
        if (isBlank(inventoryItemId)) {
            return reserveConsumableByProduct(header, wegs, quantity);
        }
        fetchInventoryItem(inventoryItemId);

        WorkEffortInvReservation reservation = new WorkEffortInvReservation();
        reservation.setWorkEffortId(header.getWorkEffortId());
        reservation.setInventoryItemId(inventoryItemId);
        reservation.setQuantity(quantity);
        reservation.setReservedDatetime(LocalDateTime.now());
        reservation.setCreatedDatetime(LocalDateTime.now());
        reservation.setWegsReferenceNumber(wegs.getWegsReferenceNumber());
        workEffortInvReservationRepository.save(reservation);

        createInventoryDetail(inventoryItemId, header.getWorkEffortId(), null,
                "0", negate(quantity), "0", "Reserve inventory for work effort");
        recalculateInventoryTotals(inventoryItemId);

        wegs.setStatusId(WEGS_STATUS_RESERVED);
        workEffortGoodStandardRepository.save(wegs);

        return new WorkEffortInventoryActionResponse(wegs.getId(), inventoryItemId, wegs.getStatusId(), "Reserved");
    }

    public WorkEffortInventoryActionResponse releaseConsumable(
            String workEffortId,
            Long wegsId,
            WorkEffortInventoryActionRequest request
    ) {
        WorkEffortGoodStandard wegs = getConsumable(wegsId);
        ensureWegsReferenceNumber(wegs);
        ensureNotCancelled(wegs);
        WorkEffort header = resolveHeaderForWorkEffort(workEffortId, wegs);
        BigDecimal requested = parseQuantity(request != null ? request.getQuantity() : null);
        if (requested.compareTo(BigDecimal.ZERO) <= 0) {
            requested = resolveRemainingQuantity(header, wegs);
        }
        if (requested.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "quantity must be greater than zero");
        }
        String inventoryItemId = request != null ? request.getInventoryItemId() : null;
        if (isBlank(inventoryItemId)) {
            return releaseConsumableFromReservations(header, wegs, requested);
        }

        return releaseConsumableForItem(header, wegs, inventoryItemId, requested);
    }

    public WorkEffortInventoryActionResponse issueConsumable(
            String workEffortId,
            Long wegsId,
            WorkEffortInventoryActionRequest request
    ) {
        WorkEffortGoodStandard wegs = getConsumable(wegsId);
        ensureWegsReferenceNumber(wegs);
        ensureNotCancelled(wegs);
        WorkEffort header = resolveHeaderForWorkEffort(workEffortId, wegs);
        BigDecimal quantity = parseQuantity(request != null ? request.getQuantity() : null);
        if (quantity.compareTo(BigDecimal.ZERO) <= 0) {
            quantity = sumReservedQuantity(header.getWorkEffortId(), wegs.getId());
        }
        if (quantity.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "quantity must be greater than zero");
        }
        String inventoryItemId = request != null ? request.getInventoryItemId() : null;
        if (isBlank(inventoryItemId)) {
            return issueConsumableFromReservations(header, wegs, quantity);
        }
        return issueConsumableForItem(header, wegs, inventoryItemId, quantity);
    }

    public WorkEffortInventoryActionResponse cancelConsumable(String workEffortId, Long wegsId) {
        WorkEffortGoodStandard wegs = getConsumable(wegsId);
        WorkEffort header = resolveHeaderForWorkEffort(workEffortId, wegs);
        wegs.setStatusId(WEGS_STATUS_CANCELLED);
        workEffortGoodStandardRepository.save(wegs);
        return new WorkEffortInventoryActionResponse(wegs.getId(), null, wegs.getStatusId(), "Cancelled");
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
        WmsProductDetailResponse response;
        try {
            ResponseEntity<WmsProductDetailResponse> responseEntity = restTemplate.exchange(
                    url,
                    HttpMethod.GET,
                    requestEntity,
                    WmsProductDetailResponse.class
            );
            response = responseEntity.getBody();
        } catch (org.springframework.web.client.HttpClientErrorException.NotFound ex) {
            return Collections.emptyList();
        }
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
        dto.setId(wegs.getId());
        dto.setProductId(wegs.getProductId());
        dto.setEstimatedQuantity(wegs.getEstimatedQuantity());
        dto.setWorkEffortGoodStdTypeId(wegs.getWorkEffortGoodStdTypeId());
        dto.setStatusId(wegs.getStatusId());
        dto.setWorkEffortId(wegs.getWorkEffortId());
        return dto;
    }

    private void attachProducedInventoryItemIds(String workEffortId, List<JobGoodStandardDto> produceList) {
        if (produceList == null || produceList.isEmpty() || isBlank(workEffortId)) {
            return;
        }
        List<WorkEffortInventoryProduced> produced = workEffortInventoryProducedRepository
                .findByWorkEffortId(workEffortId);
        if (produced.isEmpty()) {
            return;
        }
        String ids = produced.stream()
                .map(WorkEffortInventoryProduced::getInventoryItemId)
                .filter(id -> id != null && !id.isBlank())
                .collect(Collectors.joining(", "));
        String producedCount = String.valueOf(produced.size());
        for (JobGoodStandardDto item : produceList) {
            item.setProducedInventoryItemIds(ids);
            item.setProduced(producedCount);
        }
    }

    private JobGoodStandardDto toGoodStandardDtoWithQuantities(
            WorkEffortGoodStandard wegs,
            String headerWorkEffortId,
            IssuedQuantityContext issuedContext
    ) {
        JobGoodStandardDto dto = toGoodStandardDto(wegs);
        BigDecimal reserved = sumReservedQuantity(headerWorkEffortId, wegs.getId());
        BigDecimal issued = issuedContext.sumIssuedForProduct(wegs.getProductId());
        BigDecimal estimated = parseQuantity(wegs.getEstimatedQuantity());
        BigDecimal remaining = estimated.subtract(reserved).subtract(issued);
        if (remaining.compareTo(BigDecimal.ZERO) < 0) {
            remaining = BigDecimal.ZERO;
        }
        dto.setReservedQuantity(reserved.toPlainString());
        dto.setIssuedQuantity(issued.toPlainString());
        dto.setRemainingQuantity(remaining.toPlainString());
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

    private WorkEffort resolveTask(WorkEffort base) {
        if (TYPE_PRODUCTION_TASK.equalsIgnoreCase(base.getWorkEffortTypeId())) {
            return base;
        }
        List<WorkEffort> tasks = workEffortRepository.findByWorkEffortParentId(base.getWorkEffortId());
        return tasks.stream()
                .filter(task -> TYPE_PRODUCTION_TASK.equalsIgnoreCase(task.getWorkEffortTypeId()))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Production task not found"));
    }

    private String resolveProduceProductId(WorkEffort header, String productId) {
        if (!isBlank(productId)) {
            return productId;
        }
        List<WorkEffortGoodStandard> produces = workEffortGoodStandardRepository.findByWorkEffortId(header.getWorkEffortId())
                .stream()
                .filter(item -> isProduceType(item.getWorkEffortGoodStdTypeId()))
                .collect(Collectors.toList());
        if (produces.size() == 1) {
            return produces.get(0).getProductId();
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "productId is required");
    }

    private WorkEffortGoodStandard getConsumable(Long wegsId) {
        WorkEffortGoodStandard wegs = workEffortGoodStandardRepository.findById(wegsId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkEffortGoodStandard %d not found".formatted(wegsId)));
        if (!isConsumeType(wegs.getWorkEffortGoodStdTypeId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "WorkEffortGoodStandard is not a consumable item");
        }
        return wegs;
    }

    private void ensureNotCancelled(WorkEffortGoodStandard wegs) {
        if (WEGS_STATUS_CANCELLED.equalsIgnoreCase(wegs.getStatusId())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Consumable item is cancelled");
        }
    }

    private WorkEffort resolveHeaderForWorkEffort(String workEffortId, WorkEffortGoodStandard wegs) {
        WorkEffort requested = findWorkEffort(workEffortId);
        if (wegs.getWorkEffortId() == null) {
            return requested;
        }
        WorkEffort wegsEffort = findWorkEffort(wegs.getWorkEffortId());
        if (requested.getWorkEffortId().equalsIgnoreCase(wegsEffort.getWorkEffortId())) {
            return requested;
        }
        if (wegsEffort.getWorkEffortParentId() != null
                && requested.getWorkEffortId().equalsIgnoreCase(wegsEffort.getWorkEffortParentId())) {
            return requested;
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Work effort does not match consumable item");
    }

    private WmsInventoryItemDto fetchInventoryItem(String inventoryItemId) {
        String url = String.format("%s/api/inventory-items/by-id/%s", wmsBaseUrl, inventoryItemId);
        HttpHeaders headers = new HttpHeaders();
        String authHeader = resolveAuthorizationHeader();
        if (!isBlank(authHeader)) {
            headers.set(HttpHeaders.AUTHORIZATION, authHeader);
        }
        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);
        ResponseEntity<WmsInventoryItemDto> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                requestEntity,
                WmsInventoryItemDto.class
        );
        if (response.getBody() == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Inventory item not found");
        }
        return response.getBody();
    }

    private void createInventoryDetail(
            String inventoryItemId,
            String workEffortId,
            String itemIssuanceId,
            String qohDiff,
            String atpDiff,
            String accountingDiff,
            String description
    ) {
        WmsInventoryItemDetailRequest detail = new WmsInventoryItemDetailRequest();
        detail.setInventoryItemId(inventoryItemId);
        detail.setEffectiveDate(LocalDateTime.now());
        detail.setQuantityOnHandDiff(qohDiff);
        detail.setAvailableToPromiseDiff(atpDiff);
        detail.setAccountingQuantityDiff(accountingDiff);
        detail.setWorkEffortId(workEffortId);
        detail.setItemIssuanceId(itemIssuanceId);
        detail.setDescription(description);

        String url = String.format("%s/api/inventory-item-details", wmsBaseUrl);
        HttpHeaders headers = new HttpHeaders();
        String authHeader = resolveAuthorizationHeader();
        if (!isBlank(authHeader)) {
            headers.set(HttpHeaders.AUTHORIZATION, authHeader);
        }
        HttpEntity<WmsInventoryItemDetailRequest> requestEntity = new HttpEntity<>(detail, headers);
        restTemplate.exchange(url, HttpMethod.POST, requestEntity, Void.class);
    }

    private WmsAssetReceiveResponse receiveAsset(WmsAssetReceiveRequest request) {
        String url = String.format("%s/api/assets/receive", wmsBaseUrl);
        HttpHeaders headers = new HttpHeaders();
        String authHeader = resolveAuthorizationHeader();
        if (!isBlank(authHeader)) {
            headers.set(HttpHeaders.AUTHORIZATION, authHeader);
        }
        HttpEntity<WmsAssetReceiveRequest> requestEntity = new HttpEntity<>(request, headers);
        ResponseEntity<WmsAssetReceiveResponse> response = restTemplate.exchange(
                url,
                HttpMethod.POST,
                requestEntity,
                WmsAssetReceiveResponse.class
        );
        return response.getBody();
    }

    private WorkEffortInventoryActionResponse reserveConsumableByProduct(
            WorkEffort header,
            WorkEffortGoodStandard wegs,
            BigDecimal requested
    ) {
        if (isBlank(wegs.getProductId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "productId is required to reserve");
        }
        List<WmsInventoryItemSearchDto> inventoryItems = fetchInventoryItemsByProduct(
                wegs.getProductId(),
                header.getFacilityId()
        );
        if (inventoryItems.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No inventory items found for product");
        }

        BigDecimal remaining = requested;
        BigDecimal reservedTotal = BigDecimal.ZERO;
        for (WmsInventoryItemSearchDto item : inventoryItems) {
            if (remaining.compareTo(BigDecimal.ZERO) <= 0) {
                break;
            }
            BigDecimal available = parseQuantity(item.getAvailableToPromiseTotal());
            if (available.compareTo(BigDecimal.ZERO) <= 0) {
                continue;
            }
            BigDecimal allocated = available.min(remaining);
            WorkEffortInvReservation reservation = new WorkEffortInvReservation();
            reservation.setWorkEffortId(header.getWorkEffortId());
            reservation.setInventoryItemId(item.getInventoryItemId());
            reservation.setQuantity(allocated);
            reservation.setReservedDatetime(LocalDateTime.now());
            reservation.setCreatedDatetime(LocalDateTime.now());
            reservation.setWegsReferenceNumber(wegs.getWegsReferenceNumber());
            workEffortInvReservationRepository.save(reservation);

            createInventoryDetail(item.getInventoryItemId(), header.getWorkEffortId(), null,
                    "0", negate(allocated), "0", "Reserve inventory for work effort");
            recalculateInventoryTotals(item.getInventoryItemId());
            remaining = remaining.subtract(allocated);
            reservedTotal = reservedTotal.add(allocated);
        }

        if (reservedTotal.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No available inventory to reserve");
        }

        wegs.setStatusId(WEGS_STATUS_RESERVED);
        workEffortGoodStandardRepository.save(wegs);

        String message = reservedTotal.compareTo(requested) < 0
                ? "Reserved " + reservedTotal + " of " + requested
                : "Reserved";
        return new WorkEffortInventoryActionResponse(wegs.getId(), null, wegs.getStatusId(), message);
    }

    private WorkEffortInventoryActionResponse releaseConsumableFromReservations(
            WorkEffort header,
            WorkEffortGoodStandard wegs,
            BigDecimal requested
    ) {
        List<WorkEffortInvReservation> reservations = workEffortInvReservationRepository
                .findByWorkEffortIdAndWegsReferenceNumber(header.getWorkEffortId(), wegs.getWegsReferenceNumber());
        if (reservations.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Reservation not found");
        }
        return releaseReservations(header, wegs, reservations, requested);
    }

    private WorkEffortInventoryActionResponse releaseConsumableForItem(
            WorkEffort header,
            WorkEffortGoodStandard wegs,
            String inventoryItemId,
            BigDecimal requested
    ) {
        List<WorkEffortInvReservation> reservations = workEffortInvReservationRepository
                .findByWorkEffortIdAndInventoryItemIdAndWegsReferenceNumber(
                        header.getWorkEffortId(),
                        inventoryItemId,
                        wegs.getWegsReferenceNumber()
                );
        if (reservations.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Reservation not found");
        }
        return releaseReservations(header, wegs, reservations, requested);
    }

    private WorkEffortInventoryActionResponse releaseReservations(
            WorkEffort header,
            WorkEffortGoodStandard wegs,
            List<WorkEffortInvReservation> reservations,
            BigDecimal requested
    ) {
        reservations.sort(java.util.Comparator.comparing(WorkEffortInvReservation::getId));
        BigDecimal reservedTotal = reservations.stream()
                .map(WorkEffortInvReservation::getQuantity)
                .filter(qty -> qty != null)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal releaseQty = requested.min(reservedTotal);
        if (releaseQty.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No reserved quantity to release");
        }

        BigDecimal remaining = releaseQty;
        BigDecimal releasedTotal = BigDecimal.ZERO;
        for (WorkEffortInvReservation reservation : reservations) {
            if (remaining.compareTo(BigDecimal.ZERO) <= 0) {
                break;
            }
            BigDecimal current = defaultIfNull(reservation.getQuantity());
            if (current.compareTo(BigDecimal.ZERO) <= 0) {
                continue;
            }
            BigDecimal releasePart = current.min(remaining);
            remaining = remaining.subtract(releasePart);
            releasedTotal = releasedTotal.add(releasePart);

            if (current.compareTo(releasePart) <= 0) {
                workEffortInvReservationRepository.delete(reservation);
            } else {
                reservation.setQuantity(current.subtract(releasePart));
                workEffortInvReservationRepository.save(reservation);
            }

            createInventoryDetail(reservation.getInventoryItemId(), header.getWorkEffortId(), null,
                    "0", releasePart.toPlainString(), "0", "Release reserved inventory");
            recalculateInventoryTotals(reservation.getInventoryItemId());
        }

        List<WorkEffortInvReservation> remainingReservations = workEffortInvReservationRepository
                .findByWorkEffortIdAndWegsReferenceNumber(header.getWorkEffortId(), wegs.getWegsReferenceNumber());
        if (remainingReservations.isEmpty()) {
            wegs.setStatusId(WEGS_STATUS_CREATED);
            workEffortGoodStandardRepository.save(wegs);
        }

        String message = releasedTotal.compareTo(releaseQty) < 0
                ? "Released " + releasedTotal + " of " + releaseQty
                : "Released";
        return new WorkEffortInventoryActionResponse(wegs.getId(), null, wegs.getStatusId(), message);
    }

    private WorkEffortInventoryActionResponse issueConsumableFromReservations(
            WorkEffort header,
            WorkEffortGoodStandard wegs,
            BigDecimal requested
    ) {
        List<WorkEffortInvReservation> reservations = workEffortInvReservationRepository
                .findByWorkEffortIdAndWegsReferenceNumber(header.getWorkEffortId(), wegs.getWegsReferenceNumber());
        if (reservations.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Reservation not found");
        }
        return issueReservations(header, wegs, reservations, requested);
    }

    private WorkEffortInventoryActionResponse issueConsumableForItem(
            WorkEffort header,
            WorkEffortGoodStandard wegs,
            String inventoryItemId,
            BigDecimal requested
    ) {
        List<WorkEffortInvReservation> reservations = workEffortInvReservationRepository
                .findByWorkEffortIdAndInventoryItemIdAndWegsReferenceNumber(
                        header.getWorkEffortId(),
                        inventoryItemId,
                        wegs.getWegsReferenceNumber()
                );
        if (reservations.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Reservation not found");
        }
        return issueReservations(header, wegs, reservations, requested);
    }

    private WorkEffortInventoryActionResponse issueReservations(
            WorkEffort header,
            WorkEffortGoodStandard wegs,
            List<WorkEffortInvReservation> reservations,
            BigDecimal requested
    ) {
        reservations.sort(java.util.Comparator.comparing(WorkEffortInvReservation::getId));
        BigDecimal remaining = requested;
        BigDecimal issuedTotal = BigDecimal.ZERO;

        for (WorkEffortInvReservation reservation : reservations) {
            if (remaining.compareTo(BigDecimal.ZERO) <= 0) {
                break;
            }
            BigDecimal current = defaultIfNull(reservation.getQuantity());
            if (current.compareTo(BigDecimal.ZERO) <= 0) {
                continue;
            }
            BigDecimal issuePart = current.min(remaining);
            remaining = remaining.subtract(issuePart);
            issuedTotal = issuedTotal.add(issuePart);

            String issuanceId = createItemIssuance(reservation.getInventoryItemId(), header.getWorkEffortId(),
                    wegs.getWegsReferenceNumber(), issuePart);
            createInventoryDetail(reservation.getInventoryItemId(), header.getWorkEffortId(), issuanceId,
                    negate(issuePart), "0", negate(issuePart), "Issue inventory for work effort");
            recalculateInventoryTotals(reservation.getInventoryItemId());

            if (current.compareTo(issuePart) <= 0) {
                workEffortInvReservationRepository.delete(reservation);
            } else {
                reservation.setQuantity(current.subtract(issuePart));
                workEffortInvReservationRepository.save(reservation);
            }
        }

        if (issuedTotal.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No reserved quantity to issue");
        }

        wegs.setStatusId(WEGS_STATUS_ISSUED);
        workEffortGoodStandardRepository.save(wegs);

        String message = issuedTotal.compareTo(requested) < 0
                ? "Issued " + issuedTotal + " of " + requested
                : "Issued";
        return new WorkEffortInventoryActionResponse(wegs.getId(), null, wegs.getStatusId(), message);
    }

    private List<WmsInventoryItemSearchDto> fetchInventoryItemsByProduct(String productId, String facilityId) {
        String url = String.format("%s/api/inventory-items/search?productId=%s", wmsBaseUrl, productId);
        if (!isBlank(facilityId)) {
            url += "&facilityId=" + facilityId;
        }
        HttpHeaders headers = new HttpHeaders();
        String authHeader = resolveAuthorizationHeader();
        if (!isBlank(authHeader)) {
            headers.set(HttpHeaders.AUTHORIZATION, authHeader);
        }
        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);
        ResponseEntity<List<WmsInventoryItemSearchDto>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                requestEntity,
                new ParameterizedTypeReference<List<WmsInventoryItemSearchDto>>() {}
        );
        List<WmsInventoryItemSearchDto> items = response.getBody();
        return items == null ? List.of() : items;
    }

    private BigDecimal resolveRemainingQuantity(WorkEffort header, WorkEffortGoodStandard wegs) {
        BigDecimal estimated = parseQuantity(wegs.getEstimatedQuantity());
        BigDecimal reserved = sumReservedQuantity(header.getWorkEffortId(), wegs.getId());
        BigDecimal issued = buildIssuedQuantityContext(header.getWorkEffortId()).sumIssuedForProduct(wegs.getProductId());
        BigDecimal remaining = estimated.subtract(reserved).subtract(issued);
        return remaining.compareTo(BigDecimal.ZERO) < 0 ? BigDecimal.ZERO : remaining;
    }

    private BigDecimal sumReservedQuantity(String workEffortId, Long wegsId) {
        if (wegsId == null) {
            return BigDecimal.ZERO;
        }
        List<WorkEffortInvReservation> reservations = workEffortInvReservationRepository
                .findByWorkEffortIdAndWegsReferenceNumber(workEffortId, String.valueOf(wegsId));
        return reservations.stream()
                .map(WorkEffortInvReservation::getQuantity)
                .filter(qty -> qty != null)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private IssuedQuantityContext buildIssuedQuantityContext(String workEffortId) {
        List<WmsInventoryItemDetailDto> details = fetchInventoryItemDetails(workEffortId);
        return new IssuedQuantityContext(details, this::fetchInventoryItem, this::parseQuantity);
    }

    private List<WmsInventoryItemDetailDto> fetchInventoryItemDetails(String workEffortId) {
        String url = String.format("%s/api/inventory-item-details/by-work-effort/%s", wmsBaseUrl, workEffortId);
        HttpHeaders headers = new HttpHeaders();
        String authHeader = resolveAuthorizationHeader();
        if (!isBlank(authHeader)) {
            headers.set(HttpHeaders.AUTHORIZATION, authHeader);
        }
        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);
        try {
            ResponseEntity<List<WmsInventoryItemDetailDto>> response = restTemplate.exchange(
                    url,
                    HttpMethod.GET,
                    requestEntity,
                    new ParameterizedTypeReference<List<WmsInventoryItemDetailDto>>() {}
            );
            List<WmsInventoryItemDetailDto> items = response.getBody();
            return items == null ? List.of() : items;
        } catch (org.springframework.web.client.HttpServerErrorException | org.springframework.web.client.ResourceAccessException ex) {
            return List.of();
        }
    }

    private static class IssuedQuantityContext {
        private final List<WmsInventoryItemDetailDto> details;
        private final java.util.function.Function<String, WmsInventoryItemDto> inventoryFetcher;
        private final java.util.Map<String, String> productByInventoryId = new java.util.HashMap<>();
        private final java.util.function.Function<String, BigDecimal> quantityParser;

        IssuedQuantityContext(
                List<WmsInventoryItemDetailDto> details,
                java.util.function.Function<String, WmsInventoryItemDto> inventoryFetcher,
                java.util.function.Function<String, BigDecimal> quantityParser
        ) {
            this.details = details == null ? List.of() : details;
            this.inventoryFetcher = inventoryFetcher;
            this.quantityParser = quantityParser;
        }

        BigDecimal sumIssuedForProduct(String productId) {
            if (productId == null || productId.isBlank()) {
                return BigDecimal.ZERO;
            }
            BigDecimal total = BigDecimal.ZERO;
            for (WmsInventoryItemDetailDto detail : details) {
                if (detail == null || detail.getItemIssuanceId() == null || detail.getItemIssuanceId().isBlank()) {
                    continue;
                }
                String inventoryItemId = detail.getInventoryItemId();
                if (inventoryItemId == null || inventoryItemId.isBlank()) {
                    continue;
                }
                String detailProductId = productByInventoryId.computeIfAbsent(inventoryItemId, id -> {
                    WmsInventoryItemDto item = inventoryFetcher.apply(id);
                    return item == null ? null : item.getProductId();
                });
                if (detailProductId == null) {
                    continue;
                }
                if (!detailProductId.equalsIgnoreCase(productId)) {
                    continue;
                }
                BigDecimal issued = quantityParser.apply(detail.getQuantityOnHandDiff()).abs();
                total = total.add(issued);
            }
            return total;
        }
    }

    private String createItemIssuance(
            String inventoryItemId,
            String workEffortId,
            String wegsReferenceNumber,
            BigDecimal quantity
    ) {
        WmsItemIssuanceRequest issuance = new WmsItemIssuanceRequest();
        issuance.setInventoryItemId(inventoryItemId);
        issuance.setWorkEffortId(workEffortId);
        issuance.setIssuedDateTime(LocalDateTime.now());
        issuance.setIssuedByUserLoginId("system");
        issuance.setQuantity(quantity.toPlainString());
        issuance.setWegsReferenceNumber(wegsReferenceNumber);

        String url = String.format("%s/api/item-issuances", wmsBaseUrl);
        HttpHeaders headers = new HttpHeaders();
        String authHeader = resolveAuthorizationHeader();
        if (!isBlank(authHeader)) {
            headers.set(HttpHeaders.AUTHORIZATION, authHeader);
        }
        HttpEntity<WmsItemIssuanceRequest> requestEntity = new HttpEntity<>(issuance, headers);
        ResponseEntity<java.util.Map> response = restTemplate.exchange(
                url,
                HttpMethod.POST,
                requestEntity,
                java.util.Map.class
        );
        if (response.getBody() != null && response.getBody().get("itemIssuanceId") != null) {
            return String.valueOf(response.getBody().get("itemIssuanceId"));
        }
        return null;
    }

    private void recalculateInventoryTotals(String inventoryItemId) {
        String url = String.format("%s/api/inventory-items/%s/recalculate", wmsBaseUrl, inventoryItemId);
        HttpHeaders headers = new HttpHeaders();
        String authHeader = resolveAuthorizationHeader();
        if (!isBlank(authHeader)) {
            headers.set(HttpHeaders.AUTHORIZATION, authHeader);
        }
        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);
        restTemplate.exchange(url, HttpMethod.POST, requestEntity, Void.class);
    }

    private void ensureWegsReferenceNumber(WorkEffortGoodStandard wegs) {
        if (wegs == null) {
            return;
        }
        if (!isBlank(wegs.getWegsReferenceNumber())) {
            return;
        }
        if (wegs.getId() == null) {
            return;
        }
        wegs.setWegsReferenceNumber(String.valueOf(wegs.getId()));
        workEffortGoodStandardRepository.save(wegs);
    }

    private BigDecimal parseQuantity(String value) {
        if (isBlank(value)) {
            return BigDecimal.ZERO;
        }
        try {
            return new BigDecimal(value);
        } catch (NumberFormatException ex) {
            return BigDecimal.ZERO;
        }
    }

    private BigDecimal defaultIfNull(BigDecimal value) {
        return value == null ? BigDecimal.ZERO : value;
    }

    private String negate(BigDecimal value) {
        return value == null ? "0" : value.negate().toPlainString();
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
