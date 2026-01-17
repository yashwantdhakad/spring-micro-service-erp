package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ElectronicText;
import com.example.erp.wms.ofbiz.repository.ElectronicTextRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ElectronicTextService {

    private final ElectronicTextRepository repository;

    public ElectronicTextService(ElectronicTextRepository repository) {
        this.repository = repository;
    }

    public List<ElectronicText> list() {
        return repository.findAll();
    }

    public ElectronicText get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ElectronicText %d not found".formatted(id)));
    }

    public ElectronicText create(ElectronicText entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ElectronicText update(Long id, ElectronicText entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ElectronicText %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}