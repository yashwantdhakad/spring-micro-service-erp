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

@Entity
@Table(
        name = "security_group",
        indexes = {
                @Index(name = "idx_security_group_group_id", columnList = "group_id")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class SecurityGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String groupId;

    private String groupName;

    private String description;
public void setId(Long id) {
        this.id = id;
    }
public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
public void setDescription(String description) {
        this.description = description;
    }
}
