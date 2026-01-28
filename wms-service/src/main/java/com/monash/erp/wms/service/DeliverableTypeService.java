package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.DeliverableType;
import com.monash.erp.wms.repository.DeliverableTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DeliverableTypeService {

    private final DeliverableTypeRepository repository;

    public DeliverableTypeService(DeliverableTypeRepository repository) {
        this.repository = repository;
    }

    public List<DeliverableType> list() {
        return repository.findAll();
    }

    public DeliverableType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "DeliverableType %d not found".formatted(id)));
    }

    public DeliverableType create(DeliverableType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public DeliverableType update(Long id, DeliverableType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "DeliverableType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}