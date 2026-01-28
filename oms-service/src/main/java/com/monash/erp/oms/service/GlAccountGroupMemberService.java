package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.GlAccountGroupMember;
import com.monash.erp.oms.repository.GlAccountGroupMemberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlAccountGroupMemberService {

    private final GlAccountGroupMemberRepository repository;

    public GlAccountGroupMemberService(GlAccountGroupMemberRepository repository) {
        this.repository = repository;
    }

    public List<GlAccountGroupMember> list() {
        return repository.findAll();
    }

    public GlAccountGroupMember get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountGroupMember %d not found".formatted(id)));
    }

    public GlAccountGroupMember create(GlAccountGroupMember entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlAccountGroupMember update(Long id, GlAccountGroupMember entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountGroupMember %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}