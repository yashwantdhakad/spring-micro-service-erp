package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PayGrade;
import com.monash.erp.oms.party.repository.PayGradeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PayGradeService {

    private final PayGradeRepository repository;

    public PayGradeService(PayGradeRepository repository) {
        this.repository = repository;
    }

    public List<PayGrade> list() {
        return repository.findAll();
    }

    public PayGrade get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PayGrade %d not found".formatted(id)));
    }

    public PayGrade create(PayGrade entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PayGrade update(Long id, PayGrade entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PayGrade %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}