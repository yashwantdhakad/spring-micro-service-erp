package com.monash.erp.party.service;

import com.monash.erp.party.dto.PartyRoleSummary;
import com.monash.erp.party.entity.PartyRole;
import com.monash.erp.party.entity.Person;
import com.monash.erp.party.repository.PartyRoleRepository;
import com.monash.erp.party.repository.PersonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PartyRoleService {

    private final PartyRoleRepository repository;
    private final PersonRepository personRepository;

    public PartyRoleService(PartyRoleRepository repository, PersonRepository personRepository) {
        this.repository = repository;
        this.personRepository = personRepository;
    }

    public List<PartyRole> list(String roleTypeId) {
        if (roleTypeId == null || roleTypeId.isBlank()) {
            return repository.findAll();
        }
        return repository.findByRoleTypeId(roleTypeId);
    }

    public PartyRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyRole %d not found".formatted(id)));
    }

    public PartyRole create(PartyRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PartyRole update(Long id, PartyRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<PartyRoleSummary> listSummaries(String roleTypeId) {
        List<PartyRole> roles = list(roleTypeId);
        if (roles.isEmpty()) {
            return List.of();
        }

        List<String> partyIds = roles.stream()
                .map(PartyRole::getPartyId)
                .filter(this::isNotBlank)
                .distinct()
                .collect(Collectors.toList());

        Map<String, String> names = new HashMap<>();
        if (!partyIds.isEmpty()) {
            List<Person> people = personRepository.findByPartyIdIn(partyIds);
            for (Person person : people) {
                names.put(person.getPartyId(), formatName(person));
            }
        }

        List<PartyRoleSummary> summaries = new ArrayList<>();
        for (PartyRole role : roles) {
            String partyId = role.getPartyId();
            String name = names.getOrDefault(partyId, partyId);
            summaries.add(new PartyRoleSummary(partyId, role.getRoleTypeId(), name));
        }
        return summaries;
    }

    private String formatName(Person person) {
        if (person == null) {
            return "";
        }
        String firstName = person.getFirstName() == null ? "" : person.getFirstName().trim();
        String lastName = person.getLastName() == null ? "" : person.getLastName().trim();
        String combined = (firstName + " " + lastName).trim();
        return combined.isBlank() ? person.getPartyId() : combined;
    }

    private boolean isNotBlank(String value) {
        return value != null && !value.isBlank();
    }
}
