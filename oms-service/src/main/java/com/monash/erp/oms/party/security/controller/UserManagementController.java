package com.monash.erp.oms.party.security.controller;

import com.monash.erp.oms.party.security.dto.UserCreateRequest;
import com.monash.erp.oms.party.security.dto.UserDetailResponse;
import com.monash.erp.oms.party.security.dto.UserListResponse;
import com.monash.erp.oms.party.security.dto.UserUpdateRequest;
import com.monash.erp.oms.party.security.service.UserManagementService;
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

@RestController
@RequestMapping("/security/users")
public class UserManagementController {

    private final UserManagementService service;

    public UserManagementController(UserManagementService service) {
        this.service = service;
    }

    @GetMapping
    public UserListResponse list(@RequestParam(defaultValue = "0") int page,
                                 @RequestParam(defaultValue = "10") int pageSize,
                                 @RequestParam(defaultValue = "") String query,
                                 @RequestParam(required = false) String sortBy,
                                 @RequestParam(required = false) String sortDirection) {
        return service.listUsers(page, pageSize, query, sortBy, sortDirection);
    }

    @GetMapping("/{userLoginId}")
    public UserDetailResponse get(@PathVariable String userLoginId) {
        return service.getUser(userLoginId);
    }

    @PostMapping
    public ResponseEntity<UserDetailResponse> create(@RequestBody UserCreateRequest request) {
        UserDetailResponse created = service.createUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{userLoginId}")
    public UserDetailResponse update(@PathVariable String userLoginId, @RequestBody UserUpdateRequest request) {
        return service.updateUser(userLoginId, request);
    }

    @DeleteMapping("/{userLoginId}")
    public ResponseEntity<Void> delete(@PathVariable String userLoginId) {
        service.deleteUser(userLoginId);
        return ResponseEntity.noContent().build();
    }
}
