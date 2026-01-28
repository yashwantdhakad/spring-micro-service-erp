package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.AgreementRole;
import com.monash.erp.oms.repository.AgreementRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AgreementRoleService {

    private final AgreementRoleRepository repository;

    public AgreementRoleService(AgreementRoleRepository repository) {
        this.repository = repository;
    }

    public List<AgreementRole> list() {
        return repository.findAll();
    }

    public AgreementRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementRole %d not found".formatted(id)));
    }

    public AgreementRole create(AgreementRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AgreementRole update(Long id, AgreementRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}