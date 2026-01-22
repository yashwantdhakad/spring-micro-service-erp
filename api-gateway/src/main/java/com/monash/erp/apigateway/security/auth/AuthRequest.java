package com.monash.erp.apigateway.security.auth;

import jakarta.validation.constraints.NotBlank;

public class AuthRequest {

    @NotBlank
    private String userLoginId;

    @NotBlank
    private String password;

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
}
