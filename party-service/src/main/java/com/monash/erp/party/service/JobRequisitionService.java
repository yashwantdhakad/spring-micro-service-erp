package com.monash.erp.party.service;

import com.monash.erp.party.entity.JobRequisition;
import com.monash.erp.party.repository.JobRequisitionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class JobRequisitionService {

    private final JobRequisitionRepository repository;

    public JobRequisitionService(JobRequisitionRepository repository) {
        this.repository = repository;
    }

    public List<JobRequisition> list() {
        return repository.findAll();
    }

    public JobRequisition get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "JobRequisition %d not found".formatted(id)));
    }

    public JobRequisition create(JobRequisition entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public JobRequisition update(Long id, JobRequisition entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "JobRequisition %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}