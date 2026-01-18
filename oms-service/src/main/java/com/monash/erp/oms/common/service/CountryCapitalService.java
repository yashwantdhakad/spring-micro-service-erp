package com.monash.erp.oms.common.service;

import com.monash.erp.oms.common.entity.CountryCapital;
import com.monash.erp.oms.common.repository.CountryCapitalRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CountryCapitalService {

    private final CountryCapitalRepository repository;

    public CountryCapitalService(CountryCapitalRepository repository) {
        this.repository = repository;
    }

    public List<CountryCapital> list() {
        return repository.findAll();
    }

    public CountryCapital get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CountryCapital %d not found".formatted(id)));
    }

    public CountryCapital create(CountryCapital entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CountryCapital update(Long id, CountryCapital entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CountryCapital %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
