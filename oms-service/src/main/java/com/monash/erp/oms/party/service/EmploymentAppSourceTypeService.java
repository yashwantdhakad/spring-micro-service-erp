package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.EmploymentAppSourceType;
import com.monash.erp.oms.party.repository.EmploymentAppSourceTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmploymentAppSourceTypeService {

    private final EmploymentAppSourceTypeRepository repository;

    public EmploymentAppSourceTypeService(EmploymentAppSourceTypeRepository repository) {
        this.repository = repository;
    }

    public List<EmploymentAppSourceType> list() {
        return repository.findAll();
    }

    public EmploymentAppSourceType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EmploymentAppSourceType %d not found".formatted(id)));
    }

    public EmploymentAppSourceType create(EmploymentAppSourceType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EmploymentAppSourceType update(Long id, EmploymentAppSourceType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EmploymentAppSourceType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}