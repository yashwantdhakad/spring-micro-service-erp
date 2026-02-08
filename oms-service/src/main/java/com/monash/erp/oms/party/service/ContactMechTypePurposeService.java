package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.ContactMechTypePurpose;
import com.monash.erp.oms.party.repository.ContactMechTypePurposeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContactMechTypePurposeService {

    private final ContactMechTypePurposeRepository repository;

    public ContactMechTypePurposeService(ContactMechTypePurposeRepository repository) {
        this.repository = repository;
    }

    public List<ContactMechTypePurpose> list() {
        return repository.findAll();
    }

    public ContactMechTypePurpose get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactMechTypePurpose %d not found".formatted(id)));
    }

    public ContactMechTypePurpose create(ContactMechTypePurpose entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContactMechTypePurpose update(Long id, ContactMechTypePurpose entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactMechTypePurpose %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}