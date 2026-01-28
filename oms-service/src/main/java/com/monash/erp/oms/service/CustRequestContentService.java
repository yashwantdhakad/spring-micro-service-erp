package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CustRequestContent;
import com.monash.erp.oms.repository.CustRequestContentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustRequestContentService {

    private final CustRequestContentRepository repository;

    public CustRequestContentService(CustRequestContentRepository repository) {
        this.repository = repository;
    }

    public List<CustRequestContent> list() {
        return repository.findAll();
    }

    public CustRequestContent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestContent %d not found".formatted(id)));
    }

    public CustRequestContent create(CustRequestContent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustRequestContent update(Long id, CustRequestContent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestContent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}