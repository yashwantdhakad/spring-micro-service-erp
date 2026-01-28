package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.CatalinaSession;
import com.monash.erp.wms.repository.CatalinaSessionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CatalinaSessionService {

    private final CatalinaSessionRepository repository;

    public CatalinaSessionService(CatalinaSessionRepository repository) {
        this.repository = repository;
    }

    public List<CatalinaSession> list() {
        return repository.findAll();
    }

    public CatalinaSession get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CatalinaSession %d not found".formatted(id)));
    }

    public CatalinaSession create(CatalinaSession entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CatalinaSession update(Long id, CatalinaSession entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CatalinaSession %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}