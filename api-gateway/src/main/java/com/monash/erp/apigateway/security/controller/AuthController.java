package com.monash.erp.apigateway.security.controller;

import com.monash.erp.apigateway.security.auth.AuthRequest;
import com.monash.erp.apigateway.security.auth.AuthResponse;
import com.monash.erp.apigateway.security.auth.RegisterRequest;
import com.monash.erp.apigateway.security.service.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@RestController
@RequestMapping("/security/auth")
public class AuthController {

    private final AuthenticationService authenticationService;

    public AuthController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/login")
    public Mono<AuthResponse> login(@Valid @RequestBody AuthRequest request) {
        return Mono.fromCallable(() -> authenticationService.authenticate(request.getUserLoginId(), request.getPassword()))
                .subscribeOn(Schedulers.boundedElastic());
    }

    @PostMapping("/register")
    public Mono<AuthResponse> register(@Valid @RequestBody RegisterRequest request) {
        return Mono.fromCallable(() -> authenticationService.register(request.getUserLoginId(), request.getPassword(), request.getRoles()))
                .subscribeOn(Schedulers.boundedElastic());
    }
}
