package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CustRequestItemNote;
import com.monash.erp.oms.repository.CustRequestItemNoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustRequestItemNoteService {

    private final CustRequestItemNoteRepository repository;

    public CustRequestItemNoteService(CustRequestItemNoteRepository repository) {
        this.repository = repository;
    }

    public List<CustRequestItemNote> list() {
        return repository.findAll();
    }

    public CustRequestItemNote get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestItemNote %d not found".formatted(id)));
    }

    public CustRequestItemNote create(CustRequestItemNote entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CustRequestItemNote update(Long id, CustRequestItemNote entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CustRequestItemNote %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}