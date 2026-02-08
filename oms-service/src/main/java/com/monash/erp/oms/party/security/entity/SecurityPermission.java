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

@Entity
@Table(
        name = "security_permission",
        indexes = {
                @Index(name = "idx_security_permission_permission_id", columnList = "permission_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class SecurityPermission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String permissionId;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
