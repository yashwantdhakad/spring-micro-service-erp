package com.example.erp.mfg.ofbiz.service;

import com.example.erp.mfg.ofbiz.domain.MrpEventType;
import com.example.erp.mfg.ofbiz.repository.MrpEventTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class MrpEventTypeService {

    private final MrpEventTypeRepository repository;

    public MrpEventTypeService(MrpEventTypeRepository repository) {
        this.repository = repository;
    }

    public List<MrpEventType> list() {
        return repository.findAll();
    }

    public MrpEventType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "MrpEventType %d not found".formatted(id)));
    }

    public MrpEventType create(MrpEventType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public MrpEventType update(Long id, MrpEventType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "MrpEventType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}