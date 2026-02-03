package com.monash.erp.wms.entity;

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
        name = "picklist_role",
        indexes = {
                @Index(name = "idx_picklist_role_picklist_role", columnList = "picklist_id, role_type_id"),
                @Index(name = "idx_picklist_role_thru_date", columnList = "thru_date")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class PicklistRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String picklistId;
    private String partyId;
    private String roleTypeId;
    private LocalDateTime fromDate;
    private LocalDateTime thruDate;
    private String createdByUserLogin;
    private String lastModifiedByUserLogin;
public void setId(Long id) {
        this.id = id;
    }
public void setPicklistId(String picklistId) {
        this.picklistId = picklistId;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }
public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

}
