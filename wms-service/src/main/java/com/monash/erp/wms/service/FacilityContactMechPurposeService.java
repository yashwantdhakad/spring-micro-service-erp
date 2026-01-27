package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FacilityContactMechPurpose;
import com.monash.erp.wms.repository.FacilityContactMechPurposeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FacilityContactMechPurposeService {

    private final FacilityContactMechPurposeRepository repository;

    public FacilityContactMechPurposeService(FacilityContactMechPurposeRepository repository) {
        this.repository = repository;
    }

    public List<FacilityContactMechPurpose> list() {
        return repository.findAll();
    }

    public List<FacilityContactMechPurpose> listByFacilityId(String facilityId) {
        return repository.findByFacilityId(facilityId);
    }

    public FacilityContactMechPurpose get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityContactMechPurpose %d not found".formatted(id)));
    }

    public FacilityContactMechPurpose create(FacilityContactMechPurpose entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FacilityContactMechPurpose update(Long id, FacilityContactMechPurpose entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityContactMechPurpose %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
