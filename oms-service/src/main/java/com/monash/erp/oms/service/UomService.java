package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.Uom;
import com.monash.erp.oms.repository.UomRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UomService {

    private final UomRepository repository;

    public UomService(UomRepository repository) {
        this.repository = repository;
    }

    public List<Uom> list() {
        return repository.findAll();
    }

    public Uom get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Uom %d not found".formatted(id)));
    }

    public Uom create(Uom entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Uom update(Long id, Uom entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Uom %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}