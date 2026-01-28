package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TermTypeAttr;
import com.monash.erp.wms.repository.TermTypeAttrRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TermTypeAttrService {

    private final TermTypeAttrRepository repository;

    public TermTypeAttrService(TermTypeAttrRepository repository) {
        this.repository = repository;
    }

    public List<TermTypeAttr> list() {
        return repository.findAll();
    }

    public TermTypeAttr get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TermTypeAttr %d not found".formatted(id)));
    }

    public TermTypeAttr create(TermTypeAttr entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TermTypeAttr update(Long id, TermTypeAttr entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TermTypeAttr %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}