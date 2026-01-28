package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.MarketingCampaignPrice;
import com.monash.erp.oms.repository.MarketingCampaignPriceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class MarketingCampaignPriceService {

    private final MarketingCampaignPriceRepository repository;

    public MarketingCampaignPriceService(MarketingCampaignPriceRepository repository) {
        this.repository = repository;
    }

    public List<MarketingCampaignPrice> list() {
        return repository.findAll();
    }

    public MarketingCampaignPrice get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "MarketingCampaignPrice %d not found".formatted(id)));
    }

    public MarketingCampaignPrice create(MarketingCampaignPrice entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public MarketingCampaignPrice update(Long id, MarketingCampaignPrice entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "MarketingCampaignPrice %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}