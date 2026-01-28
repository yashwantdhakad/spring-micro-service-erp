package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.FacilityGroupMember;
import com.monash.erp.wms.repository.FacilityGroupMemberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class FacilityGroupMemberService {

    private final FacilityGroupMemberRepository repository;

    public FacilityGroupMemberService(FacilityGroupMemberRepository repository) {
        this.repository = repository;
    }

    public List<FacilityGroupMember> list() {
        return repository.findAll();
    }

    public FacilityGroupMember get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityGroupMember %d not found".formatted(id)));
    }

    public FacilityGroupMember create(FacilityGroupMember entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public FacilityGroupMember update(Long id, FacilityGroupMember entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "FacilityGroupMember %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}