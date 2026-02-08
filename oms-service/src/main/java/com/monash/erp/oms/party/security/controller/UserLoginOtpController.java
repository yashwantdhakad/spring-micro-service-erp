package com.monash.erp.oms.party.security.controller;

import com.monash.erp.oms.party.security.entity.UserLoginOtp;
import com.monash.erp.oms.party.security.service.UserLoginOtpService;
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
@RequestMapping("/security/user-login-otps")
public class UserLoginOtpController {

    private final UserLoginOtpService service;

    public UserLoginOtpController(UserLoginOtpService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserLoginOtp> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public UserLoginOtp get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<UserLoginOtp> create(@RequestBody UserLoginOtp entity) {
        UserLoginOtp created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public UserLoginOtp update(@PathVariable Long id, @RequestBody UserLoginOtp entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}