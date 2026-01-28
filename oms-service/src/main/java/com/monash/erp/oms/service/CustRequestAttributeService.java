package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CustRequestAttribute;
import com.monash.erp.oms.repository.CustRequestAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustRequestAttributeService {

    private final CustRequestAttributeRepository repository;

    public CustRequestAttributeService(CustRequestAttributeRepository repository) {
        this.repository = repository;
    }

    public List<CustRequestAttribute> list() {
        return repository.findAll();
    }

    public CustRequestAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestAttribute %d not found".formatted(id)));
    }

    public CustRequestAttribute create(CustRequestAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustRequestAttribute update(Long id, CustRequestAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}