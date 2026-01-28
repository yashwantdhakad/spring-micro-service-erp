package com.monash.erp.party.service;

import com.monash.erp.party.entity.PayrollPreference;
import com.monash.erp.party.repository.PayrollPreferenceRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PayrollPreferenceService {

    private final PayrollPreferenceRepository repository;

    public PayrollPreferenceService(PayrollPreferenceRepository repository) {
        this.repository = repository;
    }

    public List<PayrollPreference> list() {
        return repository.findAll();
    }

    public PayrollPreference get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PayrollPreference %d not found".formatted(id)));
    }

    public PayrollPreference create(PayrollPreference entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PayrollPreference update(Long id, PayrollPreference entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PayrollPreference %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}