package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.MarketingCampaign;
import com.monash.erp.oms.service.MarketingCampaignService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/marketing-campaigns")
public class MarketingCampaignController {

    private final MarketingCampaignService service;

    public MarketingCampaignController(MarketingCampaignService service) {
        this.service = service;
    }

    @GetMapping
    public List<MarketingCampaign> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public MarketingCampaign get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<MarketingCampaign> create(@RequestBody MarketingCampaign entity) {
        MarketingCampaign created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public MarketingCampaign update(@PathVariable Long id, @RequestBody MarketingCampaign entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}