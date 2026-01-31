package com.monash.erp.party.security.dto;

import java.util.List;

public class UserListResponse {

    private List<UserSummary> resultList;
    private long documentListCount;

    public UserListResponse() {}

    public UserListResponse(List<UserSummary> resultList, long documentListCount) {
        this.resultList = resultList;
        this.documentListCount = documentListCount;
    }

    public List<UserSummary> getResultList() {
        return resultList;
    }

    public void setResultList(List<UserSummary> resultList) {
        this.resultList = resultList;
    }

    public long getDocumentListCount() {
        return documentListCount;
    }

    public void setDocumentListCount(long documentListCount) {
        this.documentListCount = documentListCount;
    }
}
