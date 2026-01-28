package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.Delivery;
import com.monash.erp.wms.repository.DeliveryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class DeliveryService {

    private final DeliveryRepository repository;

    public DeliveryService(DeliveryRepository repository) {
        this.repository = repository;
    }

    public List<Delivery> list() {
        return repository.findAll();
    }

    public Delivery get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Delivery %d not found".formatted(id)));
    }

    public Delivery create(Delivery entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Delivery update(Long id, Delivery entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Delivery %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}