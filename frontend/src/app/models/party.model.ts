export interface Party {
    partyId: string;
    statusId?: string;
    externalId?: string;
    preferredCurrencyUomId?: string;
    description?: string;
    createdDate?: string;
    createdByUserLogin?: string;
    lastModifiedDate?: string;
    lastModifiedByUserLogin?: string;
    firstName?: string;
    lastName?: string;
    groupName?: string;
}

export interface PartyRole {
    partyId: string;
    roleTypeId: string;
    description?: string;
    roleTypeDescription?: string;
}

export interface ContactMech {
    contactMechId: string;
    contactMechPurposeId: string;
    fromDate?: string;
    toDate?: string;
}

export interface PostalAddress extends ContactMech {
    toName?: string;
    address1?: string;
    address2?: string;
    city?: string;
    postalCode?: string;
    countryGeoId?: string;
    stateProvinceGeoId?: string;
    geoName?: string; // State name often separate
}

export interface TelecomNumber extends ContactMech {
    countryCode?: string;
    areaCode?: string;
    contactNumber?: string;
}

export interface EmailAddress extends ContactMech {
    emailAddress?: string;
}

export interface PartyIdentification {
    partyId: string;
    partyIdentificationTypeId: string;
    idValue: string;
    description?: string; // Added description
}

export interface PartyClassification {
    partyId: string;
    partyClassificationGroupId: string;
    fromDate?: string;
    toDate?: string;
    typeDescription?: string; // Added typeDescription
    classDescription?: string; // Added classDescription
}

export interface PartyNote {
    noteId: string;
    partyId: string;
    noteName?: string;
    noteText?: string;
    noteDate?: string;
    userId?: string;
    createdBy?: string;
}

export interface PartyContent {
    contentId: string;
    partyId: string;
    contentName?: string;
    description?: string;
    contentDate?: string;
    contentLocation?: string;
}
