package com.monash.erp.party.service;

import com.monash.erp.party.entity.ContactMechPurposeType;
import com.monash.erp.party.repository.ContactMechPurposeTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContactMechPurposeTypeService {

    private final ContactMechPurposeTypeRepository repository;

    public ContactMechPurposeTypeService(ContactMechPurposeTypeRepository repository) {
        this.repository = repository;
    }

    public List<ContactMechPurposeType> list() {
        return repository.findAll();
    }

    public ContactMechPurposeType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactMechPurposeType %d not found".formatted(id)));
    }

    public ContactMechPurposeType create(ContactMechPurposeType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContactMechPurposeType update(Long id, ContactMechPurposeType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactMechPurposeType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}