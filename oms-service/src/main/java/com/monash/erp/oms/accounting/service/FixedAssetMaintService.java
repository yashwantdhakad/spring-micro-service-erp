package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.FixedAssetMaint;
import com.monash.erp.oms.accounting.repository.FixedAssetMaintRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FixedAssetMaintService {

    private final FixedAssetMaintRepository repository;

    public FixedAssetMaintService(FixedAssetMaintRepository repository) {
        this.repository = repository;
    }

    public List<FixedAssetMaint> list() {
        return repository.findAll();
    }

    public FixedAssetMaint get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetMaint %d not found".formatted(id)));
    }

    public FixedAssetMaint create(FixedAssetMaint entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FixedAssetMaint update(Long id, FixedAssetMaint entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FixedAssetMaint %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
