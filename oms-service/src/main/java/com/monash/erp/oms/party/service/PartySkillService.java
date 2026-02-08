package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartySkill;
import com.monash.erp.oms.party.repository.PartySkillRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartySkillService {

    private final PartySkillRepository repository;

    public PartySkillService(PartySkillRepository repository) {
        this.repository = repository;
    }

    public List<PartySkill> list() {
        return repository.findAll();
    }

    public PartySkill get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartySkill %d not found".formatted(id)));
    }

    public PartySkill create(PartySkill entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartySkill update(Long id, PartySkill entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartySkill %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}