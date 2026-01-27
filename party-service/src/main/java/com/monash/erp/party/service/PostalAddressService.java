package com.monash.erp.party.service;

import com.monash.erp.party.entity.PostalAddress;
import com.monash.erp.party.repository.PostalAddressRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PostalAddressService {

    private final PostalAddressRepository repository;

    public PostalAddressService(PostalAddressRepository repository) {
        this.repository = repository;
    }

    public List<PostalAddress> list() {
        return repository.findAll();
    }

    public PostalAddress get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PostalAddress %d not found".formatted(id)));
    }

    public PostalAddress getByContactMechId(String contactMechId) {
        return repository.findByContactMechId(contactMechId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PostalAddress %s not found".formatted(contactMechId)));
    }

    public PostalAddress create(PostalAddress entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PostalAddress update(Long id, PostalAddress entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PostalAddress %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
