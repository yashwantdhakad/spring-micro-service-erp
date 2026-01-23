package com.monash.erp.party.dto;

import java.util.List;

public class SupplierListResponse {

    private List<SupplierSummary> resultList;
    private long documentListCount;

    public SupplierListResponse(List<SupplierSummary> resultList, long documentListCount) {
        this.resultList = resultList;
        this.documentListCount = documentListCount;
    }

    public List<SupplierSummary> getResultList() {
        return resultList;
    }

    public void setResultList(List<SupplierSummary> resultList) {
        this.resultList = resultList;
    }

    public long getDocumentListCount() {
        return documentListCount;
    }

    public void setDocumentListCount(long documentListCount) {
        this.documentListCount = documentListCount;
    }
}
