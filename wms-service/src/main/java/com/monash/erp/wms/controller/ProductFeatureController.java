package com.monash.erp.wms.controller;

import com.monash.erp.wms.dto.ProductFeatureApplDto;
import com.monash.erp.wms.dto.ProductFeatureDetailResponse;
import com.monash.erp.wms.dto.ProductFeatureGroupApplDto;
import com.monash.erp.wms.dto.ProductFeatureGroupSummary;
import com.monash.erp.wms.entity.ProductFeature;
import com.monash.erp.wms.entity.ProductFeatureGroup;
import com.monash.erp.wms.service.ProductFeatureApplService;
import com.monash.erp.wms.service.ProductFeatureGroupApplService;
import com.monash.erp.wms.repository.ProductFeatureGroupRepository;
import com.monash.erp.wms.service.ProductFeatureService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/product-features")
public class ProductFeatureController {

    private final ProductFeatureService service;
    private final ProductFeatureApplService applService;
    private final ProductFeatureGroupApplService groupApplService;
    private final ProductFeatureGroupRepository groupRepository;

    public ProductFeatureController(
            ProductFeatureService service,
            ProductFeatureApplService applService,
            ProductFeatureGroupApplService groupApplService,
            ProductFeatureGroupRepository groupRepository
    ) {
        this.service = service;
        this.applService = applService;
        this.groupApplService = groupApplService;
        this.groupRepository = groupRepository;
    }

    @GetMapping
    public ResponseEntity<List<ProductFeature>> list(
            @RequestParam(name = "pageIndex", defaultValue = "0") int pageIndex,
            @RequestParam(name = "pageSize", defaultValue = "10") int pageSize,
            @RequestParam(name = "queryString", defaultValue = "") String queryString
    ) {
        Page<ProductFeature> page = service.list(PageRequest.of(pageIndex, pageSize), queryString);
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-total-count", String.valueOf(page.getTotalElements()));
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ProductFeature get(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("/by-id/{productFeatureId}")
    public ProductFeatureDetailResponse getByProductFeatureId(@PathVariable String productFeatureId) {
        ProductFeature feature = service.getByProductFeatureId(productFeatureId);
        List<ProductFeatureApplDto> products = applService.listByProductFeatureId(productFeatureId).stream()
                .map(appl -> {
                    ProductFeatureApplDto dto = new ProductFeatureApplDto();
                    dto.setId(appl.getId());
                    dto.setProductId(appl.getProductId());
                    dto.setProductFeatureId(appl.getProductFeatureId());
                    dto.setProductFeatureApplTypeId(appl.getProductFeatureApplTypeId());
                    dto.setFromDate(appl.getFromDate());
                    dto.setThruDate(appl.getThruDate());
                    dto.setSequenceNum(appl.getSequenceNum());
                    dto.setAmount(appl.getAmount());
                    dto.setRecurringAmount(appl.getRecurringAmount());
                    return dto;
                })
                .collect(Collectors.toList());

        Map<String, ProductFeatureGroup> groupsById = groupRepository.findAll().stream()
                .filter(group -> group.getProductFeatureGroupId() != null)
                .collect(Collectors.toMap(ProductFeatureGroup::getProductFeatureGroupId, group -> group, (a, b) -> a));

        List<ProductFeatureGroupApplDto> groups = groupApplService.listByProductFeatureId(productFeatureId).stream()
                .map(appl -> {
                    ProductFeatureGroupApplDto dto = new ProductFeatureGroupApplDto();
                    dto.setId(appl.getId());
                    dto.setProductFeatureGroupId(appl.getProductFeatureGroupId());
                    dto.setProductFeatureId(appl.getProductFeatureId());
                    dto.setFromDate(appl.getFromDate());
                    dto.setThruDate(appl.getThruDate());
                    dto.setSequenceNum(appl.getSequenceNum() != null ? appl.getSequenceNum().toString() : null);
                    ProductFeatureGroup group = groupsById.get(appl.getProductFeatureGroupId());
                    if (group != null) {
                        dto.setGroup(new ProductFeatureGroupSummary(group.getProductFeatureGroupId(), group.getDescription()));
                    }
                    return dto;
                })
                .collect(Collectors.toList());

        ProductFeatureDetailResponse response = new ProductFeatureDetailResponse();
        response.setProductFeatureId(feature.getProductFeatureId());
        response.setProductFeatureTypeId(feature.getProductFeatureTypeId());
        response.setProductFeatureCategoryId(feature.getProductFeatureCategoryId());
        response.setDescription(feature.getDescription());
        response.setUomId(feature.getUomId());
        response.setNumberSpecified(feature.getNumberSpecified());
        response.setDefaultAmount(feature.getDefaultAmount());
        response.setDefaultSequenceNum(feature.getDefaultSequenceNum());
        response.setAbbrev(feature.getAbbrev());
        response.setIdCode(feature.getIdCode());
        response.setProducts(products);
        response.setGroups(groups);
        return response;
    }

    @PostMapping
    public ResponseEntity<ProductFeature> create(@RequestBody ProductFeature entity) {
        ProductFeature created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/by-id/{productFeatureId}")
    public ProductFeature updateByProductFeatureId(
            @PathVariable String productFeatureId,
            @RequestBody ProductFeature entity
    ) {
        return service.updateByProductFeatureId(productFeatureId, entity);
    }

    @PutMapping("/{id}")
    public ProductFeature update(@PathVariable Long id, @RequestBody ProductFeature entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
