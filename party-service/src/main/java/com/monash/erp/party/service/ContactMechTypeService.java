package com.monash.erp.party.service;

import com.monash.erp.party.entity.ContactMechType;
import com.monash.erp.party.repository.ContactMechTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContactMechTypeService {

    private final ContactMechTypeRepository repository;

    public ContactMechTypeService(ContactMechTypeRepository repository) {
        this.repository = repository;
    }

    public List<ContactMechType> list() {
        return repository.findAll();
    }

    public ContactMechType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactMechType %d not found".formatted(id)));
    }

    public ContactMechType create(ContactMechType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContactMechType update(Long id, ContactMechType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactMechType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}