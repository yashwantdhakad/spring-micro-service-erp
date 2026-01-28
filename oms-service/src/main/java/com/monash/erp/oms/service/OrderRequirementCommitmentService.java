package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderRequirementCommitment;
import com.monash.erp.oms.repository.OrderRequirementCommitmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderRequirementCommitmentService {

    private final OrderRequirementCommitmentRepository repository;

    public OrderRequirementCommitmentService(OrderRequirementCommitmentRepository repository) {
        this.repository = repository;
    }

    public List<OrderRequirementCommitment> list() {
        return repository.findAll();
    }

    public OrderRequirementCommitment get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderRequirementCommitment %d not found".formatted(id)));
    }

    public OrderRequirementCommitment create(OrderRequirementCommitment entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderRequirementCommitment update(Long id, OrderRequirementCommitment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderRequirementCommitment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}