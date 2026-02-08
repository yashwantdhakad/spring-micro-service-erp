package com.monash.erp.party.service;

import com.monash.erp.party.dto.CreditCardDTO;
import com.monash.erp.party.dto.PartyDto;
import com.monash.erp.party.entity.*;
import com.monash.erp.party.mapper.PartyMapper;
import com.monash.erp.party.repository.*;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.Objects;

@Service
public class PartyService {

    private final PartyRepository repository;
    private final PartyMapper mapper;
    private final PaymentMethodRepository paymentMethodRepository;
    private final CreditCardRepository creditCardRepository;
    private final ContactMechRepository contactMechRepository;
    private final PostalAddressRepository postalAddressRepository;
    private final PartyContactMechRepository partyContactMechRepository;
    private final PartyContactMechPurposeRepository partyContactMechPurposeRepository;
    private final EncryptionService encryptionService;

    public PartyService(PartyRepository repository,
            PartyMapper mapper,
            PaymentMethodRepository paymentMethodRepository,
            CreditCardRepository creditCardRepository,
            ContactMechRepository contactMechRepository,
            PostalAddressRepository postalAddressRepository,
            PartyContactMechRepository partyContactMechRepository,
            PartyContactMechPurposeRepository partyContactMechPurposeRepository,
            EncryptionService encryptionService) {
        this.repository = repository;
        this.mapper = mapper;
        this.paymentMethodRepository = paymentMethodRepository;
        this.creditCardRepository = creditCardRepository;
        this.contactMechRepository = contactMechRepository;
        this.postalAddressRepository = postalAddressRepository;
        this.partyContactMechRepository = partyContactMechRepository;
        this.partyContactMechPurposeRepository = partyContactMechPurposeRepository;
        this.encryptionService = encryptionService;
    }

    public List<PartyDto> list() {
        return repository.findAll().stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    public PartyDto get(Long id) {
        Party entity = repository.findById(id)
                .orElseThrow(
                        () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Party %d not found".formatted(id)));
        PartyDto dto = mapper.toDTO(entity);
        dto.setCreditCards(getCreditCards(entity.getPartyId()));
        dto.setPostalAddressList(getPostalAddresses(entity.getPartyId()));
        return dto;
    }

    @Transactional
    public PartyDto create(PartyDto dto) {
        Party entity = mapper.toEntity(dto);
        entity.setId(null);
        return mapper.toDTO(repository.save(entity));
    }

    @Transactional
    public PartyDto update(Long id, PartyDto dto) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Party %d not found".formatted(id));
        }
        Party entity = mapper.toEntity(dto);
        entity.setId(id);
        return mapper.toDTO(repository.save(entity));
    }

