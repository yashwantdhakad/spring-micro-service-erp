package com.monash.erp.wms.dto;

import java.util.List;

public class ProductListResponse {

    private List<ProductSummary> documentList;
    private long documentListCount;

    public ProductListResponse() {
    }

    public ProductListResponse(List<ProductSummary> documentList, long documentListCount) {
        this.documentList = documentList;
        this.documentListCount = documentListCount;
    }

    public List<ProductSummary> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<ProductSummary> documentList) {
        this.documentList = documentList;
    }

    public long getDocumentListCount() {
        return documentListCount;
    }

    public void setDocumentListCount(long documentListCount) {
        this.documentListCount = documentListCount;
    }
}
