package com.example.erp.wms.ofbiz.service;

import com.example.erp.wms.ofbiz.domain.ItemIssuanceRole;
import com.example.erp.wms.ofbiz.repository.ItemIssuanceRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ItemIssuanceRoleService {

    private final ItemIssuanceRoleRepository repository;

    public ItemIssuanceRoleService(ItemIssuanceRoleRepository repository) {
        this.repository = repository;
    }

    public List<ItemIssuanceRole> list() {
        return repository.findAll();
    }

    public ItemIssuanceRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ItemIssuanceRole %d not found".formatted(id)));
    }

    public ItemIssuanceRole create(ItemIssuanceRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public ItemIssuanceRole update(Long id, ItemIssuanceRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "ItemIssuanceRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}