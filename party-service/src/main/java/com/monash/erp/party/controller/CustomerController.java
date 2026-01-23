package com.monash.erp.party.controller;

import com.monash.erp.party.dto.AddressDto;
import com.monash.erp.party.dto.AddressRequest;
import com.monash.erp.party.dto.CustomerCreateRequest;
import com.monash.erp.party.dto.CustomerDetailResponse;
import com.monash.erp.party.dto.CustomerListResponse;
import com.monash.erp.party.dto.CustomerSummary;
import com.monash.erp.party.dto.CustomerUpdateRequest;
import com.monash.erp.party.dto.EmailDto;
import com.monash.erp.party.dto.EmailRequest;
import com.monash.erp.party.dto.NoteDto;
import com.monash.erp.party.dto.NoteRequest;
import com.monash.erp.party.dto.PhoneDto;
import com.monash.erp.party.dto.PhoneRequest;
import com.monash.erp.party.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public CustomerListResponse listCustomers(@RequestParam(defaultValue = "0") int page,
                                              @RequestParam(defaultValue = "10") int pageSize,
                                              @RequestParam(defaultValue = "") String query) {
        return customerService.listCustomers(page, pageSize, query);
    }

    @PostMapping("/customers")
    public ResponseEntity<CustomerSummary> createCustomer(@RequestBody CustomerCreateRequest request) {
        CustomerSummary created = customerService.createCustomer(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping("/customers/{partyId}")
    public CustomerDetailResponse getCustomer(@PathVariable String partyId) {
        return customerService.getCustomer(partyId);
    }

    @PutMapping("/customers/{partyId}")
    public CustomerDetailResponse updateCustomer(@PathVariable String partyId, @RequestBody CustomerUpdateRequest request) {
        return customerService.updateCustomer(partyId, request);
    }

    @PostMapping("/parties/{partyId}/emails")
    public EmailDto addEmail(@PathVariable String partyId, @RequestBody EmailRequest request) {
        return customerService.addEmail(partyId, request.getEmailAddress(), request.getContactMechPurposeId());
    }

    @PutMapping("/parties/{partyId}/emails/{contactMechId}")
    public EmailDto updateEmail(@PathVariable String partyId,
                                @PathVariable String contactMechId,
                                @RequestBody EmailRequest request) {
        return customerService.updateEmail(partyId, contactMechId, request);
    }

    @DeleteMapping("/parties/{partyId}/emails/{contactMechId}")
    public ResponseEntity<Void> deleteEmail(@PathVariable String partyId, @PathVariable String contactMechId) {
        customerService.deleteEmail(partyId, contactMechId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/parties/{partyId}/telecom-numbers")
    public PhoneDto addPhone(@PathVariable String partyId, @RequestBody PhoneRequest request) {
        return customerService.addPhone(partyId,
                request.getContactNumber(),
                request.getCountryCode(),
                request.getAreaCode(),
                request.getContactMechPurposeId());
    }

    @PutMapping("/parties/{partyId}/telecom-numbers/{contactMechId}")
    public PhoneDto updatePhone(@PathVariable String partyId,
                                @PathVariable String contactMechId,
                                @RequestBody PhoneRequest request) {
        return customerService.updatePhone(partyId, contactMechId, request);
    }

    @DeleteMapping("/parties/{partyId}/telecom-numbers/{contactMechId}")
    public ResponseEntity<Void> deletePhone(@PathVariable String partyId, @PathVariable String contactMechId) {
        customerService.deletePhone(partyId, contactMechId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/parties/{partyId}/postal-addresses")
    public AddressDto addAddress(@PathVariable String partyId, @RequestBody AddressRequest request) {
        return customerService.addAddress(partyId, request);
    }

    @PutMapping("/parties/{partyId}/postal-addresses/{contactMechId}")
    public AddressDto updateAddress(@PathVariable String partyId,
                                    @PathVariable String contactMechId,
                                    @RequestBody AddressRequest request) {
        return customerService.updateAddress(partyId, contactMechId, request);
    }

    @DeleteMapping("/parties/{partyId}/postal-addresses/{contactMechId}")
    public ResponseEntity<Void> deleteAddress(@PathVariable String partyId, @PathVariable String contactMechId) {
        customerService.deleteAddress(partyId, contactMechId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/parties/{partyId}/notes")
    public NoteDto addNote(@PathVariable String partyId, @RequestBody NoteRequest request) {
        return customerService.addNote(partyId, request);
    }

    @PutMapping("/parties/{partyId}/notes/{noteId}")
    public NoteDto updateNote(@PathVariable String partyId, @PathVariable String noteId, @RequestBody NoteRequest request) {
        return customerService.updateNote(partyId, noteId, request);
    }

    @DeleteMapping("/parties/{partyId}/notes/{noteId}")
    public ResponseEntity<Void> deleteNote(@PathVariable String partyId, @PathVariable String noteId) {
        customerService.deleteNote(partyId, noteId);
        return ResponseEntity.noContent().build();
    }
}
