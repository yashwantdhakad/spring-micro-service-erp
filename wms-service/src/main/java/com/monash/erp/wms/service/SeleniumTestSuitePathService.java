package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SeleniumTestSuitePath;
import com.monash.erp.wms.repository.SeleniumTestSuitePathRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SeleniumTestSuitePathService {

    private final SeleniumTestSuitePathRepository repository;

    public SeleniumTestSuitePathService(SeleniumTestSuitePathRepository repository) {
        this.repository = repository;
    }

    public List<SeleniumTestSuitePath> list() {
        return repository.findAll();
    }

    public SeleniumTestSuitePath get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SeleniumTestSuitePath %d not found".formatted(id)));
    }

    public SeleniumTestSuitePath create(SeleniumTestSuitePath entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SeleniumTestSuitePath update(Long id, SeleniumTestSuitePath entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SeleniumTestSuitePath %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}