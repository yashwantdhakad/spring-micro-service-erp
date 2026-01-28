package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CommContentAssocType;
import com.monash.erp.oms.repository.CommContentAssocTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CommContentAssocTypeService {

    private final CommContentAssocTypeRepository repository;

    public CommContentAssocTypeService(CommContentAssocTypeRepository repository) {
        this.repository = repository;
    }

    public List<CommContentAssocType> list() {
        return repository.findAll();
    }

    public CommContentAssocType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommContentAssocType %d not found".formatted(id)));
    }

    public CommContentAssocType create(CommContentAssocType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CommContentAssocType update(Long id, CommContentAssocType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CommContentAssocType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}