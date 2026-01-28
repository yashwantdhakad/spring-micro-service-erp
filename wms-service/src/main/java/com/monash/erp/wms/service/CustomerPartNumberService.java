package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.CustomerPartNumber;
import com.monash.erp.wms.repository.CustomerPartNumberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustomerPartNumberService {

    private final CustomerPartNumberRepository repository;

    public CustomerPartNumberService(CustomerPartNumberRepository repository) {
        this.repository = repository;
    }

    public List<CustomerPartNumber> list() {
        return repository.findAll();
    }

    public CustomerPartNumber get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustomerPartNumber %d not found".formatted(id)));
    }

    public CustomerPartNumber create(CustomerPartNumber entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustomerPartNumber update(Long id, CustomerPartNumber entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustomerPartNumber %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}