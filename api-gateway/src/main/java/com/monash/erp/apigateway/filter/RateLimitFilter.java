package com.monash.erp.apigateway.filter;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class RateLimitFilter implements GlobalFilter, Ordered {

    private static final int REQUEST_LIMIT = 5000;
    private static final long WINDOW_MILLIS = 60_000L;

    private final Map<String, Window> windows = new ConcurrentHashMap<>();
    private final boolean enabled;

    public RateLimitFilter(@Value("${rate-limit.enabled:true}") boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        if (!enabled) {
            return chain.filter(exchange);
        }
        String key = resolveClientKey(exchange);
        Window window = windows.computeIfAbsent(key, ignored -> new Window(System.currentTimeMillis()));
        long now = System.currentTimeMillis();
        int remaining;
        long retryAfterSeconds = 0L;

        synchronized (window) {
            if (now - window.windowStart >= WINDOW_MILLIS) {
                window.windowStart = now;
                window.count.set(0);
            }
            int current = window.count.incrementAndGet();
            remaining = Math.max(0, REQUEST_LIMIT - current);
            if (current > REQUEST_LIMIT) {
                long waitMillis = WINDOW_MILLIS - (now - window.windowStart);
                retryAfterSeconds = Math.max(1L, waitMillis / 1_000L);
            }
        }

        if (retryAfterSeconds == 0L) {
            exchange.getResponse().getHeaders()
                    .add("X-Rate-Limit-Remaining", Integer.toString(remaining));
            return chain.filter(exchange);
        }

        exchange.getResponse().setStatusCode(HttpStatus.TOO_MANY_REQUESTS);
        exchange.getResponse().getHeaders().add(HttpHeaders.RETRY_AFTER, Long.toString(retryAfterSeconds));
        return exchange.getResponse().setComplete();
    }

    @Override
    public int getOrder() {
        return -1;
    }

    private String resolveClientKey(ServerWebExchange exchange) {
        String forwardedFor = exchange.getRequest().getHeaders().getFirst("X-Forwarded-For");
        if (forwardedFor != null && !forwardedFor.isBlank()) {
            return forwardedFor.split(",")[0].trim();
        }
        if (exchange.getRequest().getRemoteAddress() != null) {
            return exchange.getRequest().getRemoteAddress().getAddress().getHostAddress();
        }
        return "unknown";
    }

    private static final class Window {
        private final AtomicInteger count = new AtomicInteger(0);
        private volatile long windowStart;

        private Window(long windowStart) {
            this.windowStart = windowStart;
        }
    }
}
