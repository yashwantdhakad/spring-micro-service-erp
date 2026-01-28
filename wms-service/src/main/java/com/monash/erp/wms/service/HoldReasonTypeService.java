package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.HoldReasonType;
import com.monash.erp.wms.repository.HoldReasonTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class HoldReasonTypeService {

    private final HoldReasonTypeRepository repository;

    public HoldReasonTypeService(HoldReasonTypeRepository repository) {
        this.repository = repository;
    }

    public List<HoldReasonType> list() {
        return repository.findAll();
    }

    public HoldReasonType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "HoldReasonType %d not found".formatted(id)));
    }

    public HoldReasonType create(HoldReasonType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public HoldReasonType update(Long id, HoldReasonType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "HoldReasonType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}