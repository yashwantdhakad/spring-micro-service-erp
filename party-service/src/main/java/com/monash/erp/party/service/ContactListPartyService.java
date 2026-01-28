package com.monash.erp.party.service;

import com.monash.erp.party.entity.ContactListParty;
import com.monash.erp.party.repository.ContactListPartyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContactListPartyService {

    private final ContactListPartyRepository repository;

    public ContactListPartyService(ContactListPartyRepository repository) {
        this.repository = repository;
    }

    public List<ContactListParty> list() {
        return repository.findAll();
    }

    public ContactListParty get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactListParty %d not found".formatted(id)));
    }

    public ContactListParty create(ContactListParty entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContactListParty update(Long id, ContactListParty entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactListParty %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}