package com.example.erp.party.ofbiz.service;

import com.example.erp.party.ofbiz.domain.Person;
import com.example.erp.party.ofbiz.repository.PersonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> list() {
        return repository.findAll();
    }

    public Person get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Person %d not found".formatted(id)));
    }

    public Person create(Person entity) {
        entity.setId(null);
        return repository.save(entity);
    }

    public Person update(Long id, Person entity) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Person %d not found".formatted(id));
        }
        entity.setId(id);
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}