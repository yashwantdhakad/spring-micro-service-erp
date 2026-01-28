package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ValidContactMechRole;
import com.monash.erp.wms.repository.ValidContactMechRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ValidContactMechRoleService {

    private final ValidContactMechRoleRepository repository;

    public ValidContactMechRoleService(ValidContactMechRoleRepository repository) {
        this.repository = repository;
    }

    public List<ValidContactMechRole> list() {
        return repository.findAll();
    }

    public ValidContactMechRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ValidContactMechRole %d not found".formatted(id)));
    }

    public ValidContactMechRole create(ValidContactMechRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ValidContactMechRole update(Long id, ValidContactMechRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ValidContactMechRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}