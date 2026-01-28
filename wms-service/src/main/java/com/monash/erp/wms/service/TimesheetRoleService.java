package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TimesheetRole;
import com.monash.erp.wms.repository.TimesheetRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TimesheetRoleService {

    private final TimesheetRoleRepository repository;

    public TimesheetRoleService(TimesheetRoleRepository repository) {
        this.repository = repository;
    }

    public List<TimesheetRole> list() {
        return repository.findAll();
    }

    public TimesheetRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TimesheetRole %d not found".formatted(id)));
    }

    public TimesheetRole create(TimesheetRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TimesheetRole update(Long id, TimesheetRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TimesheetRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}