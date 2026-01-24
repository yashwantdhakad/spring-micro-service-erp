package com.monash.erp.mfg.dto;

import java.util.List;

public class WmsProductDetailResponse {

    private List<WmsProductAssocDto> assocs;

    public List<WmsProductAssocDto> getAssocs() {
        return assocs;
    }

    public void setAssocs(List<WmsProductAssocDto> assocs) {
        this.assocs = assocs;
    }
}
