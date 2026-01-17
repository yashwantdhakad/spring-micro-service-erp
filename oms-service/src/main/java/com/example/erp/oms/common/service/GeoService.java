package com.example.erp.oms.common.service;

import com.example.erp.oms.common.domain.Geo;
import com.example.erp.oms.common.repository.GeoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GeoService {

    private final GeoRepository repository;

    public GeoService(GeoRepository repository) {
        this.repository = repository;
    }

    public List<Geo> list() {
        return repository.findAll();
    }

    public Geo get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Geo %d not found".formatted(id)));
    }

    public Geo create(Geo entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Geo update(Long id, Geo entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Geo %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
