package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.AgreementWorkeffortAppl;
import com.monash.erp.oms.repository.AgreementWorkeffortApplRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AgreementWorkeffortApplService {

    private final AgreementWorkeffortApplRepository repository;

    public AgreementWorkeffortApplService(AgreementWorkeffortApplRepository repository) {
        this.repository = repository;
    }

    public List<AgreementWorkeffortAppl> list() {
        return repository.findAll();
    }

    public AgreementWorkeffortAppl get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementWorkeffortAppl %d not found".formatted(id)));
    }

    public AgreementWorkeffortAppl create(AgreementWorkeffortAppl entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public AgreementWorkeffortAppl update(Long id, AgreementWorkeffortAppl entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "AgreementWorkeffortAppl %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}