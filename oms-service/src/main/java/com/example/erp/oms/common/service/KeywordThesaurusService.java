package com.example.erp.oms.common.service;

import com.example.erp.oms.common.domain.KeywordThesaurus;
import com.example.erp.oms.common.repository.KeywordThesaurusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class KeywordThesaurusService {

    private final KeywordThesaurusRepository repository;

    public KeywordThesaurusService(KeywordThesaurusRepository repository) {
        this.repository = repository;
    }

    public List<KeywordThesaurus> list() {
        return repository.findAll();
    }

    public KeywordThesaurus get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "KeywordThesaurus %d not found".formatted(id)));
    }

    public KeywordThesaurus create(KeywordThesaurus entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public KeywordThesaurus update(Long id, KeywordThesaurus entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "KeywordThesaurus %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
