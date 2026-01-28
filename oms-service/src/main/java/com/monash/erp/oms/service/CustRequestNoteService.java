package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CustRequestNote;
import com.monash.erp.oms.repository.CustRequestNoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustRequestNoteService {

    private final CustRequestNoteRepository repository;

    public CustRequestNoteService(CustRequestNoteRepository repository) {
        this.repository = repository;
    }

    public List<CustRequestNote> list() {
        return repository.findAll();
    }

    public CustRequestNote get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestNote %d not found".formatted(id)));
    }

    public CustRequestNote create(CustRequestNote entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustRequestNote update(Long id, CustRequestNote entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestNote %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}