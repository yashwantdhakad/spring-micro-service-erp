package com.monash.erp.oms.common.controller;

import com.monash.erp.oms.common.entity.UserPrefGroupType;
import com.monash.erp.oms.common.service.UserPrefGroupTypeService;
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
@RequestMapping("/common/user-pref-group-types")
public class UserPrefGroupTypeController {

    private final UserPrefGroupTypeService service;

    public UserPrefGroupTypeController(UserPrefGroupTypeService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserPrefGroupType> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public UserPrefGroupType get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<UserPrefGroupType> create(@RequestBody UserPrefGroupType entity) {
        UserPrefGroupType created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public UserPrefGroupType update(@PathVariable Long id, @RequestBody UserPrefGroupType entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
