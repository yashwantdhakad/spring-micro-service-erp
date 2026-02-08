package com.monash.erp.oms.party.security.service;

import com.monash.erp.oms.party.security.entity.UserLoginOtp;
import com.monash.erp.oms.party.security.repository.UserLoginOtpRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserLoginOtpService {

    private final UserLoginOtpRepository repository;

    public UserLoginOtpService(UserLoginOtpRepository repository) {
        this.repository = repository;
    }

    public List<UserLoginOtp> list() {
        return repository.findAll();
    }

    public UserLoginOtp get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "UserLoginOtp %d not found".formatted(id)));
    }

    public UserLoginOtp create(UserLoginOtp entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public UserLoginOtp update(Long id, UserLoginOtp entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "UserLoginOtp %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}