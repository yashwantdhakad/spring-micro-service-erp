package com.monash.erp.party.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ResponseStatusException;

import com.monash.erp.party.dto.AddressDto;
import com.monash.erp.party.dto.AddressRequest;
import com.monash.erp.party.dto.EmailDto;
import com.monash.erp.party.dto.EmailRequest;
import com.monash.erp.party.dto.NoteDto;
import com.monash.erp.party.dto.NoteRequest;
import com.monash.erp.party.dto.PartyContentDto;
import com.monash.erp.party.dto.PhoneDto;
import com.monash.erp.party.dto.PhoneRequest;
import com.monash.erp.party.dto.RoleSummary;
import com.monash.erp.party.dto.SupplierCreateRequest;
import com.monash.erp.party.dto.SupplierDetail;
import com.monash.erp.party.dto.SupplierDetailResponse;
import com.monash.erp.party.dto.SupplierListResponse;
import com.monash.erp.party.dto.SupplierProfile;
import com.monash.erp.party.dto.SupplierSummary;
import com.monash.erp.party.dto.SupplierUpdateRequest;
import com.monash.erp.party.entity.ContactMech;
import com.monash.erp.party.entity.Party;
import com.monash.erp.party.entity.PartyContactMech;
import com.monash.erp.party.entity.PartyContactMechPurpose;
import com.monash.erp.party.entity.PartyGroup;
import com.monash.erp.party.entity.PartyNote;
import com.monash.erp.party.entity.PartyRole;
import com.monash.erp.party.entity.PartyContentInfo;
import com.monash.erp.party.entity.PostalAddress;
import com.monash.erp.party.entity.TelecomNumber;
import com.monash.erp.party.repository.ContactMechRepository;
import com.monash.erp.party.repository.PartyContactMechPurposeRepository;
import com.monash.erp.party.repository.PartyContactMechRepository;
import com.monash.erp.party.repository.PartyGroupRepository;
import com.monash.erp.party.repository.PartyNoteRepository;
import com.monash.erp.party.repository.PartyRepository;
import com.monash.erp.party.repository.PartyRoleRepository;
import com.monash.erp.party.repository.PartyContentInfoRepository;
import com.monash.erp.party.repository.PostalAddressRepository;
import com.monash.erp.party.repository.TelecomNumberRepository;

@Service
public class SupplierService {

    private static final String DEFAULT_EMAIL_PURPOSE = "PRIMARY_EMAIL";
    private static final String DEFAULT_PHONE_PURPOSE = "PRIMARY_PHONE";
    private static final String DEFAULT_ADDRESS_PURPOSE = "PRIMARY_LOCATION";
    private static final String CONTACT_TYPE_EMAIL = "EMAIL_ADDRESS";
    private static final String CONTACT_TYPE_PHONE = "TELECOM_NUMBER";
    private static final String CONTACT_TYPE_ADDRESS = "POSTAL_ADDRESS";
    private static final String DEFAULT_ROLE = "SUPPLIER";

    private final PartyRepository partyRepository;
    private final PartyGroupRepository partyGroupRepository;
    private final ContactMechRepository contactMechRepository;
    private final PartyContactMechRepository partyContactMechRepository;
    private final PartyContactMechPurposeRepository partyContactMechPurposeRepository;
    private final TelecomNumberRepository telecomNumberRepository;
    private final PostalAddressRepository postalAddressRepository;
    private final PartyRoleRepository partyRoleRepository;
    private final PartyNoteRepository partyNoteRepository;
    private final PartyContentInfoRepository partyContentInfoRepository;

    public SupplierService(PartyRepository partyRepository,
                           PartyGroupRepository partyGroupRepository,
                           ContactMechRepository contactMechRepository,
                           PartyContactMechRepository partyContactMechRepository,
                           PartyContactMechPurposeRepository partyContactMechPurposeRepository,
                           TelecomNumberRepository telecomNumberRepository,
                           PostalAddressRepository postalAddressRepository,
                           PartyRoleRepository partyRoleRepository,
                           PartyNoteRepository partyNoteRepository,
                           PartyContentInfoRepository partyContentInfoRepository) {
        this.partyRepository = partyRepository;
        this.partyGroupRepository = partyGroupRepository;
        this.contactMechRepository = contactMechRepository;
        this.partyContactMechRepository = partyContactMechRepository;
        this.partyContactMechPurposeRepository = partyContactMechPurposeRepository;
        this.telecomNumberRepository = telecomNumberRepository;
        this.postalAddressRepository = postalAddressRepository;
        this.partyRoleRepository = partyRoleRepository;
        this.partyNoteRepository = partyNoteRepository;
        this.partyContentInfoRepository = partyContentInfoRepository;
    }

