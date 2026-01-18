package com.monash.erp.oms.common.service;

import com.monash.erp.oms.common.entity.UomGroup;
import com.monash.erp.oms.common.repository.UomGroupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UomGroupService {

    private final UomGroupRepository repository;

    public UomGroupService(UomGroupRepository repository) {
        this.repository = repository;
    }

    public List<UomGroup> list() {
        return repository.findAll();
    }

    public UomGroup get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "UomGroup %d not found".formatted(id)));
    }

    public UomGroup create(UomGroup entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public UomGroup update(Long id, UomGroup entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "UomGroup %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
