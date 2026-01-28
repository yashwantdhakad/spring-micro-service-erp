package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.CommunicationEventRole;
import com.monash.erp.oms.repository.CommunicationEventRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CommunicationEventRoleService {

    private final CommunicationEventRoleRepository repository;

    public CommunicationEventRoleService(CommunicationEventRoleRepository repository) {
        this.repository = repository;
    }

    public List<CommunicationEventRole> list() {
        return repository.findAll();
    }

    public CommunicationEventRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunicationEventRole %d not found".formatted(id)));
    }

    public CommunicationEventRole create(CommunicationEventRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public CommunicationEventRole update(Long id, CommunicationEventRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CommunicationEventRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}