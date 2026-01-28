package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SalaryStep;
import com.monash.erp.wms.repository.SalaryStepRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SalaryStepService {

    private final SalaryStepRepository repository;

    public SalaryStepService(SalaryStepRepository repository) {
        this.repository = repository;
    }

    public List<SalaryStep> list() {
        return repository.findAll();
    }

    public SalaryStep get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SalaryStep %d not found".formatted(id)));
    }

    public SalaryStep create(SalaryStep entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SalaryStep update(Long id, SalaryStep entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SalaryStep %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}