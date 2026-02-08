package com.monash.erp.oms.party.security.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "user_login",
        indexes = {
                @Index(name = "idx_user_login_user_login_id", columnList = "user_login_id"),
                @Index(name = "idx_user_login_party_id", columnList = "party_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class UserLogin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userLoginId;

    private String partyId;

    private String currentPassword;

    private String passwordHint;

    private Boolean isSystem;

    private Boolean enabled;

    private Boolean hasLoggedOut;

    private Boolean requirePasswordChange;

    private String lastCurrencyUom;

    private String lastLocale;

    private String lastTimeZone;

    private LocalDateTime disabledDateTime;

    private BigDecimal successiveFailedLogins;

    private String externalAuthId;

    private String userLdapDn;

    private String disabledBy;
public void setId(Long id) {
        this.id = id;
    }
public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }
public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }
public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }
public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
public void setHasLoggedOut(Boolean hasLoggedOut) {
        this.hasLoggedOut = hasLoggedOut;
    }
public void setRequirePasswordChange(Boolean requirePasswordChange) {
        this.requirePasswordChange = requirePasswordChange;
    }
public void setLastCurrencyUom(String lastCurrencyUom) {
        this.lastCurrencyUom = lastCurrencyUom;
    }
public void setLastLocale(String lastLocale) {
        this.lastLocale = lastLocale;
    }
public void setLastTimeZone(String lastTimeZone) {
        this.lastTimeZone = lastTimeZone;
    }
public void setDisabledDateTime(LocalDateTime disabledDateTime) {
        this.disabledDateTime = disabledDateTime;
    }
public void setSuccessiveFailedLogins(BigDecimal successiveFailedLogins) {
        this.successiveFailedLogins = successiveFailedLogins;
    }
public void setExternalAuthId(String externalAuthId) {
        this.externalAuthId = externalAuthId;
    }
public void setUserLdapDn(String userLdapDn) {
        this.userLdapDn = userLdapDn;
    }
public void setDisabledBy(String disabledBy) {
        this.disabledBy = disabledBy;
    }
}
