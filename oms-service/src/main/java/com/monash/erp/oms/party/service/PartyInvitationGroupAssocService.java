package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.PartyInvitationGroupAssoc;
import com.monash.erp.oms.party.repository.PartyInvitationGroupAssocRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyInvitationGroupAssocService {

    private final PartyInvitationGroupAssocRepository repository;

    public PartyInvitationGroupAssocService(PartyInvitationGroupAssocRepository repository) {
        this.repository = repository;
    }

    public List<PartyInvitationGroupAssoc> list() {
        return repository.findAll();
    }

    public PartyInvitationGroupAssoc get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyInvitationGroupAssoc %d not found".formatted(id)));
    }

    public PartyInvitationGroupAssoc create(PartyInvitationGroupAssoc entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyInvitationGroupAssoc update(Long id, PartyInvitationGroupAssoc entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyInvitationGroupAssoc %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}