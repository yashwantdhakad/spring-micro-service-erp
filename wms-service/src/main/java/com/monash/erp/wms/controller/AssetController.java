package com.monash.erp.wms.controller;

import com.monash.erp.wms.dto.AssetDetailResponse;
import com.monash.erp.wms.dto.AssetListResponse;
import com.monash.erp.wms.dto.AssetReceiveRequest;
import com.monash.erp.wms.dto.AssetReceiveResponse;
import com.monash.erp.wms.dto.PhysicalInventoryVarianceRequest;
import com.monash.erp.wms.service.AssetCompositeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/assets")
public class AssetController {

    private final AssetCompositeService service;

    public AssetController(AssetCompositeService service) {
        this.service = service;
    }

    @GetMapping
    public AssetListResponse list(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size,
            @RequestParam(name = "queryString", defaultValue = "") String queryString) {
        return service.listAssets(page, size, queryString);
    }

    @GetMapping("/{assetId}")
    public AssetDetailResponse get(@PathVariable String assetId) {
        return service.getAsset(assetId);
    }

    @PostMapping("/receive")
    public ResponseEntity<AssetReceiveResponse> receive(@RequestBody AssetReceiveRequest request) {
        AssetReceiveResponse response = service.receiveAsset(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PostMapping("/{assetId}/variances")
    public AssetDetailResponse createVariance(@PathVariable String assetId,
            @RequestBody PhysicalInventoryVarianceRequest request) {
        return service.createPhysicalInventoryVariance(assetId, request);
    }
}
