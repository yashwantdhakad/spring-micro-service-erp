package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.MarketingCampaignNote;
import com.monash.erp.oms.repository.MarketingCampaignNoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class MarketingCampaignNoteService {

    private final MarketingCampaignNoteRepository repository;

    public MarketingCampaignNoteService(MarketingCampaignNoteRepository repository) {
        this.repository = repository;
    }

    public List<MarketingCampaignNote> list() {
        return repository.findAll();
    }

    public MarketingCampaignNote get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "MarketingCampaignNote %d not found".formatted(id)));
    }

    public MarketingCampaignNote create(MarketingCampaignNote entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public MarketingCampaignNote update(Long id, MarketingCampaignNote entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "MarketingCampaignNote %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}