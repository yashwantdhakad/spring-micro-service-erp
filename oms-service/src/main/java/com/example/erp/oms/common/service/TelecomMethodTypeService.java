package com.example.erp.oms.common.service;

import com.example.erp.oms.common.domain.TelecomMethodType;
import com.example.erp.oms.common.repository.TelecomMethodTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TelecomMethodTypeService {

    private final TelecomMethodTypeRepository repository;

    public TelecomMethodTypeService(TelecomMethodTypeRepository repository) {
        this.repository = repository;
    }

    public List<TelecomMethodType> list() {
        return repository.findAll();
    }

    public TelecomMethodType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TelecomMethodType %d not found".formatted(id)));
    }

    public TelecomMethodType create(TelecomMethodType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TelecomMethodType update(Long id, TelecomMethodType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TelecomMethodType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
