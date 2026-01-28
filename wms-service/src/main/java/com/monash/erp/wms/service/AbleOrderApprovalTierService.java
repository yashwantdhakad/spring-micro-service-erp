package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.AbleOrderApprovalTier;
import com.monash.erp.wms.repository.AbleOrderApprovalTierRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AbleOrderApprovalTierService {

    private final AbleOrderApprovalTierRepository repository;

    public AbleOrderApprovalTierService(AbleOrderApprovalTierRepository repository) {
        this.repository = repository;
    }

    public List<AbleOrderApprovalTier> list() {
        return repository.findAll();
    }

    public AbleOrderApprovalTier get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AbleOrderApprovalTier %d not found".formatted(id)));
    }

    public AbleOrderApprovalTier create(AbleOrderApprovalTier entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AbleOrderApprovalTier update(Long id, AbleOrderApprovalTier entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AbleOrderApprovalTier %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}