package com.monash.erp.wms.controller;

import com.monash.erp.wms.dto.FacilityDetailResponse;
import com.monash.erp.wms.dto.FacilityDto;
import com.monash.erp.wms.service.FacilityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/facilities")
public class FacilityController {

    private final FacilityService service;

    public FacilityController(FacilityService service) {
        this.service = service;
    }

    @GetMapping
    public List<FacilityDto> list() {
        return service.list();
    }

    @GetMapping("/{facilityId}")
    public FacilityDetailResponse get(
            @PathVariable String facilityId,
            @RequestParam(defaultValue = "false") boolean includeLocations) {
        return service.getDetail(facilityId, includeLocations);
    }

    @PostMapping
    public ResponseEntity<FacilityDto> create(@RequestBody FacilityDto dto) {
        FacilityDto created = service.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{facilityId}")
    public FacilityDto update(@PathVariable String facilityId, @RequestBody FacilityDto dto) {
        if (dto.getId() == null && facilityId != null && facilityId.chars().allMatch(Character::isDigit)) {
            dto.setId(Long.parseLong(facilityId));
        }
        return service.update(dto.getId(), dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
