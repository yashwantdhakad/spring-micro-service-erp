package com.example.erp.oms.accounting.service;

import com.example.erp.oms.accounting.domain.PaymentGatewayRespMsg;
import com.example.erp.oms.accounting.repository.PaymentGatewayRespMsgRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PaymentGatewayRespMsgService {

    private final PaymentGatewayRespMsgRepository repository;

    public PaymentGatewayRespMsgService(PaymentGatewayRespMsgRepository repository) {
        this.repository = repository;
    }

    public List<PaymentGatewayRespMsg> list() {
        return repository.findAll();
    }

    public PaymentGatewayRespMsg get(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayRespMsg %d not found".formatted(id)));
    }

    public PaymentGatewayRespMsg create(PaymentGatewayRespMsg entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public PaymentGatewayRespMsg update(Long id, PaymentGatewayRespMsg entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PaymentGatewayRespMsg %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
