package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.PicklistStatus;
import com.example.erp.wms.ofbiz.repository.PicklistStatusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PicklistStatusService {

    private final PicklistStatusRepository repository;

    public PicklistStatusService(PicklistStatusRepository repository) {
        this.repository = repository;
    }

    public List<PicklistStatus> list() {
        return repository.findAll();
    }

    public PicklistStatus get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PicklistStatus %d not found".formatted(id)));
    }

    public PicklistStatus create(PicklistStatus entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PicklistStatus update(Long id, PicklistStatus entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PicklistStatus %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}