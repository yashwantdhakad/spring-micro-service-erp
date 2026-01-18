package com.monash.erp.mfg.service;

import com.monash.erp.mfg.entity.WorkOrder;
import com.monash.erp.mfg.repository.WorkOrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WorkOrderService {

    private final WorkOrderRepository repository;

    public WorkOrderService(WorkOrderRepository repository) {
        this.repository = repository;
    }

    public WorkOrder create(WorkOrder workOrder) {
        return repository.save(workOrder);
    }

    public WorkOrder update(Long id, WorkOrder update) {
        return repository.findById(id)
                .map(existing -> {
                    existing.setSku(update.getSku());
                    existing.setStatus(update.getStatus());
                    existing.setQuantity(update.getQuantity());
                    if (update.getScheduledDate() != null) {
                        existing.setScheduledDate(update.getScheduledDate());
                    }
                    return repository.save(existing);
                })
                .orElseThrow(() -> new IllegalArgumentException("Work order %d not found".formatted(id)));
    }

    @Transactional(readOnly = true)
    public List<WorkOrder> list() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public WorkOrder get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Work order %d not found".formatted(id)));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<WorkOrder> findBySku(String sku) {
        return repository.findBySku(sku);
    }
}
