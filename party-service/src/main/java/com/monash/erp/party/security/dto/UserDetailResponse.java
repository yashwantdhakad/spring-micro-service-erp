package com.monash.erp.party.security.dto;

public class UserDetailResponse {

    private UserDetail userDetail;

    public UserDetailResponse() {}

    public UserDetailResponse(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }
}
