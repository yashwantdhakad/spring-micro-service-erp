package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.ContactListPartyStatus;
import com.monash.erp.oms.party.repository.ContactListPartyStatusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContactListPartyStatusService {

    private final ContactListPartyStatusRepository repository;

    public ContactListPartyStatusService(ContactListPartyStatusRepository repository) {
        this.repository = repository;
    }

    public List<ContactListPartyStatus> list() {
        return repository.findAll();
    }

    public ContactListPartyStatus get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactListPartyStatus %d not found".formatted(id)));
    }

    public ContactListPartyStatus create(ContactListPartyStatus entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContactListPartyStatus update(Long id, ContactListPartyStatus entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactListPartyStatus %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}