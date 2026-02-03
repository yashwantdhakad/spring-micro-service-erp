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
public class PartyClassification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyId;
    private String partyClassificationGroupId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
public void setId(Long id) {
        this.id = id;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setPartyClassificationGroupId(String partyClassificationGroupId) {
        this.partyClassificationGroupId = partyClassificationGroupId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }

}
