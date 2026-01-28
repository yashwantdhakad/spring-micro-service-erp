package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.IosBadge;
import com.monash.erp.wms.repository.IosBadgeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class IosBadgeService {

    private final IosBadgeRepository repository;

    public IosBadgeService(IosBadgeRepository repository) {
        this.repository = repository;
    }

    public List<IosBadge> list() {
        return repository.findAll();
    }

    public IosBadge get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "IosBadge %d not found".formatted(id)));
    }

    public IosBadge create(IosBadge entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public IosBadge update(Long id, IosBadge entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "IosBadge %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}