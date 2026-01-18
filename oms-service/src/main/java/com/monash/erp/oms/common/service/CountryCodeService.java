package com.monash.erp.oms.common.service;

import com.monash.erp.oms.common.entity.CountryCode;
import com.monash.erp.oms.common.repository.CountryCodeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CountryCodeService {

    private final CountryCodeRepository repository;

    public CountryCodeService(CountryCodeRepository repository) {
        this.repository = repository;
    }

    public List<CountryCode> list() {
        return repository.findAll();
    }

    public CountryCode get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CountryCode %d not found".formatted(id)));
    }

    public CountryCode create(CountryCode entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CountryCode update(Long id, CountryCode entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CountryCode %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
