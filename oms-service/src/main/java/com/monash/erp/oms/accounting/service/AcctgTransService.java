package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.AcctgTrans;
import com.monash.erp.oms.accounting.repository.AcctgTransRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AcctgTransService {

    private final AcctgTransRepository repository;

    public AcctgTransService(AcctgTransRepository repository) {
        this.repository = repository;
    }
    

    public List<AcctgTrans> list() {
        return repository.findAll();
    }

    public AcctgTrans get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AcctgTrans %d not found".formatted(id)));
    }

    public AcctgTrans create(AcctgTrans entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AcctgTrans update(Long id, AcctgTrans entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AcctgTrans %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
