package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ContainerGeoPoint;
import com.monash.erp.wms.repository.ContainerGeoPointRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContainerGeoPointService {

    private final ContainerGeoPointRepository repository;

    public ContainerGeoPointService(ContainerGeoPointRepository repository) {
        this.repository = repository;
    }

    public List<ContainerGeoPoint> list() {
        return repository.findAll();
    }

    public ContainerGeoPoint get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContainerGeoPoint %d not found".formatted(id)));
    }

    public ContainerGeoPoint create(ContainerGeoPoint entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContainerGeoPoint update(Long id, ContainerGeoPoint entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContainerGeoPoint %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}