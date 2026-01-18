package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.OtherDataResource;
import com.monash.erp.wms.repository.OtherDataResourceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OtherDataResourceService {

    private final OtherDataResourceRepository repository;

    public OtherDataResourceService(OtherDataResourceRepository repository) {
        this.repository = repository;
    }

    public List<OtherDataResource> list() {
        return repository.findAll();
    }

    public OtherDataResource get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OtherDataResource %d not found".formatted(id)));
    }

    public OtherDataResource create(OtherDataResource entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OtherDataResource update(Long id, OtherDataResource entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OtherDataResource %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}