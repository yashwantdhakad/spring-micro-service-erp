package com.monash.erp.apigateway.security.auth;

import com.monash.erp.apigateway.security.TokenAuthProperties;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@Component
public class JwtTokenService {

    private final TokenAuthProperties properties;
    private final Key key;

    public JwtTokenService(TokenAuthProperties properties) {
        this.properties = properties;
        if (!StringUtils.hasText(properties.getSecret())) {
            throw new IllegalStateException("security.auth.secret must be set for token generation");
        }
        this.key = Keys.hmacShaKeyFor(properties.getSecret().getBytes(StandardCharsets.UTF_8));
    }

    public TokenDetails issueToken(String subject, List<String> roles) {
        Instant now = Instant.now();
        Instant expiresAt = now.plusSeconds(properties.getTokenTtlSeconds());

        String token = Jwts.builder()
                .setSubject(subject)
                .setIssuer(properties.getIssuer())
                .setIssuedAt(Date.from(now))
                .setExpiration(Date.from(expiresAt))
                .claim("roles", roles)
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();

        return new TokenDetails(token, expiresAt);
    }

    public record TokenDetails(String token, Instant expiresAt) {
    }
}
