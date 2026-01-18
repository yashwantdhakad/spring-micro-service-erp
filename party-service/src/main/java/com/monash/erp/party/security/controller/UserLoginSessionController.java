package com.monash.erp.party.security.controller;

import com.monash.erp.party.security.entity.UserLoginSession;
import com.monash.erp.party.security.service.UserLoginSessionService;
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
@RequestMapping("/security/user-login-sessions")
public class UserLoginSessionController {

    private final UserLoginSessionService service;

    public UserLoginSessionController(UserLoginSessionService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserLoginSession> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public UserLoginSession get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<UserLoginSession> create(@RequestBody UserLoginSession entity) {
        UserLoginSession created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public UserLoginSession update(@PathVariable Long id, @RequestBody UserLoginSession entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
