package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.Vendor;
import com.monash.erp.oms.party.repository.VendorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class VendorService {

    private final VendorRepository repository;

    public VendorService(VendorRepository repository) {
        this.repository = repository;
    }

    public List<Vendor> list() {
        return repository.findAll();
    }

    public Vendor get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Vendor %d not found".formatted(id)));
    }

    public Vendor create(Vendor entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Vendor update(Long id, Vendor entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Vendor %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}