package com.monash.erp.party.security.dto;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserListResponse {

    private List<UserSummary> resultList;
    private long documentListCount;
}
