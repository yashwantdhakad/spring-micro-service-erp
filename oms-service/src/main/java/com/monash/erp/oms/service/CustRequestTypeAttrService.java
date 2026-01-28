package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CustRequestTypeAttr;
import com.monash.erp.oms.repository.CustRequestTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustRequestTypeAttrService {

    private final CustRequestTypeAttrRepository repository;

    public CustRequestTypeAttrService(CustRequestTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<CustRequestTypeAttr> list() {
        return repository.findAll();
    }

    public CustRequestTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestTypeAttr %d not found".formatted(id)));
    }

    public CustRequestTypeAttr create(CustRequestTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustRequestTypeAttr update(Long id, CustRequestTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}