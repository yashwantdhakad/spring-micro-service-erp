package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.entity.PartyCarrierAccount;
import com.monash.erp.oms.party.service.PartyCarrierAccountService;
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
@RequestMapping("/api/party-carrier-accounts")
public class PartyCarrierAccountController {

    private final PartyCarrierAccountService service;

    public PartyCarrierAccountController(PartyCarrierAccountService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyCarrierAccount> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyCarrierAccount get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyCarrierAccount> create(@RequestBody PartyCarrierAccount entity) {
        PartyCarrierAccount created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyCarrierAccount update(@PathVariable Long id, @RequestBody PartyCarrierAccount entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}