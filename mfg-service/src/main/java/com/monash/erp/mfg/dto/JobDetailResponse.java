package com.monash.erp.mfg.dto;

import com.monash.erp.mfg.entity.WorkEffort;

import java.util.List;

public class JobDetailResponse {

    private WorkEffort workEffort;
    private List<JobGoodStandardDto> produceList;
    private List<JobGoodStandardDto> consumeList;
    private List<WorkEffort> tasks;

    public JobDetailResponse() {
    }

    public JobDetailResponse(
            WorkEffort workEffort,
            List<JobGoodStandardDto> produceList,
            List<JobGoodStandardDto> consumeList,
            List<WorkEffort> tasks
    ) {
        this.workEffort = workEffort;
        this.produceList = produceList;
        this.consumeList = consumeList;
        this.tasks = tasks;
    }

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }

    public List<JobGoodStandardDto> getProduceList() {
        return produceList;
    }

    public void setProduceList(List<JobGoodStandardDto> produceList) {
        this.produceList = produceList;
    }

    public List<JobGoodStandardDto> getConsumeList() {
        return consumeList;
    }

    public void setConsumeList(List<JobGoodStandardDto> consumeList) {
        this.consumeList = consumeList;
    }

    public List<WorkEffort> getTasks() {
        return tasks;
    }

    public void setTasks(List<WorkEffort> tasks) {
        this.tasks = tasks;
    }
}
