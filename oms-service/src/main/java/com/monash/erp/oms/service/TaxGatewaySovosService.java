package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.TaxGatewaySovos;
import com.monash.erp.oms.repository.TaxGatewaySovosRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TaxGatewaySovosService {

    private final TaxGatewaySovosRepository repository;

    public TaxGatewaySovosService(TaxGatewaySovosRepository repository) {
        this.repository = repository;
    }

    public List<TaxGatewaySovos> list() {
        return repository.findAll();
    }

    public TaxGatewaySovos get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxGatewaySovos %d not found".formatted(id)));
    }

    public TaxGatewaySovos create(TaxGatewaySovos entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TaxGatewaySovos update(Long id, TaxGatewaySovos entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TaxGatewaySovos %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}