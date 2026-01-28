package com.monash.erp.party.service;

import com.monash.erp.party.entity.ContactMechAttribute;
import com.monash.erp.party.repository.ContactMechAttributeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContactMechAttributeService {

    private final ContactMechAttributeRepository repository;

    public ContactMechAttributeService(ContactMechAttributeRepository repository) {
        this.repository = repository;
    }

    public List<ContactMechAttribute> list() {
        return repository.findAll();
    }

    public ContactMechAttribute get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactMechAttribute %d not found".formatted(id)));
    }

    public ContactMechAttribute create(ContactMechAttribute entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContactMechAttribute update(Long id, ContactMechAttribute entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactMechAttribute %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}