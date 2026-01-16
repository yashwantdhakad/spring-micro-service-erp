package com.example.erp.party.ofbiz.repository;

import com.example.erp.party.ofbiz.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}