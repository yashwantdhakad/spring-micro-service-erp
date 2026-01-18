package com.monash.erp.oms.accounting.controller;

import com.monash.erp.oms.accounting.entity.GlAccountCategoryMember;
import com.monash.erp.oms.accounting.service.GlAccountCategoryMemberService;
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
@RequestMapping("/accounting/gl-account-category-members")
public class GlAccountCategoryMemberController {

    private final GlAccountCategoryMemberService service;

    public GlAccountCategoryMemberController(GlAccountCategoryMemberService service) {
        this.service = service;
    }

    @GetMapping
    public List<GlAccountCategoryMember> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public GlAccountCategoryMember get(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public ResponseEntity<GlAccountCategoryMember> create(@RequestBody GlAccountCategoryMember entity) {
        GlAccountCategoryMember created = service.create(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public GlAccountCategoryMember update(@PathVariable Long id, @RequestBody GlAccountCategoryMember entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
