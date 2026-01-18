package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.GlAccountOrganization;
import com.monash.erp.oms.accounting.repository.GlAccountOrganizationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlAccountOrganizationService {

    private final GlAccountOrganizationRepository repository;

    public GlAccountOrganizationService(GlAccountOrganizationRepository repository) {
        this.repository = repository;
    }

    public List<GlAccountOrganization> list() {
        return repository.findAll();
    }

    public GlAccountOrganization get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountOrganization %d not found".formatted(id)));
    }

    public GlAccountOrganization create(GlAccountOrganization entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlAccountOrganization update(Long id, GlAccountOrganization entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountOrganization %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
