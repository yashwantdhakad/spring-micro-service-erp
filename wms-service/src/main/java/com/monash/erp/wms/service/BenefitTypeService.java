package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.BenefitType;
import com.monash.erp.wms.repository.BenefitTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BenefitTypeService {

    private final BenefitTypeRepository repository;

    public BenefitTypeService(BenefitTypeRepository repository) {
        this.repository = repository;
    }

    public List<BenefitType> list() {
        return repository.findAll();
    }

    public BenefitType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "BenefitType %d not found".formatted(id)));
    }

    public BenefitType create(BenefitType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public BenefitType update(Long id, BenefitType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "BenefitType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}