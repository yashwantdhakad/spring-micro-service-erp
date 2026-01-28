package com.monash.erp.party.security.controller;

import com.monash.erp.party.security.entity.UserAgent;
import com.monash.erp.party.security.service.UserAgentService;
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
@RequestMapping("/security/user-agents")
public class UserAgentController {

    private final UserAgentService service;

    public UserAgentController(UserAgentService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserAgent> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public UserAgent get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<UserAgent> create(@RequestBody UserAgent entity) {
        UserAgent created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public UserAgent update(@PathVariable Long id, @RequestBody UserAgent entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}