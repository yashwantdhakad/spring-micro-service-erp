package com.monash.erp.wms.controller;

import com.monash.erp.wms.dto.ProductFeatureGroupCategoryDto;
import com.monash.erp.wms.dto.ProductFeatureGroupDetailResponse;
import com.monash.erp.wms.dto.ProductFeatureGroupFeatureDto;
import com.monash.erp.wms.entity.ProductCategory;
import com.monash.erp.wms.entity.ProductFeature;
import com.monash.erp.wms.entity.ProductFeatureGroup;
import com.monash.erp.wms.service.ProductFeatureCatGrpApplService;
import com.monash.erp.wms.service.ProductFeatureGroupApplService;
import com.monash.erp.wms.repository.ProductCategoryRepository;
import com.monash.erp.wms.repository.ProductFeatureGroupRepository;
import com.monash.erp.wms.repository.ProductFeatureRepository;
import com.monash.erp.wms.service.ProductFeatureGroupService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;
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
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/product-feature-groups")
public class ProductFeatureGroupController {

    private final ProductFeatureGroupService service;
    private final ProductFeatureGroupRepository groupRepository;
    private final ProductFeatureGroupApplService groupApplService;
    private final ProductFeatureCatGrpApplService catGrpApplService;
    private final ProductFeatureRepository featureRepository;
    private final ProductCategoryRepository categoryRepository;

    public ProductFeatureGroupController(
            ProductFeatureGroupService service,
            ProductFeatureGroupRepository groupRepository,
            ProductFeatureGroupApplService groupApplService,
            ProductFeatureCatGrpApplService catGrpApplService,
            ProductFeatureRepository featureRepository,
            ProductCategoryRepository categoryRepository
    ) {
        this.service = service;
        this.groupRepository = groupRepository;
        this.groupApplService = groupApplService;
        this.catGrpApplService = catGrpApplService;
        this.featureRepository = featureRepository;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    public ResponseEntity<List<ProductFeatureGroup>> list(
            @RequestParam(name = "pageIndex", defaultValue = "0") int pageIndex,
            @RequestParam(name = "pageSize", defaultValue = "10") int pageSize,
            @RequestParam(name = "queryString", defaultValue = "") String queryString
    ) {
        Page<ProductFeatureGroup> page = service.list(PageRequest.of(pageIndex, pageSize), queryString);
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-total-count", String.valueOf(page.getTotalElements()));
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ProductFeatureGroup get(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping("/by-id/{productFeatureGroupId}")
    public ProductFeatureGroupDetailResponse getByProductFeatureGroupId(@PathVariable String productFeatureGroupId) {
        ProductFeatureGroup group = groupRepository.findFirstByProductFeatureGroupIdOrderByIdAsc(productFeatureGroupId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProductFeatureGroup %s not found".formatted(productFeatureGroupId)));

        Map<String, ProductFeature> featuresById = featureRepository.findAll().stream()
                .filter(feature -> feature.getProductFeatureId() != null)
                .collect(Collectors.toMap(ProductFeature::getProductFeatureId, Function.identity(), (a, b) -> a));

        Map<String, ProductCategory> categoriesById = categoryRepository.findAll().stream()
                .filter(category -> category.getProductCategoryId() != null)
                .collect(Collectors.toMap(ProductCategory::getProductCategoryId, Function.identity(), (a, b) -> a));

        List<ProductFeatureGroupFeatureDto> features = groupApplService.listByProductFeatureGroupId(productFeatureGroupId)
                .stream()
                .map(appl -> {
                    ProductFeatureGroupFeatureDto dto = new ProductFeatureGroupFeatureDto();
                    dto.setId(appl.getId());
                    dto.setProductFeatureId(appl.getProductFeatureId());
                    dto.setSequenceNum(appl.getSequenceNum() != null ? appl.getSequenceNum().toString() : null);
                    dto.setFromDate(appl.getFromDate());
                    ProductFeature feature = featuresById.get(appl.getProductFeatureId());
                    if (feature != null) {
                        dto.setDescription(feature.getDescription());
                        dto.setAbbrev(feature.getAbbrev());
                        dto.setProductFeatureTypeEnumId(feature.getProductFeatureTypeId());
                    }
                    return dto;
                })
                .collect(Collectors.toList());

        List<ProductFeatureGroupCategoryDto> categories = catGrpApplService.listByProductFeatureGroupId(productFeatureGroupId)
                .stream()
                .map(appl -> {
                    ProductFeatureGroupCategoryDto dto = new ProductFeatureGroupCategoryDto();
                    dto.setId(appl.getId());
                    dto.setProductCategoryId(appl.getProductCategoryId());
                    dto.setFromDate(appl.getFromDate());
                    ProductCategory category = categoriesById.get(appl.getProductCategoryId());
                    if (category != null) {
                        dto.setCategoryName(category.getCategoryName());
                    }
                    return dto;
                })
                .collect(Collectors.toList());

        ProductFeatureGroupDetailResponse response = new ProductFeatureGroupDetailResponse();
        response.setProductFeatureGroupId(group.getProductFeatureGroupId());
        response.setDescription(group.getDescription());
        response.setFeatures(features);
        response.setCategories(categories);
        return response;
    }

    @PostMapping
    public ResponseEntity<ProductFeatureGroup> create(@RequestBody ProductFeatureGroup entity) {
        ProductFeatureGroup created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ProductFeatureGroup update(@PathVariable Long id, @RequestBody ProductFeatureGroup entity) {
        return service.update(id, entity);
    }

    @PutMapping("/by-id/{productFeatureGroupId}")
    public ProductFeatureGroup updateByProductFeatureGroupId(
            @PathVariable String productFeatureGroupId,
            @RequestBody ProductFeatureGroup entity
    ) {
        return service.updateByProductFeatureGroupId(productFeatureGroupId, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
