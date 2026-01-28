package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CustRequestType;
import com.monash.erp.oms.repository.CustRequestTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustRequestTypeService {

    private final CustRequestTypeRepository repository;

    public CustRequestTypeService(CustRequestTypeRepository repository) {
        this.repository = repository;
    }

    public List<CustRequestType> list() {
        return repository.findAll();
    }

    public CustRequestType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestType %d not found".formatted(id)));
    }

    public CustRequestType create(CustRequestType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustRequestType update(Long id, CustRequestType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}