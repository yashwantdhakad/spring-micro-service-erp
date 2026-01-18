package com.monash.erp.oms.accounting.service;

import com.monash.erp.oms.accounting.entity.GlAccountCategoryMember;
import com.monash.erp.oms.accounting.repository.GlAccountCategoryMemberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class GlAccountCategoryMemberService {

    private final GlAccountCategoryMemberRepository repository;

    public GlAccountCategoryMemberService(GlAccountCategoryMemberRepository repository) {
        this.repository = repository;
    }

    public List<GlAccountCategoryMember> list() {
        return repository.findAll();
    }

    public GlAccountCategoryMember get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountCategoryMember %d not found".formatted(id)));
    }

    public GlAccountCategoryMember create(GlAccountCategoryMember entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public GlAccountCategoryMember update(Long id, GlAccountCategoryMember entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "GlAccountCategoryMember %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
