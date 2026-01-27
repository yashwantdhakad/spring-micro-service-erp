package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FacilityContactMech;
import com.monash.erp.wms.repository.FacilityContactMechRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FacilityContactMechService {

    private final FacilityContactMechRepository repository;

    public FacilityContactMechService(FacilityContactMechRepository repository) {
        this.repository = repository;
    }

    public List<FacilityContactMech> list() {
        return repository.findAll();
    }

    public List<FacilityContactMech> listByFacilityId(String facilityId) {
        return repository.findByFacilityId(facilityId);
    }

    public FacilityContactMech get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityContactMech %d not found".formatted(id)));
    }

    public FacilityContactMech create(FacilityContactMech entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FacilityContactMech update(Long id, FacilityContactMech entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityContactMech %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
