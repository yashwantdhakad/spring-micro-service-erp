package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.Deliverable;
import com.monash.erp.wms.repository.DeliverableRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DeliverableService {

    private final DeliverableRepository repository;

    public DeliverableService(DeliverableRepository repository) {
        this.repository = repository;
    }

    public List<Deliverable> list() {
        return repository.findAll();
    }

    public Deliverable get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Deliverable %d not found".formatted(id)));
    }

    public Deliverable create(Deliverable entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Deliverable update(Long id, Deliverable entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Deliverable %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}