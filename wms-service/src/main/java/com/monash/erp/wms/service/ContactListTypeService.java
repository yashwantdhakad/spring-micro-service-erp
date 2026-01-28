package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.ContactListType;
import com.monash.erp.wms.repository.ContactListTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContactListTypeService {

    private final ContactListTypeRepository repository;

    public ContactListTypeService(ContactListTypeRepository repository) {
        this.repository = repository;
    }

    public List<ContactListType> list() {
        return repository.findAll();
    }

    public ContactListType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactListType %d not found".formatted(id)));
    }

    public ContactListType create(ContactListType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ContactListType update(Long id, ContactListType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactListType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}