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
        return mapper.toDTO(entity);
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
            LocalDateTime now
    ) {
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
}
