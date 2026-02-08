package com.monash.erp.oms.party.security.controller;

import com.monash.erp.oms.party.security.entity.UserLoginSecurityGroup;
import com.monash.erp.oms.party.security.service.UserLoginSecurityGroupService;
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
@RequestMapping("/security/user-login-security-groups")
public class UserLoginSecurityGroupController {

    private final UserLoginSecurityGroupService service;

    public UserLoginSecurityGroupController(UserLoginSecurityGroupService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserLoginSecurityGroup> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public UserLoginSecurityGroup get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<UserLoginSecurityGroup> create(@RequestBody UserLoginSecurityGroup entity) {
        UserLoginSecurityGroup created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public UserLoginSecurityGroup update(@PathVariable Long id, @RequestBody UserLoginSecurityGroup entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
