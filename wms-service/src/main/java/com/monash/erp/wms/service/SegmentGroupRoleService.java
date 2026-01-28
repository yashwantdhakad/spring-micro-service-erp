package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.SegmentGroupRole;
import com.monash.erp.wms.repository.SegmentGroupRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SegmentGroupRoleService {

    private final SegmentGroupRoleRepository repository;

    public SegmentGroupRoleService(SegmentGroupRoleRepository repository) {
        this.repository = repository;
    }

    public List<SegmentGroupRole> list() {
        return repository.findAll();
    }

    public SegmentGroupRole get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "SegmentGroupRole %d not found".formatted(id)));
    }

    public SegmentGroupRole create(SegmentGroupRole entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public SegmentGroupRole update(Long id, SegmentGroupRole entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "SegmentGroupRole %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}