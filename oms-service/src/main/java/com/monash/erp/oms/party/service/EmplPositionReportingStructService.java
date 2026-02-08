package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.EmplPositionReportingStruct;
import com.monash.erp.oms.party.repository.EmplPositionReportingStructRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmplPositionReportingStructService {

    private final EmplPositionReportingStructRepository repository;

    public EmplPositionReportingStructService(EmplPositionReportingStructRepository repository) {
        this.repository = repository;
    }

    public List<EmplPositionReportingStruct> list() {
        return repository.findAll();
    }

    public EmplPositionReportingStruct get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplPositionReportingStruct %d not found".formatted(id)));
    }

    public EmplPositionReportingStruct create(EmplPositionReportingStruct entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EmplPositionReportingStruct update(Long id, EmplPositionReportingStruct entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplPositionReportingStruct %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}