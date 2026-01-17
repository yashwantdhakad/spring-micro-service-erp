package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.GlAccountClass;
import com.example.erp.oms.accounting.repository.GlAccountClassRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlAccountClassService {

    private final GlAccountClassRepository repository;

    public GlAccountClassService(GlAccountClassRepository repository) {
        this.repository = repository;
    }

    public List<GlAccountClass> list() {
        return repository.findAll();
    }

    public GlAccountClass get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountClass %d not found".formatted(id)));
    }

    public GlAccountClass create(GlAccountClass entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlAccountClass update(Long id, GlAccountClass entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountClass %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
