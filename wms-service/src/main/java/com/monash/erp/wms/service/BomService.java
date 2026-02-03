package com.monash.erp.wms.service;

import com.monash.erp.wms.dto.BomListResponse;
import com.monash.erp.wms.dto.BomSummaryDto;
import com.monash.erp.wms.entity.Product;
import com.monash.erp.wms.entity.ProductAssoc;
import com.monash.erp.wms.entity.ProductAssocType;
import com.monash.erp.wms.repository.ProductAssocRepository;
import com.monash.erp.wms.repository.ProductAssocTypeRepository;
import com.monash.erp.wms.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class BomService {
    private final ProductAssocRepository productAssocRepository;
    private final ProductRepository productRepository;
    private final ProductAssocTypeRepository productAssocTypeRepository;

    public BomService(
            ProductAssocRepository productAssocRepository,
            ProductRepository productRepository,
            ProductAssocTypeRepository productAssocTypeRepository
    ) {
        this.productAssocRepository = productAssocRepository;
        this.productRepository = productRepository;
        this.productAssocTypeRepository = productAssocTypeRepository;
    }

    public BomListResponse list(int page, int size, String query, String bomTypeId) {
        String trimmedQuery = query != null && !query.isBlank() ? query.trim() : null;
        String trimmedType = bomTypeId != null && !bomTypeId.isBlank() ? bomTypeId.trim() : null;

        Page<String> productIdsPage = productAssocRepository.findBomProductIds(
                trimmedType,
                trimmedQuery,
                PageRequest.of(page, size)
        );

        List<String> productIds = productIdsPage.getContent();
        if (productIds.isEmpty()) {
            return new BomListResponse(List.of(), productIdsPage.getTotalElements());
        }

        List<ProductAssoc> assocs = productAssocRepository.findBomAssocsByProductIdIn(productIds);
        Map<String, String> bomTypeByProductId = new HashMap<>();
        for (ProductAssoc assoc : assocs) {
            if (!bomTypeByProductId.containsKey(assoc.getProductId())) {
                bomTypeByProductId.put(assoc.getProductId(), assoc.getProductAssocTypeId());
            }
        }

        Map<String, String> bomTypeLabelMap = productAssocTypeRepository.findAll().stream()
                .collect(Collectors.toMap(
                        ProductAssocType::getProductAssocTypeId,
                        ProductAssocType::getDescription,
                        (a, b) -> a
                ));

        Map<String, String> productNameMap = productRepository.findByProductIdIn(productIds).stream()
                .collect(Collectors.toMap(
                        Product::getProductId,
                        product -> product.getProductName() != null ? product.getProductName() : product.getProductId(),
                        (a, b) -> a
                ));

        List<BomSummaryDto> results = new ArrayList<>();
        for (String productId : productIds) {
            String typeId = trimmedType != null ? trimmedType : bomTypeByProductId.get(productId);
            String typeLabel = bomTypeLabelMap.getOrDefault(typeId, typeId);
            results.add(new BomSummaryDto(
                    productId,
                    productNameMap.getOrDefault(productId, productId),
                    typeId,
                    typeLabel
            ));
        }

        return new BomListResponse(results, productIdsPage.getTotalElements());
    }
}
