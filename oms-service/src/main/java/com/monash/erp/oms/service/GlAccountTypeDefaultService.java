package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.GlAccountTypeDefault;
import com.monash.erp.oms.repository.GlAccountTypeDefaultRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlAccountTypeDefaultService {

    private final GlAccountTypeDefaultRepository repository;

    public GlAccountTypeDefaultService(GlAccountTypeDefaultRepository repository) {
        this.repository = repository;
    }

    public List<GlAccountTypeDefault> list() {
        return repository.findAll();
    }

    public GlAccountTypeDefault get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountTypeDefault %d not found".formatted(id)));
    }

    public GlAccountTypeDefault create(GlAccountTypeDefault entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlAccountTypeDefault update(Long id, GlAccountTypeDefault entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountTypeDefault %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}