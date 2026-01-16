package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.Lot;
import com.example.erp.wms.ofbiz.repository.LotRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class LotService {

    private final LotRepository repository;

    public LotService(LotRepository repository) {
        this.repository = repository;
    }

    public List<Lot> list() {
        return repository.findAll();
    }

    public Lot get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Lot %d not found".formatted(id)));
    }

    public Lot create(Lot entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Lot update(Long id, Lot entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Lot %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}