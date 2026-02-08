package com.monash.erp.oms.party.dto;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
public class CustomerDetail {

    private CustomerProfile party;
    private List<RoleSummary> partyRoleList;
    private List<Object> pcaaList;
    private List<Object> partyIdentificationList;
    private List<EmailDto> emailAddressList;
    private List<PhoneDto> telecomNumberList;
    private List<AddressDto> postalAddressList;
    private List<Object> payments;
    private List<NoteDto> partyNoteList;
    private List<PartyContentDto> contentList;

    public CustomerDetail(CustomerProfile party,
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
        this.pcaaList = List.of();
        this.partyIdentificationList = List.of();
        this.payments = List.of();
        this.partyNoteList = partyNoteList;
        this.contentList = List.of();
    }
}
