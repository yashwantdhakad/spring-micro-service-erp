package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.EmplLeaveType;
import com.monash.erp.oms.party.repository.EmplLeaveTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmplLeaveTypeService {

    private final EmplLeaveTypeRepository repository;

    public EmplLeaveTypeService(EmplLeaveTypeRepository repository) {
        this.repository = repository;
    }

    public List<EmplLeaveType> list() {
        return repository.findAll();
    }

    public EmplLeaveType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplLeaveType %d not found".formatted(id)));
    }

    public EmplLeaveType create(EmplLeaveType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public EmplLeaveType update(Long id, EmplLeaveType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "EmplLeaveType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}