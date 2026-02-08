package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.JobInterviewType;
import com.monash.erp.oms.party.repository.JobInterviewTypeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class JobInterviewTypeService {

    private final JobInterviewTypeRepository repository;

    public JobInterviewTypeService(JobInterviewTypeRepository repository) {
        this.repository = repository;
    }

    public List<JobInterviewType> list() {
        return repository.findAll();
    }

    public JobInterviewType get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "JobInterviewType %d not found".formatted(id)));
    }

    public JobInterviewType create(JobInterviewType entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public JobInterviewType update(Long id, JobInterviewType entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "JobInterviewType %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}