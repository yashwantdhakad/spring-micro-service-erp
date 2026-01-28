package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ContactList;
import com.monash.erp.wms.repository.ContactListRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContactListService {

    private final ContactListRepository repository;

    public ContactListService(ContactListRepository repository) {
        this.repository = repository;
    }

    public List<ContactList> list() {
        return repository.findAll();
    }

    public ContactList get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactList %d not found".formatted(id)));
    }

    public ContactList create(ContactList entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContactList update(Long id, ContactList entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactList %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}