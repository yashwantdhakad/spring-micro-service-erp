package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.Shipment;
import com.monash.erp.wms.repository.ShipmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentService {

    private final ShipmentRepository repository;

    public ShipmentService(ShipmentRepository repository) {
        this.repository = repository;
    }

    public List<Shipment> list() {
        return repository.findAll();
    }

    public Shipment get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Shipment %d not found".formatted(id)));
    }

    public Shipment create(Shipment entity) {
        entity.setId(null);
        Shipment saved = repository.save(entity);
        if (isBlank(saved.getShipmentId())) {
            saved.setShipmentId(String.valueOf(saved.getId()));
            saved = repository.save(saved);
        }
        return saved;
    }

    public Shipment update(Long id, Shipment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Shipment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    private boolean isBlank(String value) {
        return value == null || value.isBlank();
    }
}
