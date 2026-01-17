package com.example.erp.oms.common.service;

import com.example.erp.oms.common.domain.PeriodType;
import com.example.erp.oms.common.repository.PeriodTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PeriodTypeService {

    private final PeriodTypeRepository repository;

    public PeriodTypeService(PeriodTypeRepository repository) {
        this.repository = repository;
    }

    public List<PeriodType> list() {
        return repository.findAll();
    }

    public PeriodType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PeriodType %d not found".formatted(id)));
    }

    public PeriodType create(PeriodType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PeriodType update(Long id, PeriodType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PeriodType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
