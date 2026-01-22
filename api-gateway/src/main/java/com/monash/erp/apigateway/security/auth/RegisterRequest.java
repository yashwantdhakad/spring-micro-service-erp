package com.monash.erp.apigateway.security.auth;

import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class RegisterRequest {

    @NotBlank
    private String userLoginId;

    @NotBlank
    private String password;

    private List<String> roles;

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
