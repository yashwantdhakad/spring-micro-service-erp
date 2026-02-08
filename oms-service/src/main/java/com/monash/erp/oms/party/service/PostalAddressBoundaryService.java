package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PostalAddressBoundary;
import com.monash.erp.oms.party.repository.PostalAddressBoundaryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PostalAddressBoundaryService {

    private final PostalAddressBoundaryRepository repository;

    public PostalAddressBoundaryService(PostalAddressBoundaryRepository repository) {
        this.repository = repository;
    }

    public List<PostalAddressBoundary> list() {
        return repository.findAll();
    }

    public PostalAddressBoundary get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PostalAddressBoundary %d not found".formatted(id)));
    }

    public PostalAddressBoundary create(PostalAddressBoundary entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PostalAddressBoundary update(Long id, PostalAddressBoundary entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PostalAddressBoundary %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}