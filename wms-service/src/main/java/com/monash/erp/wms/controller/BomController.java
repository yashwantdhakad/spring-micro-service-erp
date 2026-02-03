package com.monash.erp.wms.controller;

import com.monash.erp.wms.dto.BomListResponse;
import com.monash.erp.wms.service.BomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/boms")
public class BomController {
    private final BomService bomService;

    public BomController(BomService bomService) {
        this.bomService = bomService;
    }

    @GetMapping
    public BomListResponse list(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "") String queryString,
            @RequestParam(required = false) String bomTypeId
    ) {
        return bomService.list(page, size, queryString, bomTypeId);
    }
}
