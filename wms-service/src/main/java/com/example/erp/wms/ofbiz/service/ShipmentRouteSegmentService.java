package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ShipmentRouteSegment;
import com.example.erp.wms.ofbiz.repository.ShipmentRouteSegmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentRouteSegmentService {

    private final ShipmentRouteSegmentRepository repository;

    public ShipmentRouteSegmentService(ShipmentRouteSegmentRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentRouteSegment> list() {
        return repository.findAll();
    }

    public ShipmentRouteSegment get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentRouteSegment %d not found".formatted(id)));
    }

    public ShipmentRouteSegment create(ShipmentRouteSegment entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentRouteSegment update(Long id, ShipmentRouteSegment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentRouteSegment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}