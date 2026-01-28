package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.MarketingCampaignRole;
import com.monash.erp.oms.repository.MarketingCampaignRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class MarketingCampaignRoleService {

    private final MarketingCampaignRoleRepository repository;

    public MarketingCampaignRoleService(MarketingCampaignRoleRepository repository) {
        this.repository = repository;
    }

    public List<MarketingCampaignRole> list() {
        return repository.findAll();
    }

    public MarketingCampaignRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "MarketingCampaignRole %d not found".formatted(id)));
    }

    public MarketingCampaignRole create(MarketingCampaignRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public MarketingCampaignRole update(Long id, MarketingCampaignRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "MarketingCampaignRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}