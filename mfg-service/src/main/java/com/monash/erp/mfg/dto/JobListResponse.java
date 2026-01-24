package com.monash.erp.mfg.dto;

public class JobListResponse {

    private JobListResponseMap responseMap;

    public JobListResponse() {
    }

    public JobListResponse(JobListResponseMap responseMap) {
        this.responseMap = responseMap;
    }

    public JobListResponseMap getResponseMap() {
        return responseMap;
    }

    public void setResponseMap(JobListResponseMap responseMap) {
        this.responseMap = responseMap;
    }
}
