package com.monash.erp.party.dto;

import java.util.List;

public class SupplierDetail {

    private SupplierProfile party;
    private List<RoleSummary> partyRoleList;
    private List<Object> partyIdentificationList;
    private List<EmailDto> emailAddressList;
    private List<PhoneDto> telecomNumberList;
    private List<AddressDto> postalAddressList;
    private List<Object> payments;
    private List<NoteDto> partyNoteList;
    private List<PartyContentDto> contentList;

    public SupplierDetail(SupplierProfile party,
                          List<RoleSummary> partyRoleList,
                          List<EmailDto> emailAddressList,
                          List<PhoneDto> telecomNumberList,
                          List<AddressDto> postalAddressList,
                          List<NoteDto> partyNoteList) {
        this.party = party;
        this.partyRoleList = partyRoleList;
        this.emailAddressList = emailAddressList;
        this.telecomNumberList = telecomNumberList;
        this.postalAddressList = postalAddressList;
        this.partyIdentificationList = List.of();
        this.payments = List.of();
        this.partyNoteList = partyNoteList;
        this.contentList = List.of();
    }

    public SupplierProfile getParty() {
        return party;
    }

    public void setParty(SupplierProfile party) {
        this.party = party;
    }

    public List<RoleSummary> getPartyRoleList() {
        return partyRoleList;
    }

    public void setPartyRoleList(List<RoleSummary> partyRoleList) {
        this.partyRoleList = partyRoleList;
    }

    public List<Object> getPartyIdentificationList() {
        return partyIdentificationList;
    }

    public void setPartyIdentificationList(List<Object> partyIdentificationList) {
        this.partyIdentificationList = partyIdentificationList;
    }

    public List<EmailDto> getEmailAddressList() {
        return emailAddressList;
    }

    public void setEmailAddressList(List<EmailDto> emailAddressList) {
        this.emailAddressList = emailAddressList;
    }

    public List<PhoneDto> getTelecomNumberList() {
        return telecomNumberList;
    }

    public void setTelecomNumberList(List<PhoneDto> telecomNumberList) {
        this.telecomNumberList = telecomNumberList;
    }

    public List<AddressDto> getPostalAddressList() {
        return postalAddressList;
    }

    public void setPostalAddressList(List<AddressDto> postalAddressList) {
        this.postalAddressList = postalAddressList;
    }

    public List<Object> getPayments() {
        return payments;
    }

    public void setPayments(List<Object> payments) {
        this.payments = payments;
    }

    public List<NoteDto> getPartyNoteList() {
        return partyNoteList;
    }

    public void setPartyNoteList(List<NoteDto> partyNoteList) {
        this.partyNoteList = partyNoteList;
    }

    public List<PartyContentDto> getContentList() {
        return contentList;
    }

    public void setContentList(List<PartyContentDto> contentList) {
        this.contentList = contentList;
    }
}
