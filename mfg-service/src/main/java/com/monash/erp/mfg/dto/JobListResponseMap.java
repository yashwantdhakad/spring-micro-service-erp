package com.monash.erp.mfg.dto;

import java.util.List;

public class JobListResponseMap {

    private List<JobListItem> resultList;
    private long total;

    public JobListResponseMap() {
    }

    public JobListResponseMap(List<JobListItem> resultList, long total) {
        this.resultList = resultList;
        this.total = total;
    }

    public List<JobListItem> getResultList() {
        return resultList;
    }

    public void setResultList(List<JobListItem> resultList) {
        this.resultList = resultList;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
