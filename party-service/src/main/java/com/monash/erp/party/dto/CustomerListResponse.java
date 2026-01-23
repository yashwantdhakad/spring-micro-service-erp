package com.monash.erp.party.dto;

import java.util.List;

public class CustomerListResponse {

    private List<CustomerSummary> resultList;
    private long documentListCount;

    public CustomerListResponse(List<CustomerSummary> resultList, long documentListCount) {
        this.resultList = resultList;
        this.documentListCount = documentListCount;
    }

    public List<CustomerSummary> getResultList() {
        return resultList;
    }

    public void setResultList(List<CustomerSummary> resultList) {
        this.resultList = resultList;
    }

    public long getDocumentListCount() {
        return documentListCount;
    }

    public void setDocumentListCount(long documentListCount) {
        this.documentListCount = documentListCount;
    }
}
