package com.monash.erp.apigateway.security;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties(prefix = "security.auth")
public class TokenAuthProperties {

    private boolean enabled = true;
    private String secret;
    private String issuer;
    private long allowedSkewSeconds = 60L;
    private long tokenTtlSeconds = 3600L;
    private List<String> ignoredPaths = new ArrayList<>(List.of("/actuator/**"));

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public long getAllowedSkewSeconds() {
        return allowedSkewSeconds;
    }

    public void setAllowedSkewSeconds(long allowedSkewSeconds) {
        this.allowedSkewSeconds = allowedSkewSeconds;
    }

    public long getTokenTtlSeconds() {
        return tokenTtlSeconds;
    }

    public void setTokenTtlSeconds(long tokenTtlSeconds) {
        this.tokenTtlSeconds = tokenTtlSeconds;
    }

    public List<String> getIgnoredPaths() {
        return ignoredPaths;
    }

    public void setIgnoredPaths(List<String> ignoredPaths) {
        this.ignoredPaths = ignoredPaths;
    }
}
