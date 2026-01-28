package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ContactListCommStatus;
import com.monash.erp.wms.repository.ContactListCommStatusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContactListCommStatusService {

    private final ContactListCommStatusRepository repository;

    public ContactListCommStatusService(ContactListCommStatusRepository repository) {
        this.repository = repository;
    }

    public List<ContactListCommStatus> list() {
        return repository.findAll();
    }

    public ContactListCommStatus get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactListCommStatus %d not found".formatted(id)));
    }

    public ContactListCommStatus create(ContactListCommStatus entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContactListCommStatus update(Long id, ContactListCommStatus entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactListCommStatus %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}