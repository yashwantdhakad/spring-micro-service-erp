package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.AcctgTransEntryType;
import com.example.erp.oms.accounting.repository.AcctgTransEntryTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AcctgTransEntryTypeService {

    private final AcctgTransEntryTypeRepository repository;

    public AcctgTransEntryTypeService(AcctgTransEntryTypeRepository repository) {
        this.repository = repository;
    }

    public List<AcctgTransEntryType> list() {
        return repository.findAll();
    }

    public AcctgTransEntryType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AcctgTransEntryType %d not found".formatted(id)));
    }

    public AcctgTransEntryType create(AcctgTransEntryType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AcctgTransEntryType update(Long id, AcctgTransEntryType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AcctgTransEntryType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
