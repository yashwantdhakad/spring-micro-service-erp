package com.monash.erp.oms.common.service;

import com.monash.erp.oms.common.entity.CountryTeleCode;
import com.monash.erp.oms.common.repository.CountryTeleCodeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CountryTeleCodeService {

    private final CountryTeleCodeRepository repository;

    public CountryTeleCodeService(CountryTeleCodeRepository repository) {
        this.repository = repository;
    }

    public List<CountryTeleCode> list() {
        return repository.findAll();
    }

    public CountryTeleCode get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CountryTeleCode %d not found".formatted(id)));
    }

    public CountryTeleCode create(CountryTeleCode entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CountryTeleCode update(Long id, CountryTeleCode entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CountryTeleCode %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
