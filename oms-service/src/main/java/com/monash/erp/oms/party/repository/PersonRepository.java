package com.monash.erp.oms.party.repository;

import com.monash.erp.oms.party.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByPartyId(String partyId);

    List<Person> findByPartyIdIn(List<String> partyIds);

    Page<Person> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(String firstName,
                                                                                   String lastName,
                                                                                   Pageable pageable);
}
