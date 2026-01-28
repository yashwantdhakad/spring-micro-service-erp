package com.monash.erp.party.service;

import com.monash.erp.party.entity.ContactMechLink;
import com.monash.erp.party.repository.ContactMechLinkRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContactMechLinkService {

    private final ContactMechLinkRepository repository;

    public ContactMechLinkService(ContactMechLinkRepository repository) {
        this.repository = repository;
    }

    public List<ContactMechLink> list() {
        return repository.findAll();
    }

    public ContactMechLink get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactMechLink %d not found".formatted(id)));
    }

    public ContactMechLink create(ContactMechLink entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContactMechLink update(Long id, ContactMechLink entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactMechLink %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}