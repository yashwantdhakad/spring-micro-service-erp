package com.monash.erp.party.service;

import com.monash.erp.party.entity.SupplierQual;
import com.monash.erp.party.repository.SupplierQualRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SupplierQualService {

    private final SupplierQualRepository repository;

    public SupplierQualService(SupplierQualRepository repository) {
        this.repository = repository;
    }

    public List<SupplierQual> list() {
        return repository.findAll();
    }

    public SupplierQual get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SupplierQual %d not found".formatted(id)));
    }

    public SupplierQual create(SupplierQual entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SupplierQual update(Long id, SupplierQual entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SupplierQual %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}