    @Transactional
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Party %d not found".formatted(id));
        }
        repository.deleteById(id);
    }

    @Transactional
    public void createCreditCard(String partyId, CreditCardDTO dto) {
        String roleTypeId = dto.getRoleTypeId() != null && !dto.getRoleTypeId().isBlank()
                ? dto.getRoleTypeId()
                : "CUSTOMER";
        // 1. Create PaymentMethod
        String paymentMethodId = generateId();
        LocalDateTime now = LocalDateTime.now();

        PaymentMethod pm = new PaymentMethod();
        pm.setPaymentMethodId(paymentMethodId);
        pm.setPaymentMethodTypeId("CREDIT_CARD");
        pm.setPartyId(partyId);
        pm.setFromDate(now);
        pm.setCreatedStamp(now);
        pm.setCreatedTxStamp(now);
        pm.setLastUpdatedStamp(now);
        pm.setLastUpdatedTxStamp(now);
        paymentMethodRepository.save(pm);

        // 2. Handle Address (ContactMech)
        String contactMechId = dto.getPostalAddressId();

        if (contactMechId == null || contactMechId.isEmpty()) {
            // Create new address
            contactMechId = generateId();

            // ContactMech
            ContactMech cm = new ContactMech();
            cm.setContactMechId(contactMechId);
            cm.setContactMechTypeId("POSTAL_ADDRESS");
            cm.setCreatedStamp(now);
            cm.setCreatedTxStamp(now);
            cm.setLastUpdatedStamp(now);
            cm.setLastUpdatedTxStamp(now);
            contactMechRepository.save(cm);

            // PostalAddress
            PostalAddress pa = new PostalAddress();
            pa.setContactMechId(contactMechId);
            pa.setAddress1(dto.getAddress1());
            pa.setAddress2(dto.getAddress2());
            pa.setCity(dto.getCity());
            pa.setPostalCode(dto.getPostalCode());
            pa.setCountryGeoId(dto.getCountryGeoId());
            pa.setStateProvinceGeoId(dto.getStateProvinceGeoId());
            pa.setToName(dto.getFirstNameOnCard() + " " + dto.getLastNameOnCard());
            pa.setCreatedStamp(now);
            pa.setCreatedTxStamp(now);
            pa.setLastUpdatedStamp(now);
            pa.setLastUpdatedTxStamp(now);
            postalAddressRepository.save(pa);
        }

        ensurePartyContactMechAndPurpose(partyId, contactMechId, roleTypeId, now);

        // 3. Create CreditCard
        CreditCard cc = new CreditCard();
        cc.setPaymentMethodId(paymentMethodId);
        cc.setCardType(dto.getCardType());
        cc.setCardNumber(encryptionService.encrypt(dto.getCardNumber())); // Encrypt!
        cc.setValidFromDate(dto.getValidFromDate());
        cc.setExpireDate(dto.getExpireDate());
        cc.setFirstNameOnCard(dto.getFirstNameOnCard());
        cc.setMiddleNameOnCard(dto.getMiddleNameOnCard());
        cc.setLastNameOnCard(dto.getLastNameOnCard());
        cc.setContactMechId(contactMechId);
        cc.setCreatedStamp(now);
        cc.setCreatedTxStamp(now);
        cc.setLastUpdatedStamp(now);
        cc.setLastUpdatedTxStamp(now);
        creditCardRepository.save(cc);
    }

    private void ensurePartyContactMechAndPurpose(
            String partyId,
            String contactMechId,
            String roleTypeId,
            LocalDateTime now) {
        boolean hasContactMech = partyContactMechRepository
                .findByPartyIdAndContactMechId(partyId, contactMechId)
                .isPresent();
        if (!hasContactMech) {
            PartyContactMech pcm = new PartyContactMech();
            pcm.setPartyId(partyId);
            pcm.setContactMechId(contactMechId);
            pcm.setFromDate(now);
            pcm.setRoleTypeId(roleTypeId);
            pcm.setCreatedStamp(now);
            pcm.setCreatedTxStamp(now);
            pcm.setLastUpdatedStamp(now);
            pcm.setLastUpdatedTxStamp(now);
            partyContactMechRepository.save(pcm);
        }

        boolean hasBillingPurpose = partyContactMechPurposeRepository
                .findByPartyIdAndContactMechId(partyId, contactMechId)
                .stream()
                .anyMatch(purpose -> "BILLING_LOCATION".equals(purpose.getContactMechPurposeTypeId())
                        && purpose.getThruDate() == null);
        if (!hasBillingPurpose) {
            PartyContactMechPurpose pcmp = new PartyContactMechPurpose();
            pcmp.setPartyId(partyId);
            pcmp.setContactMechId(contactMechId);
            pcmp.setContactMechPurposeTypeId("BILLING_LOCATION");
            pcmp.setFromDate(now);
            pcmp.setCreatedStamp(now);
            pcmp.setCreatedTxStamp(now);
            pcmp.setLastUpdatedStamp(now);
            pcmp.setLastUpdatedTxStamp(now);
            partyContactMechPurposeRepository.save(pcmp);
        }
    }

    private String generateId() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 20);
    }

    private List<CreditCardDTO> getCreditCards(String partyId) {
        return paymentMethodRepository.findByPartyIdAndPaymentMethodTypeId(partyId, "CREDIT_CARD").stream()
                .map(pm -> creditCardRepository.findById(pm.getPaymentMethodId()).map(cc -> {
                    CreditCardDTO dto = new CreditCardDTO();
                    dto.setCardType(cc.getCardType());
                    // Decrypt card number if present
                    if (cc.getCardNumber() != null) {
                        try {
                            dto.setCardNumber(encryptionService.decrypt(cc.getCardNumber()));
                        } catch (Exception e) {
                            dto.setCardNumber(cc.getCardNumber()); // Fallback
                        }
                    }
                    dto.setValidFromDate(cc.getValidFromDate());
                    dto.setExpireDate(cc.getExpireDate());
                    dto.setFirstNameOnCard(cc.getFirstNameOnCard());
                    dto.setMiddleNameOnCard(cc.getMiddleNameOnCard());
                    dto.setLastNameOnCard(cc.getLastNameOnCard());
                    dto.setPostalAddressId(cc.getContactMechId());
                    return dto;
                }).orElse(null))
                .filter(java.util.Objects::nonNull)
                .collect(Collectors.toList());
    }

    private List<com.monash.erp.party.dto.AddressDto> getPostalAddresses(String partyId) {
        return partyContactMechRepository.findByPartyId(partyId).stream()
                .map(pcm -> {
                    // Check if it's a postal address
                    return contactMechRepository.findByContactMechId(pcm.getContactMechId())
                            .filter(cm -> "POSTAL_ADDRESS".equals(cm.getContactMechTypeId()))
                            .flatMap(cm -> postalAddressRepository.findByContactMechId(pcm.getContactMechId())
                                    .map(pa -> {
                                        com.monash.erp.party.dto.AddressDto dto = new com.monash.erp.party.dto.AddressDto();
                                        dto.setContactMechId(pa.getContactMechId());
                                        dto.setToName(pa.getToName());
                                        dto.setAddress1(pa.getAddress1());
                                        dto.setAddress2(pa.getAddress2());
                                        dto.setCity(pa.getCity());
                                        dto.setPostalCode(pa.getPostalCode());
                                        dto.setCountryGeoId(pa.getCountryGeoId());
                                        dto.setStateProvinceGeoId(pa.getStateProvinceGeoId());

                                        // Find purpose
                                        partyContactMechPurposeRepository
                                                .findByPartyIdAndContactMechId(partyId, pa.getContactMechId())
                                                .stream()
                                                .filter(p -> p.getThruDate() == null)
                                                .findFirst()
                                                .ifPresent(purpose -> dto
                                                        .setContactMechPurposeId(
                                                                purpose.getContactMechPurposeTypeId()));

                                        return dto;
                                    }));
                })
                .filter(java.util.Optional::isPresent)
                .map(java.util.Optional::get)
                .collect(Collectors.toList());
    }
}
