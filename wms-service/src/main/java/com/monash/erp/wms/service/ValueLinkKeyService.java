package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ValueLinkKey;
import com.monash.erp.wms.repository.ValueLinkKeyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ValueLinkKeyService {

    private final ValueLinkKeyRepository repository;

    public ValueLinkKeyService(ValueLinkKeyRepository repository) {
        this.repository = repository;
    }

    public List<ValueLinkKey> list() {
        return repository.findAll();
    }

    public ValueLinkKey get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ValueLinkKey %d not found".formatted(id)));
    }

    public ValueLinkKey create(ValueLinkKey entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ValueLinkKey update(Long id, ValueLinkKey entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ValueLinkKey %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}