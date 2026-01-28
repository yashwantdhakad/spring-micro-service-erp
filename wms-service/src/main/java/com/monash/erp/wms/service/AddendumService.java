package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.Addendum;
import com.monash.erp.wms.repository.AddendumRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AddendumService {

    private final AddendumRepository repository;

    public AddendumService(AddendumRepository repository) {
        this.repository = repository;
    }

    public List<Addendum> list() {
        return repository.findAll();
    }

    public Addendum get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Addendum %d not found".formatted(id)));
    }

    public Addendum create(Addendum entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Addendum update(Long id, Addendum entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Addendum %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}