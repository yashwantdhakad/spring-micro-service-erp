package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.GiftCard;
import com.monash.erp.oms.accounting.service.GiftCardService;
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
@RequestMapping("/accounting/gift-cards")
public class GiftCardController {

    private final GiftCardService service;

    public GiftCardController(GiftCardService service) {
        this.service = service;
    }

    @GetMapping
    public List<GiftCard> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GiftCard get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GiftCard> create(@RequestBody GiftCard entity) {
        GiftCard created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GiftCard update(@PathVariable Long id, @RequestBody GiftCard entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
