package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.MimeType;
import com.monash.erp.wms.repository.MimeTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class MimeTypeService {

    private final MimeTypeRepository repository;

    public MimeTypeService(MimeTypeRepository repository) {
        this.repository = repository;
    }

    public List<MimeType> list() {
        return repository.findAll();
    }

    public MimeType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "MimeType %d not found".formatted(id)));
    }

    public MimeType create(MimeType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public MimeType update(Long id, MimeType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "MimeType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}