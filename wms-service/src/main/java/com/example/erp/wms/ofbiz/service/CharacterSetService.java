package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.CharacterSet;
import com.example.erp.wms.ofbiz.repository.CharacterSetRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CharacterSetService {

    private final CharacterSetRepository repository;

    public CharacterSetService(CharacterSetRepository repository) {
        this.repository = repository;
    }

    public List<CharacterSet> list() {
        return repository.findAll();
    }

    public CharacterSet get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CharacterSet %d not found".formatted(id)));
    }

    public CharacterSet create(CharacterSet entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CharacterSet update(Long id, CharacterSet entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CharacterSet %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}