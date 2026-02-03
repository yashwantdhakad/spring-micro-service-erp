package com.monash.erp.wms.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class ContentPurposeOperation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contentPurposeTypeId;
    private String contentOperationId;
    private String roleTypeId;
    private String statusId;
    private String privilegeEnumId;
public void setId(Long id) {
        this.id = id;
    }
public void setContentPurposeTypeId(String contentPurposeTypeId) {
        this.contentPurposeTypeId = contentPurposeTypeId;
    }
public void setContentOperationId(String contentOperationId) {
        this.contentOperationId = contentOperationId;
    }
public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setPrivilegeEnumId(String privilegeEnumId) {
        this.privilegeEnumId = privilegeEnumId;
    }

}
