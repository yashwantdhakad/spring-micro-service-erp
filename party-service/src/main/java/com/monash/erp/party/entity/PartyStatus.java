package com.monash.erp.party.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class PartyStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String statusId;
    private String partyId;
    private LocalDateTime statusDate;
    private String changeByUserLoginId;
public void setId(Long id) {
        this.id = id;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setStatusDate(LocalDateTime statusDate) {
        this.statusDate = statusDate;
    }
public void setChangeByUserLoginId(String changeByUserLoginId) {
        this.changeByUserLoginId = changeByUserLoginId;
    }

}
