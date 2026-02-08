package com.monash.erp.oms.party.service;

import com.monash.erp.oms.party.dto.AddressDto;
import com.monash.erp.oms.party.dto.AddressRequest;
import com.monash.erp.oms.party.dto.CustomerCreateRequest;
import com.monash.erp.oms.party.dto.CustomerDetail;
import com.monash.erp.oms.party.dto.CustomerDetailResponse;
import com.monash.erp.oms.party.dto.PartyContentDto;
import com.monash.erp.oms.party.dto.CustomerListResponse;
import com.monash.erp.oms.party.dto.CustomerProfile;
import com.monash.erp.oms.party.dto.CustomerSummary;
import com.monash.erp.oms.party.dto.CustomerUpdateRequest;
import com.monash.erp.oms.party.dto.EmailDto;
import com.monash.erp.oms.party.dto.EmailRequest;
import com.monash.erp.oms.party.dto.NoteDto;
import com.monash.erp.oms.party.dto.NoteRequest;
import com.monash.erp.oms.party.dto.PhoneDto;
import com.monash.erp.oms.party.dto.PhoneRequest;
import com.monash.erp.oms.party.dto.RoleSummary;
import com.monash.erp.oms.party.entity.ContactMech;
import com.monash.erp.oms.party.entity.Party;
import com.monash.erp.oms.party.entity.PartyContactMech;
import com.monash.erp.oms.party.entity.PartyContactMechPurpose;
import com.monash.erp.oms.party.entity.PartyNote;
import com.monash.erp.oms.party.entity.PartyRole;
import com.monash.erp.oms.party.entity.Person;
import com.monash.erp.oms.party.entity.PartyContentInfo;
import com.monash.erp.oms.party.entity.PostalAddress;
import com.monash.erp.oms.party.entity.TelecomNumber;
import com.monash.erp.oms.party.repository.ContactMechRepository;
import com.monash.erp.oms.party.repository.PartyContactMechPurposeRepository;
import com.monash.erp.oms.party.repository.PartyContactMechRepository;
import com.monash.erp.oms.party.repository.PartyNoteRepository;
import com.monash.erp.oms.party.repository.PartyRepository;
import com.monash.erp.oms.party.repository.PartyRoleRepository;
import com.monash.erp.oms.party.repository.PartyContentInfoRepository;
import com.monash.erp.oms.party.repository.PersonRepository;
import com.monash.erp.oms.party.repository.PostalAddressRepository;
import com.monash.erp.oms.party.repository.TelecomNumberRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private static final String DEFAULT_EMAIL_PURPOSE = "PRIMARY_EMAIL";
    private static final String DEFAULT_PHONE_PURPOSE = "PRIMARY_PHONE";
    private static final String DEFAULT_ADDRESS_PURPOSE = "PRIMARY_LOCATION";
    private static final String CONTACT_TYPE_EMAIL = "EMAIL_ADDRESS";
    private static final String CONTACT_TYPE_PHONE = "TELECOM_NUMBER";
    private static final String CONTACT_TYPE_ADDRESS = "POSTAL_ADDRESS";

    private final PartyRepository partyRepository;
    private final PersonRepository personRepository;
    private final ContactMechRepository contactMechRepository;
    private final PartyContactMechRepository partyContactMechRepository;
    private final PartyContactMechPurposeRepository partyContactMechPurposeRepository;
    private final TelecomNumberRepository telecomNumberRepository;
    private final PostalAddressRepository postalAddressRepository;
    private final PartyRoleRepository partyRoleRepository;
    private final PartyContentInfoRepository partyContentInfoRepository;
    private final PartyNoteRepository partyNoteRepository;
    private final com.monash.erp.oms.party.repository.PartyServicePaymentMethodRepository paymentMethodRepository;
    private final com.monash.erp.oms.party.repository.CreditCardRepository creditCardRepository;
    private final EncryptionService encryptionService;

    public CustomerService(PartyRepository partyRepository,
            PersonRepository personRepository,
            ContactMechRepository contactMechRepository,
            PartyContactMechRepository partyContactMechRepository,
            PartyContactMechPurposeRepository partyContactMechPurposeRepository,
            TelecomNumberRepository telecomNumberRepository,
            PostalAddressRepository postalAddressRepository,
            PartyRoleRepository partyRoleRepository,
            PartyContentInfoRepository partyContentInfoRepository,
            PartyNoteRepository partyNoteRepository,
            com.monash.erp.oms.party.repository.PartyServicePaymentMethodRepository paymentMethodRepository,
            com.monash.erp.oms.party.repository.CreditCardRepository creditCardRepository,
            EncryptionService encryptionService) {
        this.partyRepository = partyRepository;
        this.personRepository = personRepository;
        this.contactMechRepository = contactMechRepository;
        this.partyContactMechRepository = partyContactMechRepository;
        this.partyContactMechPurposeRepository = partyContactMechPurposeRepository;
        this.telecomNumberRepository = telecomNumberRepository;
        this.postalAddressRepository = postalAddressRepository;
        this.partyRoleRepository = partyRoleRepository;
        this.partyContentInfoRepository = partyContentInfoRepository;
        this.partyNoteRepository = partyNoteRepository;
        this.paymentMethodRepository = paymentMethodRepository;
        this.creditCardRepository = creditCardRepository;
        this.encryptionService = encryptionService;
    }

    public CustomerListResponse listCustomers(int page, int size, String query, String sortBy, String sortDirection) {
        String sortField = resolveSortField(sortBy);
        boolean requiresSummarySort = requiresSummarySort(sortField);
        Page<Person> people;
        if (requiresSummarySort) {
            PageRequest pageable = PageRequest.of(0, Integer.MAX_VALUE);
            if (StringUtils.hasText(query)) {
                people = personRepository.findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(query,
                        query, pageable);
            } else {
                people = personRepository.findAll(pageable);
            }
        } else {
            Sort sort = Sort.by(resolveDirection(sortDirection), sortField);
            PageRequest pageable = PageRequest.of(page, size, sort);
            if (StringUtils.hasText(query)) {
                people = personRepository.findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(query,
                        query, pageable);
            } else {
                people = personRepository.findAll(pageable);
            }
        }

        List<CustomerSummary> results = people.getContent().stream()
                .map(this::toSummary)
                .collect(Collectors.toList());

        if (requiresSummarySort) {
            results = sortSummaries(results, sortField, resolveDirection(sortDirection));
            long total = results.size();
            int fromIndex = Math.max(page, 0) * size;
            int toIndex = Math.min(fromIndex + size, results.size());
            List<CustomerSummary> pageSlice = fromIndex >= results.size()
                    ? List.of()
                    : results.subList(fromIndex, toIndex);
            return new CustomerListResponse(pageSlice, total);
        }

        return new CustomerListResponse(results, people.getTotalElements());
    }

    public CustomerDetailResponse getCustomer(String partyId) {
        Party party = partyRepository.findByPartyId(partyId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Party %s not found".formatted(partyId)));
        Person person = personRepository.findByPartyId(partyId).orElse(null);
        return new CustomerDetailResponse(toDetail(party, person));
    }

    @Transactional
    public CustomerSummary createCustomer(CustomerCreateRequest request) {
        Party party = new Party();
        party.setPartyTypeId("PERSON");
        party.setStatusId("PARTY_ENABLED");
        party.setCreatedDate(LocalDateTime.now());
        party = partyRepository.save(party);

        String partyId = String.valueOf(party.getId());
        party.setPartyId(partyId);
        party = partyRepository.save(party);

        Person person = new Person();
        person.setPartyId(partyId);
        person.setFirstName(request.getFirstName());
        person.setLastName(request.getLastName());
        personRepository.save(person);

        String roleTypeId = StringUtils.hasText(request.getRoleTypeId()) ? request.getRoleTypeId() : "Customer";
        PartyRole role = new PartyRole();
        role.setPartyId(partyId);
        role.setRoleTypeId(roleTypeId);
        partyRoleRepository.save(role);

        if (StringUtils.hasText(request.getEmailAddress())) {
            addEmail(partyId, request.getEmailAddress(), request.getEmailPurposeId());
        }
        if (StringUtils.hasText(request.getContactNumber())) {
            addPhone(partyId, request.getContactNumber(), request.getCountryCode(), request.getAreaCode(),
                    request.getPhonePurposeId());
        }
        if (StringUtils.hasText(request.getAddress1())) {
            AddressRequest addressRequest = new AddressRequest();
            addressRequest
                    .setToName(StringUtils.hasText(request.getToName()) ? request.getToName() : buildName(request));
            addressRequest.setAddress1(request.getAddress1());
            addressRequest.setAddress2(request.getAddress2());
            addressRequest.setCity(request.getCity());
            addressRequest.setPostalCode(request.getPostalCode());
            addressRequest.setCountryGeoId(request.getCountryGeoId());
            addressRequest.setStateProvinceGeoId(request.getStateProvinceGeoId());
            addressRequest.setContactMechPurposeId(request.getAddressPurposeId());
            addAddress(partyId, addressRequest);
        }

        return toSummary(person);
    }

    @Transactional
    public CustomerDetailResponse updateCustomer(String partyId, CustomerUpdateRequest request) {
        Person person = personRepository.findByPartyId(partyId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Person %s not found".formatted(partyId)));
        if (StringUtils.hasText(request.getFirstName())) {
            person.setFirstName(request.getFirstName());
        }
        if (StringUtils.hasText(request.getLastName())) {
            person.setLastName(request.getLastName());
        }
        personRepository.save(person);

        Party party = partyRepository.findByPartyId(partyId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Party %s not found".formatted(partyId)));
        party.setLastModifiedDate(LocalDateTime.now());
        partyRepository.save(party);

        return new CustomerDetailResponse(toDetail(party, person));
    }

    @Transactional
    public EmailDto addEmail(String partyId, String emailAddress, String purposeId) {
        ContactMech contactMech = createContactMech(CONTACT_TYPE_EMAIL, emailAddress);
        linkContactMech(partyId, contactMech.getContactMechId());
        upsertPurpose(partyId, contactMech.getContactMechId(), purposeId, DEFAULT_EMAIL_PURPOSE);
        return new EmailDto(contactMech.getContactMechId(), resolvePurpose(purposeId, DEFAULT_EMAIL_PURPOSE),
                emailAddress);
    }

    @Transactional
    public EmailDto updateEmail(String partyId, String contactMechId, EmailRequest request) {
        ContactMech contactMech = contactMechRepository.findByContactMechId(contactMechId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "ContactMech %s not found".formatted(contactMechId)));
        if (StringUtils.hasText(request.getEmailAddress())) {
            contactMech.setInfoString(request.getEmailAddress());
        }
        contactMechRepository.save(contactMech);
        upsertPurpose(partyId, contactMechId, request.getContactMechPurposeId(), DEFAULT_EMAIL_PURPOSE);
        return new EmailDto(contactMechId, resolvePurpose(request.getContactMechPurposeId(), DEFAULT_EMAIL_PURPOSE),
                contactMech.getInfoString());
    }

    @Transactional
    public void deleteEmail(String partyId, String contactMechId) {
        partyContactMechPurposeRepository.deleteByPartyIdAndContactMechId(partyId, contactMechId);
        partyContactMechRepository.deleteByPartyIdAndContactMechId(partyId, contactMechId);
        contactMechRepository.findByContactMechId(contactMechId).ifPresent(contactMechRepository::delete);
    }

    @Transactional
    public PhoneDto addPhone(String partyId,
            String contactNumber,
            String countryCode,
            String areaCode,
            String purposeId) {
        ContactMech contactMech = createContactMech(CONTACT_TYPE_PHONE, null);
        TelecomNumber telecomNumber = new TelecomNumber();
        telecomNumber.setContactMechId(contactMech.getContactMechId());
        telecomNumber.setContactNumber(contactNumber);
        telecomNumber.setCountryCode(countryCode);
        telecomNumber.setAreaCode(areaCode);
        telecomNumberRepository.save(telecomNumber);

        linkContactMech(partyId, contactMech.getContactMechId());
        upsertPurpose(partyId, contactMech.getContactMechId(), purposeId, DEFAULT_PHONE_PURPOSE);

        return new PhoneDto(contactMech.getContactMechId(),
                resolvePurpose(purposeId, DEFAULT_PHONE_PURPOSE),
                countryCode,
                areaCode,
                contactNumber);
    }

    @Transactional
    public PhoneDto updatePhone(String partyId, String contactMechId, PhoneRequest request) {
        TelecomNumber telecomNumber = telecomNumberRepository.findByContactMechId(contactMechId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "TelecomNumber %s not found".formatted(contactMechId)));
        if (StringUtils.hasText(request.getContactNumber())) {
            telecomNumber.setContactNumber(request.getContactNumber());
        }
        telecomNumber.setCountryCode(request.getCountryCode());
        telecomNumber.setAreaCode(request.getAreaCode());
        telecomNumberRepository.save(telecomNumber);
        upsertPurpose(partyId, contactMechId, request.getContactMechPurposeId(), DEFAULT_PHONE_PURPOSE);
        return new PhoneDto(contactMechId,
                resolvePurpose(request.getContactMechPurposeId(), DEFAULT_PHONE_PURPOSE),
                telecomNumber.getCountryCode(),
                telecomNumber.getAreaCode(),
                telecomNumber.getContactNumber());
    }

    @Transactional
    public void deletePhone(String partyId, String contactMechId) {
        partyContactMechPurposeRepository.deleteByPartyIdAndContactMechId(partyId, contactMechId);
        partyContactMechRepository.deleteByPartyIdAndContactMechId(partyId, contactMechId);
        telecomNumberRepository.deleteByContactMechId(contactMechId);
        contactMechRepository.findByContactMechId(contactMechId).ifPresent(contactMechRepository::delete);
    }

    @Transactional
    public AddressDto addAddress(String partyId, AddressRequest request) {
        ContactMech contactMech = createContactMech(CONTACT_TYPE_ADDRESS, null);
        PostalAddress address = new PostalAddress();
        address.setContactMechId(contactMech.getContactMechId());
        address.setToName(request.getToName());
        address.setAddress1(request.getAddress1());
        address.setAddress2(request.getAddress2());
        address.setCity(request.getCity());
        address.setPostalCode(request.getPostalCode());
        address.setCountryGeoId(request.getCountryGeoId());
        address.setStateProvinceGeoId(request.getStateProvinceGeoId());
        postalAddressRepository.save(address);

        linkContactMech(partyId, contactMech.getContactMechId());
        String purposeId = resolvePurpose(request.getContactMechPurposeId(), DEFAULT_ADDRESS_PURPOSE);
        expireAddressPurposes(partyId, purposeId);
        upsertPurpose(partyId, contactMech.getContactMechId(), purposeId, DEFAULT_ADDRESS_PURPOSE);

        return new AddressDto(contactMech.getContactMechId(),
                purposeId,
                address.getToName(),
                address.getAddress1(),
                address.getAddress2(),
                address.getCity(),
                address.getPostalCode(),
                address.getCountryGeoId(),
                address.getStateProvinceGeoId());
    }

    @Transactional
    public AddressDto updateAddress(String partyId, String contactMechId, AddressRequest request) {
        PostalAddress address = postalAddressRepository.findByContactMechId(contactMechId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "PostalAddress %s not found".formatted(contactMechId)));
        if (StringUtils.hasText(request.getToName())) {
            address.setToName(request.getToName());
        }
        if (StringUtils.hasText(request.getAddress1())) {
            address.setAddress1(request.getAddress1());
        }
        address.setAddress2(request.getAddress2());
        if (StringUtils.hasText(request.getCity())) {
            address.setCity(request.getCity());
        }
        address.setPostalCode(request.getPostalCode());
        address.setCountryGeoId(request.getCountryGeoId());
        address.setStateProvinceGeoId(request.getStateProvinceGeoId());
        postalAddressRepository.save(address);

        upsertPurpose(partyId, contactMechId, request.getContactMechPurposeId(), DEFAULT_ADDRESS_PURPOSE);

        return new AddressDto(contactMechId,
                resolvePurpose(request.getContactMechPurposeId(), DEFAULT_ADDRESS_PURPOSE),
                address.getToName(),
                address.getAddress1(),
                address.getAddress2(),
                address.getCity(),
                address.getPostalCode(),
                address.getCountryGeoId(),
                address.getStateProvinceGeoId());
    }

    @Transactional
    public void deleteAddress(String partyId, String contactMechId) {
        partyContactMechPurposeRepository.deleteByPartyIdAndContactMechId(partyId, contactMechId);
        partyContactMechRepository.deleteByPartyIdAndContactMechId(partyId, contactMechId);
        postalAddressRepository.deleteByContactMechId(contactMechId);
        contactMechRepository.findByContactMechId(contactMechId).ifPresent(contactMechRepository::delete);
    }

    private CustomerSummary toSummary(Person person) {
        String partyId = person.getPartyId();
        List<EmailDto> emails = resolveEmails(partyId);
        List<PhoneDto> phones = resolvePhones(partyId);

        String email = emails.stream()
                .filter(dto -> DEFAULT_EMAIL_PURPOSE.equals(dto.getContactMechPurposeId()))
                .map(EmailDto::getEmailAddress)
                .findFirst()
                .orElse(emails.stream().findFirst().map(EmailDto::getEmailAddress).orElse(null));

        String phone = phones.stream()
                .filter(dto -> DEFAULT_PHONE_PURPOSE.equals(dto.getContactMechPurposeId()))
                .map(PhoneDto::getContactNumber)
                .findFirst()
                .orElse(phones.stream().findFirst().map(PhoneDto::getContactNumber).orElse(null));

        return new CustomerSummary(partyId, person.getFirstName(), person.getLastName(), phone, email);
    }

    private String resolveSortField(String sortBy) {
        if (!StringUtils.hasText(sortBy)) {
            return "id";
        }
        return switch (sortBy) {
            case "partyId", "firstName", "lastName", "contactNumber", "emailAddress" -> sortBy;
            default -> "id";
        };
    }

    private boolean requiresSummarySort(String sortField) {
        return "contactNumber".equals(sortField) || "emailAddress".equals(sortField);
    }

    private Sort.Direction resolveDirection(String sortDirection) {
        return "asc".equalsIgnoreCase(sortDirection) ? Sort.Direction.ASC : Sort.Direction.DESC;
    }

    private List<CustomerSummary> sortSummaries(List<CustomerSummary> results, String sortField,
            Sort.Direction direction) {
        Comparator<CustomerSummary> comparator = switch (sortField) {
            case "partyId" ->
                Comparator.comparing(CustomerSummary::getPartyId, Comparator.nullsLast(String::compareToIgnoreCase));
            case "firstName" ->
                Comparator.comparing(CustomerSummary::getFirstName, Comparator.nullsLast(String::compareToIgnoreCase));
            case "lastName" ->
                Comparator.comparing(CustomerSummary::getLastName, Comparator.nullsLast(String::compareToIgnoreCase));
            case "contactNumber" -> Comparator.comparing(CustomerSummary::getContactNumber,
                    Comparator.nullsLast(String::compareToIgnoreCase));
            case "emailAddress" -> Comparator.comparing(CustomerSummary::getEmailAddress,
                    Comparator.nullsLast(String::compareToIgnoreCase));
            default ->
                Comparator.comparing(CustomerSummary::getPartyId, Comparator.nullsLast(String::compareToIgnoreCase));
        };
        if (direction == Sort.Direction.DESC) {
            comparator = comparator.reversed();
        }
        return results.stream().sorted(comparator).collect(Collectors.toList());
    }

    private CustomerDetail toDetail(Party party, Person person) {
        CustomerProfile profile = new CustomerProfile(
                party.getPartyId(),
                person != null ? person.getFirstName() : null,
                person != null ? person.getLastName() : null,
                party.getPartyTypeId(),
                party.getStatusId());

        List<RoleSummary> roles = partyRoleRepository.findByPartyId(party.getPartyId()).stream()
                .map(role -> new RoleSummary(role.getRoleTypeId(), role.getRoleTypeId()))
                .toList();

        List<EmailDto> emails = resolveEmails(party.getPartyId());
        List<PhoneDto> phones = resolvePhones(party.getPartyId());
        List<AddressDto> addresses = resolveAddresses(party.getPartyId());

        List<NoteDto> notes = partyNoteRepository.findByPartyId(party.getPartyId()).stream()
                .map(note -> new NoteDto(note.getNoteId(), note.getNoteText(), note.getNoteDate(), note.getCreatedBy()))
                .toList();

        CustomerDetail detail = new CustomerDetail(profile, roles, emails, phones, addresses, notes);

        detail.setContentList(resolveContents(party.getPartyId()));
        detail.setPayments(resolvePayments(party.getPartyId()));
        return detail;
    }

    private List<PartyContentDto> resolveContents(String partyId) {
        return partyContentInfoRepository.findByPartyId(partyId).stream()
                .map(this::toContentDto)
                .toList();
    }

    private PartyContentDto toContentDto(PartyContentInfo info) {
        PartyContentDto dto = new PartyContentDto();
        dto.setContentId(info.getContentId());
        dto.setDescription(info.getDescription());
        dto.setContentDate(info.getContentDate());
        dto.setContentLocation(info.getContentLocation());
        return dto;
    }

    @Transactional
    public NoteDto addNote(String partyId, NoteRequest request) {
        PartyNote note = new PartyNote();
        note.setPartyId(partyId);
        note.setNoteId("NOTE" + UUID.randomUUID().toString().replace("-", ""));
        note.setNoteText(request.getNoteText());
        note.setNoteDate(request.getNoteDate() != null ? request.getNoteDate() : LocalDateTime.now());
        note.setCreatedBy(request.getCreatedBy());
        PartyNote saved = partyNoteRepository.save(note);
        return new NoteDto(saved.getNoteId(), saved.getNoteText(), saved.getNoteDate(), saved.getCreatedBy());
    }

    @Transactional
    public NoteDto updateNote(String partyId, String noteId, NoteRequest request) {
        PartyNote note = partyNoteRepository.findByPartyId(partyId).stream()
                .filter(existing -> noteId.equals(existing.getNoteId()))
                .findFirst()
                .orElseThrow(
                        () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Note %s not found".formatted(noteId)));

        if (StringUtils.hasText(request.getNoteText())) {
            note.setNoteText(request.getNoteText());
        }
        if (request.getNoteDate() != null) {
            note.setNoteDate(request.getNoteDate());
        }
        if (StringUtils.hasText(request.getCreatedBy())) {
            note.setCreatedBy(request.getCreatedBy());
        }
        PartyNote saved = partyNoteRepository.save(note);
        return new NoteDto(saved.getNoteId(), saved.getNoteText(), saved.getNoteDate(), saved.getCreatedBy());
    }

    @Transactional
    public void deleteNote(String partyId, String noteId) {
        PartyNote note = partyNoteRepository.findByPartyId(partyId).stream()
                .filter(existing -> noteId.equals(existing.getNoteId()))
                .findFirst()
                .orElseThrow(
                        () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Note %s not found".formatted(noteId)));
        partyNoteRepository.delete(note);
    }

    private List<EmailDto> resolveEmails(String partyId) {
        List<String> contactMechIds = partyContactMechRepository.findByPartyId(partyId).stream()
                .map(PartyContactMech::getContactMechId)
                .toList();
        if (contactMechIds.isEmpty()) {
            return List.of();
        }
        Map<String, List<String>> purposes = loadPurposeMap(partyId);
        return contactMechRepository.findByContactMechIdIn(contactMechIds).stream()
                .filter(mech -> CONTACT_TYPE_EMAIL.equals(mech.getContactMechTypeId()))
                .flatMap(mech -> toPurposeEntries(mech.getContactMechId(), purposes, DEFAULT_EMAIL_PURPOSE).stream()
                        .map(purposeId -> new EmailDto(mech.getContactMechId(), purposeId, mech.getInfoString())))
                .collect(Collectors.toList());
    }

    private List<PhoneDto> resolvePhones(String partyId) {
        List<String> contactMechIds = partyContactMechRepository.findByPartyId(partyId).stream()
                .map(PartyContactMech::getContactMechId)
                .toList();
        if (contactMechIds.isEmpty()) {
            return List.of();
        }
        Map<String, List<String>> purposes = loadPurposeMap(partyId);
        Map<String, TelecomNumber> telecomMap = telecomNumberRepository.findByContactMechIdIn(contactMechIds).stream()
                .collect(Collectors.toMap(TelecomNumber::getContactMechId, telecom -> telecom));

        List<PhoneDto> results = new ArrayList<>();
        for (String contactMechId : contactMechIds) {
            TelecomNumber telecom = telecomMap.get(contactMechId);
            if (telecom == null) {
                continue;
            }
            for (String purposeId : toPurposeEntries(contactMechId, purposes, DEFAULT_PHONE_PURPOSE)) {
                results.add(new PhoneDto(contactMechId, purposeId, telecom.getCountryCode(), telecom.getAreaCode(),
                        telecom.getContactNumber()));
            }
        }
        return results;
    }

    private List<AddressDto> resolveAddresses(String partyId) {
        List<String> contactMechIds = partyContactMechRepository.findByPartyId(partyId).stream()
                .map(PartyContactMech::getContactMechId)
                .toList();
        if (contactMechIds.isEmpty()) {
            return List.of();
        }
        Map<String, List<String>> purposes = loadPurposeMap(partyId);
        Map<String, PostalAddress> addressMap = postalAddressRepository.findByContactMechIdIn(contactMechIds).stream()
                .collect(Collectors.toMap(PostalAddress::getContactMechId, address -> address));

        List<AddressDto> results = new ArrayList<>();
        for (String contactMechId : contactMechIds) {
            PostalAddress address = addressMap.get(contactMechId);
            if (address == null) {
                continue;
            }
            for (String purposeId : toPurposeEntries(contactMechId, purposes, DEFAULT_ADDRESS_PURPOSE)) {
                results.add(new AddressDto(contactMechId, purposeId, address.getToName(), address.getAddress1(),
                        address.getAddress2(), address.getCity(), address.getPostalCode(),
                        address.getCountryGeoId(), address.getStateProvinceGeoId()));
            }
        }
        return results;
    }

    private ContactMech createContactMech(String typeId, String infoString) {
        ContactMech contactMech = new ContactMech();
        contactMech.setContactMechTypeId(typeId);
        contactMech.setInfoString(infoString);
        ContactMech saved = contactMechRepository.save(contactMech);
        if (!StringUtils.hasText(saved.getContactMechId())) {
            saved.setContactMechId(String.valueOf(saved.getId()));
            saved = contactMechRepository.save(saved);
        }
        return saved;
    }

    private void linkContactMech(String partyId, String contactMechId) {
        if (partyContactMechRepository.findByPartyIdAndContactMechId(partyId, contactMechId).isPresent()) {
            return;
        }
        PartyContactMech link = new PartyContactMech();
        link.setPartyId(partyId);
        link.setContactMechId(contactMechId);
        link.setFromDate(LocalDateTime.now());
        partyContactMechRepository.save(link);
    }

    private void upsertPurpose(String partyId, String contactMechId, String requestedPurpose, String defaultPurpose) {
        String purposeId = resolvePurpose(requestedPurpose, defaultPurpose);
        List<PartyContactMechPurpose> purposes = partyContactMechPurposeRepository
                .findByPartyIdAndContactMechId(partyId, contactMechId);
        if (purposes.isEmpty()) {
            PartyContactMechPurpose purpose = new PartyContactMechPurpose();
            purpose.setPartyId(partyId);
            purpose.setContactMechId(contactMechId);
            purpose.setContactMechPurposeTypeId(purposeId);
            purpose.setFromDate(LocalDateTime.now());
            partyContactMechPurposeRepository.save(purpose);
            return;
        }
        PartyContactMechPurpose primary = purposes.get(0);
        primary.setContactMechPurposeTypeId(purposeId);
        partyContactMechPurposeRepository.save(primary);
    }

    private Map<String, List<String>> loadPurposeMap(String partyId) {
        Map<String, List<String>> map = new HashMap<>();
        LocalDateTime now = LocalDateTime.now();
        for (PartyContactMechPurpose purpose : partyContactMechPurposeRepository.findByPartyId(partyId)) {
            LocalDateTime thruDate = purpose.getThruDate();
            if (thruDate != null && !thruDate.isAfter(now)) {
                continue;
            }
            map.computeIfAbsent(purpose.getContactMechId(), ignored -> new ArrayList<>())
                    .add(purpose.getContactMechPurposeTypeId());
        }
        return map;
    }

    private void expireAddressPurposes(String partyId, String purposeId) {
        if (!StringUtils.hasText(purposeId)) {
            return;
        }
        List<PartyContactMechPurpose> purposes = partyContactMechPurposeRepository
                .findByPartyIdAndContactMechPurposeTypeIdAndThruDateIsNull(partyId, purposeId);
        if (purposes.isEmpty()) {
            return;
        }
        LocalDateTime now = LocalDateTime.now();
        for (PartyContactMechPurpose purpose : purposes) {
            purpose.setThruDate(now);
        }
        partyContactMechPurposeRepository.saveAll(purposes);
    }

    private List<String> toPurposeEntries(String contactMechId, Map<String, List<String>> purposes, String fallback) {
        List<String> purposeList = purposes.get(contactMechId);
        if (purposeList == null || purposeList.isEmpty()) {
            return List.of(fallback);
        }
        return purposeList;
    }

    private String resolvePurpose(String requested, String fallback) {
        return StringUtils.hasText(requested) ? requested : fallback;
    }

    private String buildName(CustomerCreateRequest request) {
        String firstName = Optional.ofNullable(request.getFirstName()).orElse("");
        String lastName = Optional.ofNullable(request.getLastName()).orElse("");
        return (firstName + " " + lastName).trim();
    }

    private List<Object> resolvePayments(String partyId) {
        List<Object> payments = new ArrayList<>();
        List<com.monash.erp.oms.party.entity.PaymentMethod> methods = paymentMethodRepository.findByPartyId(partyId);

        for (com.monash.erp.oms.party.entity.PaymentMethod pm : methods) {
            Map<String, Object> paymentData = new HashMap<>();

            // Map PaymentMethod
            Map<String, Object> pmMap = new HashMap<>();
            pmMap.put("paymentMethodId", pm.getPaymentMethodId());
            pmMap.put("paymentMethodTypeEnumId", pm.getPaymentMethodTypeId()); // e.g. "PmtCreditCard" or "CREDIT_CARD"
            pmMap.put("description", pm.getDescription());
            paymentData.put("paymentMethod", pmMap);

            if ("CREDIT_CARD".equals(pm.getPaymentMethodTypeId())
                    || "PmtCreditCard".equals(pm.getPaymentMethodTypeId())) {
                creditCardRepository.findById(pm.getPaymentMethodId()).ifPresent(cc -> {
                    Map<String, Object> ccMap = new HashMap<>();
                    ccMap.put("cardType", cc.getCardType());

                    String decryptedNumber = cc.getCardNumber();
                    try {
                        decryptedNumber = encryptionService.decrypt(cc.getCardNumber());
                    } catch (Exception e) {
                        // ignore
                        decryptedNumber = cc.getCardNumber();
                    }

                    // Mask the card number (Show only last 4 strings)
                    if (StringUtils.hasText(decryptedNumber) && decryptedNumber.length() > 4) {
                        String last4 = decryptedNumber.substring(decryptedNumber.length() - 4);
                        ccMap.put("cardNumber", "**** **** **** " + last4);
                    } else {
                        ccMap.put("cardNumber", decryptedNumber);
                    }
                    ccMap.put("validFromDate", cc.getValidFromDate());
                    ccMap.put("expireDate", cc.getExpireDate());
                    ccMap.put("firstNameOnCard", cc.getFirstNameOnCard());
                    ccMap.put("lastNameOnCard", cc.getLastNameOnCard());
                    paymentData.put("creditCard", ccMap);

                    // Mock Enum object for display
                    Map<String, String> enumMap = new HashMap<>();
                    enumMap.put("description", cc.getCardType());
                    paymentData.put("creditCardTypeEnum", enumMap);

                    // Postal Address
                    if (StringUtils.hasText(cc.getContactMechId())) {
                        postalAddressRepository.findByContactMechId(cc.getContactMechId()).ifPresent(pa -> {
                            Map<String, Object> paMap = new HashMap<>();
                            paMap.put("toName", pa.getToName());
                            paMap.put("address1", pa.getAddress1());
                            paMap.put("address2", pa.getAddress2());
                            paMap.put("city", pa.getCity());
                            paMap.put("postalCode", pa.getPostalCode());
                            paMap.put("countryGeoId", pa.getCountryGeoId());
                            paMap.put("stateProvinceGeoId", pa.getStateProvinceGeoId());
                            paymentData.put("postalAddress", paMap);
                        });
                    }
                });
            }
            payments.add(paymentData);
        }
        return payments;
    }
}
