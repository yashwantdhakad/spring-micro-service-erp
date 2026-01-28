package com.monash.erp.party.service;

import com.monash.erp.party.entity.PartyInvitationRoleAssoc;
import com.monash.erp.party.repository.PartyInvitationRoleAssocRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PartyInvitationRoleAssocService {

    private final PartyInvitationRoleAssocRepository repository;

    public PartyInvitationRoleAssocService(PartyInvitationRoleAssocRepository repository) {
        this.repository = repository;
    }

    public List<PartyInvitationRoleAssoc> list() {
        return repository.findAll();
    }

    public PartyInvitationRoleAssoc get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyInvitationRoleAssoc %d not found".formatted(id)));
    }

    public PartyInvitationRoleAssoc create(PartyInvitationRoleAssoc entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyInvitationRoleAssoc update(Long id, PartyInvitationRoleAssoc entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyInvitationRoleAssoc %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}