package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.AcctgTransType;
import com.example.erp.oms.accounting.repository.AcctgTransTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AcctgTransTypeService {

    private final AcctgTransTypeRepository repository;

    public AcctgTransTypeService(AcctgTransTypeRepository repository) {
        this.repository = repository;
    }
    

    public List<AcctgTransType> list() {
        return repository.findAll();
    }

    public AcctgTransType get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AcctgTransType %d not found".formatted(id)));
    }

    public AcctgTransType create(AcctgTransType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AcctgTransType update(Long id, AcctgTransType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AcctgTransType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
