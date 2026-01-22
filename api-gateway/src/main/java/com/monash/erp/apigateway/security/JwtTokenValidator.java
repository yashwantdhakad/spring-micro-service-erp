package com.monash.erp.apigateway.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.nio.charset.StandardCharsets;
import java.security.Key;

@Component
public class JwtTokenValidator {

    private final TokenAuthProperties properties;
    private final io.jsonwebtoken.JwtParser parser;

    public JwtTokenValidator(TokenAuthProperties properties) {
        this.properties = properties;
        if (!properties.isEnabled()) {
            this.parser = null;
            return;
        }
        if (!StringUtils.hasText(properties.getSecret())) {
            throw new IllegalStateException("security.auth.secret must be set when security.auth.enabled=true");
        }
        Key key = Keys.hmacShaKeyFor(properties.getSecret().getBytes(StandardCharsets.UTF_8));
        this.parser = Jwts.parserBuilder()
                .setSigningKey(key)
                .setAllowedClockSkewSeconds(properties.getAllowedSkewSeconds())
                .build();
    }

    public Claims validate(String token) {
        if (!properties.isEnabled()) {
            throw new JwtException("Token validation is disabled");
        }
        Jws<Claims> jws = parser.parseClaimsJws(token);
        Claims claims = jws.getBody();
        String issuer = properties.getIssuer();
        if (StringUtils.hasText(issuer) && !issuer.equals(claims.getIssuer())) {
            throw new JwtException("Invalid token issuer");
        }
        return claims;
    }
}
