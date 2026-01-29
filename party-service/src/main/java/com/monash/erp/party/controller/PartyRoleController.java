package com.monash.erp.party.controller;

import com.monash.erp.party.dto.PartyRoleSummary;
import com.monash.erp.party.entity.PartyRole;
import com.monash.erp.party.service.PartyRoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/party-roles")
public class PartyRoleController {

    private final PartyRoleService service;

    public PartyRoleController(PartyRoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<PartyRole> list(@RequestParam(name = "roleTypeId", required = false) String roleTypeId) {
        return service.list(roleTypeId);
    }

    @GetMapping("/summary")
    public List<PartyRoleSummary> listSummary(
            @RequestParam(name = "roleTypeId", required = false) String roleTypeId
    ) {
        return service.listSummaries(roleTypeId);
    }

    @GetMapping("/{id}")
    public PartyRole get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<PartyRole> create(@RequestBody PartyRole entity) {
        PartyRole created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public PartyRole update(@PathVariable Long id, @RequestBody PartyRole entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
