package com.monash.erp.party.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "person",
        indexes = {
                @Index(name = "idx_person_party_id", columnList = "party_id"),
                @Index(name = "idx_person_first_name", columnList = "first_name"),
                @Index(name = "idx_person_last_name", columnList = "last_name")
        }
)
@NoArgsConstructor
@Setter
@Getter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String partyId;
    private String salutation;
    private String firstName;
    private String middleName;
    private String lastName;
    private String personalTitle;
    private String suffix;
    private String nickname;
    private String firstNameLocal;
    private String middleNameLocal;
    private String lastNameLocal;
    private String otherLocal;
    private String memberId;
    private String gender;
    private LocalDateTime birthDate;
    private LocalDateTime deceasedDate;
    private String height;
    private String weight;
    private String mothersMaidenName;
    private String maritalStatus;
    private String socialSecurityNumber;
    private String passportNumber;
    private LocalDateTime passportExpireDate;
    private String totalYearsWorkExperience;
    private String comments;
    private String employmentStatusEnumId;
    private String residenceStatusEnumId;
    private String occupation;
    private String yearsWithEmployer;
    private String monthsWithEmployer;
    private String existingCustomer;
    private String cardId;
    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;
public void setId(Long id) {
        this.id = id;
    }
public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
public void setLastName(String lastName) {
        this.lastName = lastName;
    }
public void setPersonalTitle(String personalTitle) {
        this.personalTitle = personalTitle;
    }
public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
public void setNickname(String nickname) {
        this.nickname = nickname;
    }
public void setFirstNameLocal(String firstNameLocal) {
        this.firstNameLocal = firstNameLocal;
    }
public void setMiddleNameLocal(String middleNameLocal) {
        this.middleNameLocal = middleNameLocal;
    }
public void setLastNameLocal(String lastNameLocal) {
        this.lastNameLocal = lastNameLocal;
    }
public void setOtherLocal(String otherLocal) {
        this.otherLocal = otherLocal;
    }
public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
public void setGender(String gender) {
        this.gender = gender;
    }
public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }
public void setDeceasedDate(LocalDateTime deceasedDate) {
        this.deceasedDate = deceasedDate;
    }
public void setHeight(String height) {
        this.height = height;
    }
public void setWeight(String weight) {
        this.weight = weight;
    }
public void setMothersMaidenName(String mothersMaidenName) {
        this.mothersMaidenName = mothersMaidenName;
    }
public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
public void setPassportExpireDate(LocalDateTime passportExpireDate) {
        this.passportExpireDate = passportExpireDate;
    }
public void setTotalYearsWorkExperience(String totalYearsWorkExperience) {
        this.totalYearsWorkExperience = totalYearsWorkExperience;
    }
public void setComments(String comments) {
        this.comments = comments;
    }
public void setEmploymentStatusEnumId(String employmentStatusEnumId) {
        this.employmentStatusEnumId = employmentStatusEnumId;
    }
public void setResidenceStatusEnumId(String residenceStatusEnumId) {
        this.residenceStatusEnumId = residenceStatusEnumId;
    }
public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
public void setYearsWithEmployer(String yearsWithEmployer) {
        this.yearsWithEmployer = yearsWithEmployer;
    }
public void setMonthsWithEmployer(String monthsWithEmployer) {
        this.monthsWithEmployer = monthsWithEmployer;
    }
public void setExistingCustomer(String existingCustomer) {
        this.existingCustomer = existingCustomer;
    }
public void setCardId(String cardId) {
        this.cardId = cardId;
    }
public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }
public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

}
