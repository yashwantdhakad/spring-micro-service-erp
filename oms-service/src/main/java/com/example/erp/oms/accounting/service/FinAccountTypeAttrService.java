package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.FinAccountTypeAttr;
import com.example.erp.oms.accounting.repository.FinAccountTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FinAccountTypeAttrService {

    private final FinAccountTypeAttrRepository repository;

    public FinAccountTypeAttrService(FinAccountTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<FinAccountTypeAttr> list() {
        return repository.findAll();
    }

    public FinAccountTypeAttr get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountTypeAttr %d not found".formatted(id)));
    }

    public FinAccountTypeAttr create(FinAccountTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FinAccountTypeAttr update(Long id, FinAccountTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FinAccountTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
