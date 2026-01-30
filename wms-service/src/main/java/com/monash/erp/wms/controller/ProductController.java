package com.monash.erp.wms.controller;

import com.monash.erp.wms.dto.ProductAssocDto;
import com.monash.erp.wms.dto.ProductAssocRequest;
import com.monash.erp.wms.dto.ProductCategoryDto;
import com.monash.erp.wms.dto.ProductCategoryRequest;
import com.monash.erp.wms.dto.ProductContentDto;
import com.monash.erp.wms.dto.ProductCreateRequest;
import com.monash.erp.wms.dto.ProductCreateResponse;
import com.monash.erp.wms.dto.ProductDetailResponse;
import com.monash.erp.wms.dto.ProductListResponse;
import com.monash.erp.wms.dto.ProductPriceDto;
import com.monash.erp.wms.dto.ProductPriceRequest;
import com.monash.erp.wms.dto.ProductUpdateRequest;
import com.monash.erp.wms.entity.Product;
import com.monash.erp.wms.service.ProductCompositeService;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.net.URLConnection;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductCompositeService service;

    public ProductController(ProductCompositeService service) {
        this.service = service;
    }

    @GetMapping
    public ProductListResponse list(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "") String queryString,
            @RequestParam(required = false) Integer size,
            @RequestParam(required = false) String sortBy,
            @RequestParam(required = false) String sortDirection
    ) {
        return service.listProducts(page, queryString, size, sortBy, sortDirection);
    }

    @GetMapping("/{productId}")
    public ProductDetailResponse get(@PathVariable String productId) {
        return service.getDetail(productId);
    }

    @PostMapping
    public ResponseEntity<ProductCreateResponse> create(@RequestBody ProductCreateRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(request));
    }

    @PutMapping("/{productId}")
    public Product update(@PathVariable String productId, @RequestBody ProductUpdateRequest request) {
        return service.update(productId, request);
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> delete(@PathVariable String productId) {
        service.delete(productId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{productId}/prices")
    public ResponseEntity<ProductPriceDto> addPrice(
            @PathVariable String productId,
            @RequestBody ProductPriceRequest request
    ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.addPrice(productId, request));
    }

    @PutMapping("/{productId}/prices/{productPriceId}")
    public ProductPriceDto updatePrice(
            @PathVariable String productId,
            @PathVariable Long productPriceId,
            @RequestBody ProductPriceRequest request
    ) {
        return service.updatePrice(productId, productPriceId, request);
    }

    @DeleteMapping("/{productId}/prices/{productPriceId}")
    public ResponseEntity<Void> deletePrice(
            @PathVariable String productId,
            @PathVariable Long productPriceId
    ) {
        service.deletePrice(productId, productPriceId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{productId}/categories")
    public ResponseEntity<ProductCategoryDto> addCategory(
            @PathVariable String productId,
            @RequestBody ProductCategoryRequest request
    ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.addCategory(productId, request));
    }

    @DeleteMapping("/{productId}/categories/{productCategoryId}")
    public ResponseEntity<Void> deleteCategory(
            @PathVariable String productId,
            @PathVariable String productCategoryId
    ) {
        service.deleteCategory(productId, productCategoryId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{productId}/assocs")
    public ResponseEntity<ProductAssocDto> addAssoc(
            @PathVariable String productId,
            @RequestBody ProductAssocRequest request
    ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.addAssoc(productId, request));
    }

    @PostMapping(value = "/{productId}/contents", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<ProductContentDto> addContent(
            @PathVariable String productId,
            @RequestPart("contentFile") MultipartFile contentFile
    ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.addContent(productId, contentFile));
    }

    @GetMapping("/{productId}/contents/{contentId}")
    public ResponseEntity<Resource> getContent(
            @PathVariable String productId,
            @PathVariable String contentId
    ) throws Exception {
        ProductCompositeService.ProductContentDownload download = service.loadProductContent(productId, contentId);
        Resource resource = new UrlResource(download.getFilePath().toUri());
        String fileName = download.getFileName();
        if (fileName == null || fileName.isBlank()) {
            fileName = contentId;
        }
        String contentType = URLConnection.guessContentTypeFromName(fileName);
        MediaType mediaType = contentType != null ? MediaType.parseMediaType(contentType) : MediaType.APPLICATION_OCTET_STREAM;

        return ResponseEntity.ok()
                .contentType(mediaType)
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + fileName + "\"")
                .body(resource);
    }
}
