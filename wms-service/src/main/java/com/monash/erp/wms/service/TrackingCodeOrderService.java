package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TrackingCodeOrder;
import com.monash.erp.wms.repository.TrackingCodeOrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TrackingCodeOrderService {

    private final TrackingCodeOrderRepository repository;

    public TrackingCodeOrderService(TrackingCodeOrderRepository repository) {
        this.repository = repository;
    }

    public List<TrackingCodeOrder> list() {
        return repository.findAll();
    }

    public TrackingCodeOrder get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TrackingCodeOrder %d not found".formatted(id)));
    }

    public TrackingCodeOrder create(TrackingCodeOrder entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TrackingCodeOrder update(Long id, TrackingCodeOrder entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TrackingCodeOrder %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}