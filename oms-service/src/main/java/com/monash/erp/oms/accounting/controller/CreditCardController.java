package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.CreditCard;
import com.monash.erp.oms.accounting.service.CreditCardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/accounting/credit-cards")
public class CreditCardController {

    private final CreditCardService service;

    public CreditCardController(CreditCardService service) {
        this.service = service;
    }

    @GetMapping
    public List<CreditCard> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public CreditCard get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<CreditCard> create(@RequestBody CreditCard entity) {
        CreditCard created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public CreditCard update(@PathVariable Long id, @RequestBody CreditCard entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
