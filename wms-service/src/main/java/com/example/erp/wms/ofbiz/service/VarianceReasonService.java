package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.VarianceReason;
import com.example.erp.wms.ofbiz.repository.VarianceReasonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class VarianceReasonService {

    private final VarianceReasonRepository repository;

    public VarianceReasonService(VarianceReasonRepository repository) {
        this.repository = repository;
    }

    public List<VarianceReason> list() {
        return repository.findAll();
    }

    public VarianceReason get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "VarianceReason %d not found".formatted(id)));
    }

    public VarianceReason create(VarianceReason entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public VarianceReason update(Long id, VarianceReason entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "VarianceReason %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}