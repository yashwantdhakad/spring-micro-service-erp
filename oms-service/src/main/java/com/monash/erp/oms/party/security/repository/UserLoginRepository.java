package com.monash.erp.oms.party.security.repository;

import com.monash.erp.oms.party.security.entity.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserLoginRepository extends JpaRepository<UserLogin, Long> {
    Optional<UserLogin> findByUserLoginId(String userLoginId);

    boolean existsByUserLoginId(String userLoginId);

    Page<UserLogin> findByUserLoginIdContainingIgnoreCaseOrPartyIdContainingIgnoreCase(String userLoginId,
                                                                                       String partyId,
                                                                                       Pageable pageable);
}
