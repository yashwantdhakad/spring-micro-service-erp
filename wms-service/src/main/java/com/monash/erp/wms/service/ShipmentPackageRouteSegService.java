package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ShipmentPackageRouteSeg;
import com.monash.erp.wms.repository.ShipmentPackageRouteSegRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ShipmentPackageRouteSegService {

    private final ShipmentPackageRouteSegRepository repository;

    public ShipmentPackageRouteSegService(ShipmentPackageRouteSegRepository repository) {
        this.repository = repository;
    }

    public List<ShipmentPackageRouteSeg> list() {
        return repository.findAll();
    }

    public ShipmentPackageRouteSeg get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentPackageRouteSeg %d not found".formatted(id)));
    }

    public ShipmentPackageRouteSeg create(ShipmentPackageRouteSeg entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ShipmentPackageRouteSeg update(Long id, ShipmentPackageRouteSeg entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ShipmentPackageRouteSeg %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}