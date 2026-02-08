package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.MrpEvent;
import com.monash.erp.mfg.repository.MrpEventRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class MrpEventService {

    private final MrpEventRepository repository;

    public MrpEventService(MrpEventRepository repository) {
        this.repository = repository;
    }

    public List<MrpEvent> list() {
        return repository.findAll();
    }

    public MrpEvent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "MrpEvent %d not found".formatted(id)));
    }

    public MrpEvent create(MrpEvent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public MrpEvent update(Long id, MrpEvent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "MrpEvent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}