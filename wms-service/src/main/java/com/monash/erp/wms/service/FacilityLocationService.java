package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FacilityLocation;
import com.monash.erp.wms.repository.FacilityLocationRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Locale;
import java.util.List;

@Service
public class FacilityLocationService {

    private final FacilityLocationRepository repository;

    public FacilityLocationService(FacilityLocationRepository repository) {
        this.repository = repository;
    }

    public List<FacilityLocation> list() {
        return repository.findAll();
    }

    public Page<FacilityLocation> listByFacility(String facilityId, int page, int size, String locationSeqId, String locationName) {
        Pageable pageable = PageRequest.of(page, size);
        String seqFilter = normalizeFilter(locationSeqId);
        String nameFilter = normalizeFilter(locationName);
        return repository.findByFacilityIdWithFilters(facilityId, seqFilter, nameFilter, pageable);
    }

    public FacilityLocation get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityLocation %d not found".formatted(id)));
    }

    public FacilityLocation create(FacilityLocation entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FacilityLocation update(Long id, FacilityLocation entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityLocation %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    private String normalizeFilter(String value) {
        if (value == null) {
            return null;
        }
        String trimmed = value.trim();
        return trimmed.isEmpty() ? null : trimmed.toLowerCase(Locale.ROOT);
    }
}
