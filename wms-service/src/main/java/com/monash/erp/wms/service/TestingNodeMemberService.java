package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.TestingNodeMember;
import com.monash.erp.wms.repository.TestingNodeMemberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TestingNodeMemberService {

    private final TestingNodeMemberRepository repository;

    public TestingNodeMemberService(TestingNodeMemberRepository repository) {
        this.repository = repository;
    }

    public List<TestingNodeMember> list() {
        return repository.findAll();
    }

    public TestingNodeMember get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TestingNodeMember %d not found".formatted(id)));
    }

    public TestingNodeMember create(TestingNodeMember entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public TestingNodeMember update(Long id, TestingNodeMember entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TestingNodeMember %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}