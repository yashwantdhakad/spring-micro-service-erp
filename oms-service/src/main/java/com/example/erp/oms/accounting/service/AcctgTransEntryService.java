package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.AcctgTransEntry;
import com.example.erp.oms.accounting.repository.AcctgTransEntryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AcctgTransEntryService {

    private final AcctgTransEntryRepository repository;

    public AcctgTransEntryService(AcctgTransEntryRepository repository) {
        this.repository = repository;
    }
    

    public List<AcctgTransEntry> list() {
        return repository.findAll();
    }

    public AcctgTransEntry get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AcctgTransEntry %d not found".formatted(id)));
    }

    public AcctgTransEntry create(AcctgTransEntry entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AcctgTransEntry update(Long id, AcctgTransEntry entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AcctgTransEntry %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
