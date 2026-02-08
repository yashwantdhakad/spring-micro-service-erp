package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.entity.JobSandbox;
import com.monash.erp.oms.party.repository.JobSandboxRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class JobSandboxService {

    private final JobSandboxRepository repository;

    public JobSandboxService(JobSandboxRepository repository) {
        this.repository = repository;
    }

    public List<JobSandbox> list() {
        return repository.findAll();
    }

    public JobSandbox get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "JobSandbox %d not found".formatted(id)));
    }

    public JobSandbox create(JobSandbox entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public JobSandbox update(Long id, JobSandbox entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "JobSandbox %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}