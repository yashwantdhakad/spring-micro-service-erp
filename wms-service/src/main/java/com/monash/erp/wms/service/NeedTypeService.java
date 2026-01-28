package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.NeedType;
import com.monash.erp.wms.repository.NeedTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class NeedTypeService {

    private final NeedTypeRepository repository;

    public NeedTypeService(NeedTypeRepository repository) {
        this.repository = repository;
    }

    public List<NeedType> list() {
        return repository.findAll();
    }

    public NeedType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "NeedType %d not found".formatted(id)));
    }

    public NeedType create(NeedType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public NeedType update(Long id, NeedType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NeedType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}