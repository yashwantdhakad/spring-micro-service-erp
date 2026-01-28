package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ProdConfItemContent;
import com.monash.erp.wms.repository.ProdConfItemContentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProdConfItemContentService {

    private final ProdConfItemContentRepository repository;

    public ProdConfItemContentService(ProdConfItemContentRepository repository) {
        this.repository = repository;
    }

    public List<ProdConfItemContent> list() {
        return repository.findAll();
    }

    public ProdConfItemContent get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ProdConfItemContent %d not found".formatted(id)));
    }

    public ProdConfItemContent create(ProdConfItemContent entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ProdConfItemContent update(Long id, ProdConfItemContent entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ProdConfItemContent %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}