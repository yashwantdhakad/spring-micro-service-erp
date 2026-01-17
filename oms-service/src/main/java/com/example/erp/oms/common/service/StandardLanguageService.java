package com.example.erp.oms.common.service;

import com.example.erp.oms.common.domain.StandardLanguage;
import com.example.erp.oms.common.repository.StandardLanguageRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StandardLanguageService {

    private final StandardLanguageRepository repository;

    public StandardLanguageService(StandardLanguageRepository repository) {
        this.repository = repository;
    }

    public List<StandardLanguage> list() {
        return repository.findAll();
    }

    public StandardLanguage get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "StandardLanguage %d not found".formatted(id)));
    }

    public StandardLanguage create(StandardLanguage entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public StandardLanguage update(Long id, StandardLanguage entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "StandardLanguage %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
