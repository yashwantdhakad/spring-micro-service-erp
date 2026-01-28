package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.AddressMatchMap;
import com.monash.erp.wms.repository.AddressMatchMapRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AddressMatchMapService {

    private final AddressMatchMapRepository repository;

    public AddressMatchMapService(AddressMatchMapRepository repository) {
        this.repository = repository;
    }

    public List<AddressMatchMap> list() {
        return repository.findAll();
    }

    public AddressMatchMap get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AddressMatchMap %d not found".formatted(id)));
    }

    public AddressMatchMap create(AddressMatchMap entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AddressMatchMap update(Long id, AddressMatchMap entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AddressMatchMap %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}