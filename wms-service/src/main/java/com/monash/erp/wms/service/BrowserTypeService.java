package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.BrowserType;
import com.monash.erp.wms.repository.BrowserTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BrowserTypeService {

    private final BrowserTypeRepository repository;

    public BrowserTypeService(BrowserTypeRepository repository) {
        this.repository = repository;
    }

    public List<BrowserType> list() {
        return repository.findAll();
    }

    public BrowserType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BrowserType %d not found".formatted(id)));
    }

    public BrowserType create(BrowserType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BrowserType update(Long id, BrowserType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BrowserType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}