package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.AgreementPromoAppl;
import com.monash.erp.oms.repository.AgreementPromoApplRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AgreementPromoApplService {

    private final AgreementPromoApplRepository repository;

    public AgreementPromoApplService(AgreementPromoApplRepository repository) {
        this.repository = repository;
    }

    public List<AgreementPromoAppl> list() {
        return repository.findAll();
    }

    public AgreementPromoAppl get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementPromoAppl %d not found".formatted(id)));
    }

    public AgreementPromoAppl create(AgreementPromoAppl entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AgreementPromoAppl update(Long id, AgreementPromoAppl entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementPromoAppl %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}