    public SupplierListResponse listSuppliers(int page, int size, String query, String sortBy, String sortDirection) {
        String sortField = resolveSortField(sortBy);
        boolean requiresSummarySort = requiresSummarySort(sortField);
        Page<PartyGroup> groups;
        if (requiresSummarySort) {
            PageRequest pageable = PageRequest.of(0, Integer.MAX_VALUE);
            if (StringUtils.hasText(query)) {
                groups = partyGroupRepository.findByGroupNameContainingIgnoreCase(query, pageable);
            } else {
                groups = partyGroupRepository.findAll(pageable);
            }
        } else {
            Sort sort = Sort.by(resolveDirection(sortDirection), sortField);
            PageRequest pageable = PageRequest.of(page, size, sort);
            if (StringUtils.hasText(query)) {
                groups = partyGroupRepository.findByGroupNameContainingIgnoreCase(query, pageable);
            } else {
                groups = partyGroupRepository.findAll(pageable);
            }
        }

        List<SupplierSummary> results = groups.getContent().stream()
                .map(this::toSummary)
                .collect(Collectors.toList());

        if (requiresSummarySort) {
            results = sortSummaries(results, sortField, resolveDirection(sortDirection));
            long total = results.size();
            int fromIndex = Math.max(page, 0) * size;
            int toIndex = Math.min(fromIndex + size, results.size());
            List<SupplierSummary> pageSlice = fromIndex >= results.size()
                    ? List.of()
                    : results.subList(fromIndex, toIndex);
            return new SupplierListResponse(pageSlice, total);
        }

        return new SupplierListResponse(results, groups.getTotalElements());
    }

