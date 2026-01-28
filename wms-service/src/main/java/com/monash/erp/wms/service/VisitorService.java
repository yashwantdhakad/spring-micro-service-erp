package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.Visitor;
import com.monash.erp.wms.repository.VisitorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class VisitorService {

    private final VisitorRepository repository;

    public VisitorService(VisitorRepository repository) {
        this.repository = repository;
    }

    public List<Visitor> list() {
        return repository.findAll();
    }

    public Visitor get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Visitor %d not found".formatted(id)));
    }

    public Visitor create(Visitor entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Visitor update(Long id, Visitor entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Visitor %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}