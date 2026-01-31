package com.monash.erp.apigateway.security.service;

import com.monash.erp.apigateway.security.auth.AuthResponse;
import com.monash.erp.apigateway.security.auth.JwtTokenService;
import com.monash.erp.apigateway.security.entity.UserLogin;
import com.monash.erp.apigateway.security.entity.UserLoginSecurityGroup;
import com.monash.erp.apigateway.security.repository.UserLoginRepository;
import com.monash.erp.apigateway.security.repository.UserLoginSecurityGroupRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class AuthenticationService {

    private final UserLoginRepository userLoginRepository;
    private final UserLoginSecurityGroupRepository securityGroupRepository;
    private final JwtTokenService tokenService;
    private final PasswordEncoder passwordEncoder;

    public AuthenticationService(UserLoginRepository userLoginRepository,
                                 UserLoginSecurityGroupRepository securityGroupRepository,
                                 JwtTokenService tokenService,
                                 PasswordEncoder passwordEncoder) {
        this.userLoginRepository = userLoginRepository;
        this.securityGroupRepository = securityGroupRepository;
        this.tokenService = tokenService;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public AuthResponse authenticate(String userLoginId, String password) {
        UserLogin userLogin = userLoginRepository.findByUserLoginId(userLoginId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid credentials"));

        if (Boolean.FALSE.equals(userLogin.getEnabled()) || userLogin.getDisabledDateTime() != null) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid credentials");
        }

        String storedPassword = userLogin.getCurrentPassword();
        if (!StringUtils.hasText(storedPassword)) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid credentials");
        }
        if (passwordEncoder.matches(password, storedPassword)) {
            // already hashed
        } else if (storedPassword.equals(password)) {
            // legacy plain-text password; upgrade to bcrypt
            userLogin.setCurrentPassword(passwordEncoder.encode(password));
            userLoginRepository.save(userLogin);
        } else {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid credentials");
        }

        List<String> roles = resolveRoles(userLoginId);
        JwtTokenService.TokenDetails tokenDetails = tokenService.issueToken(userLoginId, roles);

        return new AuthResponse(tokenDetails.token(), "Bearer", tokenDetails.expiresAt(), userLoginId, roles);
    }

    @Transactional
    public AuthResponse register(String userLoginId, String password, List<String> roles) {
        if (userLoginRepository.existsByUserLoginId(userLoginId)) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "User already exists");
        }

        UserLogin userLogin = new UserLogin();
        userLogin.setUserLoginId(userLoginId);
        userLogin.setCurrentPassword(passwordEncoder.encode(password));
        userLogin.setEnabled(true);
        userLoginRepository.save(userLogin);

        List<String> normalizedRoles = normalizeRoles(roles);
        if (!normalizedRoles.isEmpty()) {
            LocalDateTime now = LocalDateTime.now();
            List<UserLoginSecurityGroup> groups = normalizedRoles.stream()
                    .map(role -> toSecurityGroup(userLoginId, role, now))
                    .collect(Collectors.toList());
            securityGroupRepository.saveAll(groups);
        }

        JwtTokenService.TokenDetails tokenDetails = tokenService.issueToken(userLoginId, normalizedRoles);
        return new AuthResponse(tokenDetails.token(), "Bearer", tokenDetails.expiresAt(), userLoginId, normalizedRoles);
    }

    private List<String> resolveRoles(String userLoginId) {
        LocalDateTime now = LocalDateTime.now();
        return securityGroupRepository.findByUserLoginId(userLoginId).stream()
                .filter(group -> isActive(group, now))
                .map(UserLoginSecurityGroup::getGroupId)
                .toList();
    }

    private List<String> normalizeRoles(List<String> roles) {
        if (roles == null) {
            return List.of();
        }
        return roles.stream()
                .filter(Objects::nonNull)
                .map(String::trim)
                .filter(StringUtils::hasText)
                .distinct()
                .toList();
    }

    private UserLoginSecurityGroup toSecurityGroup(String userLoginId, String role, LocalDateTime now) {
        UserLoginSecurityGroup group = new UserLoginSecurityGroup();
        group.setUserLoginId(userLoginId);
        group.setGroupId(role);
        group.setFromDate(now);
        return group;
    }

    private boolean isActive(UserLoginSecurityGroup group, LocalDateTime now) {
        if (group.getFromDate() != null && group.getFromDate().isAfter(now)) {
            return false;
        }
        return group.getThruDate() == null || group.getThruDate().isAfter(now);
    }
}
