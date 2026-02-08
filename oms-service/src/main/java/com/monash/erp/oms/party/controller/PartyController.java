package com.monash.erp.oms.party.controller;

import com.monash.erp.oms.party.dto.PartyDto;
import com.monash.erp.oms.party.service.PartyService;
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
@RequestMapping("/api/parties")
public class PartyController {

    private final PartyService service;

    public PartyController(PartyService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyDto> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public PartyDto get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyDto> create(@RequestBody PartyDto dto) {
        PartyDto created = service.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyDto update(@PathVariable Long id, @RequestBody PartyDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}/payment-methods/credit-cards")
    public ResponseEntity<Void> createCreditCard(@PathVariable Long id,
            @RequestBody com.monash.erp.oms.party.dto.CreditCardDTO dto) {
        PartyDto party = service.get(id);
        service.createCreditCard(party.getPartyId(), dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}