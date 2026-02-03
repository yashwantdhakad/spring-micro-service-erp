package com.monash.erp.party.security.entity;

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
        name = "security_group_permission",
        indexes = {
                @Index(name = "idx_security_group_permission_group_id", columnList = "group_id"),
                @Index(name = "idx_security_group_permission_permission_id", columnList = "permission_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class SecurityGroupPermission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String groupId;

    private String permissionId;

    private LocalDateTime fromDate;

    private LocalDateTime thruDate;
public void setId(Long id) {
        this.id = id;
    }
public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }
public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }
public void setThruDate(LocalDateTime thruDate) {
        this.thruDate = thruDate;
    }
}
