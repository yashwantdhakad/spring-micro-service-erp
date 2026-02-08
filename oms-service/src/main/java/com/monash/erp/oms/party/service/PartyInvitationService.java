package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartyInvitation;
import com.monash.erp.oms.party.repository.PartyInvitationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyInvitationService {

    private final PartyInvitationRepository repository;

    public PartyInvitationService(PartyInvitationRepository repository) {
        this.repository = repository;
    }

    public List<PartyInvitation> list() {
        return repository.findAll();
    }

    public PartyInvitation get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyInvitation %d not found".formatted(id)));
    }

    public PartyInvitation create(PartyInvitation entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyInvitation update(Long id, PartyInvitation entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyInvitation %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}