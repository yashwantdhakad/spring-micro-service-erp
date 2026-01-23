package com.monash.erp.wms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.monash.erp.wms.dto.CategoryProductDto;
import com.monash.erp.wms.dto.ProductCategoryDetailResponse;
import com.monash.erp.wms.dto.ProductSummary;
import com.monash.erp.wms.entity.ProductCategory;
import com.monash.erp.wms.entity.ProductCategoryMember;
import com.monash.erp.wms.repository.ProductCategoryMemberRepository;
import com.monash.erp.wms.repository.ProductCategoryRepository;
import com.monash.erp.wms.repository.ProductRepository;

@Service
public class ProductCategoryService {

    private final ProductCategoryRepository repository;
    private final ProductCategoryMemberRepository memberRepository;
    private final ProductRepository productRepository;

    public ProductCategoryService(
            ProductCategoryRepository repository,
            ProductCategoryMemberRepository memberRepository,
            ProductRepository productRepository
    ) {
        this.repository = repository;
        this.memberRepository = memberRepository;
        this.productRepository = productRepository;
    }

    public Page<ProductCategory> list(int page, int size, String categoryName) {
        PageRequest pageable = PageRequest.of(Math.max(page, 0), size, Sort.by("id").descending());
        if (categoryName == null || categoryName.isBlank()) {
            return repository.findAll(pageable);
        }
        return repository.findByCategoryNameContainingIgnoreCase(categoryName, pageable);
    }

    public ProductCategory getByCategoryId(String productCategoryId) {
        return repository.findByProductCategoryId(productCategoryId)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "ProductCategory %s not found".formatted(productCategoryId)
                ));
    }

    public ProductCategoryDetailResponse getDetail(String productCategoryId) {
        ProductCategory category = getByCategoryId(productCategoryId);
        List<ProductCategoryMember> categoryMembers = memberRepository.findByProductCategoryId(productCategoryId);

        Map<String, ProductSummary> productCache = new HashMap<>();
        List<CategoryProductDto> products = categoryMembers.stream()
                .map(member -> toCategoryProductDto(member, productCache))
                .toList();

        ProductCategoryDetailResponse response = new ProductCategoryDetailResponse();
        response.setCategory(category);
        response.setProducts(products);
        return response;
    }

    public ProductCategory create(ProductCategory entity) {
        entity.setId(null);
        ProductCategory saved = repository.save(entity);
        if (saved.getProductCategoryId() == null || saved.getProductCategoryId().isBlank()) {
            saved.setProductCategoryId("CAT" + saved.getId());
            saved = repository.save(saved);
        }
        return saved;
    }

    public ProductCategory update(String productCategoryId, ProductCategory entity) {
        ProductCategory existing = getByCategoryId(productCategoryId);
        entity.setId(existing.getId());
        entity.setProductCategoryId(existing.getProductCategoryId());
        return repository.save(entity);
    }

    public void delete(String productCategoryId) {
        ProductCategory existing = getByCategoryId(productCategoryId);
        repository.delete(existing);
    }

    public void deleteMember(String productCategoryId, String productId) {
        Optional<ProductCategoryMember> member = memberRepository
                .findByProductIdAndProductCategoryId(productId, productCategoryId);
        if (member.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Category member not found");
        }
        memberRepository.delete(member.get());
    }

    private CategoryProductDto toCategoryProductDto(
            ProductCategoryMember member,
            Map<String, ProductSummary> productCache
    ) {
        CategoryProductDto dto = new CategoryProductDto();
        dto.setProductId(member.getProductId());
        dto.setFromDate(member.getFromDate());
        dto.setSequenceNum(member.getSequenceNum());
        dto.setProduct(getProductSummary(member.getProductId(), productCache));
        return dto;
    }

    private ProductSummary getProductSummary(String productId, Map<String, ProductSummary> cache) {
        if (productId == null || productId.isBlank()) {
            return null;
        }
        return cache.computeIfAbsent(productId, id -> productRepository.findByProductId(id)
                .map(product -> new ProductSummary(product.getProductId(), product.getProductName(), product.getProductTypeId()))
                .orElse(new ProductSummary(id, id, null)));
    }
}
