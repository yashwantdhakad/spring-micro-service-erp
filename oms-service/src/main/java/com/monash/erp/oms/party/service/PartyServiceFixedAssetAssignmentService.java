package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartyFixedAssetAssignment;
import com.monash.erp.oms.party.repository.PartyServiceFixedAssetAssignmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyServiceFixedAssetAssignmentService {

    private final PartyServiceFixedAssetAssignmentRepository repository;

    public PartyServiceFixedAssetAssignmentService(PartyServiceFixedAssetAssignmentRepository repository) {
        this.repository = repository;
    }

    public List<PartyFixedAssetAssignment> list() {
        return repository.findAll();
    }

    public PartyFixedAssetAssignment get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "PartyFixedAssetAssignment %d not found".formatted(id)));
    }

    public PartyFixedAssetAssignment create(PartyFixedAssetAssignment entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyFixedAssetAssignment update(Long id, PartyFixedAssetAssignment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "PartyFixedAssetAssignment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}