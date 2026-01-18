package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.PicklistBin;
import com.monash.erp.wms.repository.PicklistBinRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PicklistBinService {

    private final PicklistBinRepository repository;

    public PicklistBinService(PicklistBinRepository repository) {
        this.repository = repository;
    }

    public List<PicklistBin> list() {
        return repository.findAll();
    }

    public PicklistBin get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PicklistBin %d not found".formatted(id)));
    }

    public PicklistBin create(PicklistBin entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PicklistBin update(Long id, PicklistBin entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PicklistBin %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}