package com.monash.erp.oms.controller;

import com.monash.erp.oms.entity.MarketingCampaignNote;
import com.monash.erp.oms.service.MarketingCampaignNoteService;
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
@RequestMapping("/api/marketing-campaign-notes")
public class MarketingCampaignNoteController {

    private final MarketingCampaignNoteService service;

    public MarketingCampaignNoteController(MarketingCampaignNoteService service) {
        this.service = service;
    }

    @GetMapping
    public List<MarketingCampaignNote> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public MarketingCampaignNote get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<MarketingCampaignNote> create(@RequestBody MarketingCampaignNote entity) {
        MarketingCampaignNote created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public MarketingCampaignNote update(@PathVariable Long id, @RequestBody MarketingCampaignNote entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}