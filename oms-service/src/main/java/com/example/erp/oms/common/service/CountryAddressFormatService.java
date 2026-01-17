package com.example.erp.oms.common.service;

import com.example.erp.oms.common.domain.CountryAddressFormat;
import com.example.erp.oms.common.repository.CountryAddressFormatRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CountryAddressFormatService {

    private final CountryAddressFormatRepository repository;

    public CountryAddressFormatService(CountryAddressFormatRepository repository) {
        this.repository = repository;
    }

    public List<CountryAddressFormat> list() {
        return repository.findAll();
    }

    public CountryAddressFormat get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CountryAddressFormat %d not found".formatted(id)));
    }

    public CountryAddressFormat create(CountryAddressFormat entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CountryAddressFormat update(Long id, CountryAddressFormat entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CountryAddressFormat %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
