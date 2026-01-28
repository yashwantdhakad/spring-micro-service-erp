package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.MarketingCampaign;
import com.monash.erp.oms.repository.MarketingCampaignRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class MarketingCampaignService {

    private final MarketingCampaignRepository repository;

    public MarketingCampaignService(MarketingCampaignRepository repository) {
        this.repository = repository;
    }

    public List<MarketingCampaign> list() {
        return repository.findAll();
    }

    public MarketingCampaign get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "MarketingCampaign %d not found".formatted(id)));
    }

    public MarketingCampaign create(MarketingCampaign entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public MarketingCampaign update(Long id, MarketingCampaign entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "MarketingCampaign %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}