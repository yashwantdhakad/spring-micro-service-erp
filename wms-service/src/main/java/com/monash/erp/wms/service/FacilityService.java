package com.monash.erp.wms.service;

import com.monash.erp.wms.dto.FacilityDetailResponse;
import com.monash.erp.wms.dto.FacilityDto;
import com.monash.erp.wms.entity.Facility;
import com.monash.erp.wms.entity.FacilityLocation;
import com.monash.erp.wms.mapper.FacilityMapper;
import com.monash.erp.wms.repository.FacilityLocationRepository;
import com.monash.erp.wms.repository.FacilityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FacilityService {

    private final FacilityRepository repository;
    private final FacilityLocationRepository locationRepository;
    private final FacilityMapper mapper;

    public FacilityService(FacilityRepository repository, FacilityLocationRepository locationRepository,
            FacilityMapper mapper) {
        this.repository = repository;
        this.locationRepository = locationRepository;
        this.mapper = mapper;
    }

    public List<FacilityDto> list() {
        return repository.findAll().stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    public FacilityDto get(Long id) {
        Facility entity = repository.findById(id)
                .orElseThrow(
                        () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Facility %d not found".formatted(id)));
        return mapper.toDTO(entity);
    }

    public FacilityDetailResponse getDetail(String facilityId, boolean includeLocations) {
        Facility facility = findFacility(facilityId);
        List<FacilityLocation> locations = includeLocations
                ? locationRepository.findByFacilityId(facility.getFacilityId())
                : List.of();
        return new FacilityDetailResponse(facility, locations);
    }

    @Transactional
    public FacilityDto create(FacilityDto dto) {
        Facility entity = mapper.toEntity(dto);
        entity.setId(null);
        Facility saved = repository.save(entity);
        if (saved.getFacilityId() == null || saved.getFacilityId().isBlank()) {
            saved.setFacilityId(String.valueOf(saved.getId()));
            saved = repository.save(saved);
        }
        return mapper.toDTO(saved);
    }

    @Transactional
    public FacilityDto update(Long id, FacilityDto dto) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Facility %d not found".formatted(id));
        }
        Facility entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDTO(repository.save(entity));
    }

    @Transactional
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Facility %d not found".formatted(id));
        }
        repository.deleteById(id);
    }

    private Facility findFacility(String facilityId) {
        return repository.findByFacilityId(facilityId)
                .orElseGet(() -> {
                    if (isNumeric(facilityId)) {
                        long id = Long.parseLong(facilityId);
                        return repository.findById(id)
                                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                                        "Facility %s not found".formatted(facilityId)));
                    }
                    throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                            "Facility %s not found".formatted(facilityId));
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
