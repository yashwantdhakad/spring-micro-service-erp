package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.FixedAssetTypeGlAccount;
import com.example.erp.oms.accounting.repository.FixedAssetTypeGlAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FixedAssetTypeGlAccountService {

    private final FixedAssetTypeGlAccountRepository repository;

    public FixedAssetTypeGlAccountService(FixedAssetTypeGlAccountRepository repository) {
        this.repository = repository;
    }

    public List<FixedAssetTypeGlAccount> list() {
        return repository.findAll();
    }

    public FixedAssetTypeGlAccount get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetTypeGlAccount %d not found".formatted(id)));
    }

    public FixedAssetTypeGlAccount create(FixedAssetTypeGlAccount entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FixedAssetTypeGlAccount update(Long id, FixedAssetTypeGlAccount entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetTypeGlAccount %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
