package com.monash.erp.oms.service;

import com.monash.erp.oms.entity.OrderFinishedGoodsShipment;
import com.monash.erp.oms.repository.OrderFinishedGoodsShipmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class OrderFinishedGoodsShipmentService {

    private final OrderFinishedGoodsShipmentRepository repository;

    public OrderFinishedGoodsShipmentService(OrderFinishedGoodsShipmentRepository repository) {
        this.repository = repository;
    }

    public List<OrderFinishedGoodsShipment> list() {
        return repository.findAll();
    }

    public OrderFinishedGoodsShipment get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderFinishedGoodsShipment %d not found".formatted(id)));
    }

    public OrderFinishedGoodsShipment create(OrderFinishedGoodsShipment entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public OrderFinishedGoodsShipment update(Long id, OrderFinishedGoodsShipment entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "OrderFinishedGoodsShipment %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}