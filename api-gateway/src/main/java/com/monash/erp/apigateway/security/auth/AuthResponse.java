package com.monash.erp.apigateway.security.auth;

import java.time.Instant;
import java.util.List;

public class AuthResponse {

    private final String accessToken;
    private final String tokenType;
    private final Instant expiresAt;
    private final String userLoginId;
    private final List<String> roles;

    public AuthResponse(String accessToken, String tokenType, Instant expiresAt, String userLoginId, List<String> roles) {
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.expiresAt = expiresAt;
        this.userLoginId = userLoginId;
        this.roles = roles;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public Instant getExpiresAt() {
        return expiresAt;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public List<String> getRoles() {
        return roles;
    }
}