    public SupplierDetailResponse getSupplier(String partyId) {
        Party party = partyRepository.findByPartyId(partyId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Party %s not found".formatted(partyId)));
        PartyGroup group = partyGroupRepository.findByPartyId(partyId).orElse(null);
        return new SupplierDetailResponse(toDetail(party, group));
    }

    @Transactional
    public SupplierSummary createSupplier(SupplierCreateRequest request) {
        Party party = new Party();
        party.setPartyTypeId("PARTY_GROUP");
        party.setStatusId("PARTY_ENABLED");
        party.setCreatedDate(LocalDateTime.now());
        party = partyRepository.save(party);

        String partyId = String.valueOf(party.getId());
        party.setPartyId(partyId);
        party = partyRepository.save(party);

        PartyGroup group = new PartyGroup();
        group.setPartyId(partyId);
        group.setGroupName(request.getGroupName());
        partyGroupRepository.save(group);

        String roleTypeId = StringUtils.hasText(request.getRoleTypeId()) ? request.getRoleTypeId() : DEFAULT_ROLE;
        PartyRole role = new PartyRole();
        role.setPartyId(partyId);
        role.setRoleTypeId(roleTypeId);
        partyRoleRepository.save(role);

        if (StringUtils.hasText(request.getEmailAddress())) {
            addEmail(partyId, request.getEmailAddress(), request.getEmailPurposeId());
        }
        if (StringUtils.hasText(request.getContactNumber())) {
            addPhone(partyId, request.getContactNumber(), request.getCountryCode(), request.getAreaCode(), request.getPhonePurposeId());
        }
        if (StringUtils.hasText(request.getAddress1())) {
            AddressRequest addressRequest = new AddressRequest();
            addressRequest.setToName(StringUtils.hasText(request.getToName()) ? request.getToName() : request.getGroupName());
            addressRequest.setAddress1(request.getAddress1());
            addressRequest.setAddress2(request.getAddress2());
            addressRequest.setCity(request.getCity());
            addressRequest.setPostalCode(request.getPostalCode());
            addressRequest.setCountryGeoId(request.getCountryGeoId());
            addressRequest.setStateProvinceGeoId(request.getStateProvinceGeoId());
            addressRequest.setContactMechPurposeId(request.getAddressPurposeId());
            addAddress(partyId, addressRequest);
        }

        return toSummary(group);
    }

    @Transactional
    public SupplierDetailResponse updateSupplier(String partyId, SupplierUpdateRequest request) {
        PartyGroup group = partyGroupRepository.findByPartyId(partyId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PartyGroup %s not found".formatted(partyId)));
        if (StringUtils.hasText(request.getGroupName())) {
            group.setGroupName(request.getGroupName());
        }
        partyGroupRepository.save(group);

        Party party = partyRepository.findByPartyId(partyId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Party %s not found".formatted(partyId)));
        party.setLastModifiedDate(LocalDateTime.now());
        partyRepository.save(party);

        return new SupplierDetailResponse(toDetail(party, group));
    }

    @Transactional
    public EmailDto addEmail(String partyId, String emailAddress, String purposeId) {
        ContactMech contactMech = createContactMech(CONTACT_TYPE_EMAIL, emailAddress);
        linkContactMech(partyId, contactMech.getContactMechId());
        upsertPurpose(partyId, contactMech.getContactMechId(), purposeId, DEFAULT_EMAIL_PURPOSE);
        return new EmailDto(contactMech.getContactMechId(), resolvePurpose(purposeId, DEFAULT_EMAIL_PURPOSE), emailAddress);
    }

    @Transactional
    public EmailDto updateEmail(String partyId, String contactMechId, EmailRequest request) {
        ContactMech contactMech = contactMechRepository.findByContactMechId(contactMechId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ContactMech %s not found".formatted(contactMechId)));
        if (StringUtils.hasText(request.getEmailAddress())) {
            contactMech.setInfoString(request.getEmailAddress());
        }
        contactMechRepository.save(contactMech);
        upsertPurpose(partyId, contactMechId, request.getContactMechPurposeId(), DEFAULT_EMAIL_PURPOSE);
        return new EmailDto(contactMechId, resolvePurpose(request.getContactMechPurposeId(), DEFAULT_EMAIL_PURPOSE), contactMech.getInfoString());
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
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "TelecomNumber %s not found".formatted(contactMechId)));
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
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PostalAddress %s not found".formatted(contactMechId)));
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
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Note %s not found".formatted(noteId)));

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
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Note %s not found".formatted(noteId)));
        partyNoteRepository.delete(note);
    }

    private SupplierSummary toSummary(PartyGroup group) {
        String partyId = group.getPartyId();
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

        return new SupplierSummary(partyId, group.getGroupName(), phone, email);
    }

    private String resolveSortField(String sortBy) {
        if (!StringUtils.hasText(sortBy)) {
            return "id";
        }
        return switch (sortBy) {
            case "partyId", "groupName", "contactNumber", "emailAddress" -> sortBy;
            default -> "id";
        };
    }

    private boolean requiresSummarySort(String sortField) {
        return "contactNumber".equals(sortField) || "emailAddress".equals(sortField);
    }

    private Sort.Direction resolveDirection(String sortDirection) {
        return "asc".equalsIgnoreCase(sortDirection) ? Sort.Direction.ASC : Sort.Direction.DESC;
    }

    private List<SupplierSummary> sortSummaries(List<SupplierSummary> results, String sortField, Sort.Direction direction) {
        Comparator<SupplierSummary> comparator = switch (sortField) {
            case "partyId" -> Comparator.comparing(SupplierSummary::getPartyId, Comparator.nullsLast(String::compareToIgnoreCase));
            case "groupName" -> Comparator.comparing(SupplierSummary::getGroupName, Comparator.nullsLast(String::compareToIgnoreCase));
            case "contactNumber" -> Comparator.comparing(SupplierSummary::getContactNumber, Comparator.nullsLast(String::compareToIgnoreCase));
            case "emailAddress" -> Comparator.comparing(SupplierSummary::getEmailAddress, Comparator.nullsLast(String::compareToIgnoreCase));
            default -> Comparator.comparing(SupplierSummary::getPartyId, Comparator.nullsLast(String::compareToIgnoreCase));
        };
        if (direction == Sort.Direction.DESC) {
            comparator = comparator.reversed();
        }
        return results.stream().sorted(comparator).collect(Collectors.toList());
    }

    private SupplierDetail toDetail(Party party, PartyGroup group) {
        SupplierProfile profile = new SupplierProfile(
                party.getPartyId(),
                group != null ? group.getGroupName() : null,
                party.getPartyTypeId(),
                party.getStatusId()
        );

        List<RoleSummary> roles = partyRoleRepository.findByPartyId(party.getPartyId()).stream()
                .map(role -> new RoleSummary(role.getRoleTypeId(), role.getRoleTypeId()))
                .toList();

        List<EmailDto> emails = resolveEmails(party.getPartyId());
        List<PhoneDto> phones = resolvePhones(party.getPartyId());
        List<AddressDto> addresses = resolveAddresses(party.getPartyId());
        List<NoteDto> notes = partyNoteRepository.findByPartyId(party.getPartyId()).stream()
                .map(note -> new NoteDto(note.getNoteId(), note.getNoteText(), note.getNoteDate(), note.getCreatedBy()))
                .toList();

        SupplierDetail detail = new SupplierDetail(profile, roles, emails, phones, addresses, notes);
        detail.setContentList(resolveContents(party.getPartyId()));
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
                results.add(new PhoneDto(contactMechId, purposeId, telecom.getCountryCode(), telecom.getAreaCode(), telecom.getContactNumber()));
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
}
