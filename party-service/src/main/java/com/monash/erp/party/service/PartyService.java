package com.monash.erp.party.service;

import com.monash.erp.party.dto.PartyDto;
import com.monash.erp.party.entity.Party;
import com.monash.erp.party.mapper.PartyMapper;
import com.monash.erp.party.repository.PartyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartyService {

    private final PartyRepository repository;
    private final PartyMapper mapper;

    public PartyService(PartyRepository repository, PartyMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<PartyDto> list() {
        return repository.findAll().stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    public PartyDto get(Long id) {
        Party entity = repository.findById(id)
                .orElseThrow(
                        () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Party %d not found".formatted(id)));
        return mapper.toDTO(entity);
    }

    @Transactional
    public PartyDto create(PartyDto dto) {
        Party entity = mapper.toEntity(dto);
        entity.setId(null);
        return mapper.toDTO(repository.save(entity));
    }

    @Transactional
    public PartyDto update(Long id, PartyDto dto) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Party %d not found".formatted(id));
        }
        Party entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDTO(repository.save(entity));
    }

    @Transactional
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Party %d not found".formatted(id));
        }
        repository.deleteById(id);
    }
}