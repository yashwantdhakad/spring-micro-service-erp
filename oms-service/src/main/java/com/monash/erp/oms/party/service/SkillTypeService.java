package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.SkillType;
import com.monash.erp.oms.party.repository.SkillTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SkillTypeService {

    private final SkillTypeRepository repository;

    public SkillTypeService(SkillTypeRepository repository) {
        this.repository = repository;
    }

    public List<SkillType> list() {
        return repository.findAll();
    }

    public SkillType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SkillType %d not found".formatted(id)));
    }

    public SkillType create(SkillType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SkillType update(Long id, SkillType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SkillType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}