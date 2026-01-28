package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CustRequestItem;
import com.monash.erp.oms.repository.CustRequestItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustRequestItemService {

    private final CustRequestItemRepository repository;

    public CustRequestItemService(CustRequestItemRepository repository) {
        this.repository = repository;
    }

    public List<CustRequestItem> list() {
        return repository.findAll();
    }

    public CustRequestItem get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestItem %d not found".formatted(id)));
    }

    public CustRequestItem create(CustRequestItem entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustRequestItem update(Long id, CustRequestItem entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestItem %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}