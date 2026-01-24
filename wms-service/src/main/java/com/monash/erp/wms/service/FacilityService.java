package com.monash.erp.wms.service;

import com.monash.erp.wms.dto.FacilityDetailResponse;
import com.monash.erp.wms.entity.Facility;
import com.monash.erp.wms.entity.FacilityLocation;
import com.monash.erp.wms.repository.FacilityLocationRepository;
import com.monash.erp.wms.repository.FacilityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FacilityService {

    private final FacilityRepository repository;
    private final FacilityLocationRepository locationRepository;

    public FacilityService(FacilityRepository repository, FacilityLocationRepository locationRepository) {
        this.repository = repository;
        this.locationRepository = locationRepository;
    }

    public List<Facility> list() {
        return repository.findAll();
    }

    public Facility get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Facility %d not found".formatted(id)));
    }

    public FacilityDetailResponse getDetail(String facilityId) {
        Facility facility = findFacility(facilityId);
        List<FacilityLocation> locations = locationRepository.findByFacilityId(facility.getFacilityId());
        return new FacilityDetailResponse(facility, locations);
    }

    public Facility create(Facility entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Facility update(Long id, Facility entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Facility %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    private Facility findFacility(String facilityId) {
        return repository.findByFacilityId(facilityId)
                .orElseGet(() -> {
                    if (isNumeric(facilityId)) {
                        long id = Long.parseLong(facilityId);
                        return repository.findById(id)
                                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Facility %s not found".formatted(facilityId)));
                    }
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Facility %s not found".formatted(facilityId));
                });
    }

    private boolean isNumeric(String value) {
        if (value == null || value.isBlank()) {
            return false;
        }
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isDigit(value.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
