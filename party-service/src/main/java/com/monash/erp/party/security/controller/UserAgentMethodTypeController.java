package com.monash.erp.party.security.controller;

import com.monash.erp.party.security.entity.UserAgentMethodType;
import com.monash.erp.party.security.service.UserAgentMethodTypeService;
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
@RequestMapping("/security/user-agent-method-types")
public class UserAgentMethodTypeController {

    private final UserAgentMethodTypeService service;

    public UserAgentMethodTypeController(UserAgentMethodTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserAgentMethodType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public UserAgentMethodType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<UserAgentMethodType> create(@RequestBody UserAgentMethodType entity) {
        UserAgentMethodType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public UserAgentMethodType update(@PathVariable Long id, @RequestBody UserAgentMethodType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}