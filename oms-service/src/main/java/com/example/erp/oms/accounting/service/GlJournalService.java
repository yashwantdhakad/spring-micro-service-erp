package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.GlJournal;
import com.example.erp.oms.accounting.repository.GlJournalRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlJournalService {

    private final GlJournalRepository repository;

    public GlJournalService(GlJournalRepository repository) {
        this.repository = repository;
    }

    public List<GlJournal> list() {
        return repository.findAll();
    }

    public GlJournal get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlJournal %d not found".formatted(id)));
    }

    public GlJournal create(GlJournal entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlJournal update(Long id, GlJournal entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlJournal %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
