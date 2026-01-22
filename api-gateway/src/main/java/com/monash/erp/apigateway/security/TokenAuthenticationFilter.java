package com.monash.erp.apigateway.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class TokenAuthenticationFilter implements GlobalFilter, Ordered {

    private static final String BEARER_PREFIX = "Bearer ";

    private final TokenAuthProperties properties;
    private final JwtTokenValidator validator;
    private final AntPathMatcher pathMatcher = new AntPathMatcher();

    public TokenAuthenticationFilter(TokenAuthProperties properties, JwtTokenValidator validator) {
        this.properties = properties;
        this.validator = validator;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        if (!properties.isEnabled()) {
            return chain.filter(exchange);
        }
        if (HttpMethod.OPTIONS.equals(exchange.getRequest().getMethod())) {
            return chain.filter(exchange);
        }
        String path = exchange.getRequest().getPath().value();
        if (isIgnoredPath(path)) {
            return chain.filter(exchange);
        }
        String authorization = exchange.getRequest().getHeaders().getFirst(HttpHeaders.AUTHORIZATION);
        if (!StringUtils.hasText(authorization) || !authorization.startsWith(BEARER_PREFIX)) {
            return unauthorized(exchange);
        }

        String token = authorization.substring(BEARER_PREFIX.length());
        try {
            Claims claims = validator.validate(token);
            ServerHttpRequest request = exchange.getRequest().mutate()
                    .headers(headers -> applyClaims(headers, claims))
                    .build();
            return chain.filter(exchange.mutate().request(request).build());
        } catch (JwtException ex) {
            return unauthorized(exchange);
        }
    }

    @Override
    public int getOrder() {
        return -2;
    }

    private boolean isIgnoredPath(String path) {
        for (String pattern : properties.getIgnoredPaths()) {
            if (pathMatcher.match(pattern, path)) {
                return true;
            }
        }
        return false;
    }

    private void applyClaims(HttpHeaders headers, Claims claims) {
        String subject = claims.getSubject();
        if (StringUtils.hasText(subject)) {
            headers.set("X-Auth-Subject", subject);
        }
        String roles = resolveRoles(claims);
        if (StringUtils.hasText(roles)) {
            headers.set("X-Auth-Roles", roles);
        }
    }

    private String resolveRoles(Claims claims) {
        Object value = claims.get("roles");
        if (value instanceof Collection<?> collection) {
            return collection.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(","));
        }
        return value != null ? value.toString() : null;
    }

    private Mono<Void> unauthorized(ServerWebExchange exchange) {
        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
        exchange.getResponse().getHeaders().set(HttpHeaders.WWW_AUTHENTICATE, "Bearer");
        return exchange.getResponse().setComplete();
    }
}
