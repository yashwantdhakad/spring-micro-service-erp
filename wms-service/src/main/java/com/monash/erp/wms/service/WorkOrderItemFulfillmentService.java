package com.monash.erp.wms.service;

import com.monash.erp.wms.entity.WorkOrderItemFulfillment;
import com.monash.erp.wms.repository.WorkOrderItemFulfillmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WorkOrderItemFulfillmentService {

    private final WorkOrderItemFulfillmentRepository repository;

    public WorkOrderItemFulfillmentService(WorkOrderItemFulfillmentRepository repository) {
        this.repository = repository;
    }

    public List<WorkOrderItemFulfillment> list() {
        return repository.findAll();
    }

    public WorkOrderItemFulfillment get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkOrderItemFulfillment %d not found".formatted(id)));
    }

    public WorkOrderItemFulfillment create(WorkOrderItemFulfillment entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public WorkOrderItemFulfillment update(Long id, WorkOrderItemFulfillment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "WorkOrderItemFulfillment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}