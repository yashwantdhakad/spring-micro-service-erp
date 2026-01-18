package com.monash.erp.party.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
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
    private String maritalStatusEnumId;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalTitle() {
        return personalTitle;
    }

    public void setPersonalTitle(String personalTitle) {
        this.personalTitle = personalTitle;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFirstNameLocal() {
        return firstNameLocal;
    }

    public void setFirstNameLocal(String firstNameLocal) {
        this.firstNameLocal = firstNameLocal;
    }

    public String getMiddleNameLocal() {
        return middleNameLocal;
    }

    public void setMiddleNameLocal(String middleNameLocal) {
        this.middleNameLocal = middleNameLocal;
    }

    public String getLastNameLocal() {
        return lastNameLocal;
    }

    public void setLastNameLocal(String lastNameLocal) {
        this.lastNameLocal = lastNameLocal;
    }

    public String getOtherLocal() {
        return otherLocal;
    }

    public void setOtherLocal(String otherLocal) {
        this.otherLocal = otherLocal;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDateTime getDeceasedDate() {
        return deceasedDate;
    }

    public void setDeceasedDate(LocalDateTime deceasedDate) {
        this.deceasedDate = deceasedDate;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getMothersMaidenName() {
        return mothersMaidenName;
    }

    public void setMothersMaidenName(String mothersMaidenName) {
        this.mothersMaidenName = mothersMaidenName;
    }

    public String getMaritalStatusEnumId() {
        return maritalStatusEnumId;
    }

    public void setMaritalStatusEnumId(String maritalStatusEnumId) {
        this.maritalStatusEnumId = maritalStatusEnumId;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDateTime getPassportExpireDate() {
        return passportExpireDate;
    }

    public void setPassportExpireDate(LocalDateTime passportExpireDate) {
        this.passportExpireDate = passportExpireDate;
    }

    public String getTotalYearsWorkExperience() {
        return totalYearsWorkExperience;
    }

    public void setTotalYearsWorkExperience(String totalYearsWorkExperience) {
        this.totalYearsWorkExperience = totalYearsWorkExperience;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getEmploymentStatusEnumId() {
        return employmentStatusEnumId;
    }

    public void setEmploymentStatusEnumId(String employmentStatusEnumId) {
        this.employmentStatusEnumId = employmentStatusEnumId;
    }

    public String getResidenceStatusEnumId() {
        return residenceStatusEnumId;
    }

    public void setResidenceStatusEnumId(String residenceStatusEnumId) {
        this.residenceStatusEnumId = residenceStatusEnumId;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getYearsWithEmployer() {
        return yearsWithEmployer;
    }

    public void setYearsWithEmployer(String yearsWithEmployer) {
        this.yearsWithEmployer = yearsWithEmployer;
    }

    public String getMonthsWithEmployer() {
        return monthsWithEmployer;
    }

    public void setMonthsWithEmployer(String monthsWithEmployer) {
        this.monthsWithEmployer = monthsWithEmployer;
    }

    public String getExistingCustomer() {
        return existingCustomer;
    }

    public void setExistingCustomer(String existingCustomer) {
        this.existingCustomer = existingCustomer;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

}