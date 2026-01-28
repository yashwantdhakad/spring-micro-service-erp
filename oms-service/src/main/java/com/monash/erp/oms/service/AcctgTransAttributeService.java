package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.AcctgTransAttribute;
import com.monash.erp.oms.repository.AcctgTransAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AcctgTransAttributeService {

    private final AcctgTransAttributeRepository repository;

    public AcctgTransAttributeService(AcctgTransAttributeRepository repository) {
        this.repository = repository;
    }

    public List<AcctgTransAttribute> list() {
        return repository.findAll();
    }

    public AcctgTransAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AcctgTransAttribute %d not found".formatted(id)));
    }

    public AcctgTransAttribute create(AcctgTransAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AcctgTransAttribute update(Long id, AcctgTransAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AcctgTransAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}