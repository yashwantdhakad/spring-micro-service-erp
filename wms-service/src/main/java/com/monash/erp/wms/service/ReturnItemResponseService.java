package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ReturnItemResponse;
import com.monash.erp.wms.repository.ReturnItemResponseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ReturnItemResponseService {

    private final ReturnItemResponseRepository repository;

    public ReturnItemResponseService(ReturnItemResponseRepository repository) {
        this.repository = repository;
    }

    public List<ReturnItemResponse> list() {
        return repository.findAll();
    }

    public ReturnItemResponse get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnItemResponse %d not found".formatted(id)));
    }

    public ReturnItemResponse create(ReturnItemResponse entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ReturnItemResponse update(Long id, ReturnItemResponse entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ReturnItemResponse %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}