package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderDeliverySchedule;
import com.monash.erp.oms.repository.OrderDeliveryScheduleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderDeliveryScheduleService {

    private final OrderDeliveryScheduleRepository repository;

    public OrderDeliveryScheduleService(OrderDeliveryScheduleRepository repository) {
        this.repository = repository;
    }

    public List<OrderDeliverySchedule> list() {
        return repository.findAll();
    }

    public OrderDeliverySchedule get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderDeliverySchedule %d not found".formatted(id)));
    }

    public OrderDeliverySchedule create(OrderDeliverySchedule entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderDeliverySchedule update(Long id, OrderDeliverySchedule entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderDeliverySchedule %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}