package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.InvoiceRole;
import com.monash.erp.oms.accounting.repository.InvoiceRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class InvoiceRoleService {

    private final InvoiceRoleRepository repository;

    public InvoiceRoleService(InvoiceRoleRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceRole> list() {
        return repository.findAll();
    }

    public InvoiceRole get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceRole %d not found".formatted(id)));
    }

    public InvoiceRole create(InvoiceRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public InvoiceRole update(Long id, InvoiceRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "InvoiceRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
