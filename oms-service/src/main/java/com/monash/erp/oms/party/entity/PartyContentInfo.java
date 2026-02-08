package com.monash.erp.oms.party.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "party_content_info",
        indexes = {
                @Index(name = "idx_party_content_info_party_id", columnList = "party_id"),
                @Index(name = "idx_party_content_info_party_content", columnList = "party_id, content_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class PartyContentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyId;
    private String contentId;
    private String description;
    private String contentLocation;
    private LocalDateTime contentDate;
public void setId(Long id) {
        this.id = id;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setContentId(String contentId) {
        this.contentId = contentId;
    }
public void setDescription(String description) {
        this.description = description;
    }
public void setContentLocation(String contentLocation) {
        this.contentLocation = contentLocation;
    }
public void setContentDate(LocalDateTime contentDate) {
        this.contentDate = contentDate;
    }
}
