package com.monash.erp.wms.service;

import com.monash.erp.wms.dto.ProductAssocDto;
import com.monash.erp.wms.dto.ProductAssocRequest;
import com.monash.erp.wms.dto.ProductAssocTypeDto;
import com.monash.erp.wms.dto.ProductCategoryDto;
import com.monash.erp.wms.dto.ProductCategoryRequest;
import com.monash.erp.wms.dto.ProductContentDto;
import com.monash.erp.wms.dto.ProductCreateRequest;
import com.monash.erp.wms.dto.ProductCreateResponse;
import com.monash.erp.wms.dto.ProductDetailResponse;
import com.monash.erp.wms.dto.ProductListResponse;
import com.monash.erp.wms.dto.ProductPriceDto;
import com.monash.erp.wms.dto.ProductPriceRequest;
import com.monash.erp.wms.dto.ProductSummary;
import com.monash.erp.wms.dto.ProductUpdateRequest;
import com.monash.erp.wms.entity.Content;
import com.monash.erp.wms.entity.ContentMetaData;
import com.monash.erp.wms.entity.Product;
import com.monash.erp.wms.entity.ProductAssoc;
import com.monash.erp.wms.entity.ProductAssocType;
import com.monash.erp.wms.entity.ProductCategory;
import com.monash.erp.wms.entity.ProductCategoryMember;
import com.monash.erp.wms.entity.ProductContent;
import com.monash.erp.wms.entity.ProductPrice;
import com.monash.erp.wms.repository.ContentMetaDataRepository;
import com.monash.erp.wms.repository.ContentRepository;
import com.monash.erp.wms.repository.ProductAssocRepository;
import com.monash.erp.wms.repository.ProductAssocTypeRepository;
import com.monash.erp.wms.repository.ProductCategoryMemberRepository;
import com.monash.erp.wms.repository.ProductCategoryRepository;
import com.monash.erp.wms.repository.ProductContentRepository;
import com.monash.erp.wms.repository.ProductPriceRepository;
import com.monash.erp.wms.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProductCompositeService {

    private static final int DEFAULT_PAGE_SIZE = 10;
    private static final String DEFAULT_PRICE_TYPE = "DEFAULT_PRICE";
    private static final String DEFAULT_PRICE_PURPOSE = "PURCHASE";
    private static final String DEFAULT_CURRENCY = "USD";
    private static final String DEFAULT_PRODUCT_CONTENT_TYPE = "IMAGE";
    private static final String CONTENT_LOCATION_PREDICATE = "CONTENT_LOCATION";

    private final ProductRepository productRepository;
    private final ProductPriceRepository productPriceRepository;
    private final ProductCategoryMemberRepository productCategoryMemberRepository;
    private final ProductCategoryRepository productCategoryRepository;
    private final ProductAssocRepository productAssocRepository;
    private final ProductAssocTypeRepository productAssocTypeRepository;
    private final ProductContentRepository productContentRepository;
    private final ContentRepository contentRepository;
    private final ContentMetaDataRepository contentMetaDataRepository;

    public ProductCompositeService(
            ProductRepository productRepository,
            ProductPriceRepository productPriceRepository,
            ProductCategoryMemberRepository productCategoryMemberRepository,
            ProductCategoryRepository productCategoryRepository,
            ProductAssocRepository productAssocRepository,
            ProductAssocTypeRepository productAssocTypeRepository,
            ProductContentRepository productContentRepository,
            ContentRepository contentRepository,
            ContentMetaDataRepository contentMetaDataRepository
    ) {
        this.productRepository = productRepository;
        this.productPriceRepository = productPriceRepository;
        this.productCategoryMemberRepository = productCategoryMemberRepository;
        this.productCategoryRepository = productCategoryRepository;
        this.productAssocRepository = productAssocRepository;
        this.productAssocTypeRepository = productAssocTypeRepository;
        this.productContentRepository = productContentRepository;
        this.contentRepository = contentRepository;
        this.contentMetaDataRepository = contentMetaDataRepository;
    }

    public ProductListResponse listProducts(int page, String queryString, Integer size) {
        int pageSize = size != null && size > 0 ? size : DEFAULT_PAGE_SIZE;
        PageRequest pageable = PageRequest.of(Math.max(page, 0), pageSize, Sort.by("id").descending());
        Page<Product> result = isBlank(queryString)
                ? productRepository.findAll(pageable)
                : productRepository.findByProductNameContainingIgnoreCaseOrProductIdContainingIgnoreCase(
                queryString, queryString, pageable
        );

        List<ProductSummary> summaries = result.getContent().stream()
                .map(this::toSummary)
                .toList();

        return new ProductListResponse(summaries, result.getTotalElements());
    }

    public ProductDetailResponse getDetail(String productId) {
        Product product = productRepository.findByProductId(productId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product %s not found".formatted(productId)));

        List<ProductPriceDto> prices = productPriceRepository.findByProductId(productId).stream()
                .map(this::toPriceDto)
                .toList();

        List<ProductCategoryDto> categories = buildCategoryDtos(productId);
        List<ProductContentDto> contents = buildContentDtos(productId);

        List<ProductAssocDto> assocs = buildAssocDtos(productAssocRepository.findByProductId(productId));
        List<ProductAssocDto> toAssocs = buildAssocDtos(productAssocRepository.findByProductIdTo(productId));

        ProductDetailResponse response = new ProductDetailResponse();
        response.setProduct(product);
        response.setPrices(prices);
        response.setCategories(categories);
        response.setContents(contents);
        response.setAssocs(assocs);
        response.setToAssocs(toAssocs);
        return response;
    }

    public ProductCreateResponse create(ProductCreateRequest request) {
        Product product = new Product();
        product.setProductName(request.getProductName());
        product.setProductTypeId(request.getProductTypeId());
        product.setDescription(request.getDescription());
        Product saved = productRepository.save(product);

        if (isBlank(saved.getProductId())) {
            saved.setProductId("PROD" + saved.getId());
            saved = productRepository.save(saved);
        }

        ProductPriceDto priceDto = null;
        if (!isBlank(request.getPrice())) {
            ProductPrice price = new ProductPrice();
            price.setProductId(saved.getProductId());
            price.setProductPriceTypeId(DEFAULT_PRICE_TYPE);
            price.setProductPricePurposeId(DEFAULT_PRICE_PURPOSE);
            price.setPrice(request.getPrice());
            price.setCurrencyUomId(firstNonBlank(request.getCurrencyUomId(), DEFAULT_CURRENCY));
            price.setFromDate(LocalDateTime.now());
            ProductPrice createdPrice = productPriceRepository.save(price);
            priceDto = toPriceDto(createdPrice);
        }

        return new ProductCreateResponse(saved, priceDto);
    }

    public Product update(String productId, ProductUpdateRequest request) {
        Product existing = productRepository.findByProductId(productId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product %s not found".formatted(productId)));

        if (!isBlank(request.getProductName())) {
            existing.setProductName(request.getProductName());
        }
        if (request.getDescription() != null) {
            existing.setDescription(request.getDescription());
        }

        return productRepository.save(existing);
    }

    public void delete(String productId) {
        Product existing = productRepository.findByProductId(productId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product %s not found".formatted(productId)));
        productRepository.delete(existing);
    }

    public ProductPriceDto addPrice(String productId, ProductPriceRequest request) {
        requireProduct(productId);

        ProductPrice price = new ProductPrice();
        price.setProductId(productId);
        price.setProductPriceTypeId(firstNonBlank(request.getProductPriceTypeId(), DEFAULT_PRICE_TYPE));
        price.setProductPricePurposeId(firstNonBlank(request.getProductPricePurposeId(), DEFAULT_PRICE_PURPOSE));
        price.setPrice(request.getPrice());
        price.setCurrencyUomId(firstNonBlank(request.getCurrencyUomId(), DEFAULT_CURRENCY));
        price.setFromDate(LocalDateTime.now());
        return toPriceDto(productPriceRepository.save(price));
    }

    public ProductPriceDto updatePrice(String productId, Long productPriceId, ProductPriceRequest request) {
        ProductPrice price = productPriceRepository.findByIdAndProductId(productPriceId, productId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product price %d not found".formatted(productPriceId)));

        if (!isBlank(request.getProductPriceTypeId())) {
            price.setProductPriceTypeId(request.getProductPriceTypeId());
        }
        if (!isBlank(request.getProductPricePurposeId())) {
            price.setProductPricePurposeId(request.getProductPricePurposeId());
        }
        if (request.getPrice() != null) {
            price.setPrice(request.getPrice());
        }
        if (!isBlank(request.getCurrencyUomId())) {
            price.setCurrencyUomId(request.getCurrencyUomId());
        }

        return toPriceDto(productPriceRepository.save(price));
    }

    public void deletePrice(String productId, Long productPriceId) {
        ProductPrice price = productPriceRepository.findByIdAndProductId(productPriceId, productId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product price %d not found".formatted(productPriceId)));
        productPriceRepository.delete(price);
    }

    public ProductCategoryDto addCategory(String productId, ProductCategoryRequest request) {
        requireProduct(productId);

        if (isBlank(request.getProductCategoryId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "productCategoryId is required");
        }

        ProductCategoryMember member = productCategoryMemberRepository
                .findByProductIdAndProductCategoryId(productId, request.getProductCategoryId())
                .orElseGet(ProductCategoryMember::new);
        member.setProductId(productId);
        member.setProductCategoryId(request.getProductCategoryId());
        if (member.getFromDate() == null) {
            member.setFromDate(LocalDateTime.now());
        }

        ProductCategoryMember saved = productCategoryMemberRepository.save(member);
        ProductCategory category = productCategoryRepository.findByProductCategoryId(saved.getProductCategoryId())
                .orElse(null);
        return toCategoryDto(saved, category);
    }

    public void deleteCategory(String productId, String productCategoryId) {
        ProductCategoryMember member = productCategoryMemberRepository
                .findByProductIdAndProductCategoryId(productId, productCategoryId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category member not found"));
        productCategoryMemberRepository.delete(member);
    }

    public ProductAssocDto addAssoc(String productId, ProductAssocRequest request) {
        requireProduct(productId);

        if (isBlank(request.getToProductId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "toProductId is required");
        }

        ProductAssoc assoc = new ProductAssoc();
        assoc.setProductId(productId);
        assoc.setProductIdTo(request.getToProductId());
        assoc.setProductAssocTypeId(request.getProductAssocTypeEnumId());
        assoc.setQuantity(request.getQuantity());
        assoc.setFromDate(Optional.ofNullable(request.getFromDate()).orElseGet(LocalDateTime::now));
        return toAssocDto(productAssocRepository.save(assoc));
    }

    public ProductContentDto addContent(String productId, MultipartFile contentFile) {
        requireProduct(productId);

        if (contentFile == null || contentFile.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "contentFile is required");
        }

        Content content = new Content();
        String contentId = "CNT" + UUID.randomUUID().toString().replace("-", "");
        String originalName = contentFile.getOriginalFilename();
        content.setContentId(contentId);
        content.setContentName(originalName);
        content.setDescription(originalName);
        Content savedContent = contentRepository.save(content);

        ContentMetaData metaData = new ContentMetaData();
        metaData.setContentId(savedContent.getContentId());
        metaData.setMetaDataPredicateId(CONTENT_LOCATION_PREDICATE);
        metaData.setMetaDataValue(originalName);
        contentMetaDataRepository.save(metaData);

        ProductContent productContent = new ProductContent();
        productContent.setProductId(productId);
        productContent.setContentId(savedContent.getContentId());
        productContent.setProductContentTypeId(DEFAULT_PRODUCT_CONTENT_TYPE);
        productContent.setFromDate(LocalDateTime.now());
        productContentRepository.save(productContent);

        ProductContentDto dto = new ProductContentDto();
        dto.setContentId(savedContent.getContentId());
        dto.setDescription(firstNonBlank(savedContent.getDescription(), savedContent.getContentName()));
        dto.setProductContentTypeEnumId(productContent.getProductContentTypeId());
        dto.setContentLocation(originalName);
        return dto;
    }

    private void requireProduct(String productId) {
        productRepository.findByProductId(productId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product %s not found".formatted(productId)));
    }

    private ProductSummary toSummary(Product product) {
        return new ProductSummary(product.getProductId(), product.getProductName(), product.getProductTypeId());
    }

    private ProductPriceDto toPriceDto(ProductPrice price) {
        ProductPriceDto dto = new ProductPriceDto();
        dto.setProductPriceId(price.getId());
        dto.setProductId(price.getProductId());
        dto.setProductPriceTypeId(price.getProductPriceTypeId());
        dto.setProductPricePurposeId(price.getProductPricePurposeId());
        dto.setPrice(price.getPrice());
        dto.setCurrencyUomId(price.getCurrencyUomId());
        return dto;
    }

    private List<ProductCategoryDto> buildCategoryDtos(String productId) {
        List<ProductCategoryMember> members = productCategoryMemberRepository.findByProductId(productId);
        if (members.isEmpty()) {
            return Collections.emptyList();
        }

        List<String> categoryIds = members.stream()
                .map(ProductCategoryMember::getProductCategoryId)
                .filter(Objects::nonNull)
                .distinct()
                .toList();

        Map<String, ProductCategory> categoryMap = productCategoryRepository.findByProductCategoryIdIn(categoryIds)
                .stream()
                .collect(Collectors.toMap(ProductCategory::getProductCategoryId, category -> category));

        List<ProductCategoryDto> results = new ArrayList<>();
        for (ProductCategoryMember member : members) {
            ProductCategory category = categoryMap.get(member.getProductCategoryId());
            results.add(toCategoryDto(member, category));
        }
        return results;
    }

    private ProductCategoryDto toCategoryDto(ProductCategoryMember member, ProductCategory category) {
        ProductCategoryDto dto = new ProductCategoryDto();
        dto.setProductCategoryId(member.getProductCategoryId());
        dto.setCategoryName(category != null ? category.getCategoryName() : null);
        dto.setProductCategoryTypeId(category != null ? category.getProductCategoryTypeId() : null);
        dto.setFromDate(member.getFromDate());
        return dto;
    }

    private List<ProductContentDto> buildContentDtos(String productId) {
        List<ProductContent> contents = productContentRepository.findByProductId(productId);
        if (contents.isEmpty()) {
            return Collections.emptyList();
        }

        List<ProductContentDto> results = new ArrayList<>();
        for (ProductContent content : contents) {
            ProductContentDto dto = new ProductContentDto();
            dto.setContentId(content.getContentId());
            dto.setProductContentTypeEnumId(content.getProductContentTypeId());

            Content contentEntity = contentRepository.findByContentId(content.getContentId()).orElse(null);
            String description = contentEntity != null
                    ? firstNonBlank(contentEntity.getDescription(), contentEntity.getContentName())
                    : null;
            dto.setDescription(description);

            String location = contentMetaDataRepository.findByContentId(content.getContentId())
                    .stream()
                    .filter(meta -> CONTENT_LOCATION_PREDICATE.equalsIgnoreCase(meta.getMetaDataPredicateId()))
                    .map(ContentMetaData::getMetaDataValue)
                    .findFirst()
                    .orElse(null);
            dto.setContentLocation(location);
            results.add(dto);
        }
        return results;
    }

    private List<ProductAssocDto> buildAssocDtos(List<ProductAssoc> assocs) {
        if (assocs.isEmpty()) {
            return Collections.emptyList();
        }

        Map<String, ProductSummary> productCache = new HashMap<>();
        List<ProductAssocDto> results = new ArrayList<>();
        for (ProductAssoc assoc : assocs) {
            ProductAssocDto dto = new ProductAssocDto();
            dto.setProduct(getProductSummary(assoc.getProductId(), productCache));
            dto.setToProduct(getProductSummary(assoc.getProductIdTo(), productCache));
            dto.setType(getAssocType(assoc.getProductAssocTypeId()));
            dto.setFromDate(assoc.getFromDate());
            dto.setQuantity(assoc.getQuantity());
            results.add(dto);
        }
        return results;
    }

    private ProductSummary getProductSummary(String productId, Map<String, ProductSummary> cache) {
        if (isBlank(productId)) {
            return null;
        }
        return cache.computeIfAbsent(productId, id -> productRepository.findByProductId(id)
                .map(this::toSummary)
                .orElse(new ProductSummary(id, id, null)));
    }

    private ProductAssocTypeDto getAssocType(String assocTypeId) {
        if (isBlank(assocTypeId)) {
            return null;
        }
        return productAssocTypeRepository.findByProductAssocTypeId(assocTypeId)
                .map(type -> new ProductAssocTypeDto(type.getProductAssocTypeId(), type.getDescription()))
                .orElse(new ProductAssocTypeDto(assocTypeId, assocTypeId));
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }

    private String firstNonBlank(String value, String fallback) {
        return isBlank(value) ? fallback : value;
    }
}
